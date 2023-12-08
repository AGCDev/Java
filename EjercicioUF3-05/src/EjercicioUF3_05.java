
public class EjercicioUF3_05 {

	public static void main(String[] args) {
		String caso1, caso2, caso3, caso4, caso5, error;

		int numeroAleatorio = 1;

		while (numeroAleatorio >= 1 && numeroAleatorio <= 5) {
			numeroAleatorio = (int) (Math.random() * 10 + 1);
			switch (numeroAleatorio) {
			case 1:
				caso1 = "El numero generado ha sido: " + numeroAleatorio;
				System.out.println(caso1);
				break;
			case 2:
				caso2 = "El numero generado ha sido: " + numeroAleatorio;
				System.out.println(caso2);
				break;
			case 3:
				caso3 = "El numero generado ha sido: " + numeroAleatorio;
				System.out.println(caso3);
				break;
			case 4:
				caso4 = "El numero generado ha sido: " + numeroAleatorio;
				System.out.println(caso4);
				break;
			case 5:
				caso5 = "El numero generado ha sido: " + numeroAleatorio;
				System.out.println(caso5);
				break;

			default:
				error = "El numero generado ha sido: " + numeroAleatorio + " y está fuera de margen.";
				System.out.println(error);
				break;
			}
		}

	}

}
