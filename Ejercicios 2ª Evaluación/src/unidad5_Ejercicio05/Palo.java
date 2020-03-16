package unidad5_Ejercicio05;

public enum Palo {

	CLOVERS('C'), HEARTS('H'), SPADES('S'), DIAMONDS('D');
	
	private char simbolo;
	
	private Palo(char simbolo) {
		this.simbolo=simbolo;
	}

	public char getSimbolo() {
		return simbolo;
	}
	
	
}
