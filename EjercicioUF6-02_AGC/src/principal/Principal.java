package principal;

import com.itt.libreria.Autor;
import com.itt.libreria.Libro;

public class Principal {

	public static void main(String[] args) {
		
		String titulo, genero, nombre, biografia;
		
		Autor autor = new Autor(null, null);
		Libro libro = new Libro(null, null, autor);

		titulo = "cualquierTitulo";
		libro.setTitulo(titulo);
		
		genero = "cualquierGenero";
		libro.setGenero(genero);
		
		nombre = "cualquierNombre";
		autor.setNombre(nombre);
		
		biografia = "cualquierBiografia";
		autor.setBiografia(biografia);
		
		
		System.out.println(libro.toString());
		
		biografia = "biografiaModificada";
		autor.setBiografia(biografia);
		
		System.out.println(libro.toString());
		System.out.println(autor.toString());
		
		genero = "generoModificado";
		libro.setGenero(genero);
		System.out.println(libro.toString());
		
		
	}

}
