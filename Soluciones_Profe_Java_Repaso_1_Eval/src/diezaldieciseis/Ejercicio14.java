package diezaldieciseis;

public class Ejercicio14 {
	/*
	 * 14. Dise�ar un programa que muestre el producto de los 10 primeros n�meros impares.
	 */
	public static void main(String[] args) {
		
		int acumula = 1;
		int impar = 1;
		
		for (int i=1; i<=10; i++) {
			acumula *= impar;
			impar+=2;
			System.out.println("total diez primeros impares : " + acumula);
		}
		
		System.out.println("total diez primeros impares : " + acumula);
		System.out.println("FIN PROCESO");

	}

}
