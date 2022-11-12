package com.spring.core.basics2.noXML;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student{
	
	@Value("${student.cheatClass}")
	private String s;

	@Autowired
	@Qualifier(value = "englishCheat")
	private Cheat cheat;
	
	@Value("${student.id}")
	private int no;
	
	public Student() {	
	}

	public Student(Cheat cheat) {
		this.cheat = cheat;
	}
	
	public Cheat getCheat() {
		return cheat;
	}

	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}
	
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
}
