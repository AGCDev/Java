package primerosnueve;

public class Ejercicio04 {

	/*
	 * 4. Pedir un número entre 0 y 9999, decir si es capicúa.
	 */
	public static void main(String[] args) {
		int[] numeros = {1245, 1221, 2222, 123, 121, 12, 22, 3};
		
		for (int numero : numeros) {
			String cadena = String.valueOf(numero);
			
			switch (cadena.length()) {
			case 4:
				if (cadena.valueOf(cadena.charAt(0)).equals(cadena.valueOf(cadena.charAt(3))) && cadena.valueOf(cadena.charAt(1)).equals(cadena.valueOf(cadena.charAt(2)))) {
					System.out.println("El numero: " + numero + " es capicua. ");
				}else {
					System.out.println("El numero: " + numero + " NO es capicua. ");
				}
				break;
			case 3:
				if (cadena.valueOf(cadena.charAt(0)).equals(cadena.valueOf(cadena.charAt(2)))) {
					System.out.println("El numero: " + numero + " es capicua. ");
				} else {
					System.out.println("El numero: " + numero + " NO es capicua. ");
				}
				break;
			case 2:
				if (cadena.valueOf(cadena.charAt(0)).equals(cadena.valueOf(cadena.charAt(1)))) {
					System.out.println("El numero: " + numero + " es capicua. ");
				} else {
					System.out.println("El numero: " + numero + " NO es capicua. ");
				}
				break;
			case 1:
				System.out.println("El numero: " + numero + " solo tiene una cifra.");
				break;

			default:
				break;
			}
		}

	}

}
