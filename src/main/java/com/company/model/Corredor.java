package com.company.model;

public class Corredor extends Persona {

	private int velocidad;

	public Corredor(String nombres, String apellidos, int edad, int velocidad) {
		super(nombres, apellidos, edad);
		this.velocidad = velocidad;
	}

	public Corredor(String nombres, String apellidos, int edad) {
		super(nombres, apellidos, edad);
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

}
