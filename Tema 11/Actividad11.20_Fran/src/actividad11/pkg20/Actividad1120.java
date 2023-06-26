package actividad11.pkg20;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author fran - modified
 */
public class Actividad1120 {

	private static final Scanner sc = new Scanner(System.in); //Para abrir el Scanner para toda la clase
	
	public static void nuevoCliente(int ultimoId, String nombre, int telefono, ArrayList<Cliente> Clientes) {
        boolean existe = false;
        for (Cliente cliente : Clientes) {
            if (cliente.getTelefono() == telefono) {
                existe = true;
            }
        }
        if (existe) {
            System.out.println("Ya existe un cliente con ese teléfono");
        } else {
            Clientes.add(new Cliente(ultimoId, nombre, telefono));

        }
    }

    public static void modificarNombre(int telefono, ArrayList<Cliente> Clientes) {
        boolean existe = false;
        for (Cliente cliente : Clientes) {
            if (cliente.getTelefono() == telefono) {
                existe = true;
                System.out.println("Escriba el nuevo nombre del cliente");
                String nombreNuevo = pedirCadena();
                cliente.setNombre(nombreNuevo);
            }
        }
        if (existe) {
            System.out.println("Se ha modificado correctamente");
        } else {
            System.out.println("No se ha encontrado el cliente");
        }

    }

    public static void modificarNumero(int telefono, ArrayList<Cliente> Clientes) {
        boolean existe = false;
        for (Cliente cliente : Clientes) {
            if (cliente.getTelefono() == telefono) {
                existe = true;
                System.out.println("Escriba el nuevo telefono del cliente");
                int telefonoNuevo = pedirEntero("Introduce una opción del menú: ");
                cliente.setTelefono(telefonoNuevo);
            }
        }
        if (existe) {
            System.out.println("Se ha modificado correctamente\n");
        } else {
            System.out.println("No se ha encontrado el cliente\n");
        }

    }

    public static void bajaCliente(int telefono, ArrayList<Cliente> Clientes) {
        boolean existe = false;
        for (Cliente cliente : Clientes) {
            if (cliente.getTelefono() == telefono) {
                existe = true;
                int indice = Clientes.indexOf(cliente);
                Clientes.remove(indice);
                break;
            }
        }
        if (existe) {
            System.out.println("Se ha dado de baja el cliente\n");
        } else {
            System.out.println("No se ha encontrado el cliente indicado\n");
        }
    }

    public static void listarClientes(ArrayList<Cliente> Clientes) {
        if (!Clientes.isEmpty()) {
            System.out.println("Nombre\tTelefono");
			Clientes.forEach(cliente -> {
				System.out.println(cliente);
			});
        } else {
            System.out.println("No existen clientes\n");
        }

    }

    public static String pedirCadena() {
        return sc.nextLine();
    }

    public static int pedirEntero(String mensaje) {
        int numero = 0;
		boolean correcto;
		
		do {
			correcto = true;
			System.out.println(mensaje);
			try {
				numero = sc.nextInt();
			} catch (InputMismatchException ex) {
				correcto = false;
			} finally {
				sc.nextLine(); //Para que salte a la siguiente línea y no detecte la basura
			}
			
		} while(!correcto);
		
		
		return numero;
    }
	
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        int opcion = -1;
        int modificacion = -1;
        int ultimoId = 0;
		int telefono; int telefonoAntiguo;

        try {
			try (FileInputStream lectura = new FileInputStream("datos.dat"); ObjectInputStream leerFichero = new ObjectInputStream(lectura)) {
				while (lectura.available() > 0) {
					clientes = (ArrayList<Cliente>) leerFichero.readObject();
					ultimoId = clientes.get(clientes.size() - 1).getId();
					ultimoId++;
				}
			}

        } catch (IOException | ClassNotFoundException ex) {
            if (ex.getMessage() == null) {
                System.out.print("");
            } else {
                System.out.println(ex.getMessage());
            }

        }

        do {

            System.out.println("1.-Añadir nuevo cliente");
            System.out.println("2.-Modificar datos");
            System.out.println("3.-Dar de baja cliente");
            System.out.println("4.-Listar los clientes");
            System.out.println("0.-Guardar y salir");

            opcion = pedirEntero("Introduce una opción del menú: ");

            switch (opcion) {
                case 1 -> {
					System.out.println("Escriba el nombre del nuevo cliente");
					String nombre = pedirCadena();
					System.out.println("Escriba el teléfono del nuevo cliente");
					telefono = pedirEntero("Introduce una opción del menú: ");
					nuevoCliente(ultimoId, nombre, telefono, clientes);
					ultimoId++;
				}
                case 2 -> {
					do {
						System.out.println("1.-Modificar el nombre del cliente");
						System.out.println("2.-Modificar el telefono del cliente");
						System.out.println("0.-Salir");
						
						modificacion = pedirEntero("Introduce una opción del menú: ");
						
						if (modificacion != 0) {
							System.out.println("¿Cuál es su número de teléfono del cliente?");
							telefonoAntiguo = pedirEntero("Introduce una opción del menú: ");
							switch (modificacion) {
								case 1 -> modificarNombre(telefonoAntiguo, clientes);
								case 2 -> modificarNumero(telefonoAntiguo, clientes);
							}
						}
						
					} while (modificacion != 0);
				}
                case 3 -> {
					System.out.println("¿Cuál es su número de teléfono del cliente?");
					telefonoAntiguo = pedirEntero("Introduce una opción del menú: ");
					bajaCliente(telefonoAntiguo, clientes);
				}
                case 4 -> listarClientes(clientes);
            }

        } while (opcion != 0);

        try {
			try (FileOutputStream escritura = new FileOutputStream("datos.dat"); ObjectOutputStream escribir = new ObjectOutputStream(escritura)) {
				
				for (Cliente cliente : clientes) {
					escribir.writeObject(cliente);
				}
			}
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}