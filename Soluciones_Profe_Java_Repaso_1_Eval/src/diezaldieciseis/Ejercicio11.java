package diezaldieciseis;

import java.util.Scanner;

public class Ejercicio11 {
	/*
	 * 11. Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		
		do {
			System.out.println("Dame un numero distinto de 0. Si numero = 0, fin de programa.");
			numero = sc.nextInt();
			
			if (numero % 2 == 0) {
				System.out.println("El numero: " + numero + " es par.");
			}else {
				System.out.println("El numero: " + numero + " NO es par.");
			}
		} while (numero != 0);
		
		System.out.println("FIN  DEL PROGRAMA");
		
		sc.close();
	}

}
