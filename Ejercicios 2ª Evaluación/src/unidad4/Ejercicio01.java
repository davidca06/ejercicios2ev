package unidad4;

import java.util.Scanner;

public class Ejercicio01 {
	
	static Scanner in=new Scanner(System.in);
	static int a=0, e=0, i=0, o=0, u=0;

	public static void main(String[] args) {
		
		System.out.println("Escribe un texto: ");
		String cadena=in.nextLine();
		cadena=cadena.toLowerCase();
		proceso(cadena);
		resultados();

	}

	public static void proceso(String cadena) {
		
		
		for (int j=0; j<cadena.length(); j++) {
			char c=cadena.charAt(j);
			switch (c) {
			case 'a':
				a++;
				break;
			case 'e':
				e++;
				break;
			case 'i':
				i++;
				break;
			case 'o':
				o++;
				break;
			case 'u':
				u++;
				break;
			}
		}
	}
	
	public static void resultados() {
		System.out.println("Vocal a: "+a);
		System.out.println("Vocal e: "+e);
		System.out.println("Vocal i: "+i);
		System.out.println("Vocal o: "+o);
		System.out.println("Vocal u: "+u);
		
	}
}
