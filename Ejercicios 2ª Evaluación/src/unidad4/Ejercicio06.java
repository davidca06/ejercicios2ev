package unidad4;

import java.util.Scanner;

public class Ejercicio06 {
	
	

	public static void main(String[] args) {
		
		int tama�o=(int)(Math.random()*(51-10)+10);
		
		System.out.println("Tama�o del vector: "+tama�o);
		int vector1[]= new int[tama�o];
		
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
		int vectorInvertido[]=new int[tama�o];
		for (int j=0; j<vectorInvertido.length; j++) {
			vectorInvertido[j]=vector1[(vector1.length-1)-j];
			System.out.print(" "+vectorInvertido[j]);
		}
		
		
		
	}

}
