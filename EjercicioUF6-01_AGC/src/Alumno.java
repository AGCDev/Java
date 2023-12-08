
public class Alumno extends Persona{

	private String curso = " 1º Bachillerato";
	
	
	
	public Alumno(String nif, String nombre, String direccion, String telefono, String curso) {
		super(nif, nombre, direccion, telefono);
		this.curso = curso;
	}
	
	public Alumno() {
		
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	@Override
	public String toString() {
		return "Alumno " + super.toString() + " Cursando: " + curso;
	}


	@Override
	public void trabajar() {
		System.out.println("El alumno " + getNombre() + " va a estudiar para el curso 1º Bachillerato.");
	}
	
	public String hacerExamen() {
		return "El alumno " + getNombre() + " va a hacer su examen";
	}

}
