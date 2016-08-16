package com.marijesus.beans;

public class Persona {
	
	private int id;
	private String nombre;
	private String apodo;
	
	//Spring ya identifica el tipo de dato
	public Persona(int id, String nombre, String apodo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apodo = apodo;
	}
	
	public Persona(int id) {
		this.id = id;
	}
	
	public Persona(String apodo){
		this.apodo = apodo;
	}
	
	
	public int getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApodo() {
		return apodo;
	}
	
}
