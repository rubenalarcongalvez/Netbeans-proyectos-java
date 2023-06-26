=================================================
		    ATENCIÓN
=================================================
Abre el proyecto en Netbeans (impórtalo) y ejecuta el método main (ikea.java) o
ejecuta directamente el archivo .jar

Para ello, en cualquier terminal (cmd por ejemplo de Windows o la Shell de Linux),
ve a la ruta en la que está ubicado ikea.jar

Ej: cd C:\Users\n3bur\Mi unidad (rubenalarcongalvez@gmail.com)\Archivos de programación\Netbeans\Java\Cliente

Luego, estando allí, introduce el siguiente comando: java -jar "IKEA.jar"

*****OJO, en las terminales, puede que no se muestren los símbolos correctamente (por ejemplo el €)*****

Hice todo lo que me pediste en la tarea y bastantes funcionalidades más
aparte para que sea más completo, lógico y funcional.

=================================================
		Funcionalidades
=================================================
- Todo el progreso se guarda en un fichero .dat, y se cargará automáticamente
  al iniciar de nuevo el programa
- Try-catch completos y control de errores
- Clase util para distintas utilidades aparte
- Control de límites en caracteres de las cadenas (min y max)
- Login de usuario completo
  + Con diferentes roles usuario/admin
  + Opción de registrarse antes para tener el carrito
  + Sistema de token para acceder a crear una cuenta con rol de admin
  + Inicio de sesión mediante usuario o correo (a elegir)
  + Control de veracidad de correo básica (mínimo caracteres y @)
- Mostrar todos los productos (enuncia todos los existentes)
- Mostrar todos los productos disponibles (todos cuyo stock sea mayor a 0)
- Buscar por código (y añadirlo al carrito)
- Buscar por nombre o parte del nombre (para que sea más fácil encontrar el
  producto)
- Buscar productos por rango de precios (muy común en ikea o amazon)
- Añadir productos (solo admins)
- Modificar el stock de productos del carrito de forma fácil (solo admins)
- Eliminar productos (solo admins)
- Vista previa de carrito, modificar y finalizar compra con confirmaciones
  por correo electrónico
- Limpiar carrito
- Cerrar sesión y volver al área de login para allí poder salir
- Muchos tipos de piezas
- Varias características más aparte

=================================================
	    Logins predeterminados
=================================================
RECUERDA QUE LAS CONTRASEÑAS SON CASE SENSITIVE

(Aunque también te puedes registrar)

Usuario por defecto:
	Nombre de usuario: default
	Correo: default@outlook.es
	Contraseña: DefTest
Admin por defecto:
	Nombre de usuario: entornocliente
	Correo: entornocliente@gmail.com
	Contraseña: Testytest

=================================================
	    Información relevante
=================================================
Puedes echarle un vistazo a todo el código porque hay muchas cosas que están
en comentarios y algunas características añadidas que se pueden ver en
código.