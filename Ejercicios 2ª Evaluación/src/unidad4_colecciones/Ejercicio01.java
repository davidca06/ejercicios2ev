package unidad4_colecciones;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		String nombre;
		Set<String> c;
		c= new LinkedHashSet<String>();
		
		Scanner in=new Scanner(System.in);
		System.out.println("Teclea el n�mero de nombres: ");
		int numero=in.nextInt();
		System.out.println("Teclea los nombres: ");
		for (int i=1; i<=numero; i++) {
			nombre=in.next();
			c.add(nombre);
		}
		
		Iterator i=c.iterator();
		while (i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		
		
		
		}

}
