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
			in.nextLine();
			String nombre = in.nextLine();
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
		

	}

	public static void elegirOpcion(String[] alumnos, float[][] notas) {

		int op = 0;
		do {
			System.out.println();
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
			notaMediaTodosAlumno(alumnos, notas);
			break;
		case 2:
			notaMediaAlumno(alumnos, notas);
			break;
		
		case 3:
			notaEvaluacion(alumnos, notas);
			break;
					
		case 4:
			notaEvaluacionAlumno(alumnos,notas);
			break;
		case 5:
			notaMediaCurso(alumnos, notas);
			break;
		case 6:
			notaMasAlta(alumnos,notas);
			notaMasBaja(alumnos,notas);
			break;	
		}
	}

	public static void notaMediaTodosAlumno(String[] alumnos, float[][] notas) {
		float sumaNotas;
		float mediaAlumno;
		for (int i=0; i<notas.length; i++) {
			System.out.println(alumnos[i]+": ");
			sumaNotas=0;
			for (int j=0; j<notas[i].length; j++) {
				sumaNotas=sumaNotas+notas[i][j];
									
			}
			
			System.out.printf("Nota Media: %.1f\n\n",sumaNotas/3);
		}
		
	}

	public static void notaMediaAlumno(String[] alumnos, float[][] notas) {
		float sumaNotas = 0;
		float mediaAlumno;
		boolean fin = false;
		System.out.println("Nombre del alumno: ");
		in.nextLine();
		String nombreAlumno = in.nextLine();
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
		System.out.printf("La nota media del alumno es: %.1f\n\n",mediaAlumno);
		
	}
	
	public static void notaEvaluacion(String[] alumnos, float[][] notas) {
		
		float [] vectorNotaFinal=new float[alumnos.length];
		
		System.out.println("----- NOTAS ----");
		for (int j = 0; j < notas.length; j++) {
			System.out.print(alumnos[j] + ": ");
			for (int k = 0; k < notas[j].length; k++) {
				System.out.print(" ... "+notas[j][k]);
				vectorNotaFinal[j]+=notas[j][k];
			}
			System.out.printf(" ...Nota Final Evaluación: %.1f",vectorNotaFinal[j]/3);
			System.out.println();
		}
		
	}
	
	public static void notaEvaluacionAlumno(String[] alumnos, float[][] notas) {
		
		float [] vectorNotaFinal=new float[alumnos.length];
		boolean fin = false;
		System.out.println("Nombre del alumno: ");
		in.nextLine();
		String nombreAlumno = in.nextLine();
		do {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i].equalsIgnoreCase(nombreAlumno)) {
				System.out.print(alumnos[i] + ": ");
					for (int j = 0; j < notas[i].length; j++) {
						System.out.print(" ... "+notas[i][j]);
						vectorNotaFinal[i]+=notas[i][j];
					}
					System.out.printf(" ...Nota Final Evaluación: %.1f",vectorNotaFinal[i]/3);
					System.out.println();
					
				}
			fin=true;
			}
		
		} while (!fin);
		
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
		System.out.printf("La nota media del curso es: %.1f",mediaTotal);
		System.out.println();
	}
	
	public static void notaMasAlta (String[] alumnos, float[][] notas) {
		
		float notaMayor=0;
		String evaluacion="";
		String alumno="";
		
		for (int i=0; i<notas.length; i++) {
			for (int j=0; j<notas[i].length; j++) {
				if (notas[i][j]>notaMayor) {
					notaMayor=notas[i][j];
					if (j==0) {
						evaluacion="1a Evaluacion";
					}
					else if (j==1) {
						evaluacion="2a Evaluacion";
					}
					else {
						evaluacion="3a Evaluacion";
					}
					alumno=alumnos[i];
					
				}
			}
		}
		System.out.println("La nota más alta es: "+notaMayor+" de la "+evaluacion+" y pertenece al alumno "+alumno);
	}
	
public static void notaMasBaja (String[] alumnos, float[][] notas) {
		
		float notaMenor=10;
		String evaluacion="";
		String alumno="";
		
		for (int i=0; i<notas.length; i++) {
			for (int j=0; j<notas[i].length; j++) {
				if (notas[i][j]<notaMenor) {
					notaMenor=notas[i][j];
					if (j==0) {
						evaluacion="1a Evaluacion";
					}
					else if (j==1) {
						evaluacion="2a Evaluacion";
					}
					else {
						evaluacion="3a Evaluacion";
					}
					alumno=alumnos[i];
					
				}
			}
		}
		System.out.println("La nota más baja es: "+notaMenor+" de la "+evaluacion+" y pertenece al alumno "+alumno);
	}
}
