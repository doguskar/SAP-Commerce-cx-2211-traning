package com.sap.smartedittrail.validators;

import de.hybris.platform.cmsfacades.cmsitems.attributevalidators.AbstractAttributeContentValidator;
import de.hybris.platform.cmsfacades.validator.data.ValidationError;
import de.hybris.platform.core.model.type.AttributeDescriptorModel;

import java.util.ArrayList;
import java.util.List;

import static de.hybris.platform.cmsfacades.common.validator.ValidationErrorBuilder.newValidationErrorBuilder;
import static de.hybris.platform.cmsfacades.constants.CmsfacadesConstants.FIELD_MIN_VIOLATED;


public class TrainingAttributeContentValidator extends AbstractAttributeContentValidator<Object> {
    @Override
    public List<ValidationError> validate(final Object value, final AttributeDescriptorModel attribute) {
        final List<ValidationError> errors = new ArrayList<>();
        if (value == null) {
            return errors;
        }

        if (Integer.valueOf(value.toString()) < 0) {
            errors.add(
                    newValidationErrorBuilder() //
                            .field(attribute.getQualifier()) //
                            .errorCode(FIELD_MIN_VIOLATED) //
                            .build()
            );
        }
        return errors;
    }
}
