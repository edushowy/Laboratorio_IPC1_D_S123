/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GraficarLista;

import ListasEnlazadas.ListaImagen;

/**
 *
 * @author lobje
 */
public class CircularDot {
    String content;
    ListaImagen imagenes;

    public CircularDot(ListaImagen imagenes) {
        this.content = "";
        this.imagenes = imagenes;
    }
    
    
    public void CreateFile(ListaImagen imagenes) {
        this.content = "digraph Example {\n";
        this.imagenes = imagenes;
        
        this.content += "}";
    }
    
    private void recorrerList(){
         
    }
    
    
    
}
