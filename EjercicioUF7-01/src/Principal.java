import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		Alumno alumno = new Alumno();
		Calificacion calificacion = new Calificacion();

		alumno = new Alumno("Carmen Torres", 31553);
		

		System.out.println(alumno.toString());
		
		alumno.calificar("Matematicas", 70);
		alumno.calificar("Lengua", 55);
		alumno.calificar("Ingl�s", -93);
		alumno.calificar("F�sica", 82);
		alumno.calificar("Educaci�n f�sica", 820);
		alumno.calificar("Biolog�a y geolog�a", 58);

		alumno.notaMedia(0);
		
		
		
		
	}

}
