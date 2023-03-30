package com.springproject.music.MusicProject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@RequestMapping("/users")
	public String display()
	{
		return "hi i am jeeva";
	}
}
