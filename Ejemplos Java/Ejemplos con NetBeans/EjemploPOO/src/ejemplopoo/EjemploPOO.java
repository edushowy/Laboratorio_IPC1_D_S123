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
        
        
        
        // agregamos al ArrayList 3 productos con la funcion .add que es de la Clase ArrayList
        listaProductos.add(new Producto("salsa",9.5));
        listaProductos.add(new Producto("tomate",4));
        listaProductos.add(new Producto("carne",31.8));
        
        System.out.println("---------------- A ----------------");
        
        //recorremos el Arraylist para ver su contenido (tiene 3 productos)
        for(int i=0; i<listaProductos.size();i++){
            /* usamos la funcion mostrarProducto que devuelve un String
               con el nombre y precio del producto */
            System.out.println(i+" -> "+listaProductos.get(i).mostrarProducto());
            /* imprimimos solo el nombre, getNombre retorna un String con el 
               nombre */
            System.out.println(listaProductos.get(i).getNombre());
            /*  imprimimos solo el precio, getPrecio retorna un double con el
                precio del producto*/
            System.out.println(listaProductos.get(i).getPrecio());
        }
        
        System.out.println("---------------- B ----------------");
        
        // modificamos el nombre y precio del indice 1 dentro de nuestro ArrayList que seria toamte
        // la funcion .get devuelve el contenido del ArrayList en el indice que le indicamos
        listaProductos.get(1).setNombre("TOMATE");
        listaProductos.get(1).setPrecio(5.5);
        
        // volvemos a imprimir el contenido de nuestro ArrayList ya se vera TOMATE en vez de tomate
        for(int i=0; i<listaProductos.size();i++){
            System.out.println(i+" -> "+listaProductos.get(i).mostrarProducto());            
        }
        
        System.out.println("---------------- C ----------------");
        
        // agregamos 3 productos mas al ArrayList (ahora tiene 6, los 3 anteriores y los 3 nuevos que estan abajo)
        listaProductos.add(new Producto("Pan",15));
        listaProductos.add(new Producto("Pepsi",11));
        listaProductos.add(new Producto("Sopa",4.8));
        
        // volvemos a imprimir el contenido de nuestro ArrayList ahora mostrara 6 productos
        for(int i=0; i<listaProductos.size();i++){
            System.out.println(i+" -> "+listaProductos.get(i).mostrarProducto());            
        }
        
        System.out.println("---------------- D ----------------");
        
        // buscamos el producto pepsi
        for(int i=0; i<listaProductos.size();i++){
            /* le preguntamos al  Producto en la posicion i si su nombre es Pepsi
            */
            if(listaProductos.get(i).getNombre().equals("Pepsi")){
                /*  si el Producto en la posicion i es Pepsi mostramos el indice donde se encontro 
                    su nombre y precio 
                */
                System.out.println("encontrado en indice : "+i+" "+listaProductos.get(i).mostrarProducto());
                
                /*  dentro de la clase Producto creamos una variable Producto, acontinuacion imprimimos 
                    valor guardado en nombre de esa Variable usando el metodo getNombre
                */
                System.out.println("** Variable Producto dentro de Producto "+listaProductos.get(i).getProducto().getNombre());
            }        
        }
        
        
        System.out.println("---------------- E ----------------");
        /*
            lo siguiente no funcionaba
        
            ¿Porque?
        
            hay que sobre escribir los metodos equal y hashcode para que si funcione esto se
            hace en la clase Producto
        
            corra el codigo y vera que funciona, No recomiendo usar indexOf ya que requiere
            conocimiento avanzado para hacer esta correccion
        
            Utilicen la busqueda con un for es mas simple y les da el resultado que necesitan
        */
        
        int pos =listaProductos.indexOf(new Producto("Pepsi",11));
        System.out.println("se encontro en el indice "+pos+" "+listaProductos.get(pos).mostrarProducto());    
        
        
    }
    
}
