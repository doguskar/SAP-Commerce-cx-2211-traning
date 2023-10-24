/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.channeladvisor.setup;

import static com.channeladvisor.constants.ChanneladvisorConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import com.channeladvisor.constants.ChanneladvisorConstants;
import com.channeladvisor.service.ChanneladvisorService;


@SystemSetup(extension = ChanneladvisorConstants.EXTENSIONNAME)
public class ChanneladvisorSystemSetup
{
	private final ChanneladvisorService channeladvisorService;

	public ChanneladvisorSystemSetup(final ChanneladvisorService channeladvisorService)
	{
		this.channeladvisorService = channeladvisorService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		channeladvisorService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return ChanneladvisorSystemSetup.class.getResourceAsStream("/channeladvisor/sap-hybris-platform.png");
	}
}
