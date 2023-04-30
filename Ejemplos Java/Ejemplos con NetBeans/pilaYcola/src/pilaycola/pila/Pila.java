/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilaycola.pila;

import generico.Elemento;
import java.util.Stack;

/**
 *
 * @author edush
 */
public class Pila {

    private Stack <Elemento> miPila;
    
    public Pila() {
        miPila = new Stack<>();
    }
    
    public void agregar(Elemento e){
        miPila.push(e);
    }
    
    public Stack <Elemento> getPila(){
        return miPila;
    }
    
    public Elemento sacar(){
        return miPila.pop();
    }
    
    
    
    
    
}
