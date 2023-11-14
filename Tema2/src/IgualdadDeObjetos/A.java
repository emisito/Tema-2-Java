package IgualdadDeObjetos;


public class A {
		private int x;
		private int y;
			public A (int x, int y) {
				this.x = x;
				this.y = y;
			}
			public boolean equals (A a) {
			return (
				this.x == a.x &&
				this.y == a.y
				);
			}
	
}
