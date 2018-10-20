package com.turreta.springboot.springcore.beanalias.javaconfig.comturretaspringbootspringcorebeanaliasjavaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BeanTwo
{
	@Autowired
	@Qualifier("b1")
	private BeanOne beanOneA;

	@Autowired
	@Qualifier("bA")
	private BeanOne beanOneB;

	@Autowired
	@Qualifier("idBean1")
	private BeanOne beanOneC;

	@Override public String toString()
	{
		return "BeanTwo using " + beanOneA + " and " + beanOneB + " and " + beanOneC;
	}
}
