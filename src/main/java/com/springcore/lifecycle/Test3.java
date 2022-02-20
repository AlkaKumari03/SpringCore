package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lconfig.xml");
		
		context.registerShutdownHook();
		
//		Samosa s1=(Samosa) context.getBean("s1");
//		System.out.println(s1);
//		
//		//registering shutdown hook
//		
//		
//		System.out.println("+++++++++++++++++++++++++++");
//		Pepsi p1 =(Pepsi) context.getBean("p1");
//		
//		System.out.println(p1);
		
		Jalebi jalebi= (Jalebi) context.getBean("jalebi");
		System.out.println(jalebi);

	}

}
