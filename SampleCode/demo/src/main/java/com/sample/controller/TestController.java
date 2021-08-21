package com.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.model.FinalResult;
import com.sample.service.TestServiceImpl;

@RestController
public class TestController {

	@Autowired
	private TestServiceImpl testService;

	@GetMapping("/results")
	public FinalResult formPost() {
		return testService.getResults();
	}
}
