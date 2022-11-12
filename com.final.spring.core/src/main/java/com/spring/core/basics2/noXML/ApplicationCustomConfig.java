package com.spring.core.basics2.noXML;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.spring.core.basics2")
@PropertySource("classpath:application.properties")
public class ApplicationCustomConfig {
	
}