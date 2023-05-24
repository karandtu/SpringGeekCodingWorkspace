package com.springmodules.springcoding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class ProductServiceInterceptorAppConfig implements WebMvcConfigurer {
	
	@Autowired
	ProductServiceInterceptor productServiceInterceptor;
	
	
	public void registerInterceptorIntoRegistry(InterceptorRegistry registry) {
		registry.addInterceptor(productServiceInterceptor);
		
		//WebMvcConfigurerAdapter is deprecated so used WebMvcConfigurer
		System.out.println("Adding the interceptor into the Registry via WebMvcConfigurer");
	}
    
	

}
