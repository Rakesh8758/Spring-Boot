package com.rs.bean;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("wmg")
public class WissMassageGenerator 
{
	@Autowired
	private LocalDateTime ldt;
	public WissMassageGenerator()
	{
		System.out.println("0-param construcotr wmg");
	}
	
	public String GenerateWishMassage(String user)
	{
		int hour=ldt.getHour();
		
		if(hour <12)
			return "Good Morning "+user;
		else if(hour <16)
			return "Good afternoon "+user;
		else if(hour <20)
			return "Good evening "+user;
		else 
			return "Good Night"+user;
	}

}
