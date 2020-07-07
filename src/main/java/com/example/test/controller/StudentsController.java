package com.example.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.entity.Engine;
import com.example.test.service.BikeServiceImpl;
import com.example.test.service.CarServiceImpl;

@RestController
@RequestMapping("/students")

public class StudentsController {
	@Autowired
	BikeServiceImpl bikeServiceImpl;
	@Autowired
	CarServiceImpl carServiceImpl;

	@GetMapping("/{id}")
	Engine findAll(@PathVariable int id) {
		
		if(id==4) {
			
		return carServiceImpl.findAll();
		}
		if (id==2) {
			return bikeServiceImpl.findAll();
			
		} else {
			return null;

		}
		
	}

}
