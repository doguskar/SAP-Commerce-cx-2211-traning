/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.channeladvisor.constants;

/**
 * Global class for all Channeladvisor constants. You can add global constants for your extension into this class.
 */
public final class ChanneladvisorConstants extends GeneratedChanneladvisorConstants
{
	public static final String EXTENSIONNAME = "channeladvisor";

	private ChanneladvisorConstants()
	{
		//empty to avoid instantiating this constant class
	}

	// implement here constants used by this extension

	public static final String CHANNEL_ADVISOR_BASESTORE = "mp-channelAdvisor";
	public static final String CHANNEL_ADVISOR_MP_ID = "channelAdvisor";
	public static final String CSV_SEPARATOR = ";";
	public static final String NEW_LINE = "\n";
	public static final String TOKEN = "token";
	public static final String REFRESH_TOKEN = "refresh_token";
	public static final String PATH_ORDER_ID = "({orderId})";
	public static final String ORDER_ID = "{orderId}";
	public static final String ID = "{Id}";
	public static final String STATUS_IN_PROGRESS = "InProgress";
	public static final String STATUS_COMPLETE = "Complete";

	public static final String APPROVED_RETURN = "approveReturn";

	public static final String CANCEL_RETURN = "cancelReturn";

	public static final String CONFIRM_OR_CANCEL_RESPONSE = "_ConfirmOrCancelResponse";
	public static final String CA_REST_COMMAND_FACTORY_KEY = "caRestCommandFactory";
}
