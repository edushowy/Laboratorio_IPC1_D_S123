/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopoo.elementos;

import java.util.Objects;

/**
 *
 * @author edush
 */
public class Producto {
    private String nombre;
    private double precio;
    private Producto pro;
    
    public Producto(){
        nombre="";
        precio=0;
    }
    
    public Producto(String nombre, double precio){
        this.nombre=nombre;
        this.precio=precio;
    }
    
    public String mostrarProducto(){
        return "nombre: "+ nombre +" precio: "+precio;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setPrecio(double precio){
        this.precio=precio;
    }
    
    public Producto getProducto(){
        pro=new Producto("no trono :3",5);
        return pro;
    }
    
    
    /*
        Index of por defecto utiliza el comparador == por eso puede comprar la cadena con el nombre
        debemos sobre escribir el metodo con .equals para que funcione correctamente
    
        las dos fuciones que estan abajo corrigen el problema
    
        NO recomiendo hacer esto en su proyecto lo agrego para sepan porque no funciono y
        como solucionarlo
    */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Double.compare(producto.precio, precio) == 0                
                && nombre.equals(producto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio);
    }
    
}
