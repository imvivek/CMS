package com.spicejet.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spicejet.cms.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	LoginService loginService;

	@RequestMapping(value = "/login/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Object fetchLoginDetails(@PathVariable("id") String userId) {
//		loginService.checkLogin(userRole, userId, password);
//@PathVariable("role") String userRole, @PathVariable("id ") String userId, @PathVariable("password") String password
		return userId+ " passed From URL! Hello ";

	}
}
