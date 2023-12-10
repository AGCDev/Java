package serializacion;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

	 public static final long serialVersionUID = 1L;
	    static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));
	    private static File f=new File("clientes.dat");
	    private static List<Cliente> personas=new ArrayList<>();
	    
	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	        int opcion=1;
	        do{
	            if(opcion <1 || opcion >6)
	                System.err.println("Introduzca unicamente un valor entre 1 y 5");
	            try{
	                System.out.println("Menu principal");
	                System.out.println("1 - Agregar cliente");
	                System.out.println("2 - Listar clientes");
	                System.out.println("3 - Buscar cliente");
	                System.out.println("4 - Borrar cliente");
	                System.out.println("5 - Borrar fichero de clientes completamente");
	                System.out.println("6 - Salir de la aplicacion");
	                System.out.println("Introduzca la opcion deseada (1-6)");
	                opcion=Integer.parseInt(dato.readLine());
	                switch(opcion){
	                    case 1:
	                        introducirDatos();
	                        break;
	                    case 2:
	                        verDatos();
	                        break;
	                    case 3:
	                        buscarDato();
	                        break;
	                    case 4:
	                        eliminarUno();
	                        break;
	                    case 5:
	                        eliminarTodos();
	                        break;
	                    case 6:
	                        System.out.println("GRACIAS POR UTILIZAR LA APLICACION");
	                        break;
	                }
	            }catch (NumberFormatException nfe){
	                System.err.println("Solo son validos los valores enteros entre 1 y 6");
	            }catch(IOException ioe){
	                System.err.println("Error de entrada de datos: "+ioe.getMessage());
	            }
	        }while(opcion !=6);
	    }
	    
	    /****************
	     * Introducimos los datos del cliente comprobando:
	     * NIF      ->  Que tenga un valor entre 999999 y 99999999 y que termine en una letra
	     * Telefono ->  Que sean valores numericos entre 600000000 y 700000000 o entre 900000000 y 1000000000
	     * Deuda    ->  Que sea un valor numerico
	     */
	    private static void introducirDatos() {
	        String ni = null;
	        long tel=0L;
	        float de=0F;
	        boolean noFloat,noNIF,noTEL;
	        abrir();
	        try{
	            do{
	                System.out.println("Introduzca el NIF del cliente: ");
	                ni=dato.readLine();
	                noNIF=compruebaNIF(ni);
	                if(!noNIF)
	                    System.err.println("NIF ERRONEO");
	            }while(!noNIF);
	            System.out.println("Introduzca el nombre del cliente: ");
	            String nom = dato.readLine();
	            do{
	                noTEL=false;
	                try{
	                    System.out.println("Introduzca el telefono del cliente ");
	                    tel=Long.parseLong(dato.readLine());
	                    noTEL=compruebaTel(tel);
	                    if(!noTEL)
	                        System.err.println("N� DE TELEFONO ERRONEO");
	                }catch(IOException | NumberFormatException e){
	                    System.err.println("Introduzca numeros validos");
	                }
	            }while(!noTEL);
	            System.out.println("Introduzca la direccion del cliente: ");
	            String dir=dato.readLine();
	            do{
	                try{
	                    noFloat=false;
	                    System.out.println("Introduzca la deuda del cliente: ");
	                    de=Float.parseFloat(dato.readLine());
	                }catch(IOException | NumberFormatException e){
	                    System.err.println("Introduzca números validos");
	                    noFloat=true;
	                }
	            }while(noFloat);
	            if(personas.isEmpty()){
	                personas=new ArrayList<Cliente>();
	            }
	            personas.add(new Cliente(ni,nom,tel,dir,de));
	            escribirArchivo();
	            System.out.println("Cliente "+personas.size()+" agregado");
	        }catch (IOException | NumberFormatException ex){
	            System.err.println(ex.getMessage());
	        }
	    }

	    /*****************
	     * Funcion que nos permite visualizar todos los datos almacenados
	     * Primero comprobamos que el fichero exista.
	     * Si existe, lo abrimos y comprobamos que no este vacio recorriendo todo su contenido
	     */
	    private static void verDatos() {
	        if(!f.exists()){
	            System.err.println("NO EXISTEN DATOS");
	        } else{
	            abrir();
	            if(personas != null){
	                int con=1;
	                for(Cliente p:personas){
	                    System.out.println("Registro nº "+con+" - "+p.toString());
	                    con++;
	                }
	            }else{
	                System.out.println("No existen clientes dados de alta.");
	            }
	        }
	    }

	    /*****************
	     * Funcion que nos permite buscar un registro concreto buscandolo por su NIF
	     * 
	     */
	    private static void buscarDato(){
	        try{
	            String res;
	            boolean repetir, encontrado;
	            do{
	                repetir=false;
	                System.out.println("Introduzca el nif del cliente que desea buscar");
	                String ni=dato.readLine();
	                abrir();
	                int i=0;
	                encontrado=false;
	                for(Cliente p:personas){
	                    if(p.getNif().equals(ni)){
	                        encontrado=true;
	                        System.out.println("Registro nº"+i+" - "+p.toString());
	                    }
	                    i++;
	                }
	                if(!encontrado)
	                    System.err.println("REGISTRO NO ENCONTRADO");
	                System.out.println("Desea buscar otro registro (S/N)");
	                do{
	                    res=dato.readLine().toUpperCase();
	                    if(!res.equals("N")&&!res.equals("S"))
	                        System.err.println("Sólo 'S' para buscar otro y 'N' para salir");
	                    if(res.equals("S")){
	                        repetir=true;
	                    }
	                }while(!res.equals("S") && !res.equals("N"));
	            }while(repetir);
	        } catch(Exception ex){
	            System.out.println("Error: "+ex.getMessage());
	        }
	    }

	    /****************
	     * Funcion similar a la anterior pero que en lugar de limitarse a mostrarnos el resultado
	     * de la busqueda, nos permite decidir si deseamos eliminar el registro encontrado
	     */
	    private static void eliminarUno() {
	        try{
	            System.out.println("Introduzca el nif del cliente que desea eliminar");
	            String ni=dato.readLine();
	            abrir();
	            int i=0;
	            boolean encontrado=false;
	            for(Cliente p:personas){
	                if(p.getNif().equals(ni)){
	                    encontrado=true;
	                    System.out.println("Registro numero"+i+" - "+p.toString());
	                    System.out.println("Esta seguro que desea eliminarlo (S/N)");
	                    String res;
	                    do{
	                        res=dato.readLine().toUpperCase();
	                        if(!res.equals("N")&&!res.equals("S"))
	                            System.err.println("Solo 'S' para borrar y 'N' para mantenerlo");
	                        if(res.equals("S")){
	                            personas.remove(i);
	                            escribirArchivo();
	                            System.out.printf("REGISTRO ELIMINADO\n",i);
	                        }
	                    }while(!res.equals("S") && !res.equals("N"));
	                }
	                i++;
	            }
	            if(!encontrado)
	                System.err.println("REGISTRO NO ENCONTRADO");
	        } catch(Exception ex){
	            System.out.println("Error: "+ex.getMessage());
	        }
	    }

	    /******************
	     * Funcion que nos elimina el fichero de datos del disco
	     */
	    private static void eliminarTodos() {
	         String res;
	         boolean borrado=false;
	         try{
	            System.out.println("Está seguro que desea eliminar el fichero (S/N)");
	            do{
	                res=dato.readLine().toUpperCase();
	                if(!res.equals("N")&&!res.equals("S"))
	                    System.err.println("Sólo 'S' para borrar y 'N' para mantenerlo");
	                if(res.equals("S")){
	                    
	                    borrado=f.delete();
	                    if(borrado){
	                        System.out.println("FICHERO DE DATOS ELIMINADO");
	                        personas.clear();
	                    }else{
	                        System.err.println("No ha sido posible eliminar el fichero");
	                    }
	                }
	            }while(!res.equals("S") && !res.equals("N"));
	         }catch(FileNotFoundException fnf){
	             System.err.println("Fichero inexistente: "+fnf.getMessage());
	         }catch(Exception ex){
	             ex.getMessage();
	         }
	    }

	    /*****************
	     * Funcion que nos abre el fichero de datos para cagar su contenido en el arreglo 'personas'.
	     * Previamente comprueba si el fichero existe, y si es asi carga su contenido en el ArrayList
	     * y cierra el fichero. Si por cualquier motivo no se puede leer del disco (esta creado pero no
	     * contiene datos) nos avisa que el fichero esta vacio.
	     */
	    private static void abrir(){
	        try{
	            if(!f.exists()){
	                crearArchivo();
	            }else{
	                if(f.canRead()){
	                    FileInputStream fis = new FileInputStream(f);
	                    ObjectInputStream ois = new ObjectInputStream(fis);
	                    personas = (ArrayList<Cliente>)ois.readObject();
	                    ois.close();
	                    fis.close();
	                }else{
	                    System.err.println("FICHERO VACIO");
	                }
	            }
	        }catch(IOException | ClassNotFoundException ex){
	            System.err.println("Error: "+ex.getMessage());
	        }
	    }
	    
	    /***********************
	     * Funcion que nos crea el fichero de datos (valido para cuando se comprueba que no existe)
	     */
	    private static void crearArchivo(){
	        try{
	            f.createNewFile();
	            System.out.println("Fichero creado");
	        }catch(Exception ex){
	            System.err.println("ERROR: "+ex.getMessage());
	        }
	    }
	     
	    /************************
	     * Funcion que nos escribe el ArrayList en el fichero de disco.
	     */
	    private static void escribirArchivo(){
	        try{
	            if(!f.exists()) f=new File("clientes.dat");
	            FileOutputStream fos = new FileOutputStream(f);
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(personas);
	            oos.close();
	            fos.close();
	        }catch(Exception ex){
	            System.err.println(ex.getMessage());
	        }
	    }
	    
	    /******************
	     * Funcion que comprueba que el nif es correcto (numero entre 6 y 8 digitos 
	     * finalizados en una letra valida)
	     * @param ni
	     * @return boolean
	     */
	    private static boolean compruebaNIF(String ni) {
	        boolean miNIF=false;
	        int lon=ni.length();
	        String letraValida="TRWAGMYFPDXBNJZSQVHLCKET";
	        try{
	            char letra=Character.toUpperCase(ni.charAt(lon-1));
	            int numero=Integer.parseInt(ni.substring(0, lon-1));
	            if((numero>999999 && numero<99999999) && (letra>=65 && letra<=90)){
	                int numLetra=(int)numero%23;
	                if(letraValida.charAt(numLetra)!=letra){
	                    System.err.println("Letra del NIF no valida");
	                }else{
	                    miNIF=true;
	                }
	            }
	        }catch(Exception e){
	            System.err.println("Numero NO valido");
	        }
	        return miNIF;
	    }

	    /*******************
	     * Funcion que comprueba que el telefono es valido comienza por 6 o por 9 y tiene 9 digitos
	     * @param tel
	     * @return boolean
	     */
	    private static boolean compruebaTel(long tel) {
	        boolean miTEL=false;
	        if((tel>600000000&&tel<700000000)||(tel>900000000&&tel<1000000000)) miTEL=true;
	        return miTEL;
	    }


}
