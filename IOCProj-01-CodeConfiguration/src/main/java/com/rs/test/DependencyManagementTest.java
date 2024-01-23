package com.rs.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rs.bean.WissMassageGenerator;
import com.rs.confg.AppConfig;

public class DependencyManagementTest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext factory=new AnnotationConfigApplicationContext(AppConfig.class);
		WissMassageGenerator generate=factory.getBean("wmg",WissMassageGenerator.class);
		String result=generate.GenerateWishMassage("Rakesh");
		System.out.println(result);
		factory.close();
		
		

	}

}
