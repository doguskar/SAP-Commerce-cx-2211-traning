package com.sap.smartedittrail.converters;

import de.hybris.platform.cms2.common.functions.Converter;

public class TrainingDataToAttributeContentConverter implements Converter<String, String> {
    @Override
    public String convert(String source) {
        return source;
    }
}
