/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenamiento;

import static java.lang.Integer.parseInt;

/**
 *
 * @author edush
 */
public class Ordenamiento {
    
    // creamos una matriz de 4 filas y 3 columnas (de tipo global por eso ), para este ejemplo se llena la matriz desde su creacion
        static String[][] matriz = {{"Honda ","Civic  ","5"},{"Toyota","Corolla","19"},{"Mazda ", "CX-3   ", "75"},{"BMW   ","X1     ","9"}};
        
        /* asi se veria la matriz
        
            Marca   Modelo      Ventas
        
            Honda   Civic       25
            Toyota  Corolla     65
            Mazda   CX-3        8
            BMW     X1          19
        */
    
    public static void main(String[] args) {
        
        System.out.println("Matriz original");
        mostrarMatriz();
        // ordenando la matriz en base a la cantidad de ventas de mayor a menor
        
        // la revision se realiza por la cantidad de filas que tenga la matriz
        for(int pasada1=0; pasada1<4; pasada1++){
            
            /*  el intercambio entre la fila actual y la siguiente se limita a la cantidad de filas menos uno 
                esto porque estamos viendo dos datos al mismo tiempo si no restamos uno nos saldriamos de las
                dimesiones de la matriz ejemplo
            
                cuando estamos en la fila indice 0 tambien revisamos la fila indice 1
            
                pero en el caso de la fila indice 3 tambien revisariamos la fila indice 4, el indice 4 no existe nuestra 
                matriz solo tiene 4 filas por ende los indices van de 0 hasta 3 por eso en el 2do for limitamos la cantidad
                a total de filas menos uno
            */
            for(int pasada2=0; pasada2<3; pasada2++){
                    
                    // este es un vector que tiene 3 posiciones para guardar exactamente la informacion de una sola fila
                    String[] filaTemporal = new String[3];
                    
                    // aca se convierte a int el valor de ventas de la fila actual y el valor de ventas de la fila siguiente
                    int venta1 = parseInt(matriz[pasada2][2]);
                    int venta2 = parseInt(matriz[pasada2+1][2]);
                    
                    // si la fila actual tiene menos ventas que la fila siguiente se van a intercambiar
                    if(venta1<venta2){
                        
                        /*  guardamos los valores de la fila siguiente para que no se pierdan al momento de hacer el intercambio
                            
                            fila actual
                            Honda   Civic       25
                            
                            fila siguiente
                            Toyota  Corolla     65
                        
                            Ahora fila temporal tiene lo siguiente
                            Toyota  Corolla     65
                        */
                        filaTemporal[0]=matriz[pasada2+1][0];
                        filaTemporal[1]=matriz[pasada2+1][1];
                        filaTemporal[2]=matriz[pasada2+1][2];
                        
                        /*  cambiamos los valores de la fila siguiente por la fila actual
                        
                            fila actual
                            Honda   Civic       25
                            
                            fila siguiente
                            Toyota  Corolla     65
                        
                            el resultado seria el siguiete hemos borrado toda la informacion de Honda
                            
                            Honda   Civic       25
                            Honda   Civic       25
                        
                            como pueden ver hemos borrado la informacion de Toyota, pero eso no es problema ya que lo guardamos
                            en filaTemporal
                        */
                        matriz[pasada2+1][0]=matriz[pasada2][0];
                        matriz[pasada2+1][1]=matriz[pasada2][1];
                        matriz[pasada2+1][2]=matriz[pasada2][2];
                        
                        /*
                            ahora pasamos la informacion que esta guardada en fila temporal a la fila actual
                        
                            fila actual
                            Honda   Civic       25
                            
                            fila siguiente
                            Honda   Civic       25
                        
                            el resultado sera
                        
                            Toyota  Corolla     65
                            Honda   Civic       25                            
                        */
                        
                        matriz[pasada2][0]=filaTemporal[0];
                        matriz[pasada2][1]=filaTemporal[1];
                        matriz[pasada2][2]=filaTemporal[2];
                        
                        /*
                            asi es como ordenamos de forma descendente el contenido de una matriz en base a un
                            valor numerico
                        */
                    }
            }
        }
        
        System.out.println("");
        System.out.println("Matriz ordenada descendentemente");
        mostrarMatriz();
    }
    
    public static void mostrarMatriz(){
        for(int fila=0; fila<4; fila++){
            for(int columna=0; columna<3; columna++){
                System.out.print(matriz[fila][columna]+"  ");
            }
            System.out.println("");
        }
    }
    
}
