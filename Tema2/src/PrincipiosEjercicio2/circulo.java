package PrincipiosEjercicio2;


/**
 * @author Emi ;)
 * Aqui empezamos las cosas
 */
public class circulo {
	private double area;
	private double perimetro;
	private double radio;
	final private double pi =3.1415;
	/**
	 * Constructora
	 * @param _area
	 * @param _perimetro
	 * @param _radio
	 */
	public circulo(Double _radio) {
		this.area = 0;
		this.perimetro = 0;
		this.radio = _radio;
	}
	
	/**
	 * Metodos getArea y getPerimetro
	 * @return
	 */
	
	public Double getArea() {
		this.area = (this.pi * (this.radio * this.radio));
		return area;
	}
	
	public Double getPerimetro() {
		this.perimetro = ((2 * pi) * this.radio);
		return perimetro;
	}
	
}
