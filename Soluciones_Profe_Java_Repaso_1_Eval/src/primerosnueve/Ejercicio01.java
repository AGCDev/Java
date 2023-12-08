package primerosnueve;

import java.util.Scanner;



public class Ejercicio01 {

	/*
	 * 1. Pedir tres números y mostrarlos ordenados de mayor a menor.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		
		do {
			System.out.println("Introduce primer número:");
			num1 = sc.nextInt();
			
			System.out.println("Introduce segundo número:");
			num2 = sc.nextInt();
			
			System.out.println("Introduce tercer número:");
			num3 = sc.nextInt();
			
			System.out.println();
			
			if (num1 > num2 && num1 > num3 && num2 > num3) {
				System.out.println("Este es el orden: " + "Primero: "+ num1 +" Segundo: "+ num2 + " Tercero: " + num3);
			}else if(num1 > num2 && num1 > num3 && num3 > num2) {
				System.out.println("Este es el orden: " + "Primero: "+ num1 +" Segundo: "+ num3 + " Tercero: " + num2);
			}else if(num2 > num1 && num2 > num3 && num1 > num3) {
				System.out.println("Este es el orden: " + "Primero: "+ num2 +" Segundo: "+ num1 + " Tercero: " + num3);
			}else if(num2 > num1 && num2 > num3 && num3 > num1) {
				System.out.println("Este es el orden: " + "Primero: "+ num2 +" Segundo: "+ num3 + " Tercero: " + num1);
			}else if(num3 > num1 && num3 > num2 && num1 > num2 ) {
				System.out.println("Este es el orden: " + "Primero: "+ num3 +" Segundo: "+ num1 + " Tercero: " + num2);
			}else if(num3 > num1 && num3 > num2 && num2 > num1) {
				System.out.println("Este es el orden: " + "Primero: "+ num3 +" Segundo: "+ num2 + " Tercero: " + num1);
			}else {
				System.out.println("No se permiten numeros iguales.");
			}
		}while(num1 >= 0 || num2 >= 0 || num3 >= 0);
		
		System.out.println("Has metido numeros negativos, BRIBON!! xD!");
		
	}

}
