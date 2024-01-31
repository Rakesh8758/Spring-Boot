package com.rs;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.rs.controller.PayrollSystemController;
import com.rs.model.Employee;

@SpringBootApplication
public class BootProj03MiniprojectApplication 
{
	

	public static void main(String[] args) 
	{
		//ioc container
		ApplicationContext factory=SpringApplication.run(BootProj03MiniprojectApplication.class, args);
		//get controller class object
		PayrollSystemController controller=factory.getBean("controller", PayrollSystemController.class);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter desg1");
		String desg1=sc.next();
		
		System.out.println("Enter desg2");
		String desg2=sc.next();
		
		System.out.println("Enter desg3");
		String desg3=sc.next();
		
		try
		{
			List<Employee> listemps=controller.showEmpDetailsByDesg(desg1, desg2, desg3);
			listemps.forEach(System.out::println);
		}
		catch(SQLException se)
		{
			se.printStackTrace();
			System.out.println("Internal database problem ");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Unknown problem ");
		}
		
		
		
	}

}
