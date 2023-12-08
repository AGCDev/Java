package ejercicioUF4;

import java.util.Iterator;
import java.util.Scanner;

public class EjercicioUF401 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String matrizIngles[][]= {
				{"bear", "oso"},
				{"cat", "gato"},
				{"cheetah", "guepardo"},
				{"dog", "perro"},
				{"eagle", "águila"},
				{"fish", "pez"},
				{"frog", "rana"},
				{"horse", "caballo"},
				{"lion", "león"},
				{"lizard", "lagarto"},
				{"meerkat", "suricata"},
				{"monkey", "mono"},
				{"orangutan", "orangután"},
				{"panther", "pantera"},
				{"parrot", "loro"},
				{"pig", "cerdo"},
				{"tiger", "tigre"},
				{"toad", "sapo"},
				{"tortoise", "tortuga"},
				{"yegua", "mare"},
		};

		String animal;
		int aciertos = 0;
		int fallos = 0;
		
		for (int i = 0; i < matrizIngles.length; i++) {
			for (int j = 0; j < matrizIngles[i].length; j++) {
				System.out.println("Traduce " + matrizIngles[i][j=0] + ":");
				animal = sc.next();
				if (animal.equals(matrizIngles[i][j=1])) {
					System.out.println("Bien!");
					aciertos++;
				}else {
					System.out.println("No, es " + matrizIngles[i][j=1]);
					fallos++;
				}
				
			}
			
		}
		sc.close();
		
		System.out.println("FIN DEL TEST");
		System.out.println("Has tenido " + aciertos + " aciertos");
		System.out.println("Has tenido " + fallos + " fallos");
		
	}

}
