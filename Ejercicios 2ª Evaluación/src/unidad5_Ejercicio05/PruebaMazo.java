package unidad5_Ejercicio05;

import java.util.ArrayList;

public class PruebaMazo {

	public static void main(String[] args) {
		
		//Naipe naipe = new Naipe(Palo.CLOVERS,Rango.CINCO);
		
		//System.out.println(naipe);
		
		Mazo mazo= new Mazo(2);
		System.out.println("Muestra los mazos: ");	
		System.out.print(mazo+", ");
		System.out.println();
		System.out.println("--------------------");
		System.out.println("Retorna naipe aleatorio y lo retorna al mazo: ");
		
		Mazo mazo2 = new Mazo(); 
		
		Naipe naipe=mazo2.getNaipe();
		
		System.out.println(naipe.getPalo()+" "+naipe.getRango());
		System.out.print(mazo2+", ");
		System.out.println();
		System.out.println("Tamaño: "+mazo2.sizeMazo());
		System.out.println();
		
		naipe=mazo2.removeNaipe();
		System.out.println(naipe.getPalo()+" "+naipe.getRango());
		System.out.print(mazo2+", ");
		System.out.println();
		System.out.println("Tamaño: "+mazo2.sizeMazo());
		
		mazo2.addNaipe(naipe);
		System.out.print(mazo2+", ");
		System.out.println();
		
		ArrayList <Naipe> listaNaipes= new ArrayList<Naipe>();
		for (int i=0; i<5; i++) {
			naipe=mazo2.removeNaipe();
			listaNaipes.add(naipe);
			System.out.print(naipe+", ");
		}
		System.out.println();
		mazo2.addAll(listaNaipes);
		System.out.print(mazo2+", ");
		
		Naipe naipeJugador=mazo2.removeNaipe();
		System.out.println("Carta del jugador: "+naipeJugador);
		Naipe naipeOrdenador=mazo2.removeNaipe();
		System.out.println("Carta del ordenador: "+naipeOrdenador);

		int naipeJ=naipeJugador.getRango().ordinal();
		int naipeO=naipeOrdenador.getRango().ordinal();
		
		if (naipeJ > naipeO) {
			System.out.println("El jugador ha ganado");
		}
		else if (naipeO > naipeJ){
			System.out.println("El ordenador ha ganado");
		}
		else {
			System.out.println("Empate");
			
		}
		
		/*System.out.println("--------------------");
		System.out.println("Retorna naipe aleatorio y lo quita del mazo: ");
		Mazo naipeQuitado = new Mazo();
		System.out.println(((Mazo)naipeQuitado).removeNaipe());
		mazo= new Mazo(1);
		System.out.println(mazo);
		System.out.println();
		
		System.out.println("--------------------");
		Naipe naipe2=new Naipe(Palo.DIAMONDS,Rango.DOS);
		mazo.addNaipe(naipe2);
		System.out.println("Añade un naipe: "+naipe2);
		System.out.println(mazo);
		System.out.println();
		
		System.out.println("--------------------");
		ArrayList <Naipe> nuevosNaipes = new ArrayList<>();
		mazo.addAll(nuevosNaipes);*/
		
		
	}

}
