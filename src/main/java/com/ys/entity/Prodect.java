package com.ys.entity;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class Prodect {
	RedisTemplate redisTemplate;
	@RequestMapping
	public void Rediss(Model model) {
		
		ValueOperations opsForValue = redisTemplate.opsForValue();
		model.addAttribute("list",opsForValue);
		return ;
	}
}
