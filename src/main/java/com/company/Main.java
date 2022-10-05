package com.company;

import com.company.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================="); 
		Persona p1 = new Persona("Andersson", "Marcos", 19);
		try {
			System.out.println(p1.obtenerEdad());	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
