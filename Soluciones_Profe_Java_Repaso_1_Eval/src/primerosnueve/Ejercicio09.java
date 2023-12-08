package primerosnueve;

public class Ejercicio09 {

	/*
	 * 9. Para que tres números enteros de un triángulo válido, se tiene que dar la
	 * circunstancia de que la suma de dos cualquiera de los tiene que ser mayor que
	 * la del otro. Por tanto, el ejercicio consta de: a. Pedir tres números por
	 * consola, e informar si el triángulo es correcto, o no es correcto. b. Y si es
	 * correcto además decir si es i. Equilátero: los tres lados iguales. ii.
	 * Isósceles: dos iguales y uno desigual iii. Escaleno: los tres lados
	 * distintos.
	 */
	public static void main(String[] args) {
		int [] lados1 = {4,2,2,1,2};
		int [] lados2 = {2,2,3,1,4};
		int [] lados3 = {3,2,2,1,1};
		
		// en cada interaccion del bucle cojo el numero en la misma posición, ejemplo: primera vuelta en ç
		// posicion cero, tomo el 4,2,3, lado1 lado2, lado3. y asi en cada vuelta, 
		// y asi hago una prueba de cada en cada vuelta.
		
		for (int i = 0; i< lados1.length; i++)
		if (trianguloValido(lados1[i], lados2[i], lados3[i])) {
			System.out.print("triangulo valido\t");
			if (lados1[i] == lados2[i] && lados2[i] == lados3[i])
				System.out.println("es equilatero");
			else
				if (lados1[i] != lados2[i] && lados1[i] != lados3[i])
					System.out.println("es escaleno");
				else
					System.out.println("es isosceles");
			
		}
			else
				System.out.println("triángulo inválido");
			
	}
	

	public static boolean trianguloValido(int lado1, int lado2, int lado3) {

		if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1)
			return true;
		else
			return false;
	}

}
