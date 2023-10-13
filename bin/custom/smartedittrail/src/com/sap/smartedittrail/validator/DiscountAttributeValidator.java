package com.sap.smartedittrail.validator;

import de.hybris.platform.core.model.type.AttributeDescriptorModel;
import de.hybris.platform.cmsfacades.cmsitems.attributevalidators.IntegerAttributeContentValidator;
import de.hybris.platform.cmsfacades.common.validator.ValidationErrorsProvider;
import de.hybris.platform.cmsfacades.validator.data.ValidationError;

import org.springframework.beans.factory.annotation.Required;

import java.util.ArrayList;
import java.util.List;

import static de.hybris.platform.cmsfacades.common.validator.ValidationErrorBuilder.newValidationErrorBuilder;
import static java.lang.Integer.parseInt;

public class DiscountAttributeValidator extends IntegerAttributeContentValidator {
    private final int MIN_DISCOUNT = 5;
    private final int MAX_DISCOUNT = 40;
    private final String INVALID_DISCOUNT = "Invalid Discount";

    private ValidationErrorsProvider validationErrorsProvider;

    @Override
    public List<ValidationError> validate(final Object value, final AttributeDescriptorModel attribute) {
        final List<ValidationError> errors = new ArrayList<>();

        if (value == null) {
            return errors;
        }

        try {
            final int discount = parseInt(value.toString());
            if (discount < MIN_DISCOUNT || discount > MAX_DISCOUNT) {
                errors.add(
                        newValidationErrorBuilder() //
                                .field(attribute.getQualifier()) //
                                .errorCode(INVALID_DISCOUNT) //
                                .build());
            }

            errors.addAll(super.validate(value, attribute));
        } catch (NumberFormatException e) {
        }

        return errors;
    }

    protected ValidationErrorsProvider getValidationErrorsProvider() {
        return validationErrorsProvider;
    }

    @Required
    public void setValidationErrorsProvider(final ValidationErrorsProvider validationErrorsProvider) {
        this.validationErrorsProvider = validationErrorsProvider;
    }

}