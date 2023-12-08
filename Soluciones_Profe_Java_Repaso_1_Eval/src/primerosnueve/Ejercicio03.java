package primerosnueve;

public class Ejercicio03 {

	/*
	 * 3. Pedir número entre 0 y 9999 y decir cuantas cifras tiene.
	 */
	public static void main(String[] args) {
		int aleatorio = (int)(Math.random()*10000);
		System.out.println(aleatorio);
		
		String cadena = String.valueOf(aleatorio);
		System.out.println("Este numero: " + aleatorio + " tiene " + cadena.length() + " caracteres.");
	}

}
