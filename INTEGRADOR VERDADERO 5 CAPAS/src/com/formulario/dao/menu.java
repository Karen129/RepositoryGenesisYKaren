
package com.formulario.dao;
import static com.formulario.dao.formularioingreso.txtcargo;
import java.sql.Connection;


public class menu extends javax.swing.JFrame {
    
    Connection conn;
    int cargo=0;
    public menu() {
        initComponents();
        //Poner el formulario en el centro
        this.setLocationRelativeTo(null);
////        TIENE ACCESO
//        cargo= Integer.parseInt(txtcargo.getText());
        if(cargo !=1){
            Trabajador.setEnabled(false);
            Cargo.setEnabled(false);
            Producto.setEnabled(false);
            Reporte.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Factura = new javax.swing.JMenu();
        AProducto = new javax.swing.JMenu();
        Trabajador = new javax.swing.JMenuItem();
        Cliente = new javax.swing.JMenuItem();
        Agregar = new javax.swing.JMenu();
        Producto = new javax.swing.JMenuItem();
        Cargo = new javax.swing.JMenuItem();
        Reporte = new javax.swing.JMenu();
        Ventas = new javax.swing.JMenuItem();
        Caja = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenu();

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RESTAURANTE EL TENGUELITO");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/PresentacionRestaurante.JPG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 350));

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Factura.setText("Factura");
        Factura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FacturaMouseClicked(evt);
            }
        });
        jMenuBar1.add(Factura);

        AProducto.setText("Mantenimiento");
        AProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AProductoActionPerformed(evt);
            }
        });

        Trabajador.setText("Trabajador");
        Trabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrabajadorActionPerformed(evt);
            }
        });
        AProducto.add(Trabajador);

        Cliente.setText("Cliente");
        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });
        AProducto.add(Cliente);

        Agregar.setText("Agregar");

        Producto.setText("Producto");
        Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductoActionPerformed(evt);
            }
        });
        Agregar.add(Producto);

        Cargo.setText("Cargo");
        Cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargoActionPerformed(evt);
            }
        });
        Agregar.add(Cargo);

        AProducto.add(Agregar);

        jMenuBar1.add(AProducto);

        Reporte.setText("Reporte");

        Ventas.setText("Ventas");
        Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentasActionPerformed(evt);
            }
        });
        Reporte.add(Ventas);

        Caja.setText("Caja");
        Caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaActionPerformed(evt);
            }
        });
        Reporte.add(Caja);

        jMenuBar1.add(Reporte);

        Salir.setText("Salir");
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(Salir);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AProductoActionPerformed
//        frmIngresarConsumo f= new frmIngresarConsumo();
//        f.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_AProductoActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        
    }//GEN-LAST:event_SalirActionPerformed

    private void TrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrabajadorActionPerformed
        new formulariotrabajador().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_TrabajadorActionPerformed

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
        new formulariocliente().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ClienteActionPerformed

    private void ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoActionPerformed
        new formularioproducto().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ProductoActionPerformed

    private void CargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargoActionPerformed
        new formulariocargo().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CargoActionPerformed

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SalirMouseClicked

    private void FacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacturaMouseClicked
        new formulariofactura().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_FacturaMouseClicked

    private void VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentasActionPerformed
        new formularioreporte().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VentasActionPerformed

    private void CajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaActionPerformed
//        new formularioreportetotal().setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_CajaActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AProducto;
    private javax.swing.JMenu Agregar;
    private javax.swing.JMenuItem Caja;
    private javax.swing.JMenuItem Cargo;
    private javax.swing.JMenuItem Cliente;
    private javax.swing.JMenu Factura;
    private javax.swing.JMenuItem Producto;
    private javax.swing.JMenu Reporte;
    private javax.swing.JMenu Salir;
    private javax.swing.JMenuItem Trabajador;
    private javax.swing.JMenuItem Ventas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
