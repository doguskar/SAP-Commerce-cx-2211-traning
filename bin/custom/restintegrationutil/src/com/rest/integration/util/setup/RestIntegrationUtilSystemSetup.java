package com.rest.integration.util.setup;

import com.rest.integration.util.constants.RestintegrationutilConstants;
import de.hybris.platform.commerceservices.setup.AbstractSystemSetup;
import de.hybris.platform.core.initialization.SystemSetup;
import de.hybris.platform.core.initialization.SystemSetupContext;
import de.hybris.platform.core.initialization.SystemSetupParameter;
import de.hybris.platform.core.initialization.SystemSetupParameterMethod;

import java.util.ArrayList;
import java.util.List;

@SystemSetup(extension = RestintegrationutilConstants.EXTENSIONNAME)
public class RestIntegrationUtilSystemSetup extends AbstractSystemSetup {
    private static final String IMPORT_SAMPLE_DATA = "importSampleData";

    @Override
    @SystemSetupParameterMethod
    public List<SystemSetupParameter> getInitializationOptions() {
        final List<SystemSetupParameter> params = new ArrayList<>();
        params.add(createBooleanSystemSetupParameter(IMPORT_SAMPLE_DATA, "Import Sample Data", true));
        return params;
    }

    @SystemSetup(type = SystemSetup.Type.PROJECT, process = SystemSetup.Process.ALL)
    public void createEssentialData(final SystemSetupContext context) {
        if (getBooleanSystemSetupParameter(context, IMPORT_SAMPLE_DATA)) {
            this.logInfo(context, "Creating essential data for " + RestintegrationutilConstants.EXTENSIONNAME);
            getSetupImpexService().importImpexFile("/" + RestintegrationutilConstants.EXTENSIONNAME + "/import/cleanup.impex", true);
        }
    }
}
