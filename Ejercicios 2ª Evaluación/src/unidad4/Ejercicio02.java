package unidad4;

import java.util.Scanner;

public class Ejercicio02 {
	
	static Scanner in= new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Escribe un texto: ");
		String cadena=in.nextLine();
		cadenaInvertida(cadena);

	}
public static void cadenaInvertida(String cadena) {
	
	for (int j=cadena.length()-1; j>=0; j--) {
		char c=cadena.charAt(j);
		System.out.print(c);
	}
}
}
