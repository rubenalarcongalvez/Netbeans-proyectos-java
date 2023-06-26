package ikea;

import compra.Carrito;
import java.io.Serializable;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Usuario implements Serializable {

	private final String nombreUsuario;
	private final String email;
	private final String contrasena;
	private boolean esAdmin;
	private Carrito carrito;

	public Usuario(String nombreUsuario, String email, String contrasena) {
		this.nombreUsuario = nombreUsuario;
		this.email = email;
		this.contrasena = contrasena;
		this.carrito = new Carrito();
	}

	public Usuario(Usuario usuario) {
		this.nombreUsuario = usuario.nombreUsuario;
		this.email = usuario.email;
		this.contrasena = usuario.contrasena;
		this.esAdmin = true;
		this.carrito = new Carrito();
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public String getEmail() {
		return email;
	}

	public String getContrasena() {
		return contrasena;
	}

	public boolean isEsAdmin() {
		return esAdmin;
	}

	public Carrito getCarrito() {
		return carrito;
	}

}
