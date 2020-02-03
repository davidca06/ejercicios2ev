package unidad4_colecciones;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		String nombre;
		Set<String> c;
		c= new HashSet<String>();
		
		Scanner in=new Scanner(System.in);
		System.out.println("Teclea el número de nombres: ");
		int numero=in.nextInt();
		System.out.println("Teclea los nombres: ");
		for (int i=1; i<=numero; i++) {
			nombre=in.next();
			c.add(nombre);
		}
		
		System.out.println("Nombres no repetidos: "+c);
		
		
		}

}
