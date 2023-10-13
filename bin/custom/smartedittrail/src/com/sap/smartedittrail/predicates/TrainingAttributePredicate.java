package com.sap.smartedittrail.predicates;

import de.hybris.platform.core.model.type.AttributeDescriptorModel;

import java.util.function.Predicate;

public class TrainingAttributePredicate implements Predicate<AttributeDescriptorModel> {
    @Override
    public boolean test(final AttributeDescriptorModel attributeDescriptor) {
        return "customMessage".equals(attributeDescriptor.getQualifier());
    }
}
