package com.ldap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ldapController {
	
	@GetMapping("/")
	String index() {
		return "Home Page";
	}

}
