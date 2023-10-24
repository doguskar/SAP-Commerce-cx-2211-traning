/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.channeladvisor.service;

public interface ChanneladvisorService
{
	String getHybrisLogoUrl(String logoCode);

	void createLogo(String logoCode);
}
