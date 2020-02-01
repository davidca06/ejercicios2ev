package unidad4;

import java.util.Scanner;

public class Ejercicio12 {
	
	static Scanner in= new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Define el tamaño del vector: ");
		int tamaño=in.nextInt();
		
		int []vector=new int[tamaño];
		
		System.out.println("Teclea los elementos del vector: ");
		
		for (int i=0; i<vector.length; i++) {
			int numero=in.nextInt();
			vector[i]=numero;
		}
			
		centro(vector);
		Integer posicionCentro=centro(vector);
		if (posicionCentro==null) {
			System.out.println("El vector no tiene centro");
		}
		else {
			System.out.println("La posición centro del vector es: "+posicionCentro);
		}

	}
	
	public static Integer centro (int []vector) {
		
		int suma1;
		int suma2;
		int c;
		
		for (c=0; c<=vector.length/2; c++) {
			suma1=0;
			for (int i=0; i<=c-1; i++) {
				suma1=suma1+(c-i)*vector[i];
			}
			suma2=0;
			for (int j=c+1; j<vector.length; j++) {
				suma2=suma2+(j-c)*vector[j];
			}
			if (suma1==suma2) {
				return c;
			}
			
		}
		return null;
		
		
	}

}
