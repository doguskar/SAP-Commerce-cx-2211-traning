package org.dk.promotion.engine.action;

import de.hybris.platform.droolsruleengineservices.compiler.impl.DefaultDroolsRuleActionContext;
import de.hybris.platform.ruleengineservices.rao.*;
import de.hybris.platform.ruleengineservices.rule.evaluation.RuleActionContext;
import de.hybris.platform.ruleengineservices.rule.evaluation.actions.AbstractRuleExecutableSupport;
import de.hybris.platform.servicelayer.config.ConfigurationService;
import org.apache.commons.collections4.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class RuleCalculateTotalOfQualifiedProductsRAOAction extends AbstractRuleExecutableSupport {
    private static final Logger LOG = LoggerFactory.getLogger(RuleCalculateTotalOfQualifiedProductsRAOAction.class);
    final static String ORDER_ENTRY_RAO_CODE = "de.hybris.platform.ruleengineservices.rao.OrderEntryRAO";
    final static String CART_RAO_CODE = "de.hybris.platform.ruleengineservices.rao.CartRAO";

    @Resource
    private ConfigurationService configurationService;

    @Override
    public void performAction(RuleActionContext context) {
        this.validateRule(context);
        if (this.performActionInternal(context)) {
            this.getConsumptionSupport().trackConsumedProducts(context);
            this.trackActionExecution(context);
            context.updateScheduledFacts();
        }
    }

    @Override
    public boolean performActionInternal(RuleActionContext context) {
        final Map<String, Object> variables = ((DefaultDroolsRuleActionContext) context).getVariables();
        final Set<CartRAO> cartSt = (Set<CartRAO>) variables.get(CART_RAO_CODE);
        final CartRAO cart = CollectionUtils.isNotEmpty(cartSt) ? cartSt.iterator().next() : null;
        final Set<OrderEntryRAO> entries = (Set<OrderEntryRAO>) variables.get(ORDER_ENTRY_RAO_CODE);

        return Objects.nonNull(cart) && CollectionUtils.isNotEmpty(entries) ? this.performAction(context, cart, entries) : false;
    }

    protected boolean performAction(RuleActionContext context, CartRAO cart, Set<OrderEntryRAO> entries) {
        final StringBuilder logBuilder = new StringBuilder();
        logBuilder.append("RuleCalculateTotalOfQualifiedProductsRAOAction starts\n");
        // Calculate total of qualified products
        BigDecimal totalOfQualifiedProducts = BigDecimal.ZERO;
        final Iterator<OrderEntryRAO> entryIter = entries.iterator();
        final String cartCurrencyIsoCode = cart.getCurrencyIsoCode();
        while (entryIter.hasNext()) {
            final OrderEntryRAO entry = entryIter.next();
            final BigDecimal entryTotal = getEntryTotal(entry);
            totalOfQualifiedProducts = totalOfQualifiedProducts.add(entryTotal);
            logBuilder.append(entry.getProductCode()).append(":").append(entry.getAvailableQuantity()).append(":").append(entryTotal).append("\n");
        }

        if (isApplyCartDiscountActive()) {
            logBuilder.append("before applyCartDiscount totalOfQualifiedProducts: ").append(totalOfQualifiedProducts).append("\n");
            totalOfQualifiedProducts = applyCartDiscount(cart, cartCurrencyIsoCode, totalOfQualifiedProducts, logBuilder);
        }

        logBuilder.append("totalOfQualifiedProducts: ").append(totalOfQualifiedProducts).append("\n");
        cart.setTotalOfQualifiedProducts(totalOfQualifiedProducts);
        if (LOG.isDebugEnabled()) {
            LOG.debug(logBuilder.toString());
        }

        fireRule(context, cart);
        return true;
    }

    private BigDecimal getEntryTotal(OrderEntryRAO entry) {
        int quantity = entry.getQuantity();
        int availableQuantity = entry.getAvailableQuantity();
        if (quantity != availableQuantity) {
            return entry.getBasePrice().multiply(BigDecimal.valueOf(availableQuantity)).setScale(2, RoundingMode.HALF_EVEN);
        }
        return entry.getTotalPrice();
    }

    private BigDecimal applyCartDiscount(final CartRAO cart, final String cartCurrencyIsoCode, BigDecimal totalOfQualifiedProducts, final StringBuilder logBuilder) {
        // If there is cart level discount, it will be distributed to entries. Because of that calculate distributed discount of qualified products.
        final BigDecimal cartDiscount = getTotalDiscountFromActions(cart.getActions(), cartCurrencyIsoCode);
        if (cartDiscount.compareTo(BigDecimal.ZERO) > 0) {
            logBuilder.append("cart.getTotal(): ").append(cart.getTotal()).append("\n");
            logBuilder.append("cartDiscount: ").append(cartDiscount).append("\n");
            final BigDecimal cartTotalWithoutCartDiscount = cart.getTotal().add(cartDiscount);
            final BigDecimal ratio = totalOfQualifiedProducts.divide(cartTotalWithoutCartDiscount, 2, RoundingMode.HALF_EVEN);
            final BigDecimal discount = cartDiscount.multiply(ratio);
            totalOfQualifiedProducts = totalOfQualifiedProducts.subtract(discount).setScale(2, RoundingMode.HALF_EVEN);
        }
        return totalOfQualifiedProducts;
    }

    private BigDecimal getTotalDiscountFromActions(final LinkedHashSet<AbstractRuleActionRAO> actions, final String currencyIsoCode) {
        BigDecimal totalDiscount = BigDecimal.ZERO;
        if (CollectionUtils.isNotEmpty(actions)) {
            final Iterator<AbstractRuleActionRAO> actionIter = actions.iterator();
            while (actionIter.hasNext()) {
                final AbstractRuleActionRAO action = actionIter.next();
                if (action instanceof DiscountRAO) {
                    final DiscountRAO discount = (DiscountRAO) action;
                    if (currencyIsoCode.equals(discount.getCurrencyIsoCode())) {
                        totalDiscount = totalDiscount.add(discount.getValue());
                    }
                }
            }
        }
        return totalDiscount;
    }

    private void fireRule(RuleActionContext context, CartRAO cart) {
        RuleEngineResultRAO result = context.getRuleEngineResultRao();
        RuleExecutedRAO ruleExecutedRAO = new RuleExecutedRAO();
        this.getRaoUtils().addAction(cart, ruleExecutedRAO);
        result.getActions().add(ruleExecutedRAO);
        this.setRAOMetaData(context, new AbstractRuleActionRAO[]{ruleExecutedRAO});
        context.scheduleForUpdate(new Object[]{cart, result});
        context.insertFacts(new Object[]{ruleExecutedRAO});
    }

    private boolean isApplyCartDiscountActive() {
        return configurationService.getConfiguration().getBoolean("rule.calculate.toqp.apply.cart.discount", false);
    }
}
