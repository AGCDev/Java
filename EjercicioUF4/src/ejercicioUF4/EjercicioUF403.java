package ejercicioUF4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class EjercicioUF403 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		
		String texto = null;
		String palabras;
		String palabras2;
		
		do {
			System.out.println("Escribe un texto:");
			texto = sc.nextLine();
			palabras = sb.append(texto.toUpperCase() + " ").toString();
			palabras2 = palabras.replace("FIN", " ");
			StringTokenizer stk = new StringTokenizer(palabras2);
			if (texto.equalsIgnoreCase("FIN")) {
				while (stk.hasMoreElements()) {
					System.out.println(stk.nextElement());
				}
			}else {
				System.out.println("Longitud: " + texto.length());
			}
		} while (!texto.equalsIgnoreCase("FIN"));
	}

}
