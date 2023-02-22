/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplopoo;

import ejemplopoo.elementos.Producto;
import java.util.ArrayList;
import ejemplopoo.ventanas.ventana;


/**
 *
 * @author edush
 */
public class EjemploPOO {

    /**
     * @param args the command line arguments
     */
    
    static ArrayList <Producto> listaProductos = new ArrayList<Producto>();
    
    public static void main(String[] args) {
        // TODO code application logic here        
        ventana v = new ventana();
        v.setVisible(true);               
    }
    
}
