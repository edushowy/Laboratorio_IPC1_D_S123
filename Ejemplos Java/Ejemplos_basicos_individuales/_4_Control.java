// IPC1 D Eduardo Garcia
public class _4_Control{
	/*
		las sentencias de control sirven para tomar decisiones dentro del codigo
		
		estas son if (if y sus variantes) y switch
		
		*** if simple si la condicion es verdadera ejecuta la instruccion (solo una instruccion)
		
		if(condicionBooleana)
			//instruccion
		
		
		*** if simple si la condicion es verdadera ejecuta las instrucciones dentro de las llaves (varias instrucciones)
		
		if(condicionBooleana){
			//instrucciones
		}
		
		
		*** if else simple si la condicion es verdadera ejecuta la instruccion (solo una instruccion) si no se cumple
		la condicion se ejecuta la instuccion que sigue despues de else (solo una instruccion)
		
		if(condicionBooleana)
			//instruccion
		else
			//instruccion
		
		
		*** if else simple si la condicion es verdadera ejecutan las instrucciones (varias instrucciones) si no se cumple
		la condicion se ejecutan las instucciones que sigue despues de else y estan entre llaves (varias instrucciones)
		
		if(condicionBooleana){
			//instrucciones
		}
		else{
			//instrucciones
		}
		
	*/
	
	public static void main(String []args){
		
		// variable que usaremos en la condicion
		int a=5;
		int b=9;		
		
		System.out.println("if simple");
		// if simple una sola instruccion
		
		// a es 5 y b es 9, por lo cual a es menor que b entonces la condicion es true y se ejecutara la linea de codigo
		if(a<b)
			System.out.println("a menor que b");
		
		
		
		System.out.println("if simple con else");
		// if simple una sola instruccion y else con una sola instruccion
		
		//  a es 5 y b es 9, por lo cual a no es mayor que b entonces la condicion es false y se ejecutara la linea de codigo de else
		if(a>b)
			System.out.println("a menor que b");
		else
			System.out.println("b mayor que b");
		
		
		/* 
			switch compara la condicion (aca puede ser de varios tipos int, string, char) esta condicion se compara
			con los case que son opciones que nosotros ponemos, si no se cumple con niguna de las opciones, pasa al
			default que es una opcion que se ejecuta si no cumple con ninguna de las anteriores, el default es opcional
			
			usaremos la instruccion break esta sirve para indicar el final de las instrucciones de una opcion case, si
			no ponemos break se seguiran ejecutando todas las instruccion que esten debajo del case al que entro aunque
			estas sean de otra opcion case
		*/
		
		System.out.println("switch");
		
		// Variable cadena para comparar con las opciones de los case
		String texto = "hola";
		
		switch(texto){
			case "hola":
				System.out.println("la cadena es hola");
				// aca pueden poner mas instrucciones, no es necesario usar llaves cuando son varias instrucciones
				break;
			case "adios":
				System.out.println("la cadena es adios");
				// aca pueden poner mas instrucciones, no es necesario usar llaves cuando son varias instrucciones
				break;
			/*	si no queremos hacer algo si no se cumple con ninguna de las opciones de case no ponemos el default
				ni sus instruccion incluyendo el break */
			default:
				System.out.println("la cadena no es hola ni adios");
				// aca pueden poner mas instrucciones, no es necesario usar llaves cuando son varias instrucciones
				break;			
		}
		
		/*	ahora cambie el valor de la cadena texto="adios"; y luego por  texto="asdf"; y compare los resultados
		*/
		
		
		// tambien existe otra variante de if que funciona como un switch
		
		System.out.println("if equivalente a switch");
		
		if(texto=="hola")
			System.out.println("la cadena es hola");
		else if(texto=="adios")
			System.out.println("la cadena es adios");
		else
			System.out.println("la cadena no es hola ni adios");
		
		/*	ahora cambie el valor de la cadena texto="adios"; y luego por  texto="asdf"; y compare los resultados
		*/
		
		
	}
}