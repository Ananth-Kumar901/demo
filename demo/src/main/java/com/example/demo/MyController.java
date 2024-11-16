package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController
{
	
	@PostMapping("/save")
	public void save()
	{
		System.out.println("Save method");
	}
}
