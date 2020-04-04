package repaso2ev;

public class Matrices {

	static int[][] cuadrada1(int dim) {

		int filas = dim;
		int columnas = dim;
		int numero = 1;

		int[][] matriz1 = new int[filas][columnas];

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matriz1[i][j] = numero;
				numero++;
			}
		}

		return matriz1;
	}

	static int[][] cuadrada2(int dim) {

		int filas = dim;
		int columnas = dim;
		int numero;
		int numero2 = 0;
		int numero3 = dim;

		int[][] matriz2 = new int[filas][columnas];

		for (int i = 0; i < filas; i = i + 2) {
			numero = numero2 + 1;
			for (int j = 0; j < columnas; j++) {
				matriz2[i][j] = numero;
				numero++;
				numero2 = (i + 2) * dim;

			}
		}
		for (int i = 1; i < filas; i = i + 2) {
			numero = numero3 + 1;
			for (int j = dim - 1; j >= 0; j--) {
				matriz2[i][j] = numero;
				numero++;
				numero3 = (i + 2) * dim;

			}
		}
		return matriz2;
	}

	static String[][] palindromos(int f, int c) {

		String[][] matriz3 = new String[f][c];

		String[] letras = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };

		if ((c < 1 || c > 26) || (f < 1 || f > 26) || ((f + c) > 27)) {

			return null;

		} else {
			for (int i = 0; i < f; i++) {
				for (int j = 0; j < c; j++) {
					matriz3[i][j] = letras[i] + letras[i + j] + letras[i];
				}

			}
			return matriz3;
		}

	}

	static int max3x3sum(int[][] matriz) {

		int sumaT = 0;
		int sumaMatriz;

		for (int k = 0; k < matriz.length - 2; k++) {
			for (int l = 0; l < matriz[k].length - 2; l++) {
				sumaMatriz = 0;
				for (int i = k; i < k + 3; i++) {
					for (int j = l; j < l + 3; j++) {
						int[][] matriz33 = new int[matriz.length][matriz[k].length];
						matriz33[i][j] = matriz[i][j];
						sumaMatriz = sumaMatriz + matriz33[i][j];

					}

				}

				sumaT = sumaT + sumaMatriz;
			}
		}

		return sumaT;
	}
}
