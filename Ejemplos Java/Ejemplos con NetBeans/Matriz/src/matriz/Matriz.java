/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author edush
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    static String registro [][] = new String[5][3];
    static int indice = 0;
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        //for(int a=0; a<2;a++){
            //guardarDatos();
        //}
        
        //mostrarTodos();
        //System.out.println("se encontro a pedro: ");
        //System.out.println(buscarNombre("pedro"));
        //modificar("ana");
        //guardarDatos();
        //mostrarTodos();
        //int multiplicacion = devolverCarnet("luis") * 2;
        //System.out.println("resultado de multiplicar= "+multiplicacion);
        
        /*
        String cadena ="";
        Scanner xx = new Scanner(System.in);
        cadena=xx.nextLine();
        
        System.out.println("la cadena tiene "+ cadena.length()+" caracteres");
        if(cadena.length()<8 && cadena.length()>2 )
            System.out.println("cumple");
        else
            System.out.println("No cumple");
        */
        
        String opc="0";
        do{
            menu();
            
            System.out.println("Desea salir del programa");
            System.out.println("0 No");
            System.out.println("1 Si");                     
            Scanner ent = new Scanner(System.in);
            opc = ent.nextLine();            
            
        }while(opc.equals("0"));
        
    }
    
    public static void menu(){
        String opcion="Bienvenido a Registro y Estadistica";
        System.out.println("0 ingresar estudiante");
        System.out.println("1 modificar estudiante");
        System.out.println("2 mostrar todos los estudiantes");
        System.out.println("3 buscar carnet del estudiante");
        
        String opc = "";
        Scanner ent = new Scanner(System.in);
        opc = ent.nextLine();
        
        switch(opc){
            case "0": 
                ingresarVarios();
                break;
            case "1": 
                System.out.println("ingrese el nombre del estudiante");
                String nombre="";
                Scanner entrada = new Scanner(System.in);
                nombre=entrada.nextLine();
                modificar(nombre);
                break;
            case "2": 
                mostrarTodos();
                break;
            case "3": 
                System.out.println("ingrese el nombre del estudiante");
                String nombre2="";
                Scanner entrada2 = new Scanner(System.in);
                nombre2=entrada2.nextLine();
                System.out.println("El carnet es: "+devolverCarnet(nombre2));
                ;
                break;
            default:
                System.out.println("Opcion no valida");
                    
        }
    }
    
    public static void guardarDatos(){
        
        // para que no explote hay que revisar que indice sea menor que 5
        if(indice<5){
            String nombre = "";
            String carnet = "";
            String edad = "";

            Scanner entrada = new Scanner(System.in);
            System.out.println("ingrese el nombre");
            nombre = entrada.nextLine();
            System.out.println("ingrese el carnet");
            carnet = entrada.nextLine();
            System.out.println("ingrese el edad");
            edad = entrada.nextLine();

            registro[indice][0]=nombre;
            registro[indice][1]=carnet;
            registro[indice][2]=edad;

            //System.out.println("informacion almacenada y el indice");
            //System.out.println(registro[indice][0]+" "+registro[indice][1]+" "+registro[indice][2]+" "+indice);

            indice=indice+1;
        }else{
            System.out.println("No hay mas espacio para almacenar informacion");
        }
        
    }
    
    public static void mostrarTodos(){
        for(int fila=0; fila<5; fila++){
            System.out.print(fila+" ");
            for(int columna=0; columna<3; columna++){
                System.out.print(registro[fila][columna]+" ");
            }
            System.out.println("");
        }
    }
    
    public static boolean buscarNombre(String nombre){       
        
        for(int fila=0; fila<5; fila++){
            // para que no explote solo tenemos que revisar que no sea null antes de compararlo
            if((registro[fila][0]!=null))
                if(registro[fila][0].equals(nombre))
                    /*
                        cantidad total vendida esta en el la columna indice 2
                        
                        tomate Q5 0
                        int actual = parseInt(registro[fila][2]);
                        actual = actual+cantidad;
                        registro[fila][2]=actual+"";                        
                    */
                    return true;
        }
        return false;
    }
    
    public static void modificar(String nombre){
        for(int fila=0; fila<5; fila++){
            // para que no explote solo tenemos que revisar que no sea null antes de compararlo
            if((registro[fila][0]!=null))
                if(registro[fila][0].equals(nombre)){
                    System.out.println("valor actual del indice= "+indice);
                    //guarde el indice de la fila que tiene solo null
                    int indiceOriginal=indice;
                    System.out.println("indice que se va a modificar= "+fila);
                    // cambiar el indice a donde esta el nombre que estoy buscando
                    indice = fila;
                    guardarDatos();
                    // regreso el indice al valor donde estaba la fila de null
                    indice=indiceOriginal;
                }   
        }
    }
    
    //int descuento = devolverCarnet("A3AA");
    
    public static int devolverCarnet(String nombre){
        for(int fila=0; fila<5; fila++){
            // para que no explote solo tenemos que revisar que no sea null antes de compararlo
            if((registro[fila][0]!=null))
                if(registro[fila][0].equals(nombre))                    
                    return parseInt(registro[fila][1]); 
            
            // andres 2021 19
        }
        return -1;
    }
    
    public static void ingresarVarios(){
        //int continuar=0;
        String continuar="0";
        
        do{
            guardarDatos();
            
            Scanner entrada = new Scanner(System.in);
            System.out.println("Desea ingresar otro estudiante");
            System.out.println("0 Si");
            System.out.println("1 No");
            continuar = entrada.nextLine();
            
            
            // tomate   Q5
            //cantidad se lee con scanner
            //int cantidad=4;
            //producto tomate
            //int precio = devolverPrecio("tomate");
            // subtotal = cantidad * precio
            
            //continuar= parseInt(entrada.nextLine()); 
            //continuar= parseInt(registro[indice][2]) * descuento);
            
            // carrito[0][0] = precio+"";
            // carrito[0][1] = subtotal+"";
            
        }while(continuar.equals("0"));
        //while(continuar==0);
        
        
    }
    
}
