package com.spring.core.basics2.noXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationCustomConfig.class);
		
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
