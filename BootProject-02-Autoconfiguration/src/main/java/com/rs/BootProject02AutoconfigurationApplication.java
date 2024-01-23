package com.rs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.rs.dao.StudentDao;

@SpringBootApplication
public class BootProject02AutoconfigurationApplication {

	public static void main(String[] args) 
	{
		
		ApplicationContext factory=SpringApplication.run(BootProject02AutoconfigurationApplication.class, args);
		
		StudentDao dao=factory.getBean("stdDAO",StudentDao.class);
		try
		{
			System.out.println("Number of student is "+dao.getDataCount());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		((ConfigurableApplicationContext) factory).close();
		
		
	}//end of main

}//end of class
