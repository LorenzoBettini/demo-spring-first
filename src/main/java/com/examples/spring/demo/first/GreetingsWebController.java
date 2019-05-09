package com.examples.spring.demo.first;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingsWebController {

	// injected value through a property
	@Value("${welcome.message:World!}")
	private String welcomeMessage;

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", welcomeMessage);
		return "index";
	}
}
