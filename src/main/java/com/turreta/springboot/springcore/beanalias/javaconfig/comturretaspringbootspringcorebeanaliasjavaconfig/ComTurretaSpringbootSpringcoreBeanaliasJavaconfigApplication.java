package com.turreta.springboot.springcore.beanalias.javaconfig.comturretaspringbootspringcorebeanaliasjavaconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ComTurretaSpringbootSpringcoreBeanaliasJavaconfigApplication
{

	public static void main(String[] args)
	{
		final ConfigurableApplicationContext context = SpringApplication
				.run(ComTurretaSpringbootSpringcoreBeanaliasJavaconfigApplication.class, args);

		final BeanTwo bean = context.getBean(BeanTwo.class);

		System.out.println(bean);
	}
}
