package unidad4;

public class Ejercicio13 {

	static int filas, columnas;

	public static void main(String[] args) {

		filas = (int) (Math.random() * (21 - 2) + 2);
		columnas = (int) (Math.random() * (21 - 2) + 2);

		int matriz[][] = new int[filas][columnas];

		rellenarMatriz(matriz);

		int[] vectorSumaF = sumaFilas(matriz);
		int[] vectorSumaC = sumaColumnas(matriz);
		mostrarMatriz(matriz, vectorSumaF, vectorSumaC);

	}

	public static void rellenarMatriz(int[][] matriz) {

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				int numero = (int) (Math.random() * (21 - 0) + 0);
				matriz[i][j] = numero;

			}
		}
	}

	public static int[] sumaFilas(int[][] matriz) {
		int sumaF;
		int[] vectorSumaF = new int[filas];

		for (int i = 0; i < filas; i++) {
			sumaF = 0;
			for (int j = 0; j < columnas; j++) {

				sumaF = sumaF + matriz[i][j];
				vectorSumaF[i] = sumaF;

			}

		}
		return vectorSumaF;
	}

	public static int[] sumaColumnas(int[][] matriz) {
		int sumaC;
		int[] vectorSumaC = new int[columnas];

		for (int j = 0; j < columnas; j++) {
			sumaC = 0;
			for (int i = 0; i < filas; i++) {

				sumaC = sumaC + matriz[i][j];
				vectorSumaC[j] = sumaC;

			}

		}
		return vectorSumaC;
	}
	
	public static void mostrarMatriz ( int [][]matriz, int []vectorSumaF, int []vectorSumaC) {
		for (int i=0; i< filas; i++) {
			for (int j=0; j< columnas; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.print("......"+vectorSumaF[i]);
			System.out.println();
		}
		System.out.println("---------------------------------------");
		for (int i=0; i< columnas; i++) {
		System.out.print(vectorSumaC[i]+" ");
		}
	}

}
