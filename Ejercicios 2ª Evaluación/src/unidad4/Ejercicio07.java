package unidad4;

import java.util.Scanner;

public class Ejercicio07 {
	
	static Scanner in=new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Teclea el tamaño del vector (10-1000000): ");
		int tamaño=in.nextInt();
		do {
			if(tamaño<10 || tamaño>1000000) {
				System.out.println("Tamaño no válido. Teclea otra vez: ");
				tamaño=in.nextInt();
			}
		} while (tamaño<10 || tamaño>1000000);
		
		System.out.println(tamaño);
		
		int [] vector=new int[tamaño];
		
		long startTime=System.currentTimeMillis();
		rellenarVector(vector);
		long endTime=System.currentTimeMillis();
		System.out.println();
		System.out.println("Tiempo empleado en rellenar el vector: "+(endTime-startTime)+" milisegundos");
		startTime=System.currentTimeMillis();
		int mayor=mayorVector(vector);
		int menor=menorVector(vector);
		int diferencia=mayor-menor;
		endTime=System.currentTimeMillis();
		System.out.println("La diferencia entre el mayor y el menor es: "+diferencia);
		System.out.println("Tiempo empleado en calcular la diferencia: "+(endTime-startTime)+" milisegundos");
		
	}

	public static void rellenarVector(int []vector) {
		for (int i=0; i<vector.length; i++) {
			int numero=(int)(Math.random()*(1000001-(-999999))+(-999999));
			do {
				if (numero==vector[i]) {
					
				}
			} while (numero==vector[i]);
			vector[i]=numero;
			System.out.print(" "+vector[i]);
		}
	}
	public static int mayorVector(int []vector) {
		int mayor=vector[0];
		for (int i=1; i<vector.length; i++) {
			if (vector[i]>mayor) {
				mayor=vector[i];
		}
		
		}
		return mayor;
	}
	public static int menorVector(int []vector) {
		int menor=vector[0];
		for (int i=1; i<vector.length; i++) {
			if (vector[i]<menor) {
				menor=vector[i];
		}
		
		}
		return menor;
	}
}
