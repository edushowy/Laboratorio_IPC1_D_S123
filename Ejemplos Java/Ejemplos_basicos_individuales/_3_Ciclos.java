// IPC1 D Eduardo Garcia
public class _3_Ciclos{
	/* los ciclos ejecutan las intrucciones que se encuentran dentro de ellos
	mientras la condicion sea cierta */
	
	public static void main(String[] args){
		/*
		for repita las instucciones la cantidad de veces que le indiquemos
		
		for(variableConValorDeInicioEntera; condicion; crecimientoDeLaVariableEntera){
			// instucciones			
		}
		*/
		
		System.out.println("for");
		// hagamos un for que imprima 3 veces hola y en la misma linea escribe el valor actual de "variable"
		for(int variable=0; variable<3;variable++){ 
		//variable++ es lo mismo que variable=variable+1
			
			// al poner el signo "+" despues de la cadena "Hola" se agrega el valor de "variable"
			System.out.println("Hola"+variable);
		}
		/* cambie el valor de inicio, la condicion y utilice el incremento de la variableEntera
		por variable=variable+2 y comparelo con el resultado anterior */
		
		
		/*
		while repita las instucciones mientras la condicion sea verdadera
		
		while(condicionBooleana){
			// instucciones			
		}
		*/
		
		// vamos a realizar los mismo que en ejemplo for pero con un while
		
		// esta variable nos servira para la condicion del while
		int contador=0;
		
		System.out.println("while");
		while(contador<3){
			System.out.println("Hola"+contador);
			
			/* 	aca cambiamos el valor de contador para que cuando se vuelva a revisar la condicion del while 
				ya tenga un nuevo valor.
				
				si no cambiamo el valor de contador el ciclo entraria en un estado infinito y no terminaria jamas
			*/
			contador++;
		}
		
		/*
		do while ejecuta una vez las instuccionesy luego repite las instucciones mientras la condicion sea verdadera
		
		do{
			//instrucciones
		} while(condicionBooleana)
		*/
	
		/*	reiniciamos a 0 el contador, si no lo hicieramos el contador tendria el ultimo valor que se le asigno
			en el ciclo while anterior, donde ibamos cambiando el valor de contador */ 
		contador=0;
		// vamos a realizar los mismo que en ejemplo for pero con un do while
		System.out.println("do while");
		do{
			System.out.println("Hola"+contador);
			
			/* 	aca cambiamos el valor de contador para que cuando se vuelva a revisar la condicion del while 
				ya tenga un nuevo valor.
				
				si no cambiamo el valor de contador el ciclo entraria en un estado infinito y no terminaria jamas
			*/
			contador++;
		}while(contador<3);
		
		/* ahora comente o elimine la linea de codigo contador=0 que esta antes de System.out.println("do while");
		y vera que se imprimira Hola3 solamente, esto se imprime porque do while ejecutara una vez las instrucciones
		antes de empezar a revisar la condicionBooleana */
	}
}