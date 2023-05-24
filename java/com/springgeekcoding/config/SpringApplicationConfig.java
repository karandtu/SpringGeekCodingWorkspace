package com.springgeekcoding.config;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringApplicationConfig {
	
	
	@Bean
	public static BeanFactoryPostProcessor implementBeanFactoryPostProcessor() {
		
		return factoryHook->{
			BeanDefinitionRegistry context = (BeanDefinitionRegistry)factoryHook;
			context.registerBeanDefinition("mySpringBeans",BeanDefinitionBuilder.genericBeanDefinition(java.lang.String.class)
					.addConstructorArgReference("this is my first bean definitions created through BeanFactoryPostProcessor")
					.getBeanDefinition());
		};
		
	}
	
}
