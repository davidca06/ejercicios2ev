package repaso2ev;

import java.util.Scanner;

public class PruebaMatrices {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Matrices matriz = new Matrices();

		System.out.println("Matriz Cuadrada 1: ");
		System.out.println("Dimension NxN: ");

		int dimensionMatriz1 = in.nextInt();

		int matrizA[][] = matriz.cuadrada1(dimensionMatriz1);

		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.print(matrizA[j][i] + " ");
			}
			System.out.println();
		}

		System.out.println("-------------------------");

		System.out.println("Matriz Cuadrada 2: ");
		System.out.println("Dimension NxN: ");

		int dimensionMatriz2 = in.nextInt();

		int matrizB[][] = matriz.cuadrada2(dimensionMatriz2);

		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB[i].length; j++) {
				System.out.print(matrizB[j][i] + " ");
			}
			System.out.println();
		}

		System.out.println("-------------------------");

		System.out.println("Matriz Palíndromo NxM: ");

		System.out.println("Dimension N: ");
		int f = in.nextInt();
		System.out.println("Dimension M: ");
		int c = in.nextInt();

		String[][] matrizC = matriz.palindromos(f, c);

		while (matrizC == null) {
			System.out.println("Parámetros inválidos. Introduce otra vez los datos: ");
			f = in.nextInt();
			c = in.nextInt();
			matrizC = matriz.palindromos(f, c);
		}

		for (int i = 0; i < matrizC.length; i++) {
			for (int j = 0; j < matrizC[i].length; j++) {
				System.out.print(matrizC[i][j] + " ");

			}
			System.out.println();

		}

		System.out.println("-------------------------");

		System.out.println("Suma Matrices 3x3: ");

		System.out.println("Filas: ");
		int filas = in.nextInt();
		System.out.println("Columnas: ");
		int columnas = in.nextInt();

		int[][] matrizD = new int[filas][columnas];

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				int numero = (int) (Math.random() * (2 - 0) + 0);
				matrizD[i][j] = numero;
				System.out.print(matrizD[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("--------------------");

		int sumaTotal = matriz.max3x3sum(matrizD);

		System.out.println("Suma Total Matrices 3x3: " + sumaTotal);

		in.close();
	}
}