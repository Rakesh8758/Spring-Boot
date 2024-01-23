package com.rs.confg;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages="com.rs.bean")
public class AppConfig 
{
	public AppConfig()
	{
		System.out.println("appconfig 0-param constructor ");
		
	}
	@Bean("sysDate")
	public LocalDateTime createLDT()
	{
		System.out.println("creating local date time");
		return LocalDateTime.now();
	}

}
