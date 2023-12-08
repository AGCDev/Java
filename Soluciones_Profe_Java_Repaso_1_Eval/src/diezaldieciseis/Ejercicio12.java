package diezaldieciseis;

import java.util.Scanner;

public class Ejercicio12 {
	/*
	 * 12. Realizar un juego para adivinar un número.
	 * Para ello pedir un número N y luego ir pidiendo números indicando "mayor" o "menor" según sea mayor o menor con respecto a N.
	 * El proceso termina cuando el usuario acierta. 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dado = 0;
		int numeroBuscado = 0;
		
		
		numeroBuscado = (int)(Math.random()*20+1);
		do {
			
			System.out.println("Teclea numero hasta que lo aciertes");
			dado = sc.nextInt();
			
			if (dado > numeroBuscado) {
				System.out.println("Tu numero es mayor que el numero buscado");
			}else if(dado < numeroBuscado){
				System.out.println("Tu numero es menor que el numero buscado");
			}else {
				System.out.println("Numero encontrado");
			}
		} while (numeroBuscado != dado);
		System.out.println("FIN DEL PROGRAMA");
		
		sc.close();
	}

}
