package com.springmodules.springcoding;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessorTester implements BeanPostProcessor{
	
	public Object postProcessbeforeInitialization(Object bean, String beanName) throws BeansException{
		System.out.println("postProcessBeforeInitialization callback method is called"
				+ "before" +beanName);
		return beanName;
	
	}
	
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException{
		System.out.println("postProcessBeforeInitialization callback method is called"
				+ "after" +beanName);
		return beanName;
	
	}

}
