/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz;

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
        for(int a=0; a<5;a++){
            guardarDatos();
        }
        mostrarTodos();
        System.out.println("se encontro a pedro: ");
        System.out.println(buscarNombre("pedro"));
        
        
    }
    
    public static void menu(){
        String opcion="";
        switch(opcion){
            case "1": 
                guardarDatos();
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
                    return true;
        }
        return false;
    }
    
}
