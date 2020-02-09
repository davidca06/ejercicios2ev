package unidad4_colecciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio04 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		Map <Integer,TreeSet<String>> mapa = new HashMap<Integer,TreeSet<String>>();
		
		
		boolean fin=false;
				
		
		do {
		System.out.println("Texto: ");
		String cadena=in.readLine();
		if (cadena.equalsIgnoreCase("fin")) {
			fin=true;
		}
		procesarLinea(cadena,mapa);
				
		} while (!fin);
		
		
		
		
		System.out.println("Lista n: ");
		int numero=Integer.valueOf(in.readLine());
		while (numero <= 0) {
			System.out.println("La longitud del texto debe ser mayor de cero. Teclea otra vez: ");
			numero=Integer.valueOf(in.readLine());
		} 
		
		if (numero > 0) {
			System.out.println(mapa.get(numero));
		}
		
			
			
			
		}
		
		
		public static void procesarLinea (String cadena, Map <Integer,TreeSet<String>> mapa) {
			
			Scanner s=new Scanner(cadena);
			
			while (s.hasNext()) {
				String palabra=s.next();
				int longitud= palabra.length();
				TreeSet<String> coleccion=mapa.get(longitud);
				if (coleccion == null) {
					coleccion = new TreeSet<String>();
					mapa.put(longitud, coleccion);
					coleccion.add(palabra);
				}
				else {
					coleccion.add(palabra);
				}
										
			}
			
		}

	}


