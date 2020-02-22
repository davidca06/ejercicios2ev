package unidad4_colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Ejercicio05 {
	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		TreeMap <String,HashSet> agenda = new TreeMap<String,HashSet>();
		
		boolean fin=false;
		
		do {
			System.out.print("> ");
			String entrada=in.nextLine();
			if (entrada.equals("salir")) {
				fin=true;
			}
			else if (entrada.equalsIgnoreCase("contactos")) {
				Set nombres=agenda.keySet();
				Iterator it = nombres.iterator();
				while (it.hasNext()) {
					String nombre = (String)it.next();
					HashSet telefonos = agenda.get(nombre);
					Iterator it2=telefonos.iterator();
					while (it2.hasNext()) {
						System.out.print(nombre+": ");
						System.out.print(it2.next()+", ");
						System.out.println();
					}
				}
			}
			else if (entrada.contains(":")) {
				String operador = entrada.substring(0,entrada.indexOf(":"));
				String nombre;
				switch (operador) {
				case "buscar":
					nombre=entrada.substring(entrada.indexOf(":")+1);
					if (!agenda.containsKey(nombre)) {
						System.out.println("El contacto no existe");
					}
					else {
						HashSet telefonos=agenda.get(nombre);
						System.out.print("Teléfono: ");
						Iterator it=telefonos.iterator();
						while (it.hasNext()) {
							System.out.println(it.next());
						}
					}
					break;
				case "eliminar":
					nombre=entrada.substring(entrada.indexOf(":")+1);
					if (!agenda.containsKey(nombre)) {
						System.out.println("El contacto no existe");
					}
					else {
						agenda.remove(nombre);
						System.out.println("El contacto ha sido borrado");
						}
					break;
				default:
					String telefono = entrada.substring(entrada.indexOf(":")+1);
					if (agenda.containsKey(operador)) {//operador= nombre del contacto
						HashSet <String> telefonos = agenda.get(operador);
						telefonos.add(telefono);
					}
					else {
						HashSet <String> telefonos = new HashSet<String>();
						telefonos.add(telefono);
						agenda.put(operador, telefonos);
					}
				}
			}
			
		} while (!fin);
		
		
	

	}

}
