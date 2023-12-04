package StringyChar1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		System.out.println("Introduce una cadena de texto");
		String cadena = scn.nextLine();
				
		int contador = 0;
		for (int i = 1; i < cadena.length(); i++) {
			if(cadena.charAt(i) == 'a' || cadena.charAt(i) == 'A') {
				contador++;
			}
		}
		
		System.out.println("La cadena de texto que ha introducido: " + cadena + "cuenta con la cantidad de A y a de " + contador);
	}

}
