package unidad4;

import java.util.Scanner;

public class Ejercicio14 {

	static Scanner in= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		
		
		System.out.println("Número de secuencias: ");
		int secuencias= in.nextInt();
				
		int [][] matriz=new int [secuencias][];
		
		for (int i=0; i<secuencias; i++) {
			
			System.out.println("Posiciones de la secuencia: ");
			int posiciones=in.nextInt();
			
			matriz[i]=crearVector(posiciones);
			
			
			/*for (int j=0; j<posiciones; j++) {
				System.out.println("Número: ");
				int numero= in.nextInt();
				matriz[i][j]=numero;
			}
			System.out.print(matriz[secuencias][posiciones]+" ");
			
		}*/	
	
	}
		for (int k=0; k<matriz.length; k++) {
			for (int l=0; l<matriz[k].length; l++) {
				System.out.print(matriz[k][l]+" ");
				
			}
			
		}
	
}
	public static int [] crearVector (int posiciones) {
		
		int []vector= new int[posiciones];
		
		for (int j=0; j<posiciones; j++) {
			System.out.println("Número: ");
			int numero= in.nextInt();
			vector[j]=numero;
		}
		return vector;
	}
}