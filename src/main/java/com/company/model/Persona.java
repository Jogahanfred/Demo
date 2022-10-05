package com.company.model;

import com.company.interfaces.IParticipante;

public class Persona implements IParticipante {

	private String nombres;
	private String apellidos;

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

	@Override
	public int obtenerEdad() {
		// TODO Auto-generated method stub
		return 0;
	}

}
