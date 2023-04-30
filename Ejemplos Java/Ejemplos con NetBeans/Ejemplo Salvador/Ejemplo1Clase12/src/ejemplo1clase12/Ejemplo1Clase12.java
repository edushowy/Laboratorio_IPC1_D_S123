/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1clase12;

import InterfazGrafica.VentanaInicio;
import ListasEnlazadas.ImagenP;
import ListasEnlazadas.ListaImagen;

/**
 *
 * @author lobje
 */
public class Ejemplo1Clase12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaImagen li = new ListaImagen();
//        li.add(new ImagenP("Hola", "Hola"));
//        li.delete("hola");
//        li.delete("Hola");
//        li.update("Hola", "Adios");
        
        VentanaInicio vi = new VentanaInicio();
        vi.recibirLista(li);
        vi.setVisible(true);
    }
    
}
