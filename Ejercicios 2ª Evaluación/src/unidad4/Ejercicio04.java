package unidad4;

import java.util.Scanner;

public class Ejercicio04 {

	static Scanner in = new Scanner(System.in);
	static int [] contador= new int[6];

	public static void main(String[] args) {
		System.out.println("Número de veces que lanzamientos: ");
		int nVeces=in.nextInt();
		
		tirarDado(nVeces);
		System.out.println("Cara 1: "+contador[0]+" veces");
		System.out.println("Cara 2: "+contador[1]+" veces");
		System.out.println("Cara 3: "+contador[2]+" veces");
		System.out.println("Cara 4: "+contador[3]+" veces");
		System.out.println("Cara 5: "+contador[4]+" veces");
		System.out.println("Cara 6: "+contador[5]+" veces");
		
	}

	public static void tirarDado(int nVeces) {
		
		for (int i=1; i<=nVeces; i++) {
			int dado=(int)(Math.random()*(7-1))+1;
			System.out.println("Ha salido: "+dado);
			switch (dado) {
			case 1:
				contador[0]++;
				break;
			case 2:
				contador[1]++;
				break;
			case 3:
				contador[2]++;
				break;
			case 4:
				contador[3]++;
				break;
			case 5:
				contador[4]++;
				break;
			case 6:
				contador[5]++;
				break;
				
			}
			
		}
		
		
	}
	
}
