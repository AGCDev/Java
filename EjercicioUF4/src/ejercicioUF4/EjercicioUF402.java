package ejercicioUF4;

import java.util.Scanner;

public class EjercicioUF402 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String texto;
		
		
		System.out.println("Introduce un texto: ");
		texto = sc.nextLine();
		System.out.println(texto);
		
		System.out.println("Longitud: " + texto.length());
		System.out.println("Mayúsculas: " + texto.toUpperCase());
		System.out.println("Palabra a palabra");
		
		String[] cadena = texto.split(" ");
		
		for (String elemento : cadena) {
			System.out.println(elemento);
		}
	
		int letrasMinusculas = 0;
		for (int i = 0; i < texto.length(); i++) {
			if (Character.isLowerCase(texto.charAt(i))) {
				letrasMinusculas++;
			}
		}
		System.out.println("Hay " + letrasMinusculas + " letras minúsculas.");
		
		System.out.println("EL TRIANGULO");
		
		int cadenaDescendente = texto.length();
		
		for (int i = 0; i < texto.length(); i++) {
			
			System.out.println(texto.substring(0, cadenaDescendente));
			cadenaDescendente--;
		}	
	}

}
