package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.model.Student;

@Configuration
@ComponentScan(basePackages= {"com.model"})
public class MyConfiguration {
	 
	public MyConfiguration() {
		System.out.println("my configuration object is present");
	}
	
	@Bean
	public void M2() {
		System.out.println("we are in m2");
	}
	
//	@Bean
//	@Scope(scopeName = "prototype")
//	public Student m1() {
//		System.out.println("m1 method is called");
//		Student s=new Student();
//		s.setSid(10);
//		return  s 	;
	
	}


