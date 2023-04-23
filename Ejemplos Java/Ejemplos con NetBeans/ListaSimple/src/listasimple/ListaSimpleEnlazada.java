/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasimple;

/**
 *
 * @author edush
 */
public class ListaSimpleEnlazada {
    
    private Nodo inicio;

    public ListaSimpleEnlazada() {
        this.inicio = null;
    }
    
    public void agregar(int valor){
        Nodo nuevoNodo = new Nodo(valor);
        
        if(inicio == null){
            inicio = nuevoNodo;
        }else{
            Nodo temporal = inicio;
            while(temporal.getSiguiente()!=null){
                temporal=temporal.getSiguiente();
            }
            temporal.setSiguiente(nuevoNodo);
        }        
    }
    
    public void mostrarTodo(){
        Nodo temporal = inicio;
        
        while(temporal!=null){
            System.out.println("El valor del nodo es: "+temporal.getValor());
            temporal=temporal.getSiguiente();
        }
    }
    
    public void setInicio(Nodo inicio){
        this.inicio = inicio;
    }
    
    public Nodo getInicio(){
        return inicio;
    }
    
}
