package unidad4;

import java.util.Scanner;

public class Ejercicio06 {
	
	

	public static void main(String[] args) {
		
		int tamaño=(int)(Math.random()*(51-10)+10);
		
		System.out.println("Tamaño del vector: "+tamaño);
		int vector1[]= new int[tamaño];
		
		for (int i=0; i<vector1.length; i++) {
			int numero=(int)(Math.random()*(101-(-100))+(-100));
			do {
				if (numero==vector1[i]) {
					
				}
				
			} while(numero==vector1[i]);
			vector1[i]=numero;
			System.out.print(" "+vector1[i]);
			
		}
		System.out.println();
		int vectorInvertido[]=new int[tamaño];
		for (int j=0; j<vectorInvertido.length; j++) {
			vectorInvertido[j]=vector1[(vector1.length-1)-j];
			System.out.print(" "+vectorInvertido[j]);
		}
		
		
		
	}

}
