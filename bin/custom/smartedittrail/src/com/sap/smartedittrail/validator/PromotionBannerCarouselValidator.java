package com.sap.smartedittrail.validator;

import static de.hybris.platform.cmsfacades.common.validator.ValidationErrorBuilder.newValidationErrorBuilder;

import de.hybris.platform.cmsfacades.common.function.Validator;
import de.hybris.platform.cmsfacades.common.validator.ValidationErrorsProvider;

import com.sap.smartedittrail.model.PromotionBannerCarouselModel;

import org.springframework.beans.factory.annotation.Required;

public class PromotionBannerCarouselValidator implements Validator<PromotionBannerCarouselModel>
{
    private final String BANNERS = "banners";
    private final String INVALID_NUMBER_OF_BANNERS = "Invalid number of banners";

    private ValidationErrorsProvider validationErrorsProvider;

    @Override
    public void validate(final PromotionBannerCarouselModel validatee)
    {
        final int maxNumberOfBanners = validatee.getMaxNumOfBanners();
        final int currentNumberOfBanners = validatee.getBanners().size();
        if (currentNumberOfBanners > maxNumberOfBanners)
        {
            getValidationErrorsProvider().getCurrentValidationErrors().add(
                    newValidationErrorBuilder() //
                            .field("banners") //
                            .errorCode(INVALID_NUMBER_OF_BANNERS) //
                            .build()
            );
        }
    }

    protected ValidationErrorsProvider getValidationErrorsProvider()
    {
        return validationErrorsProvider;
    }

    @Required
    public void setValidationErrorsProvider(final ValidationErrorsProvider validationErrorsProvider)
    {
        this.validationErrorsProvider = validationErrorsProvider;
    }
}