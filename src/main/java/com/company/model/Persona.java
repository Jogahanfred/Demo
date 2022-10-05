package com.company.model;

import com.company.exception.EdadException;
import com.company.interfaces.IParticipante;

public class Persona implements IParticipante {

	private String nombres;
	private String apellidos;
	private int edad;

	public Persona(String nombres, String apellidos, int edad) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String obtenerEdad() throws EdadException {
		String msg;
		if (this.edad >= 18) {
			msg = this.nombres + " tiene " + this.edad +" años.";
			return msg;
		} else {
			throw new EdadException("Persona no puede ser menor de edad");
		}

	}

}
