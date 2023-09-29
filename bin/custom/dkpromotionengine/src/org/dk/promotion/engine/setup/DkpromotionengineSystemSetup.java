/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.dk.promotion.engine.setup;

import de.hybris.platform.commerceservices.setup.AbstractSystemSetup;
import de.hybris.platform.core.initialization.SystemSetup;
import de.hybris.platform.core.initialization.SystemSetupContext;
import de.hybris.platform.core.initialization.SystemSetupParameter;
import de.hybris.platform.core.initialization.SystemSetupParameterMethod;
import org.dk.promotion.engine.constants.DkPromotionEngineConstants;

import java.util.List;


@SystemSetup(extension = DkPromotionEngineConstants.EXTENSIONNAME)
public class DkpromotionengineSystemSetup extends AbstractSystemSetup {
    private static final String IMPORT_SAMPLE_DATA = "importSampleData";

    @Override
    @SystemSetupParameterMethod
    public List<SystemSetupParameter> getInitializationOptions() {
        return null;
    }

    @SystemSetup(type = SystemSetup.Type.ESSENTIAL, process = SystemSetup.Process.ALL)
    public void createEssentialData(final SystemSetupContext context) {
        this.logInfo(context, "Creating essential data for dkpromotionengin");
        getSetupImpexService().importImpexFile("/dkpromotionengine/import/promotions.impex", true);
        getSetupImpexService().importImpexFile("/dkpromotionengine/import/promotions_en.impex", true);
    }
}
