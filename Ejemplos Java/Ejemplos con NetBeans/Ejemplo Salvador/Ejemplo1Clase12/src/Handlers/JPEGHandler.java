package Handlers;


/**
*   @author Auxiliares
*	@version 1.0
**/
public class JPEGHandler {

    public static void runHandler(ImageHandler imgh) throws Exception {
        /**
         * NO CAMBIE ESTE CODIGO *
         */
        System.out.println("--------------------------------------");
        System.out.println(imgh.getClass().getTypeName().toUpperCase() + ": ");
        System.out.println("\nLeyendo imagen : " + imgh.getFileName());
        imgh.readFile();
        System.out.println("Proceso de lectura de imagen terminado!");
        System.out.println("\nGenerando imagenes : ");
        imgh.generateFiles();
        System.out.println("Proceso de generacion de archivos terminado!");
        System.out.println("\n--------------------------------------");
        /**
         * --------------------- *
         */
    }
}
