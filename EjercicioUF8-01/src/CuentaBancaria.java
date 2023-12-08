import java.util.ArrayList;

public class CuentaBancaria {

	private int numeroCuenta;
	private String cliente;
	private double saldo;
	private ArrayList<Movimiento> movimientos;
	
	public CuentaBancaria(int numeroCuenta, String cliente, double saldo, ArrayList<Movimiento> movimientos) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.cliente = cliente;
		this.saldo = saldo;
		this.movimientos = movimientos;
	}
	
	public CuentaBancaria(int numeroCuenta, String cliente) throws NumberFormatException, NumerosRojosException{
		super();
		this.numeroCuenta = numeroCuenta;
		this.cliente = cliente;
		this.saldo = 0;
		this.movimientos = new ArrayList();
		
		
	}
	
	public CuentaBancaria() {
		super();
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public ArrayList<Movimiento> getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(ArrayList<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}
	

	public void agregarMovimiento(String concepto, double cantidad) throws NumberFormatException, NumerosRojosException {
		
		double resultadoSacarDinero = this.getSaldo() + cantidad;
		
		if (resultadoSacarDinero < 0) {
			throw new NumerosRojosException(cantidad);
		}else {
			this.saldo = this.saldo + cantidad;
			this.movimientos.add(new Movimiento(concepto, cantidad, saldo));
			System.out.println("Saldo actual: " + this.getSaldo());
		}
	}
	
	@Override
	public String toString() {
		return "Numero = " + numeroCuenta + ", Cliente = " + cliente + ", Saldo=" + saldo;
	}
	
	public String listarMovimientos() {
		
		String listado = "";
		
		for(Movimiento mov : this.movimientos) {
			
			listado = listado + mov.toString() + "\n";
			
		}
		
		return listado;
	}
	
	
}
