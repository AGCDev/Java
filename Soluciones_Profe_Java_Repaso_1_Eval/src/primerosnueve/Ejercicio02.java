package primerosnueve;

public class Ejercicio02 {

	/*
	 * 2. Pedir un n�mero entre 0 y 9999 y mostrarlo con las cifras al rev�s.
	 */
	public static void main(String[] args) {
		// Esta es la forma mas elegante basada en el conocimiento de las clases vistas durante el curso.

		int aleatorio = (int)(Math.random()*10000);
		System.out.println(aleatorio);
		String cadena = String.valueOf(aleatorio);
		
		StringBuilder sb = new StringBuilder(cadena); //meto la cadena de numeros en un StringBuilder
		
		sb = sb.reverse(); // StringBuilder tiene un m�todo reverse que le da la vuelta a la cadena de caracteres.
		System.out.println(sb);
		
		/*
		 * Tambi�n se puede hacer as�:
		 * 
		 * StringBuilder sb = new StringBuider(String.valueOf(cadena));
		 * System.out.println("el numero : " + aleatorio + "  queda ahora : " + sb2.reverse());
		 * 
		 */
	}

}
