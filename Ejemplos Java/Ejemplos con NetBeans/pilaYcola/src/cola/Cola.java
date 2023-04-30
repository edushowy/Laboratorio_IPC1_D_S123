/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cola;

import generico.Elemento;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author edush
 */
public class Cola {
    private Queue <Elemento> cola;

    public Cola() {
        cola = new LinkedList<>();
    }
    
    public void agregar(Elemento e){
        cola.add(e);
    }
    
    public Queue <Elemento> getCola(){
        return cola;
    }
    
    public Elemento sacar(){
        return cola.remove();
    }
    
    
}
