package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaconfig {
	
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	@Bean(name= {"temp","student","con"})
	public Student getStudent() {
		
		//creating new student object
		Student student=new Student(getSamosa());
		
		return student;
		
	}
	

}
