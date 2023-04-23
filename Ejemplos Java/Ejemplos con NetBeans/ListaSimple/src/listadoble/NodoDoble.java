/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadoble;

/**
 *
 * @author edush
 */
public class NodoDoble {
    
    private int valor;
    private NodoDoble siguiente;
    private NodoDoble anterior;

    public NodoDoble(int valor) {
        this.valor = valor;
        this.siguiente = null;
        this.anterior = null;
    }
    
    public NodoDoble getSiguiente(){
        return siguiente;
    }
    
    public NodoDoble getAterior(){
        return anterior;
    }
    
    public int getValor(){
        return valor;
    }
    
    public void setSiguiente(NodoDoble siguiente){
        this.siguiente=siguiente;
    }
    
    public void setAnterior(NodoDoble anterior){
        this.anterior=anterior;
    }
    
    public void setValor(int valor){
        this.valor=valor;
    }
    
}
