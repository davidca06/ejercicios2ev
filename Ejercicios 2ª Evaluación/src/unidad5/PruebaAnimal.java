package unidad5;

import java.time.LocalDate;

public class PruebaAnimal {

	public static void main(String[] args) {
		
		Animal animal;
		animal = new Animal("Toby");
		
		System.out.println(animal.getFecha());
		
		Animal animal2= new Animal("Tarz�n",LocalDate.of(2010,5,15));
		
		System.out.println(animal2.toString());

	}

}
