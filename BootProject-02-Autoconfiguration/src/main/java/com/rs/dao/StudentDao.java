package com.rs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("stdDAO")
public class StudentDao 
{
	private static final String GET_STDS_COUNT= "select count(*) from student";
	@Autowired
	private DataSource ds;
	
	public int getDataCount() throws Exception
	{
		Connection con=ds.getConnection();// connection pool
		PreparedStatement ps=con.prepareStatement(GET_STDS_COUNT);
		ResultSet rs=ps.executeQuery();
		rs.next();
		int count=rs.getInt(1);
		rs.close();
		ps.close();
		con.close();
		return count;
		
	}

}//end of class
