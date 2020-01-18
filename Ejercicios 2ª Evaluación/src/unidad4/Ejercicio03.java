package unidad4;

import java.util.Scanner;

public class Ejercicio03 {
	
	static Scanner in=new Scanner(System.in);
	static int contador=0;

	public static void main(String[] args) {
		
		System.out.println("Escribe la primera cadena: ");
		String cadena1=in.nextLine();
		System.out.println("Escribe la segunda cadena: ");
		String cadena2=in.nextLine();
		comprobacion(cadena1,cadena2);

	}
	public static void comprobacion(String cadena1, String cadena2) {
		
	for (int i=0; i<cadena1.length(); i++) {
		int j=cadena1.indexOf(cadena2, i);
		if (j!=-1) {
			System.out.println("Indice donde comienza la repetición: "+j);
			contador++;
			i=cadena2.length()+j;
		}
	}
	System.out.println("Número repeticiones: "+contador);
	}

}
