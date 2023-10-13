package com.sap.smartedittrail.validators;

import de.hybris.platform.cmsfacades.common.function.Validator;
import de.hybris.platform.cmsfacades.common.validator.ValidationErrorsProvider;
import com.sap.smartedittrail.jalo.TrainingComponent;
import com.sap.smartedittrail.model.TrainingComponentModel;

import static de.hybris.platform.cmsfacades.common.validator.ValidationErrorBuilder.newValidationErrorBuilder;
import static de.hybris.platform.cmsfacades.constants.CmsfacadesConstants.FIELD_REQUIRED;
import static java.util.Objects.isNull;


public class DefaultCMSTrainingModelValidator implements Validator<TrainingComponentModel> {
    private ValidationErrorsProvider validationErrorsProvider;

    @Override
    public void validate(final TrainingComponentModel validatee) {
        if (isNull(validatee.getCustomMessage())) {
            getValidationErrorsProvider().getCurrentValidationErrors().add(
                    newValidationErrorBuilder() //
                            .field(TrainingComponentModel.CUSTOMMESSAGE) //
                            .errorCode(FIELD_REQUIRED) //
                            .build());
        }
    }

    public ValidationErrorsProvider getValidationErrorsProvider() {
        return validationErrorsProvider;
    }

    public void setValidationErrorsProvider(ValidationErrorsProvider validationErrorsProvider) {
        this.validationErrorsProvider = validationErrorsProvider;
    }
}
