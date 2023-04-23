/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasimple;

/**
 *
 * @author edush
 */
public class Nodo {
    
    private int valor;
    private Nodo siguiente;

    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }
    
    public Nodo getSiguiente(){
        return siguiente;
    }
    
    public int getValor(){
        return valor;
    }
    
    public void setSiguiente(Nodo siguiente){
        this.siguiente=siguiente;
    }
    
    public void setValor(int valor){
        this.valor=valor;
    }
    
}
