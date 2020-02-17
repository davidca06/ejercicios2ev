package unidad4_colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("Teclea las cantidades de cada conjunto: ");
		String cantidades= in.nextLine();
		
		String []cantidad=cantidades.split(" ");
					
		int n=Integer.parseInt(cantidad[0]);
		int m=Integer.parseInt(cantidad[1]);
		
		HashSet <String> conjunto1 = new HashSet<>();
		HashSet <String> conjunto2 = new HashSet<>();
		
		System.out.println("Teclea los elementos de ambos conjuntos: ");
		String elementos=in.nextLine();
		
		String []elemento=elementos.split(" ");
		
		for (int i=0; i<n; i++) {
			conjunto1.add(elemento[i]);
		}
		
		for (int j=n; j<n+m; j++) {
			conjunto2.add(elemento[j]);
		}
		
		comparacion(conjunto1,conjunto2,elemento);
	}

	public static void comparacion(HashSet <String>conjunto1, HashSet <String>conjunto2, String []elemento) {
		
		HashSet <String>conjunto3 = new HashSet<>();
		
		
		Iterator <String> it1=conjunto1.iterator();
		
		for (int i=0; i<elemento.length; i++) {
		for (int j=i+1; j<elemento.length; j++) {
			if (conjunto1.contains(elemento[i])&&conjunto2.contains(elemento[i])) {
				conjunto3.add(elemento[i]);
			}
		}	
		}
		 Iterator <String> it3=conjunto3.iterator();
		 while (it3.hasNext()) {
			 System.out.print(it3.next()+" ");
		 }
	}
	
	
}
