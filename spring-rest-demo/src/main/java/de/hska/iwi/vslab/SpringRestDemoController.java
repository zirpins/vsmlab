package de.hska.iwi.vslab;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringRestDemoController {	
	@RequestMapping(value = "/hello")
	public String helloWorld() {
		return "Hello World!";
	}
}
