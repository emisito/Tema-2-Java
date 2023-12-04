package stringychar6;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Ingresa un texto");
		String cadena = scn.nextLine();
		System.out.println("Ingresa la letra que quieres sustituir");
		char afectado = scn.next().charAt(0);
		System.out.println("Por que letra lo quieres sustituir");
		char sustitucion = scn.next().charAt(0);
		
		String cadena2 = cadena.replace(afectado, sustitucion);
		
		System.out.println(cadena2);
	}

}
