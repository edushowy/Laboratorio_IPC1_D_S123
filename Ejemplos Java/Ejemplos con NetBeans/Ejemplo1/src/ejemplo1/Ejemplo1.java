package ejemplo1;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class Ejemplo1 {
    
    // matriz 3x3
    static String[][] totito = new String[3][3];    
    
    public static void main(String[] args) {
                        
        // mostrando el tablero vacio        
        mostrarTablero();
        
        // ingresando coordenadas de prueba
        //totito[0][1]="x";
        //totito[1][1]="y";
        //totito[2][1]="x";
        // mostrando el tablero con una columna de x
        //mostrarTablero();
        
        while(true){
            juego();
        }        
    }
  
    public static void guardarSimbolo(int x, int y, String simbolo){
        totito[x][y]=simbolo;
    }
    
    public static boolean verificarColumna(int columna){
        
        String cero = totito[0][columna];
        String uno  = totito[1][columna];
        String dos  = totito[2][columna];
        
        if(cero!=null && uno!=null && dos!=null)
            if(cero.equals(uno) && uno.equals(dos))
                return true;        
        
        return false;   
    }
    
    public static boolean verificarTodo(){
        for(int indice=0; indice <=2 ; indice++){
            if(verificarColumna(indice))
                return true;           
        }
        return false;
    }
    
    public static void mostrarTablero(){
        System.out.println("------ Tablero -------");
        for(int fila=0; fila<3;fila++){
            for(int columna=0; columna<3;columna++){
                System.out.print(totito[fila][columna]+"  ");
            }
            System.out.println(" ");
        }
        System.out.println("----------------------");
        System.out.println("");
    }
    
    public static void juego(){
        // ingreso de cordenas
        String x;
        String y;
        String simbolo;
        final String mensaje = "Felicidades a ganado!!";
        final String otraVez = "intenta de nuevo!!";
        Scanner entrada = new Scanner(System.in); // crear un objeto Scanner

        System.out.println("ingresa el numero de la fila: ");
        x = entrada.nextLine();
        System.out.println("ingresa el numero de columna: ");
        y = entrada.nextLine();
        
        System.out.println("ingrese un simbolo [o/x] : ");
        simbolo = entrada.nextLine();
        
        System.out.println("fila= "+x+" columna= "+y+" simbolo= "+simbolo);
        System.out.println("");
        
        // Casting String a int
        int coordenadaX=parseInt(x);
        int coordenadaY=parseInt(y);
        //int resultado = coordenadaX+coordenadaY;
        
        guardarSimbolo(coordenadaX, coordenadaY, simbolo);
        //System.out.println("-- " + totito[coordenadaX][coordenadaY]);
        
        // mostrando el tablero despues de guardarSimbolo
        mostrarTablero();
        
        
        if(verificarTodo()){
            System.out.println(mensaje);
            System.exit(0);
        }            
        else
            System.out.println(otraVez);
    }
    
}
