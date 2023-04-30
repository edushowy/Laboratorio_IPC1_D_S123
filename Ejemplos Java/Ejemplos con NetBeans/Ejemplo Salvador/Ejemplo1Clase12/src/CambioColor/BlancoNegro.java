/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CambioColor;

import java.awt.Color;

/**
 *
 * @author lobje
 */
public class BlancoNegro extends CambiarColor{
    
    public BlancoNegro(String filename) {
        super(filename);
    }
    
    @Override
    public void repintar(int i, int j, Color color) {
        int promedio = (color.getBlue()+color.getGreen()+color.getRed())/3;
        Color NewColor = new Color(promedio, promedio, promedio);
        bmp.setRGB(i, j, NewColor.getRGB());
    }
}
