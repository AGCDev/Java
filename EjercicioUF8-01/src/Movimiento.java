import java.time.LocalDate;

public class Movimiento {

	private LocalDate fecha;
	private String concepto; 
	private double cantidad;
	private double saldo;
	
	
	public Movimiento(LocalDate fecha, String concepto, double cantidad, double saldo) {
		super();
		this.fecha = fecha;
		this.concepto = concepto;
		this.cantidad = cantidad;
		this.saldo = saldo;
	}
	
	public Movimiento(String concepto, double cantidad, double saldo) {
		super();
		this.concepto = concepto;
		this.cantidad = cantidad;
		this.saldo = saldo;
		this.fecha = LocalDate.now();
	}
	
	public Movimiento() {
		super();
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return fecha + " Concepto = " + concepto + " Cantidad = " + cantidad + " Saldo = " + saldo;
	}
	
	
	
}
