public class EjemploBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // las posiciones del arreglo inician en 0
        int [] arreglo = new int[5];
		//int [] arreglo = {6,7,8,9,10};
        arreglo[0]=1054;
        arreglo[1]=269;
        arreglo[2]=300;
        arreglo[3]=454;
        arreglo[4]=589;
        String x ="hola";
        
        for(int i=0; i<5; i++){
            System.out.println(arreglo[i]);
        }
        
        for(int i=0; i<5; i++){
            System.out.println(arreglo[i]);
        }
        
        if(arreglo[0]<arreglo[3])
            System.out.println("Menor");
        else
            System.out.println("Mayor");
    }
}