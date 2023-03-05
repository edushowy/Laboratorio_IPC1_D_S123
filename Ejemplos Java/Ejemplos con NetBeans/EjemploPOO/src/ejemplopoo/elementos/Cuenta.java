/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopoo.elementos;

/**
 *
 * @author edush
 */
public class Cuenta {
    private String nombres;
    private String apellidos;
    private String contraseña;
    private String rutaFoto;
    private String usuario;
    private boolean esAdmin ;

    public Cuenta() {
    }

    public Cuenta(String nombres, String apellidos, String contraseña, String rutaFoto, String usuario, boolean esAdmin) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.contraseña = contraseña;
        this.rutaFoto = rutaFoto;
        this.usuario = usuario;
        this.esAdmin = esAdmin;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRutaFoto() {
        return rutaFoto;
    }

    public void setRutaFoto(String rutaFoto) {
        this.rutaFoto = rutaFoto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public boolean getEsAdmin(){
        return esAdmin;
    }

    
    
    
}
