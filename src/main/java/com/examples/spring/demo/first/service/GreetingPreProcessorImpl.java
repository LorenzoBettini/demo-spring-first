package com.examples.spring.demo.first.service;

import org.springframework.stereotype.Component;

@Component
public class GreetingPreProcessorImpl implements GreetingPreProcessor {

	/**
	 * No real preprocessing
	 */
	@Override
	public String preprocess(String s) {
		return s;
	}

}
