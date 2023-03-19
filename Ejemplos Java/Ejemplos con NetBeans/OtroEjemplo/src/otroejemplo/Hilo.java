/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otroejemplo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edush
 */
public class Hilo extends Thread {
        
        @Override
        public void run(){
            System.out.println("--- > Hilo");
            try {
                this.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
}
