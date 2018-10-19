package com.nanda.firstrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nanda.firstrestapi.app.AppConstants;

@RestController
public class WebApiController {

	@GetMapping(value = AppConstants.BASE_METHOD_WEB + "/data")
	public String getData() {
		return "";
	}

}
