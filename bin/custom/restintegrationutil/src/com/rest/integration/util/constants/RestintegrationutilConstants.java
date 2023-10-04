/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.rest.integration.util.constants;

/**
 * Global class for all Restintegrationutil constants. You can add global constants for your extension into this class.
 */
public final class RestintegrationutilConstants
{
	public static final String EXTENSIONNAME = "restintegrationutil";

	private RestintegrationutilConstants()
	{
		//empty to avoid instantiating this constant class
	}

	// implement here constants used by this extension
	public static final String REST_COMMAND_FACTORY_KEY = "restCommandFactory";
	public static final String SAVE_REQUEST_LOG_COMMAND_FACTORY_KEY = "saveRequestLogCommandFactory";

}
