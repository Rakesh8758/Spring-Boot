package com.rs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.rs.model.Employee;
import com.rs.service.IEmployeeMgmtService;

@Controller("controller")
public class PayrollSystemController 
{
	@Autowired
	private IEmployeeMgmtService service;
	
	public List<Employee> showEmpDetailsByDesg(String desg1,String desg2,String desg3) throws Exception
	{
		List<Employee> listemps=service.FetchEmpDetailsByDesg(desg1, desg2, desg3);
		return listemps;
		
	}

}
