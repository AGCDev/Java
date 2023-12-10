package serializacion;

/**
 * Importamos los paquetes que vamos a necesitar, podríamos hacer uso de * en el
 * lugar del nombre para incluirlos todos pero de esta forma vemos más claro lo
 * que estamos haciendo.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {

	static BufferedReader datos = new BufferedReader(new InputStreamReader(System.in));
    private static File archivoClientes = new File("clientes.dat");
    private static List<Clientes> listaClientes = new ArrayList<>();
    
    // Mejor dejar de usar Scanner y usar en su lugar variable = datos.readLine(); porque dá menos problemas y errores... Es capaz de leer lineas enteras en lugar de solo cadena de caracteres de solo 1 palabra.
    static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		 int opcion = 0;

	        try {
	            do {
	                System.out.println("Elija una opción entre 1 y 6");
	                System.out.println("-----------------------------");
	                System.out.println("1. Añadir cliente");
	                System.out.println("2. Listar clientes");
	                System.out.println("3. Buscar clientes");
	                System.out.println("4. Borrar cliente");
	                System.out.println("5. Borrar fichero de clientes completamente");
	                System.out.println("6. Salir de la aplicación");
	                System.out.println("------------------------------");
	                System.out.println(" ");
	                
	                opcion = Integer.parseInt(datos.readLine());// Tenia opcion = sc.nextInt(); pero me devolvía un error que no comprendo, asi que, lo he sustituido por este ultimo...
	                
	                switch (opcion) {
	                    case 1:
	                        crearNuevoCliente();
	                        break;
	                    case 2:
	                        listarClientes();
	                        break;
	                    case 3:
	                        buscarCliente();
	                        break;
	                    case 4:
	                        borrarCliente();
	                        break;
	                    case 5:
	                        borrarFicheroCompletamente();
	                        break;
	                    case 6:
	                        System.out.println("¡¡¡ Muchas gracias por su visita y hasta pronto !!!");
	                        break;
	                }
	            } while (opcion != 6);
	        } catch (IOException | ClassNotFoundException e) {
	            System.out.println(Arrays.toString(e.getStackTrace()));
	        }

	    }

	    /**
	     * Ahora vamos a crear todos los métodos necesarios para hacer uso de las
	     * diferentes opciones que nos da el menú
	     */
	    // Crear archivo clientes.dat, lo mejor es crearlo previa y manualmente, pero lo usaremos para otros métodos
	    private static void crearArchivo() throws IOException {

	        try {
	            if (archivoClientes.exists()) {
	                System.out.println("El archivo ya existe");
	            } else {
	                archivoClientes.createNewFile();
	                System.out.println("Archivo creado correctamente");
	            }
	        } catch (IOException e) {
	            System.out.println(e.getStackTrace());
	        }

	    }

	    // Método para crear un nuevo cliente
	    private static void crearNuevoCliente() throws IOException, ClassNotFoundException {
	        
	        // Creamos un objeto para el nuevo cliente
	        Clientes nuevoCliente = new Clientes();
	        try {
	            
	        abrirCargarArchivoClientes();

	        String nif = null;
	        String nombre = null;
	        String telefono = null;
	        String email = null;
	        String direccion = null;

	        // Creamos un objeto para el nuevo cliente
	        //Clientes nuevoCliente = new Clientes();

	        
	            do {
	                System.out.println("Introduzca su NIF completo (9 caracteres)");
	                nif = datos.readLine();
	                if (nif.length() != 9) {
	                    System.out.println("ERROR. NIF incorrecto, debe tener 9 digitos");
	                } else {
	                    nuevoCliente.setNif(nif);
	                    System.out.println("NIF introducido correctamente");
	                }
	            } while (nif.length() != 9);

	            do {
	                System.out.println("Introduzca su nombre completo, preferiblemente nombre y apellidos");
	                nombre = datos.readLine();
	                if (nombre.length() < 5) {
	                    System.out.println("Introduzca nombre y apellido");
	                } else {

	                    nuevoCliente.setNombre(nombre.toLowerCase());
	                    System.out.println("Nombre y apellido introducido correctamente");
	                }
	            } while (nombre.length() < 5);

	            do {
	                System.out.println("Introduzca su teléfono, debe tener 9 caracteres numéricos");
	                telefono = sc.next();
	                if (telefono.length() < 9 || telefono.length() > 9) {
	                    System.out.println("ERROR. Teléfono no válido, asegúrese de que tiene 9 caracteres");
	                } else {
	                    nuevoCliente.setTelefono(telefono);
	                    System.out.println("Teléfono introducido correctamente");
	                }
	            } while (telefono.length() != 9);

	            do {
	                System.out.println("Introduzca su correco electrónico, debe contener @ ");
	                email = sc.next();
	                if (email.contains("@")) {
	                    nuevoCliente.setEmail(email);
	                    System.out.println("Correo electrónico introducido correctamente");
	                } else {
	                    System.out.println("ERROR. Correo electrónico no valido, debe tener @");
	                }
	            } while (!email.contains("@"));

	            System.out.println("Introduzca su dirección");
	            //direccion.trim();
	            direccion = datos.readLine();
	            nuevoCliente.setDireccion(direccion);
	            System.out.println("Su direccion es: " + direccion);

	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	        // Añadimos el nuevo cliente al array lista de clientes
	        listaClientes.add(nuevoCliente);
	    }

	    // Método para listar a todos los clientes
	    private static void listarClientes() throws IOException, ClassNotFoundException {

	        try {
	            abrirCargarArchivoClientes();

	            for (int i = 0; i < listaClientes.size(); i++) {
	                System.out.println(i + " - " + listaClientes.get(i));
	            }
	        } catch (IOException | ClassNotFoundException ex) {
	            System.out.println(ex.getMessage());
	        }

	    }

	    // Método para buscar clientes
	    private static void buscarCliente() throws IOException, ClassNotFoundException {

	        try {
	            abrirCargarArchivoClientes();

	            String nif = null;

	            do {
	                System.out.println("*************************************");
	                System.out.println("Introduzca NIF de cliente para buscar");
	                System.out.println("*************************************");
	                nif = sc.next();
	                if (nif.length() != 9) {
	                    System.out.println("ERROR. NIF incorrecto, debe tener 9 caracteres");
	                } else {
	                    for (int i = 0; i < listaClientes.size(); i++) {
	                        if (listaClientes.get(i).getNif().equalsIgnoreCase(nif)) {
	                            System.out.println("El NIF: " + nif + " se ha encontrado en la posición: " + i);
	                            System.out.println(listaClientes.get(i));
	                            //return;
	                        } else {
	                            System.out.println("NIF: " + nif + "No se encuentra");
	                        }
	                    }
	                }
	            } while (nif.length() != 9);
	        } catch (IOException | ClassNotFoundException e) {
	            System.out.println(e.getMessage());
	        }

	    }

	    // Método para borrar un cliente
	    private static void borrarCliente() throws IOException, ClassNotFoundException {

	        try {

	        } catch (Exception e) {
	            System.out.println(e.getCause());
	        }
	        abrirCargarArchivoClientes();

	        String nif = null;

	        do {
	            System.out.println("****************************************");
	            System.out.println("Introduzca NIF completo con 9 caracteres");
	            System.out.println("****************************************");
	            nif = sc.next();
	            if (nif.length() != 9) {
	                System.out.println("ERROR. NIF incorrecto, debe tener 9 caracteres");
	            } else {
	                for (int i = 0; i < listaClientes.size(); i++) {
	                    if (listaClientes.get(i).getNif().equalsIgnoreCase(nif)) {
	                        System.out.println("Se ha borrado correctamente al cliente con NIF: " + nif);
	                        listaClientes.remove(i);
	                        escribirArchivoClientes();
	                        return;
	                    } else {
	                        System.out.println("NIF: " + nif + " NO encontrado.");
	                    }
	                }
	            }
	        } while (nif.length() != 9);
	    }

	    //Método para borrar todos los clientes
	    private static void borrarFicheroCompletamente() {

	        try {
	            String respuesta = null;

	            System.out.println("******* ELIMINAR TODOS LOS DATOS *******");
	            System.out.println("Seguro que desea eliminar todos los datos? s/n");
	            respuesta = sc.next();
	            CharSequence s = null;
	            if (respuesta.contains(s)) {
	                listaClientes.clear();
	                System.out.println("El archivo se borró completamente de manera satisfactoria");
	            } else {
	                System.out.println("Archivo no borrado");
	            }
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }

	    }

	    // Método para abrir el archivo y cargue toda la información que contiene, la información la lee el ordenador, NO confundir con lectura humana, por eso input
	    private static void abrirCargarArchivoClientes() throws IOException, ClassNotFoundException {

	        try {
	            //Si no existe el archivo "clientes.dat", llamará al método crearArchivo(), en caso contrario, nos indiracará que ya existe
	            if (!archivoClientes.exists()) {
	                crearArchivo();
	            } else {
	                System.out.println("El archivo ya existe");
	            }

	            if (archivoClientes.canRead()) {
	                //Se introduce un objeto al archivo, en este caso los clientes, las personas también son objetos en java (POO)
	                try (FileInputStream fis = new FileInputStream(archivoClientes);
	                        //Se introduce un objeto al archivo, en este caso los clientes, las personas también son objetos en java (POO)
	                        ObjectInputStream ois = new ObjectInputStream(fis)) {
	                    // A esto se le llama hacer casting o castear, sirve para convertir tipos, es parecido a parsear
	                    listaClientes = (ArrayList<Clientes>) ois.readObject();
	                    ois.close();
	                    fis.close();
	                }
	            } else {
	                System.out.println("No hay contenido para cargar y/o leer");
	            }
	        } catch (IOException | ClassNotFoundException e) {
	            System.out.println(e.getMessage());
	        }

	    }

	    /**
	     * Método para que el ordenador nos muestre contenido (OutPut) del archivo y
	     * podamos escribir en el. Le pediremos que compruebe si existe el archivo
	     * clientes.dat del objeto archivoClientes, en caso contrario crealo.
	     */
	    private static void escribirArchivoClientes() throws IOException {

	        try {
	            // Si no existe el archivo, crealo, en caso contrario, envia mensaje diciendo que ya existe
	            if (!archivoClientes.exists()) {
	                crearArchivo();
	            } else {
	                System.out.println("El archivo ya existe");
	            }
	            // Creamos un objeto para que nos lo muestre
	            try ( //Nos muestra el archivo, por eso OutPut
	                    FileOutputStream fos = new FileOutputStream(archivoClientes); // Creamos un objeto para que nos lo muestre
	                    ObjectOutputStream oos = new ObjectOutputStream(fos)) {
	                // Escribir objeto en el archivo
	                oos.writeObject(listaClientes);
	                oos.close();
	            }
	        } catch (IOException ex) {
	            System.out.println(ex.getMessage());
	        }

	    }


}
