package com.turreta.springboot.springcore.beanalias.javaconfig.comturretaspringbootspringcorebeanaliasjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.annotation.AliasFor;

@Configuration
public class MyConfiguration
{
	@Bean(name = {"idBean1", "bean1", "beanA", "beanUno", "b1", "bA"})
	// OR @Bean({"idBean1", "bean1", "beanA", "beanUno", "b1", "bA"})
	public BeanOne c()
	{
		return new BeanOne();
	}

	@Bean({"idBean2", "bean2", "beanB", "beanDos", "b2", "bB"})
	public BeanTwo d()
	{
		return new BeanTwo();
	}
}
