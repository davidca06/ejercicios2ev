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
		String nombre = " ";

		boolean fin = false;

		System.out.println("Entrada: ");

		do {

			String linea = in.nextLine();
			if (linea.equals("fin")) {
				fin = true;
			} else {
				nombre = linea.substring(0, linea.indexOf(" "));
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
			nombre = (String) it.next();
			HashSet naipes = juegoNaipes.get(nombre);
			Iterator it2 = naipes.iterator();
			System.out.print(nombre + ": ");
			int puntos = 0;
			while (it2.hasNext()) {
				String jugada = (String) it2.next();
				String rango = jugada.substring(0, jugada.length() - 1);
				int valorRango = 0;
				switch (rango) {
				case "J":
					valorRango = 11;
					break;
				case "Q":
					valorRango = 12;
					break;
				case "K":
					valorRango = 13;
					break;
				case "A":
					valorRango = 14;
					break;
				default:
					valorRango = Integer.parseInt(rango);
				}
				String palo = jugada.substring(jugada.length() - 1);
				int valorPalo = 0;
				switch (palo) {
				case "S":
					valorPalo = 4;
					break;
				case "H":
					valorPalo = 3;
					break;
				case "D":
					valorPalo = 2;
					break;
				case "C":
					valorPalo = 1;
					break;

				}
				puntos = puntos + valorRango * valorPalo;

			}
			System.out.println(puntos);

		}

	}

}
