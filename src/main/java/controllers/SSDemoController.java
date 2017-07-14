package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import config.RequestInterceptor;

@Controller
public class SSDemoController {
	@Autowired
	RequestInterceptor reqInterceptor;
	
	@RequestMapping(path="/Iamadmin", method = RequestMethod.GET)
	@PreAuthorize("reqInterceptor.isAdmin")
	public ResponseEntity<String>  isValidUser(){
		return new ResponseEntity<String>("yes", HttpStatus.OK);
	}
}