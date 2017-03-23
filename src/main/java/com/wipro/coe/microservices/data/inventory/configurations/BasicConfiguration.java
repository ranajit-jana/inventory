	package com.wipro.coe.microservices.data.inventory.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;



@Configuration
@EnableAutoConfiguration
class BasicConfiguration {

	@Configuration
	
	static class CassandraConfig  {

	   @Autowired
	    private Environment environment;
	   
	   
			}
}
