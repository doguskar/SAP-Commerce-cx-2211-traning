/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.ruleenginetrail.setup;

import static de.hybris.ruleenginetrail.constants.RuleenginetrailConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import de.hybris.ruleenginetrail.constants.RuleenginetrailConstants;
import de.hybris.ruleenginetrail.service.RuleenginetrailService;


@SystemSetup(extension = RuleenginetrailConstants.EXTENSIONNAME)
public class RuleenginetrailSystemSetup
{
	private final RuleenginetrailService ruleenginetrailService;

	public RuleenginetrailSystemSetup(final RuleenginetrailService ruleenginetrailService)
	{
		this.ruleenginetrailService = ruleenginetrailService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		ruleenginetrailService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return RuleenginetrailSystemSetup.class.getResourceAsStream("/ruleenginetrail/sap-hybris-platform.png");
	}
}
