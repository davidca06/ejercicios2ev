package unidad5_Ejercicio05;

public class Naipe {
	
	private Palo palo;
	private Rango rango;
	private int valor;
	
	public Naipe(Palo palo, Rango rango, int valor) {
		this.palo = palo;
		this.rango = rango;
		this.valor = valor;
	}

	public Naipe(Palo palo, Rango rango) {
		this(palo,rango,(palo.ordinal()+1+rango.ordinal()+1));
	}

	public Palo getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	public Rango getRango() {
		return rango;
	}

	public void setRango(Rango rango) {
		this.rango = rango;
	}

	@Override
	public String toString() {
		return palo.getSimbolo()+rango.getSimbolo();
	}
	
	
	

}
