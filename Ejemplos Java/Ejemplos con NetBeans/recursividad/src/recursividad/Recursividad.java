/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

/**
 *
 * @author edush
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("El facttorial es= ");
        System.out.println(factorial(6));
    }
    
    public static int factorial(int numero){
        
        if
            (numero == 0) return 1;
        else
            // 6*5*4*3*2*1
            return numero * factorial(numero-1);
    }
    
}
