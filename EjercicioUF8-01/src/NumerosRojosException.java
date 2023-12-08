
public class NumerosRojosException extends RuntimeException{

	private double dineroErroneo;
	
	public NumerosRojosException(double dineroErroreno) {
		super("cantidad dinero inferior a 0");
		this.dineroErroneo = dineroErroreno;
	}

	@Override
	public String getMessage() {
		String mensaje = "El saldo de la cuenta es INSUFICIENTE, retirada de dinero NO PERMITIDA";
			
		return mensaje;
	}

	@Override
	public String toString() {
		return "NumerosRojosException [dineroErroneo=" + dineroErroneo + "]";
	}
	
	
}
