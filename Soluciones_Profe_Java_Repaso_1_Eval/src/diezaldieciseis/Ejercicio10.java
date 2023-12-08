package diezaldieciseis;

import java.util.Scanner;

public class Ejercicio10 {

	/*
	 * 10. Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		
		do {
			System.out.println("Dame un número. Para salir introduce un numero negativo");
			numero = sc.nextInt();
			
			System.out.println("El cuadrado de: " + numero + " es " + numero*numero);
		}while(numero >= 0);
		
		System.out.println("FIN DE PROCESO");
		
		sc.close();
	}

}
