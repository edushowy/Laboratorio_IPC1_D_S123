package ListasEnlazadas;

import Handlers.EstructuraDeDatos;
import javax.swing.JOptionPane;

/**
 *
 * @author lobje
 */

/* **************************************************** *
 * Esta va a ser una lista doblemente enlazada circular *
 * **************************************************** */
public class ListaImagen extends EstructuraDeDatos{
    /* Variable que se usara para el inicio de la lista */
    private ImagenP start;
    private final String msj1;
    private ImagenP recorrido;
    
    
    public ListaImagen(){
        this.index = 0;
        this.start = null;
        this.recorrido = null;
        this.msj1 = "La imagen con el nombre ";
        this.nombre = "";
        
    }

    /* ********************************************************************** *
     * ********************************************************************** *
     * ********************************************************************** */
    @Override
    public void add(Object e) {
        /* Se convierte el parametro e de tipo objeto a ImagenP */
        ImagenP newImage = (ImagenP)e;
        /* ****************************************************************** * 
          * Se verifica si ya existe la imagen en la lista                    *
          * Si ya existe la imagen la funcion find retornara algo diferente   *
          * de null por lo tanto no se agrega                                 *
          * ***************************************************************** */
        if(find(newImage.getName())== null){
            /* Si es la primera imagen */
            if(this.index==0) addFirstImage(newImage);
            else{
                /* *************************************************************** *
                  * Enlazamos el nuevo nodo usando como referencia el nodo inicial *
                  * Entonces decimos                                               *
                  *     - El nodo siguiente de la nueva imagen va a ser el         *
                  *       siguiente del nodo anterior de start                     *
                  *     - El nodo anterior de la nueva imagen va a ser el anterior *
                  *       del nodo start                                           *
                  * ************************************************************** */
                newImage.setNextBack(start.getBack().getNext(), start.getBack());
                
                /* *********************************************************** *
                  * Si la lista solo tiene un elemento se debe cambia las      *
                  * referencias next y back del nodo inicial, colocando como   *
                  * back y next a la nueva imagen                              *
                  * ********************************************************** */
                if(index==1) start.setNextBack(newImage, newImage);
                /* *********************************************************** *
                  * Si existe mas de un elemento                               *
                  *     - Se cambia primero la referencia next del nodo        *
                  *       anterior del nodo start asignandole la nueva imagen  *
                  *     - Despues se cambia la referencia de back del nodo     *
                  *       Start asignandole la nueva imagen                    *
                  * ********************************************************** */
                else{
                    start.getBack().setNext(newImage);
                    start.setBack(newImage);
                }
                ImagenAgregada(newImage.getName());
            }
        }
        /* Si ya existe se muentra un mensaje */
        else Mensaje("Ya existe una imagen con el nombre "+ newImage.getName());
    }

    private void addFirstImage(ImagenP newImage){
        /* ****************************************************************** *
         * Al ser el primer elemento de la lista y al ser una lista circular  *
         * se deben los apuntadores en esta caso hacia el mismo               *
         * ****************************************************************** * */
        newImage.setNextBack(newImage, newImage);
        /* Ahora si asigna a start la nueva imagen ya que ahi inicia la lista */
        start = newImage;
        ImagenAgregada(newImage.getName());
    }
    
    private void ImagenAgregada(String nombre){
        Mensaje(msj1+nombre+" se agrego a la lista");
        this.index++;
    }

    /* ********************************************************************** *
     * ********************************************************************** *
     * ********************************************************************** */
    @Override
    public Object peek() {
        return null;
    }

    /* ********************************************************************** *
     * ********************************************************************** *
     * ********************************************************************** */
    @Override
    public Object find(Object e) {
        /* Seconvierte el objeto recibido a un String */
        String name = (String)e;
        /* Se crea un Nodo temporal que se usara para recorrer la lista */
        ImagenP actual = start;
        /* Se recorre la lista usando un for usando como limite la cantidad de elementos en ella */
        for (int i = 0; i < index; i++) {
            /* ************************************************************** *
             * Se verifica si el nombre elemento analizdo son iguales con el  *
             * nombre ingresado si son iguales regresa el elemento            *
             * ************************************************************** */
            if(actual.getName().equals(name)) return actual;
            /* Si son diferentes se mueve al siguiente elemento */
            else actual = actual.getNext();
        }
        return null;
    }

    /* ********************************************************************** *
     * ********************************************************************** *
     * ********************************************************************** */
    @Override
    public Object getNext() {
        if(recorrido==null) recorrido = start;
        recorrido = recorrido.getNext();
        //System.out.println("Nombre "+recorrido.getName());
        return recorrido;
    }
    
    
    public Object getBack() {
        if(recorrido==null) recorrido = start;
        recorrido = recorrido.getBack();
        //System.out.println("Nombre "+recorrido.getName());
        return recorrido;
    }


    /* ********************************************************************** *
     * ********************************************************************** *
     * ********************************************************************** */
    @Override
    public int getSize() {
        return this.index;
    }

    /* ********************************************************************** *
     * ********************************************************************** *
     * ********************************************************************** */
    @Override
    public Object get(int i) {
        return null;
    }

    /* ********************************************************************** *
     * ********************************************************************** *
     * ********************************************************************** */
    @Override
    public Object pop() {
        return null;
    }

    /* ********************************************************************** *
     * ********************************************************************** *
     * ********************************************************************** */
    @Override
    public void delete(Object e) {
        /* ********************************************************************
         * Se busca el elemento usando el metodo Find y asignandolo a una     *
         * variable de tipo objeto                                            *
         * ****************************************************************** */
        Object imagenAEliminar = find(e);
        /* ********************************************************************
         * Se verifica que lo que se obtuvo es diferente de null para poder   *
         * convertirlo a nuestro nodo de tipo ImagenP                         *
         * ****************************************************************** */
        if(imagenAEliminar!=null){
            /* Se convierte el objeto a tipo ImagenP */
            ImagenP actual = (ImagenP)imagenAEliminar;
            /* ************************************************************** *
             * Si solo existe una imagen en la lista y se elimina solo se     *
             * reinicia la variable start con null                            *
             * ************************************************************** */
            if(index==1) start = null;
            /* ************************************************************** *
             * Si existe mas de una imagen se deben cambiar los apuntadores   *
             * de la imagen anterior y siguiente del la imagen actual         *
             *  - Se le indica a la imagen anterior que su siguiente es la    *
             *    imagen siguiente de actual                                  *
             *  - Se le indica a la imagen siguiente que su anterior es la    *
             *    imagen anterior de actual                                   *
             * ************************************************************** */
            else{
                actual.getBack().setNext(actual.getNext());
                actual.getNext().setBack(actual.getBack());
            }
            Mensaje(msj1+actual.getName()+" se ha eliminado de la lista");
            /* Se reduce en uno la cantidad de elementos en la lista */
            index--;
        }        
        /* ******************************************************************* *
         * Si devuelve un valor null la imagen con el nombre buscado no existe *
         * Por lo que solo se mostrara un mensaje indicando eso                *
         * ******************************************************************* */
        else{
            if(index==0) Mensaje("Eliminacion: Lista vacia");
            else Mensaje(msj1+(String)e+" no existe en la lista");
        }
    }

    /* ********************************************************************** *
     * ********************************************************************** *
     * ********************************************************************** */
    public void update(String name, String path){
        
        /* ********************************************************************
         * Se busca el elemento usando el metodo Find y asignandolo a una     *
         * variable de tipo objeto                                            *
         * ****************************************************************** */
        Object imagenAEliminar = find(name);
        /* ********************************************************************
         * Se verifica que lo que se obtuvo es diferente de null para poder   *
         * convertirlo a nuestro nodo de tipo ImagenP                         *
         * ****************************************************************** */
        if(imagenAEliminar!=null){
            /* Se convierte el objeto a tipo ImagenP */
            ImagenP actual = (ImagenP)imagenAEliminar;
            actual.setPath_(path);
            Mensaje(msj1+name+" actualizo la ubicacion");
        }
        else{
            if(index==0) Mensaje("Actualizacion: Lista vacia");
            else Mensaje(msj1+name+" no existe en la lista");
        }
    }
    
    /* ********************************************************************** *
     * ********************************************************************** *
     * ********************************************************************** */
    private void Mensaje(String m){
        //System.out.println(m);
        JOptionPane.showMessageDialog(null, m);
    }
    
    
    public void mostrar(){
        ImagenP tmp = start;
        for (int i = 0; i < index; i++) {
            
            System.out.println("Nombre "+tmp.getName());
            tmp = tmp.getNext();
        }
    }
}
