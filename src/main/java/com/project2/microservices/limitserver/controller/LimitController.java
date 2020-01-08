package com.project2.microservices.limitserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project2.microservices.limitserver.Beans.ConfigarationBean;

@RestController
public class LimitController {
	@Autowired
	ConfigarationBean configBean;
	@GetMapping("limits")
	public ConfigarationBean limitConfigarations() {
		return configBean; 
	}
}
