
public class Profesor extends Persona{

	private String competencias = " Matemáticas y Lengua";
	
	
	
	public Profesor(String nif, String nombre, String direccion, String telefono, String competencias) {
		super(nif, nombre, direccion, telefono);
		this.competencias = competencias;
	}
	
	
	public Profesor() {
		super();
	}
	

	public String getCompetencias() {
		return competencias;
	}


	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}


	@Override
	public String toString() {
		
		return "Profesor " + super.toString() + " Competencias: " + competencias;
	}


	@Override
	public void trabajar() {
		System.out.println("El profesor " + this.getNombre() + " va a impartir su clase.");
	}
	
	public String ponerNotas() {
		return "El profesor " + this.getNombre() + " va a corregir los exámenes";
	}

}
