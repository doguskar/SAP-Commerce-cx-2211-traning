package com.sap.smartedittrail.populators;

import com.sap.smartedittrail.model.TrainingComponentModel;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.Map;

public class TrainingItemContentPopulator implements Populator<Map<String, Object>, TrainingComponentModel> {
    @Override
    public void populate(final Map<String, Object> source, final TrainingComponentModel itemModel) throws ConversionException {
        itemModel.setCustomMessage("Updated before persistence " + itemModel.getCustomMessage());
    }
}
