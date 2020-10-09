package com.binod.learn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hello")
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String greet() {
		
		return "Hello World!";
		
	}

}
