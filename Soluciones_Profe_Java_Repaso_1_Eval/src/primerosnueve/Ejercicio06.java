package primerosnueve;

import java.util.Scanner;

public class Ejercicio06 {
	/*
	 * 6. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
	 * Suponiendo todos los meses de 30 días.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int anio = 0, mes = 0, dia = 0;
		
		System.out.println("Teclea el año:");
		anio = sc.nextInt();
		System.out.println("Teclea el mes en número");
		mes = sc.nextInt();
		System.out.println("Teclea el dia en número");
		dia = sc.nextInt();
		
		if (comprobarAnio(anio) && comprobarMes(mes) && comprobarDia(dia)) {
			System.out.println("La fecha es correcta.");
		} else {
			System.out.println("Algún dato es incorrecto, fecha INCORRECTA.");
		}
	}
	
	// Vamos a usar funciones para que el codigo del main esté más claro
	
	public static boolean comprobarAnio(int anio) {
		// consideramos que el inicio de la era del hombre en el -10000 a.c.
		if (anio >= -10000) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean comprobarMes(int mes) {
		if (mes >= 1 && mes <= 12) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean comprobarDia(int dia) {
		if (dia >= 1 && dia <= 30) {
			return true;
		}else {
			return false;
		}
	}

}
