package diezaldieciseis;

import java.util.Scanner;

public class Ejercicio10 {

	/*
	 * 10. Leer un n�mero y mostrar su cuadrado, repetir el proceso hasta que se introduzca un n�mero negativo.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		
		do {
			System.out.println("Dame un n�mero. Para salir introduce un numero negativo");
			numero = sc.nextInt();
			
			System.out.println("El cuadrado de: " + numero + " es " + numero*numero);
		}while(numero >= 0);
		
		System.out.println("FIN DE PROCESO");
		
		sc.close();
	}

}
