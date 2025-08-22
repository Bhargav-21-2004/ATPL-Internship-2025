package com.security.rolebase.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {
	
	@GetMapping("/admin/profile")
	public String admin()
	{
		return "Hello welcome to admin profile";
	}
	
	@GetMapping("/user/dashboard")
	public String user() {
		return "Hello welcome to User Dashboard";
	}
}
