import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Fiesta fiesta = new Fiesta();

		LocalDateTime fecha = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy -- HH:MM");

		fiesta.setTipo(
				JOptionPane.showInputDialog(null, "Introduce tipo de fiesta: Infantil, cumpleaños, disfraces... "));

		fiesta.setFechaHora(String.valueOf(fecha.format(dtf)));
		// fiesta1.setFechaHora(JOptionPane.showInputDialog(null, "Introduce la fecha y
		// la hora de la fiesta."));
		fiesta.setDireccion(JOptionPane.showInputDialog(null, "Introduce la direccion de la fiesta."));
		fiesta.setBebidas(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce número de bebidas.")));
		fiesta.setBocadillos(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce número de bocadillos.")));

		int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Introduce la opcion deseada: " + "\n 1. Invitar." + "\n 2. Cancelar invitación." + "\n 3. Salir."));

		switch (opcion) {
		case 1:
			JOptionPane.showMessageDialog(null, "Has invitado a 1 persona");
			fiesta.invitar();
			System.out.println(fiesta.toString());
			break;
		case 2:
			fiesta.cancelarInvitacion();
			break;
		case 3:
			System.out.println("Hasta Pronto!!");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opción Incorrecta.");
			break;
		}
		
	}
}
