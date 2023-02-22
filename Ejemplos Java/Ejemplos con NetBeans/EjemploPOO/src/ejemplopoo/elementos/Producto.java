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
        
}
