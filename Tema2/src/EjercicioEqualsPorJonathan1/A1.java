package EjercicioEqualsPorJonathan1;

public class A1 {
	private int num;
	private A2 b;
	private A3 a;
	
	public A1 (int num, A2 b, A3 a) {
		this.num = num;
		this.b = b;
		this.a = a;
	}
	
	public boolean equals(A1 d) {
		return(
			this.num == d.num && this.b.equals(d.b)
		);
	}
	
	public A1 clone() {
		return new A1(
				this.num,
				this.b.clone(), 
				this.a.clone()
				);
	}
}
