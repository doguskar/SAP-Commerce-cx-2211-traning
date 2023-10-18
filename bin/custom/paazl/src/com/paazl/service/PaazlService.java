/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.paazl.service;

public interface PaazlService
{
	String getHybrisLogoUrl(String logoCode);

	void createLogo(String logoCode);
}
