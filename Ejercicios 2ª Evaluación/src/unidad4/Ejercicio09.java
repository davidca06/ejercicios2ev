package unidad4;

public class Ejercicio09 {

	public static void main(String[] args) {

		int tamaño = (int) (Math.random() * (501 - 10) + 10);
		int[] vector = new int[tamaño];
		
		llenarVector(vector);
		System.out.println();
		secuencias(vector);

	}

	public static void llenarVector(int[] vector) {
		int contador = 0;
		for (int i = 0; i < vector.length; i++) {
			int numero = (int) (Math.random() * (101 - (-100)) + (-100));
			vector[i] = numero;
			if (vector.length <= 50) {
				System.out.print(" " + vector[i]);
			}

		}

	}

	public static void secuencias(int[] vector) {
			
		boolean haySecuencia=false;
		int contadorSecuencias=0;
		
		for (int i=1; i<vector.length; i++) {
			
			if (vector[i]==vector[i-1] && !haySecuencia) {
				contadorSecuencias++;
				haySecuencia=true;
			}
			if (vector[i]==vector[i-1]) {
				haySecuencia=false;
			}
		}
		
		System.out.println("Número de secuencias: "+contadorSecuencias);
		
	}

}
