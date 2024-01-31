package com.rs.service;

import java.util.List;

import com.rs.model.Employee;

public interface IEmployeeMgmtService 
{
	public List<Employee> FetchEmpDetailsByDesg(String desg1,String desg2,String desg3) throws Exception;

}
