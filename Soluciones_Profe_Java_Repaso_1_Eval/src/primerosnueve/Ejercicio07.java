package primerosnueve;

import java.util.Scanner;

public class Ejercicio07 {

	/*
	 * 7. Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en
	 * el segundo siguiente.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora = 0, minutos = 0, segundos = 0;

		System.out.println("Teclea primero la hora, luego los minutos y luego los segundos.");
		hora = sc.nextInt();
		minutos = sc.nextInt();
		segundos = sc.nextInt();
		
		if (segundos != 59)
			segundos++;
		else if (minutos != 59) {
			segundos = 0;
			minutos ++;
		}else if(hora != 23) {
			segundos =0;
			minutos =0;
			hora++;
		}else {
			segundos =0;
			minutos = 0;
			hora = 0;
		}
		
		
		
		System.out.println("la hora actual es : " + hora +":"+minutos+":"+segundos);


	}

}
