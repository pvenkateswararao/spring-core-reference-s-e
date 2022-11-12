package com.spring.core.basics1;


public class Student{
	
	private Cheat cheat;
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
