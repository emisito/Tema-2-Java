package StringyChar3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Ingresa una cadena de texto, vamos a contar las vocales que tiene");
		String cadena = scn.nextLine();
		
		int contador = 0;
		for (int i = 1; i < cadena.length(); i++){
			if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u') {
				contador ++;
			}
		}
		
		System.out.println("La cadena de texto que ha ingresado: \n" + cadena + "\nCuenta con " + contador + " vocales");
	}

}
