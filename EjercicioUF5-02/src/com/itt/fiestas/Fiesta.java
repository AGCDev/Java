package com.itt.fiestas;

import javax.swing.JOptionPane;

public class Fiesta {

	private String tipo;
	private String fechaHora;
	private String direccion;
	private int bebidas;
	private int bocadillos;
	private int invitados = 0;
	private static int contadorFiestas = 0;
	
	{
		contadorFiestas++;
	}
	

	public Fiesta(String tipo, String fechaHora, String direccion, int bebidas, int bocadillos) {
		super();
		this.tipo = tipo;
		this.fechaHora = fechaHora;
		this.direccion = direccion;
		this.bebidas = bebidas;
		this.bocadillos = bocadillos;

	}

	public Fiesta() {

	}
	

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getBebidas() {
		return bebidas;
	}

	public void setBebidas(int bebidas) {
		this.bebidas = bebidas;
	}

	public int getBocadillos() {
		return bocadillos;
	}

	public void setBocadillos(int bocadillos) {
		this.bocadillos = bocadillos;
	}

	public int getInvitados() {
		return invitados;
	}

	public void setInvitados(int invitados) {
		this.invitados = invitados;
	}
	
	public static int getContadorFiestas() {
		return contadorFiestas;
	}
	
	public static void setContadorFiestas(int contadorFiesta) {
		contadorFiestas = contadorFiesta;
	}

	@Override
	public String toString() {
		return "Tipo de fiesta: " + tipo + "\nFecha y hora: " + fechaHora + "\nDireccion: " + direccion + "\nNumero de bebidas: "
				+ bebidas + "\nCantidad de bocadillos: " + bocadillos + "\nNúmero de invitados: " + invitados
				+ "\nPrecio total de la fiesta: " + precioFiesta() + "€";
	}

	public String consultar() {

		return toString();
	}

	public void invitar() {
		
			int numInvitados = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce número de personas que quieres invitar."));

			setInvitados(getInvitados() + numInvitados);
			
			JOptionPane.showMessageDialog(null, "Se han realizado: " + numInvitados + " invitaciones.");
		
	}
	

	public void cancelarInvitacion() {
		
		
			int numCancelaciones = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce número de invitaciones a cancelar."));
			
			if (getInvitados() < numCancelaciones) {
				JOptionPane.showMessageDialog(null, "No hay " + numCancelaciones + " invitados en lista.");
			}else {
				setInvitados(getInvitados() - numCancelaciones);
				JOptionPane.showMessageDialog(null, "Se han cancelado: " + numCancelaciones + " número de invitados: " + getInvitados());
			}
	}
	

	public double precioFiesta() {

		double precioTotal = ((5 * getInvitados()) + (2 * getBebidas()) + (3 * getBocadillos()));

		return precioTotal;

	}
}
