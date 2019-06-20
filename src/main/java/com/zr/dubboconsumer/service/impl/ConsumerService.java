package com.zr.dubboconsumer.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zr.dubbo.DubboService;
import com.zr.model.User;

@Service
public class ConsumerService {
	@Reference(version = "1.0.0", check=false)
	DubboService dubboService;
	
	
	public List<User> useServer() {
		return dubboService.A();
	}
}
