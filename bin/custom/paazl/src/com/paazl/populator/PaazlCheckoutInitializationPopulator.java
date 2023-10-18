package com.paazl.populator;

import com.paazl.data.DeliveryDateOptionsData;
import com.paazl.data.PaazlCheckoutInitializationData;
import com.paazl.data.SortingModelData;
import com.paazl.model.PaazlWidgetParametersModel;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class PaazlCheckoutInitializationPopulator<SOURCE extends PaazlWidgetParametersModel, TARGET extends PaazlCheckoutInitializationData> implements Populator<SOURCE, TARGET> {
    @Override
    public void populate(SOURCE source, TARGET target) throws ConversionException {
        target.setLoadPaazlBasedData(source.getLoadPaazlBasedData());
        target.setLoadCarrierBasedData(source.getLoadCarrierBasedData());
        target.setAvailableTabs(source.getAvailableTabs());
        target.setDefaultTab(source.getDefaultTab());
        target.setHeaderTabType(source.getHeaderTabType());
        target.setStyle(source.getStyle());
        target.setNominatedDateEnabled(source.getNominatedDateEnabled());
        target.setNumberOfProcessingDays(source.getNumberOfProcessingDays());
        target.setTags(source.getTags());
        target.setDeliveryDateOptions(getDeliveryDateOptions(source));
        target.setIsPricingEnabled(source.getIsPricingEnabled());
        target.setIsShowAsExtraCost(source.getIsShowAsExtraCost());
        target.setDeliveryRangeFormat(source.getDeliveryRangeFormat());
        target.setDeliveryOptionDateFormat(source.getDeliveryOptionDateFormat());
        target.setDeliveryEstimateDateFormat(source.getDeliveryEstimateDateFormat());
        target.setPickupOptionDateFormat(source.getPickupOptionDateFormat());
        target.setPickupEstimateDateFormat(source.getPickupEstimateDateFormat());
        target.setSortingModel(getSortingModel(source));
        target.setShippingOptionsLimit(source.getShippingOptionsLimit());
        target.setPickupLocationsPageLimit(source.getPickupLocationsPageLimit());
        target.setPickupLocationsLimit(source.getPickupLocationsLimit());
        target.setInitialPickupLocations(source.getInitialPickupLocations());
    }

    private SortingModelData getSortingModel(SOURCE source) {
        SortingModelData sortingModelData = new SortingModelData();
        sortingModelData.setOrderBy(source.getSortingModelOrderBy());
        sortingModelData.setSortOrder(source.getSortingModelSortOrder());
        sortingModelData.setDistributor(source.getSortingModelDistributor());
        return sortingModelData;
    }

    private DeliveryDateOptionsData getDeliveryDateOptions(SOURCE source) {
        DeliveryDateOptionsData deliveryDateOptionsData = new DeliveryDateOptionsData();
        deliveryDateOptionsData.setNumberOfDays(source.getDeliveryDateOptionsNumberOfDays());
        return deliveryDateOptionsData;
    }
}
