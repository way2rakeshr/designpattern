package com.example.test.service;

import org.springframework.stereotype.Service;

import com.example.test.entity.Engine;
@Service

public class BikeServiceImpl implements CommonService {

	@Override
	public Engine findAll() {
		// TODO Auto-generated method stub
		return new Engine(1, "2 stroke", 2);
	}

	
	

}
