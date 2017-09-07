package com.mySample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@RequestMapping("call")
	public String CallController() {
		return "Inside My Call Controller";
	}
}
