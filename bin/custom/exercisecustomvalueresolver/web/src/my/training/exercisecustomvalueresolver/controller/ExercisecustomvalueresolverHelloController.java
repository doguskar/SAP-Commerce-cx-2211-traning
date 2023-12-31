/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package my.training.exercisecustomvalueresolver.controller;

import static my.training.exercisecustomvalueresolver.constants.ExercisecustomvalueresolverConstants.PLATFORM_LOGO_CODE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import my.training.exercisecustomvalueresolver.service.ExercisecustomvalueresolverService;


@Controller
public class ExercisecustomvalueresolverHelloController
{
	@Autowired
	private ExercisecustomvalueresolverService exercisecustomvalueresolverService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(final ModelMap model)
	{
		model.addAttribute("logoUrl", exercisecustomvalueresolverService.getHybrisLogoUrl(PLATFORM_LOGO_CODE));
		return "welcome";
	}
}
