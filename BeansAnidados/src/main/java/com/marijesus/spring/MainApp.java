package com.marijesus.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.marijesus.beans.Persona;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/marijesus/xml/beans.xml");
		Persona per = (Persona) appContext.getBean("persona");
		
		System.out.println(per.getId() + " " 
				+ per.getNombre() + " " 
				+ per.getApodo() + " " 
				+ per.getPais().getNombre() + " "
				+ per.getPais().getCiudad().getNombre());
		
		((ConfigurableApplicationContext) appContext).close();

	}

}
