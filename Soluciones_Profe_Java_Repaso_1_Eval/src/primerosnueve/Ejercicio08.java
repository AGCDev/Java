package primerosnueve;

import java.util.Scanner;

public class Ejercicio08 {
	/*
	 * 8. Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
	 * mostrar: cincuenta y seis
	 */

	public static void main(String[] args) {
		int[] numerosPrueba = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 19, 20, 21, 23, 25, 27, 29, 30,
				39, 40, 49, 50, 59, 60, 69, 70, 79, 80, 89, 90, 99 };

		//int aleatorio1 = 0,  la variable aleatorio1 no sirve para nada, no se está usando.
			int	unidad = 0, decena = 0;

		//aleatorio1 = (int) (Math.random() * 30); la variable aleatorio1 no sirve para nada, no se está usando.

		String[] numerEnLetra = { "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve",
				"diez", "once", "doce", "trece", "catorce", "quince", "dieciseis", "diecisiete", "dieciocho",
				"diecinueve" };

		String[] decenas = { null, null, "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta",
				"noventa" };

		for (int aleatorio : numerosPrueba) {
			if (aleatorio < 20)
				System.out.println("el numero " + aleatorio + "\tse escribe : " + numerEnLetra[aleatorio]);
			else if (aleatorio % 10 == 0)
				System.out.println("el numero " + aleatorio + "\tse escribe : " + decenas[aleatorio / 10]);
			else {
				unidad = aleatorio % 10; // el resto de la division entre 10 me da las unidades, y
				decena = aleatorio / 10; // la division entre 10 me da el cociente, y por tanto la decena.
				System.out.println(
						"el numero " + aleatorio + "\tse escribe : " + decenas[decena] + " y " + numerEnLetra[unidad]);
			}
		}
	}

}
