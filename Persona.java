package servidor;

public class Persona {
	
	private int clave;
	private String nombre, correo, cargo;
	private double sueldo;
	
	public Persona(int clave, String nombre, String correo, String cargo, double sueldo) {
		//super();
		this.clave = clave;
		this.nombre = nombre;
		this.correo = correo;
		this.cargo = cargo;
		this.sueldo = sueldo;
	}

	public int getClave() {
		return clave;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public String getCargo() {
		return cargo;
	}

	public double getSueldo() {
		return sueldo;
	}
	
	
}
