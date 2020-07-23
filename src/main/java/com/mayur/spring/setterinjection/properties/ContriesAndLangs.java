package com.mayur.spring.setterinjection.properties;

import java.util.Properties;

public class ContriesAndLangs {

	private Properties lang;

	public Properties getLang() {
		return lang;
	}

	public void setLang(Properties lang) {
		this.lang = lang;
	}

	@Override
	public String toString() {
		return "ContriesAndLangs [lang=" + lang + "]";
	}
	
}
