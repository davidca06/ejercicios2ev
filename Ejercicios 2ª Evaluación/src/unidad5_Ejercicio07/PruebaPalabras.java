package unidad5_Ejercicio07;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PruebaPalabras {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		Palabras mapa=new Palabras();
		String texto;
		
		
		do {
			
		
		texto=in.nextLine();
		if (!texto.equals("FIN")) {
				
		Set<String> lista=mapa.leerEntrada(texto);
		if (lista!= null) {
			for (String palabra: lista) {
				System.out.println(palabra);
			}
		}
				
		}
		} while (!texto.equals("FIN"));
	}

}
