package com.spring.core.basics1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		Student trinadh = (Student)context.getBean("student");
	
	
		int hallNo = trinadh.getNo();
		System.out.println("Hall No = "+hallNo);
		

		Cheat deskObject = trinadh.getCheat();
		if(deskObject==null) {
			System.out.println("Failed");
		}
		else {
			deskObject.cheating();
			
		}
		
	}

}
