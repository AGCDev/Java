import java.util.Scanner;

public class EjecicioUF3_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0, num2 = 0, resultado1 = 0, resultado2 = 0;
		
		
		System.out.println("Dame numeros positivos, si me das un numero negativo, se finaliza el programa...");
		num1 = sc.nextInt();
		
		while (num1 >= 0) {
			num1 = sc.nextInt();
			if (num1 >= 5 && num1 <= 15) {
				num2 += (num1+15);
				resultado1 = num2;
			} else {
				num2 += (num1+5);
				resultado2 = num2;
			}
		}
		
		System.out.println("Resultado opcion1: " + resultado1);
		System.out.println("Resultado opcion2: " + resultado2);
		
		sc.close();

	}

}
