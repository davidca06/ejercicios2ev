package unidad4;

import java.util.Scanner;

public class Ejercicio11 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		crearVector();

	}

	public static void crearVector() {
		String[] vector = new String[10];

		System.out.println("Teclea el nombre de diez personas: ");
		for (int i = 0; i < vector.length; i++) {
			String nombre = in.nextLine();
			vector[i] = nombre;
		}

		String cadenaMayor = nombreMayor(vector);
		System.out.println("La cadena de mayor longitud es: " + cadenaMayor);
	}

	public static String nombreMayor(String[] vector) {

		int mayorLongitud = vector[0].length();
		String largo = vector[0];

		for (int i = 1; i < vector.length; i++) {
			if (vector[i].length() > mayorLongitud) {
				mayorLongitud = vector[i].length();
				largo = vector[i];
			}
		}
		return largo;

	}
}
