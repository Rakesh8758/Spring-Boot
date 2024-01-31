package com.rs.dao;

import java.util.List;

import com.rs.model.Employee;

public interface IEmployeeDao 
{
	public List<Employee> getEmpsDetailsByDesg(String desg1,String desg2,String desg3) throws Exception;

}
