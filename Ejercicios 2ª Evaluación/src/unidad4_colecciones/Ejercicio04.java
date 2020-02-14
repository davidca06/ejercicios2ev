package unidad4_colecciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		Map <Integer,TreeSet<String>> mapa = new HashMap<Integer,TreeSet<String>>();
		
		
		boolean fin=false;
				
		
		do {
		System.out.println("Teclea \"Texto: \" o \"Lista n\" : ");
		String cadena=in.nextLine();
		
		if (cadena.equalsIgnoreCase("fin")) {
			fin=true;
		}
		else {
		procesarLinea(cadena,mapa);
		}
		System.out.println();
		} while (!fin);
		
		
		
	}
		
		
		
		public static void procesarLinea (String cadena, Map <Integer,TreeSet<String>> mapa) {
			
				if (cadena.charAt(0)=='T') {
					String subcadena=cadena.substring(cadena.indexOf(" ")+2);
					String [] palabras=subcadena.split(" ");
			
				for (int i=0; i<palabras.length; i++) {
					int longitud=palabras[i].length();
				TreeSet<String> coleccion=mapa.get(longitud);
				if (coleccion == null) {
					coleccion = new TreeSet<String>();
					coleccion.add(palabras[i]);
					mapa.put(longitud, coleccion);
					
				}
				else {
					coleccion.add(palabras[i]);
				}
										
			}
				}
				else if (cadena.charAt(0)=='L') {
					String digito=cadena.substring(6);
					int n=Integer.parseInt(digito);
					listar(mapa,n);
				}
				else {
					System.out.println("Error");
				}
		}
		
		public static void listar (Map <Integer,TreeSet<String>> mapa, int n) {
			
			TreeSet<String> coleccion=mapa.get(n);
			Iterator<String> it= coleccion.iterator();
			while (it.hasNext()) {
				System.out.print(it.next()+" ");
			}
			
		}

	}


