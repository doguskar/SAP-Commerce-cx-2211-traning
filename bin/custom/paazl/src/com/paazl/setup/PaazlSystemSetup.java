/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.paazl.setup;

import static com.paazl.constants.PaazlConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import com.paazl.constants.PaazlConstants;
import com.paazl.service.PaazlService;


@SystemSetup(extension = PaazlConstants.EXTENSIONNAME)
public class PaazlSystemSetup
{
	private final PaazlService paazlService;

	public PaazlSystemSetup(final PaazlService paazlService)
	{
		this.paazlService = paazlService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		paazlService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return PaazlSystemSetup.class.getResourceAsStream("/paazl/sap-hybris-platform.png");
	}
}
