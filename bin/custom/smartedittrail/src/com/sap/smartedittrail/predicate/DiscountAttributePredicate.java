package com.sap.smartedittrail.predicate;

import de.hybris.platform.core.model.type.AttributeDescriptorModel;

import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Required;

public class DiscountAttributePredicate implements Predicate<AttributeDescriptorModel> {

    private final String DISCOUNT_QUALIFIER = "discount";

    @Override
    public boolean test(final AttributeDescriptorModel attributeDescriptor) {
        return attributeDescriptor.getQualifier().equals(DISCOUNT_QUALIFIER);
    }

}