package unidad5_Ejercicio05;

import java.util.ArrayList;

public class Mazo {
	ArrayList<Naipe> naipes = new ArrayList<>();
	
	

	public Mazo() {
		this(1);
	}

	public Mazo(int n) {
		for (int i = 0; i < n; i++) {
			for (Palo p : Palo.values()) {
				for (Rango r : Rango.values()) {
					naipes.add(new Naipe(p, r));
				}
			}
		}

	}
	
	public Naipe getNaipe () {
		int naipeAleatorio=(int)(Math.random()*(naipes.size()-1)+1);
		return naipes.get(naipeAleatorio);
	}
	
	public Naipe removeNaipe () {
		int naipeQuitado=(int)(Math.random()*(naipes.size()-1)+1);
		return naipes.remove(naipeQuitado);
	}
	
	public void addNaipe(Naipe n) {
		naipes.add(n);
	}
	
	public void addAll(ArrayList <Naipe> nuevosNaipes) {
		naipes.addAll(nuevosNaipes);
	}

	public int sizeMazo () {
		return naipes.size();
	}
	
	
	@Override
	public String toString() {
		return naipes.toString();
	}
	
	

}
