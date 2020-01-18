package unidad4;

import java.util.Scanner;

public class Ejercicio05 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Teclea el NIF: ");
		String nif = in.nextLine();
		System.out.println(nif);
		String num = nif.substring(0, 7);
		System.out.println(num);
		int numero = Integer.parseInt(num);
		System.out.println(numero);
		char letraNif=nif.toUpperCase().charAt(7);
		System.out.println(letraNif);
		validacion(numero,letraNif);

	}

	public static void validacion(int numero, char letraNif) {
		int resto = numero % 23;
		char letra[]= new char[23];
		letra[0]='T';
		letra[1]='R';
		letra[2]='W';
		letra[3]='A';
		letra[4]='G';
		letra[5]='M';
		letra[6]='Y';
		letra[7]='F';
		letra[8]='P';
		letra[9]='D';
		letra[10]='X';
		letra[11]='B';
		letra[12]='N';
		letra[13]='J';
		letra[14]='Z';
		letra[15]='S';
		letra[16]='Q';
		letra[17]='V';
		letra[18]='H';
		letra[19]='L';
		letra[20]='C';
		letra[21]='K';
		letra[22]='E';
		
		if (letra[resto]==letraNif) {
			System.out.println("El NIF es correcto");
			
		}
		else {
			System.out.println("El NIF es incorrecto");
		}
	}
}
