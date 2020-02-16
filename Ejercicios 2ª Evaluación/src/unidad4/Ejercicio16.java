package unidad4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio16 {

	
		
	public static void main(String[] args) {
		
		int []vector = new int[10];
		
		System.out.println("Inserción Directa");
		llenarVector(vector);
		System.out.println(Arrays.toString(vector));
		MetodosOrdenacion.insercionDirecta(vector);
		System.out.println(Arrays.toString(vector));
		
			
		System.out.println("Selección Directa");
		llenarVector(vector);
		System.out.println(Arrays.toString(vector));
		MetodosOrdenacion.seleccionDirecta(vector);	
		System.out.println(Arrays.toString(vector));
		
		System.out.println("Intercambio Directo");
		llenarVector(vector);
		System.out.println(Arrays.toString(vector));
		MetodosOrdenacion.intercambioDirecto(vector);	
		System.out.println(Arrays.toString(vector));
		
		
	}

	public static void llenarVector(int [] vector) {
		
			for (int i=0; i<vector.length; i++) {
			int numero=(int)(Math.random()*(101-1)+1);
			vector[i]=numero;
			
		}
				
		
	}
	
	
}
