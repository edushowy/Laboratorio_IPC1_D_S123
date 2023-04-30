/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CambioColor;

import Handlers.ImageHandler;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author lobje
 */
public abstract class CambiarColor extends ImageHandler{
    BufferedImage jpg;
    BufferedImage bmp;
    File tmp;
    String nombre;
    
    public CambiarColor(String filename) {
        super(filename);
        this.jpg = null;
        this.bmp = null;
        this.tmp = new File(getFileName());
        this.nombre = filename;
        
    }

    @Override
    public void readFile() throws Exception {
        File file = new File(getFileName());
        jpg = ImageIO.read(file);
        tmp = new File("./Temp/btmTemp.bmp");
        ImageIO.write(jpg, "bmp", tmp);
        bmp = ImageIO.read(tmp);
    }

    @Override
    public void generateFiles() throws Exception {
        for (int i = 0; i < bmp.getWidth(); i++) {
            for (int j = 0; j < bmp.getHeight(); j++) {
                Color color = new Color(bmp.getRGB(i, j));
                repintar(i, j, color);
            }
        }
        ImageIO.write(bmp, "jpg", new File("./Imagen/BlancoNegro"+".jpg"));
        //tmp.delete();
    }
    
    public abstract void repintar(int i, int j, Color color);
}
