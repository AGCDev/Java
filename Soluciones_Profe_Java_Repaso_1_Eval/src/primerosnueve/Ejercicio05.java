package primerosnueve;

public class Ejercicio05 {

	/*
	 * 5. Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente,
	 * Suficiente, Bien...
	 */
	public static void main(String[] args) {
		int nota = 0;
		String tipoNota = null;
		nota = (int) (Math.random() * 11);
		while (nota != 0) {
			if (nota < 4) {
				tipoNota = "Muy Deficiente";
			} else if (nota < 5) {
				tipoNota = "Insuficiente";
			} else if (nota < 6) {
				tipoNota = "Suficiente";
			} else if (nota < 7) {
				tipoNota = "Bien";
			} else if (nota < 9) {
				tipoNota = "Notable";
			} else {
				tipoNota = "Sobresaliente";
			}
			System.out.println("La nota " + nota + " es " + tipoNota);
			nota = (int) (Math.random() * 11);
		}
		System.out.println("Programa terminado");
		
	}

}
