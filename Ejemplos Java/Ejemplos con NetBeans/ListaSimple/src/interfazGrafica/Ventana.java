/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfazGrafica;

import listadoble.ListaDobleEnlazada;
import listadoble.NodoDoble;
import listasimple.ListaSimpleEnlazada;
import listasimple.Nodo;

/**
 *
 * @author edush
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    ListaSimpleEnlazada lse = new ListaSimpleEnlazada();
    ListaDobleEnlazada lde = new ListaDobleEnlazada();
    Nodo temporal;    
    NodoDoble temporal2;
    NodoDoble temporal3;
    
    public Ventana() {
        initComponents();
        
        lse.agregar(4);
        lse.agregar(9);
        lse.agregar(56);
        lse.agregar(125);
        
        lde.agregar(12);
        lde.agregar(59);
        lde.agregar(21);
        lde.agregar(3);  
        
        temporal = lse.getInicio();
        temporal2 = lde.getInicio();       
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        siguienteSimple = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        anteriorDoble = new javax.swing.JButton();
        siguienteDoble = new javax.swing.JButton();
        valorSimple = new javax.swing.JTextField();
        valorDoble = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        siguienteSimple.setText("Siguiente >>");
        siguienteSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteSimpleActionPerformed(evt);
            }
        });
        getContentPane().add(siguienteSimple, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 116, -1, -1));

        jLabel1.setText("Lista Simple");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 63, -1, -1));

        jLabel2.setText("Lista Doble");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 257, -1, -1));

        anteriorDoble.setText("<< Anterior");
        anteriorDoble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorDobleActionPerformed(evt);
            }
        });
        getContentPane().add(anteriorDoble, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));

        siguienteDoble.setText("Siguiente >>");
        siguienteDoble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteDobleActionPerformed(evt);
            }
        });
        getContentPane().add(siguienteDoble, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 328, -1, -1));
        getContentPane().add(valorSimple, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 116, 154, -1));
        getContentPane().add(valorDoble, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 328, 154, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siguienteSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteSimpleActionPerformed
        // TODO add your handling code here:        
        
        if(temporal != null){
            valorSimple.setText(temporal.getValor()+"");
            temporal=temporal.getSiguiente();
        }else{
            valorSimple.setText("Fin");
        }
        
        
    }//GEN-LAST:event_siguienteSimpleActionPerformed

    private void siguienteDobleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteDobleActionPerformed
        // TODO add your handling code here:
        if(temporal2 != null){
            valorDoble.setText(temporal2.getValor()+"");
            temporal2=temporal2.getSiguiente();
            if(temporal2 == null){
                temporal2=lde.getInicio();               
            }
        }
    }//GEN-LAST:event_siguienteDobleActionPerformed

    private void anteriorDobleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorDobleActionPerformed
        // TODO add your handling code here:
        if(temporal2 != null){
            valorDoble.setText(temporal2.getValor()+"");
            temporal2=temporal2.getAterior();
            if(temporal2 == null){
                temporal2=lde.getFin();
            }
        }
    }//GEN-LAST:event_anteriorDobleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anteriorDoble;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton siguienteDoble;
    private javax.swing.JButton siguienteSimple;
    private javax.swing.JTextField valorDoble;
    private javax.swing.JTextField valorSimple;
    // End of variables declaration//GEN-END:variables
}