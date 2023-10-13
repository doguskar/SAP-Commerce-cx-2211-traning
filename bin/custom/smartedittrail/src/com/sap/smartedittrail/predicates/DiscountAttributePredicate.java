package com.sap.smartedittrail.predicates;

import de.hybris.platform.core.model.type.AttributeDescriptorModel;

import java.util.function.Predicate;

public class DiscountAttributePredicate implements Predicate<AttributeDescriptorModel> {

    private final String DISCOUNT_QUALIFIER = "discount";

    @Override
    public boolean test(final AttributeDescriptorModel attributeDescriptor) {
        return attributeDescriptor.getQualifier().equals(DISCOUNT_QUALIFIER);
    }

}