package com.company;

import com.company.exception.EdadException;
import com.company.model.Corredor; 

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====================");
		Corredor c1 = new Corredor("Andersson", "Marcos", 19);
		try {
			System.out.println(c1.obtenerEdad());
		} catch (EdadException e) {
			System.out.println(e.getMessage());
		}
	}

}
