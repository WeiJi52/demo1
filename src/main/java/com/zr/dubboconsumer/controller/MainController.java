package com.zr.dubboconsumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zr.dubboconsumer.service.impl.ConsumerService;
import com.zr.model.User;

@RestController
public class MainController {
	@Autowired
	ConsumerService consumer;
	
	@RequestMapping("/s")
	public List<User> home() {
		System.out.println("fuck");
		return consumer.useServer();
	}
	
	@RequestMapping("/f")
	public void f() {
		System.out.println("fuck");
	}
}