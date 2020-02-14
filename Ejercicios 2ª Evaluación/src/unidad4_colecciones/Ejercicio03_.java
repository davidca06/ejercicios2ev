package unidad4_colecciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio03_ {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		Set <String> textoNoRepetido= new TreeSet<String>();
		Set <String> textoRepetido= new TreeSet<String>();
		
		
		System.out.println("Teclea una cadena de texto: ");
		String cadena = in.nextLine();
		
		String []palabras=cadena.split(" ");
		
		for (int i=0; i<palabras.length; i++) {
			
			if (!textoNoRepetido.contains(palabras[i]) && !textoRepetido.contains(palabras[i])) {
				textoNoRepetido.add(palabras[i]);
			}
			else {
				textoRepetido.add(palabras[i]);
				textoNoRepetido.remove(palabras[i]);
			}
			
		}
		
		System.out.println("Texto no repetido: "+textoNoRepetido);
		System.out.println("----------");
		System.out.print("Texto repetido: "+textoRepetido);
		
		
	}

}
