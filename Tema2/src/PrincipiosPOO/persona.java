package PrincipiosPOO;

/**
 * @author Emi
 * Ayayayay, que la estamos liando
 */


public class persona {
	
	private int DNI;
	private int Edad;
	private String Nombre;
	private String Apellidos;
	private String Telefono;
	
	/**
	 * Constructora
	 * @param Nombre
	 * @param Apellidos
	 * @param DNI
	 * @param Edad
	 * @param Telefono
	 */
	public persona(String Nombre, String Apellidos, int DNI, int Edad, String Telefono) {
		this.Nombre = Nombre;
		this.Apellidos = Apellidos;
		this.DNI = DNI;
		this.Edad = Edad;
		this.Telefono = Telefono;
		
	}
	
	/**
	 * Metodo return
	 * @return
	 */
	public String obtenerTodo() {
		return "Nombre: " + this.Nombre + "\nApellidos: " + this.Apellidos + "\nDNI:" + this.DNI + "\nEdad: "+ this.Edad + "\nTelefono:"+  this.Telefono;
	}
	
	
}

