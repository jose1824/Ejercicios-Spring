package com.marijesus.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.marijesus.beans.Persona;

public class MainApp {

	public static void main(String[] args) {
		
		//INYECCION DE DEPENDENCIAS USANDO EL CONSTRUCTOR 
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/marijesus/xml/beans.xml");
		Persona per = (Persona) appContext.getBean("persona");
		
		System.out.println(per.getId() + " " + per.getNombre() + " " + per.getApodo());
		
		((ConfigurableApplicationContext) appContext).close();
		
	}

}
