package StringyChar2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		System.out.println("Introduce una cadena de texto, intenta que tenga muchas e");
		String cadena = scn.nextLine();
		String cadenax = cadena.replace('e', 'x');
		
		System.out.println(cadenax);
	}

}
