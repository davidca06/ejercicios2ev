package unidad4;

public class Ejercicio09 {

	public static void main(String[] args) {

		int tamaño = (int) (Math.random() * (501 - 10) + 10);
		int[] vector = new int[tamaño];

		llenarVector(vector);
		

	}

	public static void llenarVector(int[] vector) {
		int contador=0;
		for (int i = 0; i < vector.length; i++) {
			int numero = (int) (Math.random() * (101 - (-100)) + (-100));
			vector[i] = numero;
			if (vector.length <= 50) {
				System.out.print(" " + vector[i]);
			}
			
			
		}
		if (vector[1]==vector[0]) {
			contador++;
			for (int j=2; j<vector.length; j++) {
				if (vector[j]==vector[j-1]) {
					contador++;
				}
				
			}
		}
		for (int j=2; j<vector.length; j++) {
			
			if (vector[j]==vector[j-1]) {
				contador++;
			}
			
		}
	
		if (vector.length>50) {
			System.out.println("El vector es mayor de 50");
		}
		System.out.println();
		System.out.println("Secuencias: "+contador);
		
		
	}

	
}
