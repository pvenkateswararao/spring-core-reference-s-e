package com.spring.core.basics2.noXML;

import org.springframework.stereotype.Component;

@Component
public class EnglishCheat implements Cheat {
	public void cheating() {
		System.out.println("English Cheating Started -> Answers all");
	}
}
