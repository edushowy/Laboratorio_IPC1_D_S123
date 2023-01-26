// IPC1 D Eduardo Garcia
public class _1_VariablesNumericas{
	// este metodo es el punto de partida del codigo
	public static void main(String args[]){
		
		/* Enteros
		   creamos dos variables con valores */
		int n1 = 25;
		int n2 = 12;
		/* creamos una variable para guardar el resultado de las 
		operaciones y le asignamos un valor inicial cero */
		int resultado =0;
		
		/* vamos a sumar,restar, multiplicar y dividir los mumeros 
		anteriores y mostrar los resultados */
		
		//guardamos en resultado el total de la suma luego lo imprimimos
		resultado = n1+n2;
		/*
			System.out.println() imprime en la consola el valor que este dentro de los parentesis
			puede ser una cadena, un entero, un double entre muchos otros
		*/
		
		System.out.println("resultado = n1+n2");
		System.out.println(resultado);
		//guardamos en resultado el total de la resta luego lo imprimimos
		resultado = n1-n2;
		System.out.println("resultado = n1-n2");
		System.out.println(resultado);
		//guardamos en resultado el total de la multiplicacion luego lo imprimimos
		resultado = n1*n2;
		System.out.println("resultado = n1*n2");
		System.out.println(resultado);
		/* 	guardamos en resultado el total de la division luego lo imprimimos
			se dio cuenta que la division da como resultado 2, eso es debido
			a que unicamente se guarda la parte entera del resultado */
		resultado = n1/n2;
		System.out.println("resultado = n1/n2");
		System.out.println(resultado);
		
		
		/* Decimales
		   creamos dos variables con valores */
		double n3 = 65.75;
		double n4 = 9.478;
		/* creamos una variable para guardar el resultado de las 
		operaciones y le asignamos un valor inicial cero */
		double resultado2 =0;
		
		/* vamos a sumar,restar, multiplicar y dividir los mumeros 
		anteriores y mostrar los resultados */
		
		//guardamos en resultado el total de la suma luego lo imprimimos
		resultado2 = n3+n4;
		System.out.println("resultado = n3+n4");
		System.out.println(resultado2);
		//guardamos en resultado el total de la resta luego lo imprimimos
		resultado2 = n3-n4;
		System.out.println("resultado = n3-n4");
		System.out.println(resultado2);
		//guardamos en resultado el total de la multiplicacion luego lo imprimimos
		resultado2 = n3*n4;
		System.out.println("resultado = n3*n4");
		System.out.println(resultado2);
		/* 	al usar tipo double si se muestra la parte con decimales 
			intente usar resultado2 = n1/n2 y compare los resultados con resultado = n1/n2
		*/
		resultado2 = n3/n4;
		System.out.println("resultado = n3/n4");
		System.out.println(resultado2);
		
		/*
			hay mas tipos numericos como lo son
			float
			long

			las formas de utilizarlas son las mismas solo debemos recordar que para guardar un 
			resultado debemos utilizar el mismo tipo de variable o uno que tenga una mayor capacidad
			como sucede en el caso resultado2 = n1 / n2, guardamos en un float el resultado de la 
			division de dos enteros
		*/
		
	}
}