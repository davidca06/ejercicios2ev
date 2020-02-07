package unidad4_colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		List <Integer>lista= new ArrayList<>();
		Set <Integer>coleccion1 = new HashSet<>();
		Set <Integer>coleccion2 = new TreeSet<>();
		
		for (int i=0; i<100; i++) {
			int numero=(int)(Math.random()*(101-1)+1);
			lista.add(numero);
			
			
		}
		
		coleccion1.addAll(lista);
		coleccion2.addAll(lista);
						
		Iterator<Integer> i=lista.iterator();
		while (i.hasNext()) {
						
			System.out.print(" "+i.next());
		}
		
		System.out.println();
		
		
		
		for (Integer j: coleccion1) {
			System.out.print(j+" ");
			
		}
		
		System.out.println();
		
		coleccion2.forEach(numero -> System.out.print(numero+" "));
		}

	}


