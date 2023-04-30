/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilaycola;

import cola.Cola;
import generico.Elemento;
import java.util.Queue;
import java.util.Stack;
import pilaycola.pila.Pila;

/**
 *
 * @author edush
 */
public class PilaYcola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pila pl = new Pila();
        pl.agregar(new Elemento("Luis",95));
        pl.agregar(new Elemento("Ana",75));
        pl.agregar(new Elemento("Carlos",65));
        
        /*        
        Carlos  65
        Ana     75
        Luis    95
        */
        System.out.println("Recoriendo la Pila");
        Stack<Elemento> pilaTemporal = pl.getPila();
        Elemento elementoTemporal;
        while(!pilaTemporal.empty()){
            elementoTemporal = pl.sacar();
            System.out.println("El 1er elemento de la pila es: "+elementoTemporal.getNombre()+" su no es:"+elementoTemporal.getNota());
        }

        
        System.out.println("Recorriendo la Cola");
        Cola cl = new Cola();
        cl.agregar(new Elemento("Luis2",95));
        cl.agregar(new Elemento("Ana2",75));
        cl.agregar(new Elemento("Carlos2",65)); 
        
        Queue<Elemento> colaTemporal = cl.getCola();
        Elemento elementoTemporal2;
        while(!colaTemporal.isEmpty()){
            elementoTemporal2 = cl.sacar();
            System.out.println("El 1er elemento de la pila es: "+elementoTemporal2.getNombre()+" su no es:"+elementoTemporal2.getNota());
        }
        
    }
    
}
