/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploextra;

import java.util.Scanner;





/**
 *
 * @author edush
 */
public class EjemploExtra {

    /**
     * @param args the command line arguments
     */
    
    static int suma;
    static String c3;
    
    public static void main(String[] args) {
        // TODO code application logic here
        String entrada="";
        
        Scanner consola = new Scanner(System.in);
        System.out.println("----- Menu 1 -----");
        System.out.println("0 sumar");
        System.out.println("1 regresar lo escrito");
        
        String cajero = "cajero_2022145698";
        String contra = "ipc1_2022145698";
        entrada=consola.nextLine();        
        
        switch(entrada){
            case "0":
                System.out.println("a elegido sumar");
                System.out.println(sumar(45,60));
                break;
            case "1":
                System.out.println("quiere devolver la palabra ingresada en el menu 2");
                System.out.println("Escribio en en el menu 2: "+eligio());                
                break;
            default:
                System.out.println("opcion no valida");
                break;
        }
    }
    
    public static int sumar(int a, int b ){
        return a+b;
    }
    
    public static String eligio(){
        String ingreso;
        Scanner consola = new Scanner(System.in);
        System.out.println("----- Menu 2 -----");
        System.out.println("Opcion A");
        System.out.println("Pocion B");        
        System.out.println("regresar la siguiente palabra: ");
        ingreso=consola.nextLine();
        return ingreso;
    }
    
}
