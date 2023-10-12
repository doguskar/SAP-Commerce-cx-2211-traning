/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.ruleenginetrail.controller;

import static de.hybris.ruleenginetrail.constants.RuleenginetrailConstants.PLATFORM_LOGO_CODE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import de.hybris.ruleenginetrail.service.RuleenginetrailService;


@Controller
public class RuleenginetrailHelloController
{
	@Autowired
	private RuleenginetrailService ruleenginetrailService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(final ModelMap model)
	{
		model.addAttribute("logoUrl", ruleenginetrailService.getHybrisLogoUrl(PLATFORM_LOGO_CODE));
		return "welcome";
	}
}
