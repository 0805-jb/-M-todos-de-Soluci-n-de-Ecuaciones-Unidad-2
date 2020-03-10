package Unidad2;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Principal extends javax.swing.JFrame {

    WinBiseccion bise = new WinBiseccion();
    VentanaPuntoFIjo PuntoFijo2 = new VentanaPuntoFIjo();
    VentanaNewton metodoNewton = new VentanaNewton();
    VentanaSecante Secante2 = new VentanaSecante(); 
 

    public Principal() {
        initComponents();
        //this.setLayout(null);
        this.setSize(1024, 600);
        this.setTitle("Metodos");
        //this.setResizable(false);
        this.setLocationRelativeTo(null);

        ImageIcon icono = new javax.swing.ImageIcon(getClass().getResource("/img/fondo4.jpg"));
        Image imagen = icono.getImage();
        ImageIcon iconoEscalado = new ImageIcon(imagen.getScaledInstance(1024, 768, Image.SCALE_SMOOTH));
        fondoprincipal.setIcon(iconoEscalado);
    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("/img/fondo.jpg"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        fondoprincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        Newton = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondoprincipal.setText("jLabel2");

        desktopPane.setLayer(fondoprincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
        );

        fondoprincipal.getAccessibleContext().setAccessibleName(""); // NOI18N

        jMenu1.setText("MétodosNúmericos");

        jMenu3.setText("Unidad2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Bisección de Bolzano");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Punto Fijo");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBoxMenuItem2);

        Newton.setSelected(true);
        Newton.setText("Método Newton");
        Newton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewtonActionPerformed(evt);
            }
        });
        jMenu3.add(Newton);

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("Método Secante");
        jCheckBoxMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBoxMenuItem3);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        // TODO add your handling code here:
        //Mostrar Ventana Biseccion
        if (!desktopPane.isAncestorOf(bise)) {
            int x = (desktopPane.getWidth() / 2) - (bise.getWidth() / 2);
            int y = (desktopPane.getHeight() / 2) - (bise.getHeight() / 2);
            desktopPane.add(bise);
            bise.toFront();
            bise.setLocation(x, y + 50);
            bise.setVisible(true);
        } else {
            desktopPane.setSelectedFrame(bise);
        }
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        // TODO add your handling code here:
        //mostrar ventana Punto Fijo
        if (!desktopPane.isAncestorOf(PuntoFijo2)) {
            int x = (desktopPane.getWidth() / 2) - (PuntoFijo2.getWidth() / 2);
            int y = (desktopPane.getHeight() / 2) - (PuntoFijo2.getHeight() / 2);
            desktopPane.add(PuntoFijo2);
            PuntoFijo2.toFront();
            PuntoFijo2.setLocation(x, y + 50);
            PuntoFijo2.setVisible(true);
        } else {
            desktopPane.setSelectedFrame(PuntoFijo2);
        }
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void NewtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewtonActionPerformed
        // TODO add your handling code here:
        if (!desktopPane.isAncestorOf(metodoNewton)) {
            int x = (desktopPane.getWidth() / 2) - (metodoNewton.getWidth() / 2);
            int y = (desktopPane.getHeight() / 2) - (metodoNewton.getHeight() / 2);
            desktopPane.add(metodoNewton);
            metodoNewton.toFront();
            metodoNewton.setLocation(x, y + 50);
            metodoNewton.setVisible(true);
        } else {
            desktopPane.setSelectedFrame(metodoNewton);
        }
    }//GEN-LAST:event_NewtonActionPerformed

    private void jCheckBoxMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem3ActionPerformed
        // TODO add your handling code here:
                if (!desktopPane.isAncestorOf(Secante2)) {
            int x = (desktopPane.getWidth() / 2) - (Secante2.getWidth() / 2);
            int y = (desktopPane.getHeight() / 2) - (Secante2.getHeight() / 2);
            desktopPane.add(Secante2);
            Secante2.toFront();
            Secante2.setLocation(x, y + 50);
            Secante2.setVisible(true);
        } else {
            desktopPane.setSelectedFrame(Secante2);
        }
        
        
    }//GEN-LAST:event_jCheckBoxMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem Newton;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel fondoprincipal;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
