package FundamentosIniciales;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class OperadoresUnarios {
	public static void main(String args[]){
		int a = 3;
		
		//Cambiar el signo de un valor a negativo (o positivo si ya era negativo)
		var b = -a; //Es preferible ponerlo entre parentesis por si hay alguna operacion mas (-a)
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		//Invertir el valor de una variable (boolean)
		var c = true;
		var d = !c; //Invierte el valor de true para que sea false
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		//Incremento
			//Pre-incremento +1 (simbolo antes de la variable)
			var e = 3; //Valdria 4 porque en la variable (f) le hemos sumado +1
			var f = ++e; //Primero se incrementa en +1 la variable (e), por lo que (e) sería 4 ahora, y despues se usa su valor en (f)
			//cada vez que se ejecute la variable (f), la variable (e), también aumenta su valor en +1
			System.out.println("e = " + e);
			System.out.println("f = " + f);
			
			//Post-incremento +1 (simbolo despues de la variable)
			var g = 5; //Valdria 6 porque en la variable (h) le hemos sumado +1
			var h = g++; //Se utiliza el valor de la variable (g), por lo que (h)
						//pasaría a valer 5, y luego se suma +1, y se le asigna la variable (g = 6)
			System.out.println("g = " + g);
			System.out.println("h = " + h);
		
		//Decremento
			//Pre-decremento -1 (simbolo antes de la variable)
			var i = 3; //Valdria 2 porque en la variable (j) le hemos restado -1
			var j = --i; //Primero se decrementa en -1 la variable (i), por lo que (i) sería 2 ahora, y despues se usa su valor en (j)
			//cada vez que se ejecute la variable (j), la variable (i), también disminuye su valor en -1
			System.out.println("i = " + i);
			System.out.println("j = " + j);
			
			//Post-decremento -1 (simbolo despues de la variable)
			var k = 5; //Valdria 4 porque en la variable (l) le hemos restado -1
			var l = k--; //Se utiliza el valor de la variable (k), por lo que (l)
						//pasaría a valer 5, y luego se resta -1, y se le asigna la variable (k = 6)
			System.out.println("k = " + k);
			System.out.println("l = " + l);
	}
}
