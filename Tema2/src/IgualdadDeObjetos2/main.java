package IgualdadDeObjetos2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1 = new B(2);
		B b2 = new B(2);
		A1 a1 = new A1(3,b1);
		A1 a2 = new A1(3,b2);
		
		if (a1.equals(a2))
			System.out.println("Cierto");
		else
			System.out.println("Falso");
	}

}
