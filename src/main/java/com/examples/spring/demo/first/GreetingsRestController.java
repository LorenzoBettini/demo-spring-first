package com.examples.spring.demo.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsRestController {

	@GetMapping("/hi")
	public String sayHi() {
		return "Hello";
	}
}
