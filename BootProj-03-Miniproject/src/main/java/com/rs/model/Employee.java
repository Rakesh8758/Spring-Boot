package com.rs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee
{
	private Integer empid;
	private String empname;
	private String job;
	private Float sal;

}
