import java.util.ArrayList;

public class Alumno {

	private String nombre;
	private int matricula;
	private ArrayList<Calificacion> calificaciones;
	private Calificacion calificacion;

	public Alumno(String nombre, int matricula) {
		super();
		this.nombre = nombre;
		this.matricula = matricula;
		this.calificaciones = new ArrayList<Calificacion>();
	}

	public Alumno() {

	}

	public String getNombre() {
		return nombre;
	}

	public int getMatricula() {
		return matricula;
	}

	public ArrayList<Calificacion> getCalificaciones() {
		return calificaciones;
	}

	public void calificar(String asignatura, int nota) {

		calificacion = new Calificacion(asignatura, nota);

		if (calificacion.getNota() < 0 || calificacion.getNota() > 100) {
			
			System.out.println("Error de nota en asignatura: ---> " + calificacion.getAsignatura() + " <---" + " La nota debe ser de tipo entero y entre 0 y 100");
			
		} else if(!calificaciones.contains(calificacion)){
			
				calificaciones.add(calificacion);
				
				System.out.println(calificacion.toString());
		}

	}

	/*
	public int notaMedia() {

		int sumaNotas = 0;

		for (Calificacion calificacion : calificaciones) {
			sumaNotas += calificacion.getNota();
		}

		return (sumaNotas / calificaciones.size());

	}
	*/

	public void notaMedia(int sumaNotas) {
		sumaNotas = 0;

		for (Calificacion calificacion : calificaciones) {
			sumaNotas += calificacion.getNota();
		}

		System.out.println("NOTA MEDIA: " + (sumaNotas / calificaciones.size()));

	}

	@Override
	public String toString() {
		return "Alumno matricula: " + matricula + " - " + nombre;

	}

}
