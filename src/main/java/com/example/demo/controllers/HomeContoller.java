package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeContoller {
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String home()
	{
		return "Hello,welcome to sring boot Application";
	}
}
