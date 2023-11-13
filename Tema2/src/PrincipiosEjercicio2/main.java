package PrincipiosEjercicio2;

import java.util.Scanner;

public class main {

/**
 * @author Emi
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner (System.in);
		System.out.println("----------------------------------------------------");
		System.out.println("|Calcular aréa|Calcular perimetro|Terminar programa|");
		System.out.println("|      1      |         2        |        0        | ");
		System.out.println("----------------------------------------------------");
		int i = scn.nextInt();
		/**
		 * @param Aqui hay que hacer una serie de calculos pera un no se como
		 */
		
		
		/**
		 * @param Aqui emipiezo un bucle para el menu
		 */
		while (i > 0) {
			if (i == 1) {
				System.out.println("Introduce el radio del circulo");
				Double num1 = scn.nextDouble();
				circulo area = new circulo(num1);
				System.out.println(area.getArea());
			}
			
			if (i == 2){
				System.out.println("Introduce el perimetro del circulo");
				Double num2 = scn.nextDouble();
				circulo perimetro = new circulo(num2);
				System.out.println(perimetro.getPerimetro());
			}
			
			System.out.println("\n----------------------------------------------------");
			System.out.println("|Calcular aréa|Calcular perimetro|Terminar programa|");
			System.out.println("|      1      |         2        |        0        | ");
			System.out.println("----------------------------------------------------");
			i = scn.nextInt();
		}
		
	}

}
