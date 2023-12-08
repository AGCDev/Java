package com.itt.fiestas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		LocalDateTime fechaInvitacionParaFormatear = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy -- HH:MM");

		
		int opcion = 0;

		do {

			try {
				
				Fiesta fiesta = new Fiesta();
				
				opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la opción deseada: "	+ "\n 1. Invitar." + "\n 2. Cancelar invitación." + "\n 3. Salir."));

				switch (opcion) {
				case 1:

					fiesta.invitar();

					fiesta.setTipo(JOptionPane.showInputDialog(null, "Introduce tipo de fiesta: Infantil, cumpleaños, disfraces... "));
					fiesta.setFechaHora(String.valueOf(fechaInvitacionParaFormatear.format(dtf)));
					fiesta.setDireccion(JOptionPane.showInputDialog(null, "Introduce la dirección de la fiesta."));
					fiesta.setBebidas(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce número de bebidas.")));
					fiesta.setBocadillos(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce número de bocadillos.")));
					
					JOptionPane.showMessageDialog(null, fiesta.toString());

					break;
				case 2:
					fiesta.cancelarInvitacion();
					break;
				case 3:
					Fiesta.setContadorFiestas(Fiesta.getContadorFiestas() - 1);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opción incorrecta.");
					Fiesta.setContadorFiestas(Fiesta.getContadorFiestas() - 1);
					break;
				}

				JOptionPane.showMessageDialog(null,"Se han instanciado " + Fiesta.getContadorFiestas() + " objetos de la Clase Fiesta.");
			} catch (Exception e) {
				System.err.println("Error de datos: Caja vacía y/o tipo de dato incorrecto.");
			}

		} while (opcion != 3);

	}

}
