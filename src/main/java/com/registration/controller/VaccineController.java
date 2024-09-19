package com.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registration.repository.VaccineRepo;

@RestController
@RequestMapping("/vaccine")
public class VaccineController {
	@Autowired
	private VaccineRepo repo;
}
	
	
	
@PostMapping("/add")
public VaccineRepo newUser(@RequestBody VaccineRepo model) {
	
	VaccineRepo save =repo.save(model);
	return save;
	
	
}
