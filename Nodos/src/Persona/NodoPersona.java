package Persona;

public class NodoPersona implements Comparable<NodoPersona> {

	private Persona valor;
	private NodoPersona anterior;
	private NodoPersona siguiente;

	public NodoPersona(Persona valor) {

		this.valor = valor;
		this.anterior = null;
		this.siguiente = null;

	}
	
	
	public NodoPersona(NodoPersona a) {
		this.valor=a.getValor();
		this.anterior=a.getAnterior();
		this.siguiente=a.getSiguiente();
	}
	
	
	

	public Persona getValor() {
		return valor;
	}

	public void setValor(Persona valor) {
		this.valor = valor;
	}

	public NodoPersona getAnterior() {
		return anterior;
	}

	public void setAnterior(NodoPersona anterior) {
		this.anterior = anterior;
	}

	public NodoPersona getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoPersona siguiente) {
		this.siguiente = siguiente;
	}

	@Override
	public int compareTo(NodoPersona p) {
		if (this.valor.getEdad() > p.getValor().getEdad())
			return 1;
		if (this.valor.getEdad() < p.getValor().getEdad())
			return -1;
		return 0;
	}

	@Override
	public String toString() {
		
		String devuelve="";
		
		devuelve+=" "+ valor.toString();
		
		if(anterior==null && siguiente==null) {
			devuelve+=", ANTERIOR = nulo, SIGUIENTE = nulo]";
		}
		else if(anterior!=null && siguiente==null) {
			devuelve+=", ANTERIOR = "+anterior.getValor().toString()+", SIGUIENTE = nulo]";
		}
		else if(anterior==null && siguiente!=null) {
			devuelve+=", ANTERIOR = nulo, "+"SIGUIENTE"+siguiente.getValor().toString();
		}
		else {
			devuelve+=", ANTERIOR = "+anterior.getValor().toString()+", SIGUIENTE = "+siguiente.getValor().toString();
		}
		return devuelve;
	}

	
	
	
}
