package Persona;

public class ListaEnlazadaPersonas {

	private NodoPersona cabeza;
	private NodoPersona cola;
	private int totalElementos;

	public ListaEnlazadaPersonas() {
		super();
		this.cabeza = null;
		this.cola = null;
		this.totalElementos = 0;
	}

	public void insertar(Persona p) {

		NodoPersona uno = new NodoPersona(p);

		if (cabeza == null) {
			cabeza = uno;
			cola = uno;
			this.totalElementos++;

		} else {

			if (uno.compareTo(cabeza) == 1) {
				uno.setSiguiente(cabeza);
				cabeza.setAnterior(uno);
				cabeza = uno;
				this.totalElementos++;

			} else if (uno.compareTo(cola) == -1) {
				uno.setAnterior(cola);
				cola.setSiguiente(uno);
				cola = uno;
				this.totalElementos++;

			} else {

				NodoPersona persona = cabeza;

				while (persona.getSiguiente() != null) {

					persona = cabeza.getSiguiente();

					if (uno.compareTo(persona) == 1) {
						uno.setSiguiente(persona);
						uno.setAnterior(persona.getAnterior());
						persona.getAnterior().setSiguiente(uno);
						persona.setAnterior(uno);
						persona = uno;
						this.totalElementos++;
						break;
					} else {
						persona = persona.getSiguiente();
					}
				}
			}
		}
	}

	public void ordenar(NodoPersona p) {

		NodoPersona a = cabeza.getSiguiente();

		if (p.compareTo(a) == 1) {
			p.setAnterior(cabeza);
			p.setSiguiente(a);
			a.setAnterior(p);
			this.totalElementos++;
		} else {

		}

	}

	public int getTotalElementos() {
		return this.totalElementos;
	}

	public String toString() {

		String devuelve = "ListaEnlazadaPersonas: \nCabeza =" + cabeza.toString();
		
		NodoPersona persona = cabeza.getSiguiente();
		
		while (persona.getSiguiente() != null) {
			devuelve += "\nNodo =" + persona.toString();
			persona = persona.getSiguiente();
		}

		return devuelve += "\nCola =" + cola.toString() + "\nTotal Elementos: " + totalElementos + "";

	}

}
