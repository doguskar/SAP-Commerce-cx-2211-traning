package com.sap.smartedittrail.predicates;

import de.hybris.platform.core.model.type.AttributeDescriptorModel;

import java.util.function.Predicate;

public class TrainingNumMessageAttributePredicate implements Predicate<AttributeDescriptorModel> {
    @Override
    public boolean test(final AttributeDescriptorModel attributeDescriptor) {
        return "numMessages".equals(attributeDescriptor.getQualifier());
    }
}
