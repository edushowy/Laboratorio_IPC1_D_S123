// IPC1 D Eduardo Garcia
public class _6_Arreglos{
	/*
		los arreglos son estructuras en las cuales podemos guardar varios valores del mismo tipo,
		esto incluye objetos
	*/
	public static void main(String[] args){
		//Declarando dos vectores uno tipo double y otro tipo string
		
		/* declaramos un arreglo con 6 espacios de tipo double, al crearlo de esta forma todas las posiciones 
		tienen un valor inicial de 0.1 
		*/
		double numeros[] = new double[6];
		
		/* 	hay otra forma para crear un arreglo y llenarlo de una vez, esta consiste en poner despues
			del signo igual llaves y colocar dentro de estas los valores separados por comas segun corresponda,
			en este caso serian doubles pero el tamaño del arreglo depende de la cantidad de valores que enviemos 
			al momento de crearlo. No es recomendable usar esta forma si el arreglo es muy grande
			
		
			double numeros[] = {0.12,5.26,9.6,4.5,8,10.1};
		
		
			algo muy importante es recordar que nuestro arreglo tiene 6 posiciones pero la forma de acceder 
			a esas posiciones es mediante un indice, que es un numero entero el cual debe estar en un rango
			de 0 hasta el tamaño del arreglo menos uno
			
			en nuestro caso el arreglo tiene seis posiciones y sus indices van de 0 a 5, se debe tener el
			cuidado de no salir de este rango para no tener erros en la ejecucion del programa
		*/
		
		// llenando el arreglo un posicion a la vez
		numeros[0]=10.1;
		numeros[1]=20.2;
		numeros[2]=30.3;
		numeros[3]=40.4;
		numeros[4]=50.6;
		numeros[5]=60.6;
		
		// imprimiendo una posicion especifca del arreglo en consola
		System.out.println("valor almacenado en el indice 3 del arreglo equivalente a la posicion numero 4");
		/*
			posicion es el espacio en cual quedaria nuestro valor si contamos desde uno, como se hace normalmente
			
			indice es el numero que le corresponde a nuestro valor dentro del arreglo recordemos que estos inician en cero
			
			asi que cuando hablamos de indice es la posicion menos uno
		*/
		System.out.println(numeros[3]);
		
		/* 	cambiar un valor dentro del arreglo es muy sencillo solo debemos indicar el nombre del arreglo y el indice del
			valor que queremos cambiar y asignarle el nuevo valor	*/
		
		numeros[3]=300;
		
		System.out.println("Se cambiado el valor guardado en el indice 3 por el nuevo valor");
		System.out.println(numeros[3]);
		
		/*
			como se daran cuenta al ejecutar este programa 1ro se imprime el valor en el indice 3 que es 40.4 
			luego se cambia el valor del indice 3 por 300
			por ultimo se muestra el nuevo valor guardado en el indice 3
		*/
	}
	
	
}