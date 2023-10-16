/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package my.training.exercisecustomvalueresolver.service;

public interface ExercisecustomvalueresolverService
{
	String getHybrisLogoUrl(String logoCode);

	void createLogo(String logoCode);
}
