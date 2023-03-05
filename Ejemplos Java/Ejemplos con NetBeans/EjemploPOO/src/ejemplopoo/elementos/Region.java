/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopoo.elementos;

/**
 *
 * @author edush
 */
public class Region {
    
    private String nombre;
    private String codigo;
    private double precioEstandar;
    private double precioEspecial;

    public Region() {
    }

    public Region(String nombre, String codigo, double precioEstandar, double precioEspecial) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precioEstandar = precioEstandar;
        this.precioEspecial = precioEspecial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecioEstandar() {
        return precioEstandar;
    }

    public void setPrecioEstandar(double precioEstandar) {
        this.precioEstandar = precioEstandar;
    }

    public double getPrecioEspecial() {
        return precioEspecial;
    }

    public void setPrecioEspecial(double precioEspecial) {
        this.precioEspecial = precioEspecial;
    }
    
    
    
}
