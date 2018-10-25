package com.opus.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.opus.demo.model.Employee;
//import com.opus.demo.service.EmpService;
import com.opus.demo.service.EmpServiceImpl;


@RestController
public class EmpController {

	@Autowired
	private EmpServiceImpl empservice;
	
	@RequestMapping("/hi")
	public String hi()
	{
		return "Hi..........";
		
	}
	
	@RequestMapping("/insert")
	public void insert()
	{
		empservice.insertData();
		
	}
	
	@RequestMapping("/getAll")
	public List<Employee> getAll()
	{
		return empservice.getAll();
	}
	
	
	
}
