package Handlers;
/* NO CAMBIE EL CODIGO DE ESTA CLASE */

import java.io.Serializable;



/**
*	Define la estrucutra general en la cual se tienen que comportar las estructuras de datos 
* 	que se implementaran en este proyecto 
* 
*   @author Auxiliares
*	@version 1.0
**/

public abstract class EstructuraDeDatos implements Serializable{
    protected String nombre;
    public int index;

    public EstructuraDeDatos() {
        this.index = 0;
    }
    
    /**
     * method that adds a new element
     * @param e 
     */
   public abstract void add(Object e);
   /**
    * Method that gets the last or first item. Depends on the structure
     * @return 
   */
   public abstract Object peek();
   
   /*
      Method searching for an item
   */
   public abstract Object find(Object e);
   
   /*
   * Obtiene el siguente elemento que le sigue al indice
   */
   public abstract Object getNext();
   /*
   * Obtiene la cantidad de elementos que tiene la estructura de datos
   */
   public abstract int getSize();
   
   /**
    * Metodo que devuelve el objeto con el indice i
    * @param i
    * @return 
    */
   public abstract Object get(int i);
   /**
    * Retira el ultimo elemento o el primer elemento de la lista
    * @return 
    */
   public abstract Object pop();
   
   /**
    * Elimina un elemento de la lista, con la condicional e
    * @param e 
    */
   public abstract void delete(Object e);
}
