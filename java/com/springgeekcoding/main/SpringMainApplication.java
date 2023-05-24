package com.springgeekcoding.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springmodules.springcoding.BeanFactoryPostProcessorTester;
import com.springmodules.springcoding.CustomBeanPostProcessorTester;
import com.springmodules.springcoding.InvoiceCreationImplementation;


public class SpringMainApplication {

	
	public static void main(String args[]) {
		
		//Reading properties from external file which is My-Beans.XML configuration BeanDefinitions File.
		//At this stage, this is happening due to an in-built framework PropertyPlaceholderConfigurer
		//which implements this for you. Hence we just focus on creating context, reading property 
		//and spit it out to just create it . No Beans are actually created here.
		ApplicationContext beanFactoryPostProcessorContext = new ClassPathXmlApplicationContext("my-beans.xml");
		ApplicationContext beanPostProcessorContext = new ClassPathXmlApplicationContext("BeanPostProcessorApplication.xml");
		ApplicationContext beanPostProcessorAdditionalContext = new ClassPathXmlApplicationContext("BeanPostProcessorApplication.xml");
		System.out.println(beanFactoryPostProcessorContext.getBean("myBeans"));
		BeanFactoryPostProcessorTester beanFactoryPostProcessorTester = beanFactoryPostProcessorContext.getBean(BeanFactoryPostProcessorTester.class);
		System.out.println(beanPostProcessorContext.getBean("customBeanPostProcessorTester"));
		CustomBeanPostProcessorTester customBeanPostProcessorTesterClass = beanPostProcessorContext.getBean(CustomBeanPostProcessorTester.class);
		System.out.println(beanPostProcessorContext.getBean("invoiceCreationImplementation"));
	    InvoiceCreationImplementation invoiceCreationImplementationClass = beanFactoryPostProcessorContext.getBean(InvoiceCreationImplementation.class);
			
	}
	

}
