package com.marijesus.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	//Para que Spring sepa cual es el bean manejado
	//Es lo mismo que el XMl
	@Bean
	public Mundo mundo() {
		return new Mundo(); //Se devuelve la instancia de mundo
	}
}
