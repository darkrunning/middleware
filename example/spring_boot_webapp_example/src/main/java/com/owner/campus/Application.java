/**
 * 
 */
package com.owner.campus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author oliverpc
 *
 * 2018年2月5日 下午12:14:30
 */

@SpringBootApplication
public class Application extends SpringBootServletInitializer {
	
	
	protected SpringApplicationBuilder configure (SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}
	
	public static void main (String [] args) {
		SpringApplication.run(Application.class, args);
	}
}
