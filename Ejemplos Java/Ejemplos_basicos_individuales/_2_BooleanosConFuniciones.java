// IPC1 D Eduardo Garcia
public class _2_BooleanosConFuniciones{
	/* 
			los valores boleanos se utilizan con operadores logicos
			como lo son && , || y !
			tambien como condiciones en sentencias de control como
			if(acaSeEsperaUnValorBooleano)...
			while(acaSeEsperaUnValorBooleano){};
			do{...}while(acaSeEsperaUnValorBooleano);
	*/
	
	public static void main(String[] args){
	// declaramos tres variables boolenas y les damos un valor (true o false)
	boolean b1=true;
	boolean b2=false;
	
	// declaramosos otra variable boolena para guardar el resultado de los operadores logicos y le damos un valor inicial
	boolean resultado=false;
	
	// haremos una comparaciones logica y el resultado de las mismas lo guardaremos en resultado
	
	/* aplicamos el operador logico && (Y) en este caso si las dos variables son true la respuesta sera true en
	cualquier otro caso sera false b1 es true y b2 es false, el resultado sera false*/
	resultado = b1 && b2;
	System.out.println("resultado = b1 && b2");
	// imprimimos el resultado de opercion logica
	System.out.println(resultado);
	
	/* aplicamos el operador logico || (O) en este caso si una de las dos variables es true la respuesta sera true,
	unicamente si ambas variables son false el resultado sera false,
	b1 es true y b2 es false el resultado sera true*/
	resultado = b1 || b2;
	System.out.println("resultado = b1 || b2");
	// imprimimos el resultado de opercion logica
	System.out.println(resultado);
	
	/*  aplicamos el operador logico ! (Negacion) este se aplica aun valor	booleano y lo que hace
		es negarlo, es decir invierte el valor si es true lo convierte en false y viceversa
	*/
	
	// b1 orignalmente es true al negarlo el resultado sera false
	resultado = !b1;
	System.out.println("resultado = !b1");
	// imprimimos el resultado de opercion logica
	System.out.println(resultado);
	
	/*  realicemos el 1er ejemplo aplicando negacion para obtener un resultado true con && (Y)
		b2 es false, la vamos a negar para que sea true, por lo tanto ahora tenemos un true && true
		por lo que el resultado sera true
 	*/
	resultado = b1 && !b2;
	System.out.println("resultado = b1 && !b2");
	// imprimimos el resultado de opercion logica
	System.out.println(resultado);
	
	
	/*
		pero debemos comprender que no simpre se veran como un true o false literalmente
		por ejemplo:

		if(true)...
		podemos crear un metodo que retorne un valor bolean y usar ese como la condicion
		de la siguiente forma:
							
		if(regresamosUnBooleano())...
		
		la funcion regresaUnBooleano() estaria definida como:
		
		public boolean regresaUnBooleano(){				
			return true;
		}
		
		return asigna como valor de respuesta el valor que esta despues de el,
		en este caso indica que la funcion regresaUnBooleano() sera igual al true,
		con esto me refiero que cuando llamamos a la funcion en el if este realmente
		recibe un true
		
	*/
	
	/* 	para usar una funcion solo escribimos nombre de la funcion y enviamos parametros si
		es que los necesitara, en este caso nuestra funcion no necesita parametros.
		
		vamos aguardar en resultado el valor que devuelve la funcion regresamosUnBooleano()
	*/
	resultado = regresamosUnBooleano();
	System.out.println("resultado = regresamosUnBooleano()");
	System.out.println(resultado);
	// el resultado fue false porque nosotros regresamos un false en la funcion
	
	/* realicemos el ejemplo de && con la funcion
		b1 es true y regresamosUnBooleano() es false el resultado seria false
		ahora cambie el valor de retur en la funcion por un true y vea el resultado
	*/	
	resultado= b1 && regresamosUnBooleano();
	System.out.println("resultado= b1 && regresamosUnBooleano()");
	System.out.println(resultado);
	
	/* realicemos el ejemplo de && con la funcion pero negando el resultado de la funcion
		b1 es true y regresamosUnBooleano() es false peroa la negarlo se convierte en true,
		el resultado seria true
	*/
	resultado= b1 && !regresamosUnBooleano();
	System.out.println("resultado= b1 && !regresamosUnBooleano()");
	System.out.println(resultado);
	
	}
	
	
	
	/*
		creamos una funcion que retorne un valor booleano
	*/
	
	/* 	usamos static porque main es estatico y por eso necesita que todo lo que usemos dentro
		de el tambien sea static */
	public static boolean regresamosUnBooleano(){
		return false;
	}
}
	





			