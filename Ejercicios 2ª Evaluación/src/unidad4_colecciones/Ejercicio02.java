package unidad4_colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		List <Integer>lista= new ArrayList<>();
		
		for (int i=0; i<100; i++) {
			int numero=(int)(Math.random()*(101-1)+1);
			lista.add(numero);
		}
						
		Iterator<Integer> i=lista.iterator();
		
		while (i.hasNext()) {
						
			System.out.print(" "+i.next());
		}
		
		/*Set <Integer> c=new HashSet<Integer>();
		c.add(lista);*/
		
		
		}

	}


