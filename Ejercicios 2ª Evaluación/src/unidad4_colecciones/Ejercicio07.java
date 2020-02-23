package unidad4_colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Ejercicio07 {
	static String[] naipe;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		TreeMap<String, HashSet> juegoNaipes = new TreeMap<String, HashSet>();
		String nombre=" ";
		

		boolean fin = false;

		System.out.println("Entrada: ");

		do {

			String linea = in.nextLine();
			if (linea.equals("fin")) {
				fin = true;
			} else {
				nombre = linea.substring(0, linea.indexOf(" "));
				//System.out.print(nombre + ": ");
				String tirada = linea.substring(linea.indexOf(":") + 2);
				naipe = tirada.split(" ");
				
				if (juegoNaipes.containsKey(nombre)) {
					HashSet<String> naipes = juegoNaipes.get(nombre);
					for (int i = 0; i < naipe.length; i++) {
						naipes.add(naipe[i]);
					}
				} else {
					HashSet<String> naipes = new HashSet<String>();
					for (int i = 0; i < naipe.length; i++) {
						naipes.add(naipe[i]);
						juegoNaipes.put(nombre, naipes);
					}
				}
				
				}
					
		} while (!fin);
		
		System.out.println("Salida: ");
		Set nombres = juegoNaipes.keySet();
		Iterator it = nombres.iterator();
		while (it.hasNext()) { 
			nombre = (String)it.next();
			//System.out.print(nombre+": ");
			HashSet naipes = juegoNaipes.get(nombre);
			Iterator it2=naipes.iterator();
			System.out.print(nombre+": ");
			while (it2.hasNext()) {
				/*String valorTemp=(String)it2.next();
				Integer valor=Integer.parseInt(valorTemp);
				valor=calcularValor(naipe);
				System.out.print(valor);*/
				System.out.print(it2.next()+", ");					
			}
			
			System.out.println();
					
		}
		/*System.out.println("Mano por jugador: ");
		Set nombres = juegoNaipes.keySet();
		Iterator it = nombres.iterator();
		while (it.hasNext()) { 
			nombre = (String)it.next();
			HashSet naipes = juegoNaipes.get(nombre);
			Iterator it2=naipes.iterator();
			System.out.print(nombre+": ");
			while (it2.hasNext()) {
				
				System.out.print(it2.next()+", ");
				
			}
			System.out.println();*/
		
		//calcularValor(naipe);
}
	public static int calcularValor (String []naipe) {
		int valorRango=0;
		int valorPalo;
		int valorNaipe=0;
		
		for (int i=0; i<naipe.length; i++) {
			String rango=naipe[i].substring(0,1);
			//System.out.println(rango);
			switch (rango) {
			case "2":
				valorRango=2;
				break;
			case "3":
				valorRango=3;
				break;
			case "4":
				valorRango=4;
				break;
			case "5":
				valorRango=5;
				break;
			case "6":
				valorRango=6;
				break;
			case "7":
				valorRango=7;
				break;
			case "8":
				valorRango=8;
				break;
			case "9":
				valorRango=9;
				break;
			case "10":
				valorRango=10;
				break;
			case "J":
				valorRango=11;
				break;
			case "Q":
				valorRango=12;
				break;
			case "K":
				valorRango=13;
				break;
			case "A":
				valorRango=14;
				break;
				default:
					System.out.println("Rango no válido");
			}
			String palo=naipe[i].substring(1);
			//System.out.println(palo);
			valorPalo=0;
			switch (palo) {
			case "S":
				valorPalo=4;
			break;
			case "H":
				valorPalo=3;
			break;
			case "D":
				valorPalo=2;
			break;
			case "C":
				valorPalo=1;
			break;
			default:
				System.out.println("Palo no válido");
			
			}
			
			valorNaipe+=valorRango*valorPalo;
			System.out.print(valorNaipe+" ");
			
		}
		
		return valorNaipe;
		
	}
}
