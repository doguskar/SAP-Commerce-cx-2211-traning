package org.dk.promotion.engine.strategy;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.promotionengineservices.action.impl.AbstractRuleActionStrategy;
import de.hybris.platform.promotions.model.PromotionResultModel;
import de.hybris.platform.ruleengineservices.rao.AbstractRuleActionRAO;
import de.hybris.platform.ruleengineservices.rao.RuleExecutedRAO;
import org.dk.promotion.engine.model.RuleBasedRuleExecutedActionModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.List;

public class DefaultRuleExecutedActionStrategy extends AbstractRuleActionStrategy {
    private static final Logger LOG = LoggerFactory.getLogger(DefaultRuleExecutedActionStrategy.class);

    @Override
    public List apply(AbstractRuleActionRAO action) {
        if (!(action instanceof RuleExecutedRAO)) {
            LOG.error("cannot apply {}, action is not of type DisplayMessageRAO", this.getClass().getSimpleName());
            return Collections.emptyList();
        } else {
            PromotionResultModel promoResult = this.getPromotionActionService().createPromotionResult(action);
            if (promoResult == null) {
                LOG.error("cannot apply {}, promotionResult could not be created.", this.getClass().getSimpleName());
                return Collections.emptyList();
            } else {
                AbstractOrderModel order = this.getPromotionResultUtils().getOrder(promoResult);
                if (order == null) {
                    LOG.error("cannot apply {}, order not found", this.getClass().getSimpleName());
                    if (this.getModelService().isNew(promoResult)) {
                        this.getModelService().detach(promoResult);
                    }

                    return Collections.emptyList();
                } else {
                    RuleBasedRuleExecutedActionModel actionModel = (RuleBasedRuleExecutedActionModel)this.createPromotionAction(promoResult, action);
                    this.handleActionMetadata(action, actionModel);
                    this.getModelService().saveAll(new Object[]{promoResult, actionModel});
                    return Collections.singletonList(promoResult);
                }
            }
        }
    }

    @Override
    public void undo(ItemModel item) {
        if (item instanceof RuleBasedRuleExecutedActionModel) {
            RuleBasedRuleExecutedActionModel action = (RuleBasedRuleExecutedActionModel)item;
            this.handleUndoActionMetadata(action);
            this.undoInternal(action);
        }
    }
}
