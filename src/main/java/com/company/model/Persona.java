package com.company.model;

import com.company.exception.EdadException;
import com.company.interfaces.IParticipante;

public abstract class Persona implements IParticipante {

	protected String nombres;
	protected String apellidos;
	protected int edad;

	protected Persona(String nombres, String apellidos, int edad) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	protected String getNombres() {
		return nombres;
	}

	protected void setNombres(String nombres) {
		this.nombres = nombres;
	}

	protected String getApellidos() {
		return apellidos;
	}

	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	protected int getEdad() {
		return edad;
	}

	protected void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String obtenerEdad() throws EdadException {
		String msg;
		if (this.edad >= 18) {
			msg = this.nombres + " tiene " + this.edad + " años.";
			return msg;
		} else {
			throw new EdadException("Persona no puede ser menor de edad");
		}

	}

}
