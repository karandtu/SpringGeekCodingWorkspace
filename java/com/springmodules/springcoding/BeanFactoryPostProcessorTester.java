package com.springmodules.springcoding;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanFactoryPostProcessorTester implements BeanFactoryPostProcessor {


	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("Object of BeanFactoryPostProcessor is created");

	}

	public static void main(String args[]) {


		BeanFactoryPostProcessorTester beanFactoryPostProcessorTester = new BeanFactoryPostProcessorTester();
		beanFactoryPostProcessorTester.postProcessBeanFactory(null);
	}

}
