package com.marijesus.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.marijesus.beans.Mundo;

public class App {

	public static void main(String[] args) {
		//POR CONFIGURACIÓN XML
		//Si el xml se encuentra en el mismo paquete esta instruccion se puede dejar en blanco
		//De lo contrario se hace referencia al xml con todo y ruta
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/marijesus/xml/beans.xml");
		Mundo m = (Mundo) appContext.getBean("mundo");
		
		System.out.println(m.getSaludo());
		
		//POR ANOTACIONES JAVA
		//Obteniendo el bean
		AnnotationConfigApplicationContext appContextAnotacion = new AnnotationConfigApplicationContext();
		//Se registran los Beans
		appContextAnotacion.register(com.marijesus.beans.AppConfig.class);
		appContextAnotacion.register(com.marijesus.beans.AppConfig2.class);
		appContextAnotacion.refresh(); //Reconstruir el archivo de configuracion con los archivos que tiene los Benas
		//Se tiene igual resultado porque se viene definiendo de la misma instancia
		
		Mundo mundo = (Mundo) appContextAnotacion.getBean("mundo");
		System.out.println(mundo.getSaludo());
		
		((ConfigurableApplicationContext)appContext).close(); //Liberar el recurso

	}

}
