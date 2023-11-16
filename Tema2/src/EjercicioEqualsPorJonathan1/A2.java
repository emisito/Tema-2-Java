package EjercicioEqualsPorJonathan1;

public class A2 {
	private char michar;
	private A3 a;
	
	public A2 (char michar, A3 a) {
		this.michar = michar;
		this.a = a;
	}
	
	public boolean equals (A2 b) {
		return(
			this.michar == b.michar && this.a.equals(b.a)
		);
	}
}
