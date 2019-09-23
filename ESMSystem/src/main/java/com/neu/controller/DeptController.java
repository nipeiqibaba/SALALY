package com.neu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neu.entity.Dept;
import com.neu.service.DeptService;

@RestController
@RequestMapping("Dept")
public class DeptController {
	@Autowired
	private DeptService deptService;
	
	@RequestMapping("getall")
	public List<Dept> getAll(){
		return deptService.getAll();
	}
}
