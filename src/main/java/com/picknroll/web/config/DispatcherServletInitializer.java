package com.picknroll.web.config;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {
				 ServletContextConfig.class
				,ServiceContextConfig.class
				,SecurityContextConfig.class
		};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

	 @Override
     protected Filter[] getServletFilters() {
       CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
       characterEncodingFilter.setEncoding("UTF-8");
       return new Filter[] { characterEncodingFilter};
     }
	
	/*
	 * 
	 * 	<filter>
		<filter-name>springSecurityFilterChain</filter-name>
		<filter-class>org.springframework.web.filter.DelegatingFilterProxy</filter-class>
	</filter>
	<filter-mapping>
		<filter-name>springSecurityFilterChain</filter-name>
		<url-pattern>/*</url-pattern>
	</filter-mapping>*/
}
