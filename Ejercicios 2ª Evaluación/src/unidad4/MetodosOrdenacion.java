package unidad4;

import java.util.Arrays;

public class MetodosOrdenacion {

	public static void insercionDirecta(int [] vector) {
		
		int i,j,aux;
				
		for (i=1; i<vector.length; i++) {
			aux=vector[i];
			j=i-1;
			while(j>=0 && (aux<vector[j])) {
				
				vector[j+1]=vector[j];
				j--;
			}
			vector[j+1]=aux;
			
		}
		
	}
	
	public static void seleccionDirecta(int []vector) {
		int posMin, numero, aux;
				
		for (int i=0; i<vector.length-1; i++) {
			numero=vector[i];
			posMin=i;
			for (int j=i+1; j<vector.length; j++) {
				if (vector[j]<vector[posMin]) {
					posMin=j;
				}
			}
				if (posMin != i) {
					aux = vector[posMin];
					vector[posMin]= vector[i];
					vector[i]=aux;
				}
			
		}
	}
	
public static void intercambioDirecto(int []vector) {
	int aux;
	
	for (int i=0; i<vector.length-1; i++) {
		for (int j=vector.length-1; j>i; j--) {
			if (vector[j]<vector[j-1]) {
				aux=vector[j];
				vector[j]=vector[j-1];
				vector[j-1]=aux;
			}
		}
	}
	
}
}
