import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nif, nombre, direccion, telefono;
		
		
		Profesor profesor = new Profesor();
		Alumno alumno = new Alumno();
		Administrativo administrativo = new Administrativo();
		
		
		nif = "516632211R";
		profesor.setNif(nif);
		nombre = "Carlos Robles";
		profesor.setNombre(nombre);
		direccion = "C/ Pez Volador, 35";
		profesor.setDireccion(direccion);
		telefono = "616669922";
		profesor.setTelefono(telefono);
		
		nif = "532224411A";
		alumno.setNif(nif);
		nombre = "Alicia Torres";
		alumno.setNombre(nombre);
		direccion = "C/ Luna Lunera, 45";
		alumno.setDireccion(direccion);
		telefono = "639889999";
		alumno.setTelefono(telefono);
		
		nif = "123454411A";
		administrativo.setNif(nif);
		nombre = "Rosa Torres";
		administrativo.setNombre(nombre);
		direccion = "C/ Luna Lunera, 45";
		administrativo.setDireccion(direccion);
		telefono = "639889999";
		administrativo.setTelefono(telefono);
		
		
		System.out.println(profesor.toString());
		profesor.trabajar();
		System.out.println();
		System.out.println(alumno.toString());
		alumno.trabajar();
		System.out.println();
		System.out.println(administrativo.toString());
		administrativo.trabajar();
		
		System.out.println();
		System.out.println();
		
		alumno.llamar(profesor);
		
		System.out.println();
		
		System.out.println(profesor.ponerNotas());
		System.out.println(alumno.hacerExamen());
		System.out.println(administrativo.gestionarMatricula());
		
		
	}

}
