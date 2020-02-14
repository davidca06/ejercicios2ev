package unidad4;

import java.util.Scanner;

public class Ejercicio14 {

	static Scanner in= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		
		
		System.out.println("Número de secuencias: ");
		int secuencias= in.nextInt();
				
		int [][] matriz=new int [secuencias][];
		
		for (int i=0; i<secuencias; i++) {
			
			System.out.println("Cantidad de números de la secuencia: ");
			int posiciones=in.nextInt();
			
			matriz[i]=crearVector(posiciones);
			
			
			
	}
		for (int k=0; k<matriz.length; k++) {
			for (int l=0; l<matriz[k].length; l++) {
				System.out.print(matriz[k][l]+" ");
				
			}
			System.out.println();
		}
	
}
	public static int [] crearVector (int posiciones) {
		
		int []vector= new int[posiciones];
				
			in.nextLine();
			System.out.println("Números (separados por espacios en blanco): ");
			String numeros= in.nextLine();
			vector=sacarSecuencia(numeros,posiciones);
		
		return vector;
	}
	
	public static int [] sacarSecuencia (String numeros, int posiciones) {
		int [] vectorNumeros= new int[posiciones];
		String [] vectorSecuencia=numeros.split(" ");
		
		for (int i=0; i<posiciones; i++) {
			vectorNumeros[i]=Integer.parseInt(vectorSecuencia[i]);
		}
		
		return vectorNumeros;
	}
}