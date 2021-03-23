package com.demo.docker.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("hello/{name}")
	public String hello( @PathVariable("name")final String name) {
		
		return "Hello "+name;
	}
}
