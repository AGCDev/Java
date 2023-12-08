package diezaldieciseis;

import java.util.Scanner;

public class Ejercicio15 {
	/*
	 * 15. MENUS Pedir cada vez dos números con decimales y sacar por pantalla un
	 * menú por consola con las siguientes opciones: 1. Calcular la hipotenusa de
	 * dos números reales dados por consola. Recuerda la hipotenusa es igual a la
	 * raíz cuadrada de los cuadrados de los catetos. Recurre a la clase Math. 2.
	 * Obtener el área de un triángulo. Recuerda a= base * altura / 2. 3. Informar
	 * de cual es el número mayor de los dos, o si son iguales. 4. Devolver la suma,
	 * la diferencia y el producto de los dos números.
	 * 
	 */
	static Scanner leer;

	public static void main(String[] args) {
		leer = new Scanner(System.in);
		int num1 = 0, num2 = 0;

		int opcion = 0;

		opcion = menu();
		while (opcion >= 1 && opcion <= 4) {
			System.out.println("dame dos numeros");
			num1 = leer.nextInt();
			num2 = leer.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("la hipotenusa = " + (Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2))) + "\n\n");
				break;
			case 2:
				System.out.println("el area del triangulo b*h/2 es : " + (num1 * num2 / 2));
				break;
			case 3:
				if (num1 > num2)
					System.out.println("num1 es mayor que num2");
				else if (num1 < num2)
					System.out.println("num2 es mayor que num1");
				else
					System.out.println("num1 es igual a num2");
				break;
			case 4:
				System.out.println("suma : " + (num1 + num2));
				System.out.println("producto : " + (num1 * num2));
				System.out.println("diferencia : " + (num1 - num2));

				break;
			}
			opcion = menu();
		}

		System.out.println("PROCESO TERMINADO");

		leer.close();

	}

	public static int menu() {

		System.out.println("MENU DE OPCIONES");
		System.out.println("1.- Calcular hipotenusa");
		System.out.println("2.- Area Triangulo");
		System.out.println("3.- Comparacion numeros");
		System.out.println("4.- Suma, diferencia,producto");
		System.out.println("teclea un mumero , cualquier otro salir");
		return leer.nextInt();

	}
}
