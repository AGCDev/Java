import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		Alumno alumno = new Alumno();
		Calificacion calificacion = new Calificacion();

		alumno = new Alumno("Carmen Torres", 31553);
		

		System.out.println(alumno.toString());
		
		alumno.calificar("Matematicas", 70);
		alumno.calificar("Lengua", 55);
		alumno.calificar("Inglés", -93);
		alumno.calificar("Física", 82);
		alumno.calificar("Educación física", 820);
		alumno.calificar("Biología y geología", 58);

		alumno.notaMedia(0);
		
		
		
		
	}

}
