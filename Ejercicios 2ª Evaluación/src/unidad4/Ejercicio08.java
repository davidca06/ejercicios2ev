package unidad4;

import java.util.Scanner;

public class Ejercicio08 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Teclea el tama�o del vector (10-200): ");
		int tama�o = in.nextInt();
		do {
			if (tama�o < 10 || tama�o > 200) {
				System.out.println("Tama�o no v�lido. Teclea otra vez (10-200): ");
				tama�o = in.nextInt();
			}
		} while (tama�o < 10 || tama�o > 200);

		int[] vector = new int[tama�o];
		llenarVector(vector);
		System.out.println();
		sumaNumeros(vector);

	}

	public static void llenarVector(int[] vector) {

		for (int i = 0; i < vector.length; i++) {
			int numero = (int) (Math.random() * (21 - (-1)) + (-1));
			vector[i] = numero;
			System.out.print(" " + vector[i]);
		}
	}

	public static void sumaNumeros(int[] vector) {
		int i;
		int sumaTotal=0;
		int sumaParcial=0;
		
		for (i=0; i<vector.length; i++) {
						
			if (vector[i]==13) {
				
					for (int j=i; j<vector.length; j++) {
						sumaParcial=sumaParcial+vector[j];
						if (sumaParcial!=7) {
						vector[j]=0;
						sumaTotal=sumaTotal+vector[j];
						}
					}
									
			}
			
			sumaTotal=sumaTotal+vector[i];
			
			
			}
			
					

		System.out.println("La suma es: " + sumaTotal);
		/*System.out.println("Cantidad de elementos no sumados: " + (contador1 + contador2));*/
	}
}