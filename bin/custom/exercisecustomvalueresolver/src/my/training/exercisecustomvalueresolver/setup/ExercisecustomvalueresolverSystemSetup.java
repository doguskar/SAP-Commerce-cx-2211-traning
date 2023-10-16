/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package my.training.exercisecustomvalueresolver.setup;

import static my.training.exercisecustomvalueresolver.constants.ExercisecustomvalueresolverConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import my.training.exercisecustomvalueresolver.constants.ExercisecustomvalueresolverConstants;
import my.training.exercisecustomvalueresolver.service.ExercisecustomvalueresolverService;


@SystemSetup(extension = ExercisecustomvalueresolverConstants.EXTENSIONNAME)
public class ExercisecustomvalueresolverSystemSetup
{
	private final ExercisecustomvalueresolverService exercisecustomvalueresolverService;

	public ExercisecustomvalueresolverSystemSetup(final ExercisecustomvalueresolverService exercisecustomvalueresolverService)
	{
		this.exercisecustomvalueresolverService = exercisecustomvalueresolverService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		exercisecustomvalueresolverService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return ExercisecustomvalueresolverSystemSetup.class.getResourceAsStream("/exercisecustomvalueresolver/sap-hybris-platform.png");
	}
}
