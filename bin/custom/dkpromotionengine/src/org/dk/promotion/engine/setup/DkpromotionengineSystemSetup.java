/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.dk.promotion.engine.setup;


import de.hybris.platform.core.initialization.SystemSetup;


import org.dk.promotion.engine.constants.DkPromotionEngineConstants;


@SystemSetup(extension = DkPromotionEngineConstants.EXTENSIONNAME)
public class DkpromotionengineSystemSetup
{
	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{

	}
}
