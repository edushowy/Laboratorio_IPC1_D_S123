// IPC1 D Eduardo Garcia
public class _5_FuncionesMetodos{
	/* 
		las funciones retornar un valor con la palabra reservada return
		
		los metodos no retornan valor son de tipo void
		
		en el siguiente ejemplo vamos a usar una funcion que retorne un valor booleano
		en base a una variable global, si este valor booleano es cierto llamaremos aun metodo 
		que imprima una cadena que definiremos como una constante
		
		las variables globales se declaran dentro de la clase pero afuera de todos los metodos o funciones
		
		una variable que se declara dentro de un metodo o funcion es local, es decir unicamente esta
		disponible dentro del mismo.
		
		una constante es un valor que no puede ser modificada por otras instrucciones dentro del codigo
	*/
	
	// constantes globales para mostrar como mensajes
	static final String bienvenido="Bienvenido";
	static final String despedida="hasta pronto";
	
	public static void main(String[] args){
		// variable local que enviamos 
		String palabra="hola";
		
		//usaremos un if para decir en basea a palabra a cual metodo llamar
		if(bienvenidaOdespedida(palabra))
			/*
				recuerde que bienvenidaOdespedida(palabra) sera visto como un true o false por el if
				como aprendimos en BooleanosConFunciones y tambien que esta funcion necesista un parametro
				tipo String para funcionar por eso enviamos la cadena palabra
			*/
			mostrarBienvenido();
		else
			mostrarDespedida();
		
	}
	
	// esta funcion recibe un parametro de tipo String que vamos a utilizar para comparar con un if
	public static boolean bienvenidaOdespedida(String palabra){
		
		// el if compara la cadena llamada palabra con "hola" si es igual el metodo retorna true de lo contrario retorna false
		if(palabra=="hola")
			return true;

		return false;
		
		/*	Atención como hemos definido la funcion como boolean esta deber retornar un valor ya sea true o false si o si
			por lo que debemos asegurarnos que esto suceda			
			
			por ejemplo si no tuvieramos la parte return false, al momento de compilar nuestro codigo usando la consola con 
			javac nos mostraria un error o en netbeans nos marcaria el error en la linea
			
			debido a que solo retornariamos true si el if se cumple, pero de no cumplirse no retornariamos nada,
			por esto se generaria el error por lo cual al agregar return false nos estamos asegurando de devolver
			algo si no se aplica el return true del if
			
			cabe señalar que al ejecutarse el return termina lo ejecucion del metodo o funcion, es decir cuando
			se ejecuta return true ahi termina la funcion no llega a la linea return false y cuando no se
			cumple la condicion del if si llegamos hasta la linea del return false y termina la ejecucion de la
			funcion
		*/
	}
	
	//Este metodo unicamente imprime en pantalla la constante bienvenido="Bienvenido";
	public static void mostrarBienvenido(){		
		System.out.println(bienvenido);
	}
	
	//Este metodo unicamente imprime en pantalla la constante despedida="hasta pronto";
	public static void mostrarDespedida(){		
		System.out.println(despedida);
	}
	
	/*
	ahora cambie palabra por adios y luego por asdf 
	String palabra="adios";
	String palabra="asdf";
	
	compile y ejecute el programa y compare los resultados
	*/
}