package diezaldieciseis;

import java.util.Scanner;

public class Ejercicio16 {
	/*
	 * 16. Pedir por consola el nombre, el apellido y el salario de una persona. 
	 * Sacar un menú de opciones:
	 * 	1. Nombre completo
	 * 	2. Salario Mensual (12 pagas)
	 * 	3. Nombre en mayúsculas
	 * 	4. Cuantas letras tiene mi nombre
	 * 	5. Salir
	 */
	static Scanner leer;

	public static void main(String[] args) {
		leer = new Scanner(System.in);
		String nombre = null, apellido = null;
		double salario = 0;

		int opcion = 0;

		opcion = menu();
		while (opcion >= 1 && opcion <= 4) {
			System.out.print("dame nombre : ");
			nombre = leer.next();
			System.out.print("dame apellido : ");
			apellido = leer.next();
			System.out.print("dame salario anual : ");
			salario = leer.nextDouble();
			switch (opcion) {
			case 1:
				System.out.println("nombre completo = " + nombre + " " + apellido + "\n\n");
				break;
			case 2:
				System.out.println("salario en 12 pagas : " + salario / 12);
				break;
			case 3:
				System.out.println("nombre en mayusculas : " + nombre.toUpperCase());
				break;
			case 4:
				System.out.println("letras de mi nombre  : " + nombre.length());

				break;
			}
			opcion = menu();
		}

		System.out.println("PROCESO TERMINADO");

		leer.close();

	}

	public static int menu() {

		System.out.println("MENU DE OPCIONES");
		System.out.println("1.- Nombre Completo");
		System.out.println("2.- Salario Mensual(12 pagas)");
		System.out.println("3.- Nombre en mayúsculas");
		System.out.println("4.- Cuantas letras tiene mi nombre");
		System.out.println("teclea un mumero , cualquier otro salir");
		return leer.nextInt();

	}

}
