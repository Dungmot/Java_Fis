package fis.topic12.practice02.spring.lang.impl;

import fis.topic12.practice02.spring.lang.Language;

public class Vietnamese implements Language{

	@Override
	public String getGreeting() {
		return "Xin chào";
	}

	@Override
	public String getBye() {
		return "Tạm biệt";
	}

}
