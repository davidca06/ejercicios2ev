package unidad5_Ejercicio07;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Palabras {

	private String cadena;
	private Set<String> conjuntoPalabras;
	private Map<Integer,Set<String>> mapa;
	
	
	public Palabras() {
		this.cadena = cadena;
		this.conjuntoPalabras = conjuntoPalabras;
		mapa= new TreeMap<Integer,Set<String>>();
	}


	public Palabras(String cadena) {
		this.cadena = cadena;
	}


	public String getCadena() {
		return cadena;
	}


	public void setCadena(String cadena) {
		this.cadena = cadena;
	}
	
	

	public Set<String> getConjuntoPalabras() {
		return conjuntoPalabras;
	}


	public void setConjuntoPalabras(Set<String> conjuntoPalabras) {
		this.conjuntoPalabras = conjuntoPalabras;
	}


	public Map<Integer, Set<String>> getMapa() {
		return mapa;
	}


	public void setMapa(Map<Integer, Set<String>> mapa) {
		this.mapa = mapa;
	}


	public Set<String> leerEntrada(String cadena) {
		char inicial=cadena.charAt(0);
		if (inicial=='T') {
			añadirPalabras(cadena);
			return null;
		}
		else {
			
			Set <String> conjuntoPalabras=listarPalabras(cadena);
			return conjuntoPalabras;
		}
	}
	
	public void añadirPalabras(String cadena) {
		
		
			//añadir palabras
			cadena=cadena.substring(cadena.indexOf(":")+2);
			String [] palabras=cadena.split(" ");
			for (int i=0; i<palabras.length; i++) {
				String palabra=palabras[i];
				int longitud=palabra.length();
				
				Set <Integer> conjuntoClaves=mapa.keySet();
				if (conjuntoClaves.contains(longitud)) {
					TreeSet <String> conjuntoPalabras=(TreeSet<String>) mapa.get(longitud);
					conjuntoPalabras.add(palabra);
				
				}
				else {
					TreeSet <String> conjuntoPalabras= new TreeSet<>();
					conjuntoPalabras.add(palabra);
					mapa.put(longitud, conjuntoPalabras);
					
					}
			}
			}
			
		
		
		
		public Set<String> listarPalabras(String cadena) {
			
				//listar palabras
				String longitud=cadena.substring(cadena.indexOf(" ")+1);
				//System.out.println(longitud);
				int longitudPalabra=Integer.parseInt(longitud);
				Set <String> conjuntoPalabras=mapa.get(longitudPalabra);
				return conjuntoPalabras;
			}
		
		
	
	
	
	@Override
	public String toString() {
		return cadena;
	}
	
	
	
	
	
}
