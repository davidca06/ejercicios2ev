package unidad4;

import java.util.Scanner;

public class Ejercicio02 {
	
	static Scanner in= new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Escribe un texto: ");
		String cadena=in.nextLine();
		String inversa=cadenaInvertida(cadena);
		
		System.out.println(inversa);

	}
public static String cadenaInvertida(String cadena) {
	
	String alreves="";
	for (int j=cadena.length()-1; j>=0; j--) {
		char c=cadena.charAt(j);
		alreves=alreves+c;
		}
	return alreves;
}

}
