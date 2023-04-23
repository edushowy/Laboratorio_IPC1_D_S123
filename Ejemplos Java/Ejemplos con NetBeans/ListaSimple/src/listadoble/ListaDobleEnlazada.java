/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadoble;

import listasimple.Nodo;

/**
 *
 * @author edush
 */
public class ListaDobleEnlazada {
    private NodoDoble inicio;
        
    public ListaDobleEnlazada(){
        this.inicio = null;
    }
    
    public void agregar(int valor){
        NodoDoble nuevoNodo = new NodoDoble(valor);
        
        if(this.inicio == null){
            this.inicio=nuevoNodo;
        }else{
            NodoDoble temporal = this.inicio;
            while(temporal.getSiguiente() != null){
                temporal = temporal.getSiguiente();                
            }
            temporal.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior( temporal);            
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
    
    public NodoDoble getFin(){
        NodoDoble temporal = this.inicio;
        while(temporal.getSiguiente() != null){
                temporal = temporal.getSiguiente();                
        }
        return temporal;
    }
    
    public void setInicio(NodoDoble inicio){
        this.inicio = inicio;
    }
    
    public NodoDoble getInicio(){
        return inicio;
    }
}
