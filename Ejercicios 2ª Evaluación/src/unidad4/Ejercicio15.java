package unidad4;

import java.util.Scanner;

public class Ejercicio15 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Número de alumnos: ");
		int numeroAlumnos = in.nextInt();

		String[] alumnos = new String[numeroAlumnos];
		float[][] notas = new float[alumnos.length][3];

		leerDatos(alumnos, notas);
		System.out.println("--------------");
		elegirOpcion(alumnos, notas);

	}

	public static void leerDatos(String[] alumnos, float[][] notas) {

		for (int i = 0; i < alumnos.length; i++) {
			System.out.println("Nombre del alumno: ");
			String nombre = in.next();
			alumnos[i] = nombre;
			System.out.println("Primera Evaluación: ");
			float nota1 = in.nextFloat();
			notas[i][0] = nota1;
			System.out.println("Segunda Evaluación: ");
			float nota2 = in.nextFloat();
			notas[i][1] = nota2;
			System.out.println("Tercera Evaluación: ");
			float nota3 = in.nextFloat();
			notas[i][2] = nota3;
		}
		System.out.println("------------------");
		for (int j = 0; j < notas.length; j++) {
			System.out.print(alumnos[j] + " ");
			for (int k = 0; k < notas[j].length; k++) {
				System.out.print(notas[j][k] + " ");
			}
			System.out.println();
		}

	}

	public static void elegirOpcion(String[] alumnos, float[][] notas) {

		int op = 0;
		do {
			System.out.println("Elige una opción (1-7): ");
			System.out.println("1. Nota media de todos los alumnos");
			System.out.println("2. Nota media de un alumno");
			System.out.println("3. Nota por evaluación y nota final");
			System.out.println("4. Nota por evaluación y nota final de un alumno");
			System.out.println("5. Nota media del curso");
			System.out.println("6. Nota más alta y más baja e indicar a qué alumno y qué evaluación");
			System.out.println("7. Salir");
			op = in.nextInt();
			System.out.println();

			ejecutarOpcion(op, alumnos, notas);

		} while (op != 7);
		System.out.println("Has salido del menú");
	}

	public static void ejecutarOpcion(int op, String[] alumnos, float[][] notas) {

		switch (op) {
		case 1:
			notaMediaCadaAlumno(alumnos, notas);
			break;
		case 2:
			notaMediaAlumno(alumnos, notas);
			break;
		
		case 3:
			/*notaEvaluacion(alumnos, notas);
			notaFinalEvaluacion(alumnos, notas);*/
			break;
					
		case 4:
			break;
		case 5:
			notaMediaCurso(alumnos, notas);
			break;
		case 6:
			break;	
		}
	}

	public static void notaMediaCadaAlumno(String[] alumnos, float[][] notas) {
		float sumaNotas;
		float mediaAlumno;
		for (int i=0; i<notas.length; i++) {
			System.out.println(alumnos[i]+": ");
			sumaNotas=0;
			for (int j=0; j<notas[i].length; j++) {
				sumaNotas=sumaNotas+notas[i][j];
			System.out.print(notas[i][j]+" ");
						
			}
			System.out.println();
			System.out.println("Nota Media: "+sumaNotas/3);
		}
		
	}

	public static void notaMediaAlumno(String[] alumnos, float[][] notas) {
		float sumaNotas = 0;
		float mediaAlumno;
		boolean fin = false;
		System.out.println("Nombre del alumno: ");
		String nombreAlumno = in.next();
		do {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i].equalsIgnoreCase(nombreAlumno)) {
				for (int j = 0; j < 3; j++) {
					sumaNotas = sumaNotas + notas[i][j];
				}
				fin=true;
			}
		}
		} while (!fin);
		mediaAlumno = sumaNotas / 3;
		System.out.println("La nota media del alumno es: " + mediaAlumno);
		System.out.println();
	}
	
	public static void notaMediaCurso(String[] alumnos, float[][] notas) {
		float sumaNotas = 0;
		float mediaTotal;
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				sumaNotas = sumaNotas + notas[i][j];
			}

		}
		mediaTotal = sumaNotas / (alumnos.length * 3);
		System.out.println("La nota media de todos los alumnos es: " + mediaTotal);
		System.out.println();
	}
}
