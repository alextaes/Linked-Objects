package Persona;

public class Persona {

	private String nombre;
	private int edad;
	private Double peso;
	private Double altura;

	public Persona(String nombre, int edad, Double peso, Double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public boolean iguales(Persona p) {

		boolean igual = true;

		if (!this.nombre.equals(p.getNombre()))
			igual = false;
		else if (this.edad != p.getEdad())
			igual = false;
		else if (this.peso != p.getPeso())
			igual = false;
		else if (this.altura != p.getAltura())
			igual = false;

		return igual;
	}

	@Override
	public String toString() {
		return "[nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura + "]";
	}

}
