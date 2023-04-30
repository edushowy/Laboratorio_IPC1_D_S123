/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GraficarLista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author lobje
 */
public class GCircular {

    public GCircular() {
        System.out.println("Hola Mundo");
        String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
        String fileInputPath = "grafo1.dot";
        String fileOutputPath = "grafo1.png";
        String tParam = " -Tpng ";
        String tOParam = " -o ";


        String command = dotPath + tParam + fileInputPath + tOParam + fileOutputPath; // comando a ejecutar
        System.out.println("command="+command);
        try {
            Process process = Runtime.getRuntime().exec(command); // ejecutar el comando
            InputStream inputStream = process.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // imprimir la salida del comando en la consola
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
