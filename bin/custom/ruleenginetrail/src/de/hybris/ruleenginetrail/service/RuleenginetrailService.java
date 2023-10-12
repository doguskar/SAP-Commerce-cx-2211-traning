/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.ruleenginetrail.service;

public interface RuleenginetrailService
{
	String getHybrisLogoUrl(String logoCode);

	void createLogo(String logoCode);
}
