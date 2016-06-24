package com.spicejet.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spicejet.cms.model.Login;
import com.spicejet.cms.service.LoginService;
import com.spicejet.cms.to.ResponseTo;

@RestController
public class LoginController {

	@Autowired
	LoginService loginService;

	// @Autowired
	Login login = null;

	@RequestMapping(value = "/login/{role}/{id}/{password}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Object fetchLoginDetails(@PathVariable("role") String userRole, @PathVariable("id") String userId,
			@PathVariable("password") String password) {

		ResponseTo responseTo = new ResponseTo();
		responseTo.setMessage("Login Successfully");
		responseTo.setStatus("SUCCESS");
		
		login = loginService.checkLogin(userRole, userId, password);
		System.out.println("Hello In Checking Login Details");
		if (login == null) {
			System.out.println("Login Credentials Are Wrong Plz enter correct");
			responseTo.setMessage("Please Enter Correct Credentials !");
			responseTo.setStatus("ERROR");
			responseTo.setErrorCode("401");
			return responseTo.toJSON();
		}
		return responseTo.toJSON();
	}

	// @RequestMapping(value = "/login/{role}/{id}/{password}", method =
	// RequestMethod.GET,
	// produces = MediaType.APPLICATION_JSON_VALUE)
	// public ResponseEntity<Login> fetchLoginDetails(@PathVariable("role")
	// String userRole,
	// @PathVariable("id") String userId, @PathVariable("password") String
	// password) {
	//
	// login.setUserName(userId);
	// login.setUserRoll(userRole);
	// login.setPassword(password);
	//
	// login = loginService.checkLoginAuthenticate(login);
	//
	// login = loginService.checkLogin(userRole, userId, password);
	// System.out.println("Hello In Checking Login Details");
	// if (login == null) {
	// System.out.println("Login Credentials Are Wrong Plz enter correct");
	// return new ResponseEntity<Login>(HttpStatus.UNAUTHORIZED);
	// }
	// return new ResponseEntity<Login>(login, HttpStatus.OK);
	// }

	@RequestMapping(value = "/login/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Object checkLoginURL(@PathVariable("id") String userId) {
		// login = loginService.checkLogin(userRole, userId, password);
		System.out.println("Hello In Checking Login Details");
		if (login == null) {
			System.out.println("Login Credentials Are Wrong");
			return userId + "Hello";
			// return new ResponseEntity<Login>(HttpStatus.NOT_FOUND);
		}
		// return new ResponseEntity<Login>(login, HttpStatus.OK);
		return userId + "Helloes";
	}
}
