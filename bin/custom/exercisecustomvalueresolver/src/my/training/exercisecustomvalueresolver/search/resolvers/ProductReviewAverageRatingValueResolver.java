package my.training.exercisecustomvalueresolver.search.resolvers;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.customerreview.CustomerReviewService;
import de.hybris.platform.customerreview.enums.CustomerReviewApprovalType;
import de.hybris.platform.customerreview.model.CustomerReviewModel;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.indexer.IndexerBatchContext;
import de.hybris.platform.solrfacetsearch.indexer.spi.InputDocument;
import de.hybris.platform.solrfacetsearch.provider.impl.AbstractValueResolver;

public class ProductReviewAverageRatingValueResolver extends AbstractValueResolver<ProductModel, Object, Object> {
    private CustomerReviewService customerReviewService;

    protected CustomerReviewService getCustomerReviewService() {
        return customerReviewService;
    }

    public void setCustomerReviewService(final CustomerReviewService customerReviewService) {
        this.customerReviewService = customerReviewService;
    }

    @Override
    protected void addFieldValues(final InputDocument document, final IndexerBatchContext batchContext,
                                  final IndexedProperty indexedProperty, final ProductModel product,
                                  final ValueResolverContext<Object, Object> resolverContext) throws FieldValueProviderException {
        final Double productRating = getProductRating(product);
        document.addField(indexedProperty, productRating, resolverContext.getFieldQualifier());
    }

    private Double getProductRating(final ProductModel product) {
        double sum = 0d;
        int count = 0;
        for (final CustomerReviewModel review : getCustomerReviewService().getReviewsForProduct(product)) {
            if (
                    (review.getRating() != null)
                            && (review.getApprovalStatus() == CustomerReviewApprovalType.APPROVED)) {
                count++;
                sum += review.getRating().doubleValue();
            }
        }
        if (count > 0) {
            return Double.valueOf(sum / count);
        }
        return Double.valueOf(0);
    }
}
