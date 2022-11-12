package com.spring.core.basics2.noXML;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ScienceCheat  implements Cheat{

	public void cheating() {
		System.out.println("Science Cheating Started -> Answers all");
	}
}
