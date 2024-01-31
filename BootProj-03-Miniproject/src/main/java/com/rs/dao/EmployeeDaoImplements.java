package com.rs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rs.model.Employee;

@Repository("EmpDao")
public class EmployeeDaoImplements implements IEmployeeDao 
{
	private static final String Get_EMP_DETAILS_BY_DESG="select empid, empname, job, sal from emp101 where job in(?,?,?) order by job";
	@Autowired
	private DataSource ds;
	

	@Override
	public List<Employee> getEmpsDetailsByDesg(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> listEmps=null;
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(Get_EMP_DETAILS_BY_DESG))
		{
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			
			try(ResultSet rs=ps.executeQuery())
			{
				listEmps=new ArrayList();
				while(rs.next())
				{
					Employee emp=new Employee();
					emp.setEmpid(rs.getInt(1));
					emp.setEmpname(rs.getString(2));
					emp.setJob(rs.getString(3));
					emp.setSal(rs.getFloat(4));
					listEmps.add(emp);
					
				}//end of while
				
			}// end of try with resource 2
			
		}//end try with resource 1
		catch(SQLException se)
		{
			se.printStackTrace();
			throw se;
			//re-throwing exception
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		
		
		return listEmps;
	}

}
