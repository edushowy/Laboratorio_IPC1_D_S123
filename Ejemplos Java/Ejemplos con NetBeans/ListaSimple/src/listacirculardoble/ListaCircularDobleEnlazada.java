/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listacirculardoble;

import listadoble.NodoDoble;

/**
 *
 * @author edush
 */
public class ListaCircularDobleEnlazada {
     private NodoDoble inicio;
     private NodoDoble fin;
        
    public ListaCircularDobleEnlazada(){
        this.inicio = null;
        this.fin = null;
    }
    
    public void agregar(int valor){
        NodoDoble nuevoNodo = new NodoDoble(valor);
        
        if(this.inicio == null){
            this.inicio = nuevoNodo;
            this.fin = nuevoNodo;
        }else{
            NodoDoble temporal = this.inicio;
            while(temporal.getSiguiente() != null){
                temporal = temporal.getSiguiente();                
            }
            temporal.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior( temporal);
            fin = nuevoNodo;
        }        
    }
    
    
    public void mostrarNormal(){
        NodoDoble temporal = this.inicio;
        while(temporal != null){
            System.out.println("El valor del nodo es: "+temporal.getValor());
            temporal = temporal.getSiguiente();
        }
    }
    
    public void mostrarReversa(){
        
        NodoDoble temporal = this.inicio;
        while(temporal.getSiguiente() != null){
                temporal = temporal.getSiguiente();                
        }
        
        while(temporal != null){
            System.out.println("El valor del nodo es: "+temporal.getValor());            
            temporal = temporal.getAterior();
        }
    }
}
