import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws NumerosRojosException, NumberFormatException {

		Scanner lector = new Scanner(System.in);

		System.out.println("Vamos a crear una cuenta y realizar el primer ingreso de 100 euros");

		try {
			
			CuentaBancaria miCuenta = new CuentaBancaria(38143, "Amelia González");

			miCuenta.agregarMovimiento("Ingreso inicial", 100);

			System.out.println("Cuánto dinero retirar: ");

			int dinero;

			dinero = Integer.parseInt(lector.nextLine());

			miCuenta.agregarMovimiento("Retirada de fondos", -dinero);
			
			lector.close();
			
			System.out.println(miCuenta);
			
			System.out.println(miCuenta.listarMovimientos());

		} catch (NumberFormatException e) {

			System.err.println("Formato NO valido.");

		} catch (NumerosRojosException e) {

			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();

		}

	}

}
