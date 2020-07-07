package com.example.test.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.example.test.entity.Engine;
import com.example.test.entity.Student;

@Service("student")

public class CarServiceImpl implements CommonService {
	List<Student> listStudents = new ArrayList<Student>();

	@Override
	public Engine findAll() {
		// TODO Auto-generated method stub
		

		return new Engine(1, "4 stroke", 4);
	}

}
