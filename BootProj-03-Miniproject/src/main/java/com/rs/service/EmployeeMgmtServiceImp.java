package com.rs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rs.dao.IEmployeeDao;
import com.rs.model.Employee;

@Service("empService")
public class EmployeeMgmtServiceImp implements IEmployeeMgmtService 
{
	@Autowired
	private IEmployeeDao dao;

	@Override
	public List<Employee> FetchEmpDetailsByDesg(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> listemps=dao.getEmpsDetailsByDesg(desg1, desg2, desg3);
		return listemps;
	}

}
