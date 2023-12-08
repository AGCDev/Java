import javax.swing.JOptionPane;

public class Fiesta {

	private String tipo;
	private String fechaHora;
	private String direccion;
	private int bebidas;
	private int bocadillos;
	private int invitados = 0;

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

	@Override
	public String toString() {
		return "Fiesta de: " + tipo + ", fecha y hora: " + fechaHora + ", direccion: " + direccion + ", bebidas "
				+ bebidas + ", cantidad de bocadillos: " + bocadillos + ", numero de invitados: " + invitados
				+ ", precio total de la fiesta: " + this.precioFiesta() + "€" + "]";
	}

	public String consultar() {

		return toString();
	}

	public void invitar() {

		this.setInvitados(this.getInvitados() + 1);
	}
	

	public void cancelarInvitacion() {

		if (this.getInvitados() <= 0) {
			System.out.println("No hay invitados en la lista.");
		} else {
			this.setInvitados(getInvitados() - 1);
			JOptionPane.showMessageDialog(null, "Has cancelado 1 invitación");
		}

	}

	public double precioFiesta() {

		double precioTotal = ((5 * getInvitados()) + (2 * getBebidas()) + (3 * getBocadillos()));

		return precioTotal;

	}

}
