
public class EjercicioUF3_04 {

	public static void main(String[] args) {
		

		int numeroAleatorio = 0;
		int contadorNumerosAleatorios = 0;

		while (numeroAleatorio != 7) {
			numeroAleatorio = (int) (Math.random() * 10 + 1);
			contadorNumerosAleatorios++;
			System.out.println("Numero aleatorio generado: " + numeroAleatorio);
			System.out.println("Contador de numeros aleatorios: " + contadorNumerosAleatorios);
			System.out.println();
		}
		
	}

}
