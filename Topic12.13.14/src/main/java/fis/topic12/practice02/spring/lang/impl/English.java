package fis.topic12.practice02.spring.lang.impl;

import fis.topic12.practice02.spring.lang.Language;

public class English implements Language{

	@Override
	public String getGreeting() {
		return "What's up man";
	}

	@Override
	public String getBye() {
		return "Ok man";
	}

}
