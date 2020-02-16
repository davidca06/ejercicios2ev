package unidad4;

import java.util.Arrays;

public class Ejercicio17 {
	
	static int tamaño=(int)(Math.random()*(101-10)+10);

	public static void main(String[] args) {
		
		int []vector1= new int[tamaño];
		llenarVector(vector1);
		System.out.println(Arrays.toString(vector1));
		int []vector2= new int[tamaño];
		llenarVector(vector2);
		System.out.println(Arrays.toString(vector2));
		System.out.println("Vectores ordenados: ");
		ordenarVector(vector1);
		ordenarVector(vector2);
		System.out.println(Arrays.toString(vector1));
		System.out.println(Arrays.toString(vector2));
		System.out.println("Tercer Vector Mezclado: ");
		int [] vector3 = mezclarVectores(vector1,vector2);
		System.out.println(Arrays.toString(vector3));
		
	}
	
	public static void llenarVector(int []vector) {
		
		for (int i=0; i<vector.length; i++) {
			int numero=(int)(Math.random()*(11-1)+1);
			vector[i]=numero;
		}
	}
	public static void ordenarVector(int []vector) {
		
		int aux;
		for (int i=0; i<vector.length-1; i++) {
			for (int j=vector.length-1; j>i; j--) {
				if (vector[j]<vector[j-1]) {
					aux=vector[j];
					vector[j]=vector[j-1];
					vector[j-1]=aux;
				}
			}
		}
	}
	
	public static int [] mezclarVectores(int []vector1, int []vector2) {
		
		int []vector3= new int [vector1.length+vector2.length];
		
		int j=0, k=0;
		for (int i=0; i<vector3.length; i++) {
			if (j<vector1.length && k<vector2.length) {
				if (vector1[j]<vector2[k]) {
					vector3[i]=vector1[j++];
					
				}
				else {
					vector3[i]=vector2[k++];
				}
						
			}
			else if (j<vector1.length) {
				vector3[i]=vector1[j++];
			}
			else if (k<vector2.length) {
				vector3[i]=vector2[k++];
			}
		}
		return vector3;
	}
}
