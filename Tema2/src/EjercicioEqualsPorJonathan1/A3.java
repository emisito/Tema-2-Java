package EjercicioEqualsPorJonathan1;

/**
 * @author emi
 */

public class A3 {
	private int numero1;
	private int numero2;
	
	public A3 (int num1, int num2) {
		this.numero1 = num1;
		this.numero2 = num2;
	}
	
	public boolean equals (A3 a) {
		return (this.numero1 == a.numero1 && this.numero2 == a.numero2);
	}
	
	public A3 clone() {
		return new A3(this.numero1, this.numero2);
	}
	
}
