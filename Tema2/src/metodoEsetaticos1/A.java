package metodoEsetaticos1;

/**
 * @author Emanuel Hosu
 * 
 */

public class A {
	private static int x = 5;
	private int y;
	
	public A (int y) {
		this.y = y;
	}
	
	static public void incrementa() {
		A.x++;
		A obj = new A(3);
		obj.y++;
	}
	
	public String toString() {
		return " x = " + A.x +
				" y = " + this.y;
	}

}
