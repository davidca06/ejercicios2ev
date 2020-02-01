package unidad4;

import java.util.Scanner;

public class Ejercicio10 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Tama�o del vector (10-20): ");
		int tama�o = in.nextInt();
		while (tama�o < 10 || tama�o > 20) {
			System.out.println("Tama�o no v�lido. Teclea otra vez: ");
			tama�o = in.nextInt();
		}
		int[] vector = new int[tama�o];

		llenarVector(vector);
		System.out.println();
		diferenciaMinima(vector);

	}

	public static void llenarVector(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			int numero=(int)(Math.random()*(101-0)+0);
			vector[i]=numero;
			System.out.print(" "+vector[i]);
		}
	}
	public static void diferenciaMinima (int []vector) {
		int diferencia;
		int difMinima=vector[1]-vector[0];
		
		for (int i=2; i<vector.length; i++) {
			diferencia=vector[i]-vector[i-1];
			if (diferencia<difMinima) {
				difMinima=diferencia;
			}
		}
		
		System.out.println("La menor diferencia entre valores adyacentes es: "+difMinima);
		
	}
}
