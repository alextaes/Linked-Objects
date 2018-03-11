package Persona;

public class Prueba_ListaNodos {

	public static void main(String[] args) {

		Persona p1 = new Persona("Alejandro", 27, 85.4, 178.5);
		Persona p2 = new Persona("María", 16, 55.42, 157.0);
		Persona p3 = new Persona("Alberto", 51, 95.0, 180.0);
		Persona p4 = new Persona("Paco", 34, 76.2, 198.3);
		Persona p5 = new Persona("Marisa", 93, 46.8, 148.5);
		Persona p6 = new Persona("Antonio", 13, 53.8, 140.5);


		ListaEnlazadaPersonas l1 = new ListaEnlazadaPersonas();

		l1.insertar(p1);
		l1.insertar(p2);
		l1.insertar(p3);
		l1.insertar(p4);
		l1.insertar(p5);
		l1.insertar(p6);


		System.out.println(l1.toString());

	}

}
