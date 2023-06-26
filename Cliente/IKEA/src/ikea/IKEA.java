package ikea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import piezas.Almacen;
import piezas.Almacenaje;
import piezas.Armario;
import piezas.ArmarioLavabo;
import piezas.Complemento;
import piezas.Espejo;
import piezas.Estanteria;
import piezas.Grifo;
import piezas.Lavabo;
import piezas.Patas;
import piezas.Pieza;
import util.Entrada;

/**
 * @author n3buresp1997 <n3buresp@gmail.com>
 */
public class IKEA {

	public static Scanner sc = new Scanner(System.in);

	public static Usuario crearUsuario() {
		String nombreUsuario = "";
		String email = "";
		String contrasena = "";

		//Pedimos el nick
		while (nombreUsuario.length() < 5 || nombreUsuario.length() > 25) {
			nombreUsuario = Entrada.pedirPalabraLimpiandoBuffer("Nombre de usuario: ");

			if (nombreUsuario.length() < 5) {
				System.out.println("El nombre de usuario no puede contener menos de 5 caracteres...");
			} else if (nombreUsuario.length() > 25) {
				System.out.println("El nombre de usuario no puede contener más de 25 caracteres...");
			}
		}

		//Pedimos el email
		while (!(email.contains("@")) || (email.length() < 4)) {
			email = Entrada.pedirPalabraLimpiandoBuffer("Email: ");
		}

		//Pedimos la contraseña
		while (contrasena.length() > 35 || contrasena.length() < 5) {
			contrasena = Entrada.pedirPalabraLimpiandoBuffer("Contraseña: ");

			if (contrasena.length() < 5) {
				System.out.println("La contrasena no puede contener menos de 5 caracteres...");
			} else if (nombreUsuario.length() > 35) {
				System.out.println("La contrasena no puede contener más de 35 caracteres...");
			}
		}

		return new Usuario(nombreUsuario, email, contrasena);
	}

	public static Usuario crearAdmin() {
		Usuario user = crearUsuario();
		return new Usuario(user);
	}

	public static void anadirProducto(Almacen almacen) { //Se puede poner por tipo de pieza pero no me daba tiempo a añadir tantas funciones extra
		String codigo = Entrada.pedirPalabraLimpiandoBuffer("\nCódigo: ");
		String nombre = Entrada.pedirCadena("Nombre: ");
		String descripcion = Entrada.pedirCadena("Descripción: ");
		String dimensiones = "" + Entrada.pedirDoublePositivo("Ancho: ");
		dimensiones += " x " + Entrada.pedirDoublePositivo("Alto: ");
		dimensiones += " x " + Entrada.pedirDoublePositivo("Profundo: ");
		dimensiones += " cm";
		double precio = Entrada.pedirDoublePositivo("Precio: ");
		int stock = Entrada.pedirEnteroPositivo("Stock: ");

		if (almacen.anadirPieza(new Pieza(codigo, nombre, descripcion, dimensiones, precio, stock))) {
			System.out.println("\n--- Producto añadido con éxito ---");
		} else {
			System.out.println("\n--- El producto ya existe. No se añadió ---");
		}
	}

	public static void eliminarProducto(Almacen almacen) {
		String codigo = Entrada.pedirPalabraLimpiandoBuffer("Código del producto a eliminar: ");

		if (almacen.eliminarPieza(new Pieza(codigo))) {
			System.out.println("\n--- Producto eliminado con éxito ---");
		} else {
			System.out.println("\n--- Producto no encontrado ---");
		}
	}

	public static void modificarProducto(Almacen almacen) {
		String codigo = Entrada.pedirPalabraLimpiandoBuffer("Código del producto al que modificar el stock: ");
		System.out.println("Su stock es de " + almacen.buscarStockProducto(new Pieza(codigo)));

		int cantidad = Entrada.pedirEnteroPositivo("Introduzca su nuevo stock: ");

		if (almacen.modificarPieza(new Pieza(codigo), cantidad)) {
			System.out.println("\n--- Producto actualizado con éxito ---");
		} else {
			System.out.println("\n--- Producto no encontrado ---");
		}

	}

	public static void buscarPorNombre(Almacen almacen) {
		String nombre = Entrada.pedirCadena("Nombre (o parte del nombre) del producto (o productos): ");

		if (!almacen.buscarProductoPorNombre(nombre)) {
			System.out.println("\n--- Producto no encontrado ---");
		}
	}

	public static String buscarPorCodigo(Almacen almacen) {
		String codigo = Entrada.pedirPalabraLimpiandoBuffer("Código del producto: ");

		if (!almacen.buscarProductoPorCodigo(codigo)) {
			System.out.println("\n--- Producto no encontrado ---");
			codigo = "";
		}

		return codigo;
	}

	public static void buscarPorRangoPrecios(Almacen almacen) {
		double minimo = Entrada.pedirDoublePositivo("Mínimo precio: ");
		double maximo = Entrada.pedirDoublePositivo("Máximo precio: ");

		if (!almacen.buscarProductoPorRangoPrecio(minimo, maximo)) {
			System.out.println("\n--- No hay ninguna coincidencia ---");
		}
	}

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {
		//Variables LOGIN
		ArrayList<Usuario> usuarios = new ArrayList<>();
		Usuario usuario;
		boolean esAdmin = false;
		boolean logueado = false;
		int eleccion = -1;
		String nombreOEmail = "";
		String contrasena = "";
		int registro = -1;
		String tokenAdmin = "";

		//Usuario predeterminado
		usuarios.add(new Usuario("default", "default@outlook.es", "DefTest"));

		//Usuario admin predeterminado
		usuario = new Usuario("EntornoCliente", "entornocliente@gmail.com", "Testytest");
		usuarios.add(new Usuario(usuario));

		//Variables programa
		Almacen almacen = new Almacen();
		String codigo;
		int cantidad;

		//ALMACEN PREDETERMINADO
		almacen.anadirPieza(new Lavabo("Cerámica vidriada", "Blanco", true, true, "401.808.05", "ODENSVIK lavabo sencillo", "Un lavabo sencillo pero con complementos muy a la última", "80 x 48 x 6", 79, 10));
		almacen.anadirPieza(new Lavabo("Cerámica vidriada", "Blanco", true, true, "401.808.05", "ODENSVIK lavabo sencillo", "Un lavabo sencillo pero con complementos muy a la última", "80 x 48 x 6", 79, 10)); //No lo hará porque se repite (solo lo hice para demostrarte esa funcionalidad)

		almacen.anadirPieza(new Lavabo("Porcelana", "Blanco", false, false, "702.261.52", "EDEBOVIKEN lavabo doble", "Un lavabo muy sofisticado", "100 x 49 x 6", 169, 5));

		almacen.anadirPieza(new Grifo("Latón cromado", false, "702.177.51", "OLSKÄR grifo", "Grifo low cost", "Mediano, 20", 19, 25));
		almacen.anadirPieza(new Grifo("Latón cromado", true, "702.350.34", "LANGSKÄR grifo", "El mejor grifo que vas a tener", "Pequeño y sofisticado, 8", 122, 3));

		almacen.anadirPieza(new ArmarioLavabo("Roble", "Blanco", "802.261.99", "GODMORGON armario lavabo", "Un armario como los de antes", "80 x 47 x 58", 160, 4));

		almacen.anadirPieza(new Almacenaje("Compartimentos", "401.649.47", "GODMORGON bandeja compartimentos", "Es la hostia", "34 x 17 x 3", 9.99, 10));
		almacen.anadirPieza(new Almacenaje("Tapas", "701.774.77", "GODMORGON cajas con tapas", "Es la rehostia", "34 x 17 x 3", 9.99, 10));
		almacen.anadirPieza(new Almacenaje("Separadores", "104.774.75", "GODMORGON almacenaje con separadores", "Es la megahostia", "34 x 17 x 3", 5.99, 30));

		almacen.anadirPieza(new Patas("Acero inoxidable", "101.777.67", "GODMORGON patas", "Patas para los patos", "22 x 25", 10, 40));

		almacen.anadirPieza(new Armario("Roble", "Blanco", false, 0, "302.26.187", "GODMORGON armario pared", "Tiene dos puertas muy bonitas", "60 x 14 x 96", 69, 1));

		almacen.anadirPieza(new Estanteria("Abedul", "Marrón", "202.414.09", "MOLGER estantería", "Muy alta, casi tanto como yo", "38 x 38 x 140", 34.99, 3));

		almacen.anadirPieza(new Espejo("Abedul", "802.304.98", "MOLGER espejo", "Con este espejo verás un reflejo de tu gran futuro", "80 x 60", 39.99, 2));

		almacen.anadirPieza(new Complemento("Cristal", "001.485.82", "GRUNDTAL balda de cristal", "Ahí pondrás los libros que nunca tuviste tiempo de leer", "100", 16.99, 8));

		//Hacemos que lea la información previa
		try ( ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("ikea.dat"))) {
			usuarios = (ArrayList<Usuario>) entrada.readObject();
			almacen = (Almacen) entrada.readObject();
		} catch (IOException | ClassNotFoundException ex) {

		}

		System.out.println("Elegir opciones siempre con números");

		//LOGIN
		while (eleccion != 3) {

			System.out.println("\n1- Login"
					+ "\n2- Registrarse"
					+ "\n3- Salir");

			eleccion = Entrada.pedirEntero("Elección: ");

			switch (eleccion) {
				case 1 -> {
					System.out.println("\n=== LOGIN ===");
					nombreOEmail = Entrada.pedirPalabraLimpiandoBuffer("Nombre de usuario o email: ");
					contrasena = Entrada.pedirPalabraLimpiandoBuffer("Contraseña: ");

					for (int i = 0; i < usuarios.size(); i++) {
						if ((usuarios.get(i).getNombreUsuario().equalsIgnoreCase(nombreOEmail) && (usuarios.get(i).getContrasena().equals(contrasena)))
								|| ((usuarios.get(i).getEmail().equalsIgnoreCase(nombreOEmail)) && (usuarios.get(i).getContrasena().equals(contrasena)))) {
							usuario = usuarios.get(i);
							esAdmin = usuarios.get(i).isEsAdmin(); //Para saber si lo es o no
							logueado = true;
							eleccion = 3;
							System.out.println("\n--- Has iniciado sesión ---");
						}
					}

					//Si se loguea, pasa al siguiente nivel, si no, se repite el bucle
					if (!logueado) {
						System.out.println("\n--- Login inválido ---");
						eleccion = -1;
					}

				}
				case 2 -> {
					System.out.println("\n=== REGISTRO ===");
					System.out.println("1- Crear usuario"
							+ "\n2- Crear administrador"
							+ "\nCualquier otro número- Atrás");

					registro = Entrada.pedirEntero("Elección: ");

					if (registro == 1) {
						usuario = crearUsuario();
						if (usuarios.contains(usuario)) {
							System.out.println("El usuario ya está registrado.");
						} else {
							usuarios.add(usuario);
							System.out.println("Usuario registrado con éxito.");
						}
					} else if (registro == 2) {
						usuario = crearAdmin();
						tokenAdmin = Entrada.pedirPalabraLimpiandoBuffer("Token Admin: ");
						if (usuarios.contains(usuario)) {
							System.out.println("El usuario ya está registrado.");
						} else if (!usuarios.contains(usuario) && tokenAdmin.equals("3kjsd9ls902NM.d902")) {
							usuarios.add(usuario);
							System.out.println("Usuario administrador registrado con éxito.");
						} else {
							System.out.println("Token de administrador no válido. Cuenta no creada.");
						}
					}

					eleccion = -1;
				}
				case 3 -> {
					//Creamos un flujo de salida binario y escribimos en él para guardar todos los datos en un fichero
					try ( ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("ikea.dat"))) {
						salida.writeObject(usuarios);
						salida.writeObject(almacen);
					} catch (IOException ex) {
						System.out.println(ex);
					}

					System.out.println("\n--- Hasta luego ---");
				}
				default -> {
					System.out.println("\nPor favor, elija un número del 1 al 3...");
					eleccion = -1;
				}
			}

			//PROGRAMA
			while (logueado && eleccion != 7) {
				System.out.println("\n1- Mostrar todos los productos"
						+ "\n2- Mostrar todos los productos que estén disponibles"
						+ "\n3- Buscar producto por código (y poder añadirlo al carrito)"
						+ "\n4- Buscar productos por nombre o parte de nombre (para saber sus códigos)"
						+ "\n5- Buscar productos por rango de precios"
						+ "\n6- Ver carrito, modificar cantidad y finalizar compra"
						+ "\n7- Cerrar sesión");

				if (esAdmin) {
					System.out.println("\n\n=== SOLO PARA ADMINISTRADORES ==="
							+ "\n100- Añadir producto"
							+ "\n200- Eliminar producto"
							+ "\n300- Modificar stock de un producto buscado por código");
				}

				eleccion = Entrada.pedirEntero("Elección: ");

				switch (eleccion) {
					case 1 -> {
						System.out.println(almacen);
						eleccion = -1;
					}
					case 2 -> {
						System.out.println(almacen.mostrarStock());
						eleccion = -1;
					}
					case 3 -> {
						codigo = buscarPorCodigo(almacen);
						if (!codigo.isBlank() && Entrada.pedirPalabraLimpiandoBuffer("¿Añadir producto al carrito? (s/n): ").toLowerCase().contains("s")) {
							cantidad = Entrada.pedirEnteroPositivo("Cantidad deseada: ");

							if (usuario.getCarrito().anadirElemento(almacen, codigo, cantidad)) {
								System.out.println("\n--- Productos añadidos con éxito ---");
							} else {
								System.out.println("\n--- No hay stock suficiente ---");
							}

						}

					}
					case 4 -> {
						buscarPorNombre(almacen);
					}
					case 5 -> {
						buscarPorRangoPrecios(almacen);
					}
					case 6 -> {
						if (usuario.getCarrito() == null || usuario.getCarrito().carritoVacio()) {
							System.out.println("\n--- No hay elementos en el carrito ---");
						} else {
							System.out.println("\n=== CARRITO ===");
							System.out.println(usuario.getCarrito());

							System.out.println("\n1- Finalizar compra"
									+ "\n2- Modificar carrito (cantidad de productos) buscando por codigo"
									+ "\n3- Limpiar carrito");

							eleccion = Entrada.pedirEntero("Elección: ");

							switch (eleccion) {
								case 1 -> {
									if (usuario.getCarrito().finalizarCompra(almacen)) {
										System.out.println(usuario.getEmail()); //Finaliza compra y dice a qué email mandará la confirmación

										Thread.sleep(4000); //Para que el usuario pueda leerlo bien
									}
								}
								case 2 -> {
									if (usuario.getCarrito() == null) {
										System.out.println("\n--- No hay elementos en el carrito ---");
									} else {
										System.out.println("\n=== CARRITO ===");
										System.out.println(usuario.getCarrito());

										codigo = buscarPorCodigo(almacen);

										if (!codigo.isBlank()) {
											cantidad = Entrada.pedirEnteroPositivo("Cantidad deseada: ");

											if (usuario.getCarrito().modificarElemento(almacen, codigo, cantidad)) {
												System.out.println("\n--- Stock de producto modificado con exito ---");
											} else {
												System.out.println("\n--- No hay suficiente stock ---");
											}
										}

									}
								}
								case 3 -> {
									usuario.getCarrito().limpiarCarrito();
									System.out.println("\n--- Ya no quedan más productos en el carrito ---");
								}
							}

							eleccion = -1;
						}

					}
					case 7 -> {
						for (int i = 0; i < usuarios.size(); i++) {
							if (usuarios.get(i).getNombreUsuario().equalsIgnoreCase(usuario.getNombreUsuario())) {
								usuarios.set(i, usuario);
							}
						}

						logueado = false;
					}
					case 100 -> {
						if (esAdmin) {
							anadirProducto(almacen);
						} else {
							System.out.println("\n--- Usted no tiene los permisos suficientes ---");
							Thread.sleep(2000); //Para que al usuario le de tiempo a leer el mensaje
						}

						eleccion = -1;
					}
					case 200 -> {
						if (esAdmin) {
							eliminarProducto(almacen);
						} else {
							System.out.println("\n--- Usted no tiene los permisos suficientes ---");
							Thread.sleep(2000); //Para que al usuario le de tiempo a leer el mensaje
						}

						eleccion = -1;
					}
					case 300 -> {
						if (esAdmin) {
							modificarProducto(almacen);
						} else {
							System.out.println("\n--- Usted no tiene los permisos suficientes ---");
							Thread.sleep(2000); //Para que al usuario le de tiempo a leer el mensaje
						}

						eleccion = -1;
					}
					default -> {
						System.out.println("\nPor favor, elija un número del 1 al 7...");
						eleccion = -1;
					}
				}
			}

		}

	}
}
