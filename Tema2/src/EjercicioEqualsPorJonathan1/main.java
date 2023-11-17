package EjercicioEqualsPorJonathan1;


/**
 * @author Emanuel Hosu
 * Smurfing
 */
public class main {

	public static void main(String[] args) {
		A3 a = new A3(3, 8);
		A3 a2 = a.clone();
		A3 a3 = new A3(9, 0);
		A3 a4 = a;
		A2 b = new A2('*', a);
		A2 b2 = b;
		A1 d = new A1(4, b, a);
		A1 d2 = d;
		
		if (a.equals(a4))
			System.out.println("Cierto");
		else
			System.out.println("Falso");
	}

}

