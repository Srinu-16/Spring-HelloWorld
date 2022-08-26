/**
 * 
 */
package com.learning.springhelloworld.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Srinu16
 *
 */
@RestController
public class HelloWorldController {

	@Value("${helloWorld}")
	private String fromPropertiesFile;
	
	@GetMapping(value = "hello-world",produces = "Application/json")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(value = "hello-world-from-properties")
	public String helloWorldFromProperties() {
		return fromPropertiesFile;
	}
}
	
