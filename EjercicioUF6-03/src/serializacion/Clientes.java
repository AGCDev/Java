package serializacion;

import java.io.Serializable;

//Creamos la clase Clientes e implementamos "Serializable" del paquete "java.io.Serializable"
public class Clientes implements Serializable{

	 private String nif;
	    private String nombre;
	    private String telefono;
	    private String email;
	    private String direccion;

	    
	    // Crear un constructor vacío es una buena construmbre para evitar problemas ya que un solo constructor con parámetros, limitaría su uso.
	    public Clientes() {
	    }
	    
	    // Ahora creamos un constructor con todos los parámetros
	    public Clientes(String nif, String nombre, String telefono, String email, String direccion) {
	        this.nif = nif;
	        this.nombre = nombre;
	        this.telefono = telefono;
	        this.email = email;
	        this.direccion = direccion;
	    }
	    
	    // Ahora generamos los métodos GETTER y SETTER para obtener datos de las variables y/o modificarlas.
	    public String getNif() {
	        return nif;
	    }

	    public void setNif(String nif) {
	        this.nif = nif;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getTelefono() {
	        return telefono;
	    }

	    public void setTelefono(String telefono) {
	        this.telefono = telefono;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getDireccion() {
	        return direccion;
	    }

	    public void setDireccion(String direccion) {
	        this.direccion = direccion;
	    }
	    
	    // Ahora crearemos el método toString para recibir todos los datos de las variables de forma más cómoda
	    @Override
	    public String toString() {
	        return "Clientes{" + "nif=" + nif + ", nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + ", direccion=" + direccion + '}';
	    }
}
