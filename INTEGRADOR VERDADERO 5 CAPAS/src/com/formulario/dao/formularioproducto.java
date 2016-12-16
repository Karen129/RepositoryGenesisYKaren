
package com.formulario.dao;

import Conexion.ConexionBD;
import com.dominio.dao.Productos;
import com.proyecto.implementacion.productodao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class formularioproducto extends javax.swing.JFrame {
   
    //LLAMO AL REPOSITORIO PARA PODER ACCEDER
     Connection cnn=null;
//     Statement sta=null;
//     ResultSet rst=null;

   
    public formularioproducto(){
        initComponents();
        codigo.setVisible(true);
        this.setLocationRelativeTo(null);
        Consumo();
        CargarTabla();
        Desabilitar();
    }

    //------- BUSCAR EN LA BASE DE DATOS LOS TIPOS DE CONSUMOS ---------
    public void Consumo(){
        try {
             cnn=ConexionBD.Open();
             String sql= "select descripcion from consumo";
            try{
               Statement stm= cnn.createStatement();
               ResultSet rs=stm.executeQuery(sql);
               while(rs.next()){
                  cbconsumo.addItem(rs.getString(1));
               }
                  cbconsumo.setSelectedIndex(-1);
            }catch(Exception x){
                JOptionPane.showMessageDialog(null, "ERROR... AL CARGAR CONSUMO"+x);
            } 
        } catch (SQLException ex) {}  
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel17 = new javax.swing.JLabel();
        txtdescripcion = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        bnguardar = new javax.swing.JButton();
        bnnuevo = new javax.swing.JButton();
        bncancelar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        cbconsumo = new javax.swing.JComboBox<>();
        txtbuscar = new javax.swing.JTextField();
        bnmodificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Ttabla = new javax.swing.JTable();
        codigo = new javax.swing.JTextField();
        salir = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jMenuItem1.setText("MODIFICAR");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("ELIMINAR");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PRODUCTO");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel17.setText("Descrpcion");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txtdescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtdescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescripcionActionPerformed(evt);
            }
        });
        txtdescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdescripcionKeyTyped(evt);
            }
        });
        getContentPane().add(txtdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 210, 25));

        txtprecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioActionPerformed(evt);
            }
        });
        txtprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecioKeyTyped(evt);
            }
        });
        getContentPane().add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 60, 25));

        jLabel18.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel18.setText("Precio");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 64, 30));

        jLabel19.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel19.setText("Cantidad");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 91, -1));

        txtcantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadActionPerformed(evt);
            }
        });
        txtcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantidadKeyTyped(evt);
            }
        });
        getContentPane().add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 40, 25));

        bnguardar.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 11)); // NOI18N
        bnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar.png"))); // NOI18N
        bnguardar.setBorderPainted(false);
        bnguardar.setContentAreaFilled(false);
        bnguardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bnguardar.setIconTextGap(-1);
        bnguardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar1.png"))); // NOI18N
        bnguardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar2.png"))); // NOI18N
        bnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(bnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, 40));

        bnnuevo.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 11)); // NOI18N
        bnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/new.png"))); // NOI18N
        bnnuevo.setBorderPainted(false);
        bnnuevo.setContentAreaFilled(false);
        bnnuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bnnuevo.setIconTextGap(-1);
        bnnuevo.setInheritsPopupMenu(true);
        bnnuevo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/new_1.png"))); // NOI18N
        bnnuevo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/new_2.png"))); // NOI18N
        bnnuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(bnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 110, 60, 40));

        bncancelar.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 11)); // NOI18N
        bncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        bncancelar.setBorderPainted(false);
        bncancelar.setContentAreaFilled(false);
        bncancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bncancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bncancelar.setIconTextGap(-1);
        bncancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar1.png"))); // NOI18N
        bncancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar2.png"))); // NOI18N
        bncancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bncancelarActionPerformed(evt);
            }
        });
        getContentPane().add(bncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 60, 40));

        jLabel20.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel20.setText("Consumo");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 24));

        cbconsumo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbconsumoItemStateChanged(evt);
            }
        });
        cbconsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbconsumoActionPerformed(evt);
            }
        });
        cbconsumo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbconsumoKeyTyped(evt);
            }
        });
        getContentPane().add(cbconsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 145, 28));

        txtbuscar.setBorder(javax.swing.BorderFactory.createTitledBorder("Introducir Tipo de Consumo"));
        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });
        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 300, 60));

        bnmodificar.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 11)); // NOI18N
        bnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/edit.png"))); // NOI18N
        bnmodificar.setBorderPainted(false);
        bnmodificar.setContentAreaFilled(false);
        bnmodificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bnmodificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bnmodificar.setIconTextGap(-1);
        bnmodificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/edit_1.png"))); // NOI18N
        bnmodificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/edit_2.png"))); // NOI18N
        bnmodificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(bnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 60, 40));

        Ttabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Ttabla.setComponentPopupMenu(jPopupMenu1);
        Ttabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TtablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Ttabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 570, 220));

        codigo.setEditable(false);
        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });
        getContentPane().add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 40, -1));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton salir.gif"))); // NOI18N
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 110, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/blanco.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 450));

        jButton1.setText("jButton1");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescripcionActionPerformed
        txtcantidad.requestFocus();
        mostrardatos();
    }//GEN-LAST:event_txtdescripcionActionPerformed

    private void txtdescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescripcionKeyTyped
        //Validar solo letras
        int c = evt.getKeyChar();
        if((c < 97 || c > 122) && (c< 65 || c > 90) &&  (c != 32)){
            evt.consume();
        }
        //Validar hasta el rango de acuerdo a la base de datos "limite 50"
        String texto = txtdescripcion.getText();
        if(texto.length() == 100){
            evt.consume();
        }
    }//GEN-LAST:event_txtdescripcionKeyTyped

    private void txtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioActionPerformed
        bnguardar.requestFocus();
    }//GEN-LAST:event_txtprecioActionPerformed

    private void txtprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyTyped

        //Validar numero y signos
        int c = evt.getKeyChar();
        if(!(c < 97 || c > 122) && (c< 65 || c > 90) &&  (c != 32)){
            evt.consume();
        }
    }//GEN-LAST:event_txtprecioKeyTyped

    private void txtcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadActionPerformed
        txtprecio.requestFocus();
    }//GEN-LAST:event_txtcantidadActionPerformed

    private void txtcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyTyped
        char c=evt.getKeyChar();
        if (c<'0'|| c>'9' ){
            evt.consume();
        }
    }//GEN-LAST:event_txtcantidadKeyTyped

    private void bnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnguardarActionPerformed
       productodao producto = new productodao();
       Productos pd = new Productos();
 
       pd.setDescripcion(txtdescripcion.getText());
       pd.setCantidad(Integer.parseInt(txtcantidad.getText()));
       pd.setPrecio(Double.parseDouble(txtprecio.getText()));
       producto.insertarproducto(pd);
       JOptionPane.showMessageDialog(rootPane,"PRODUCTO GUARDADO CORRECTAMENTE"); 
       CargarTabla();
       Limpiar();
    }//GEN-LAST:event_bnguardarActionPerformed

    private void bnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnnuevoActionPerformed
        Habilitar();
    }//GEN-LAST:event_bnnuevoActionPerformed

    private void bncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bncancelarActionPerformed
        Desabilitar();
        Limpiar();

    }//GEN-LAST:event_bncancelarActionPerformed

     public void Limpiar(){
        txtdescripcion.setText("");
        txtcantidad.setText("");
        txtprecio.setText("");
        cbconsumo.setSelectedIndex(-1);
        txtbuscar.setText("");
    }
    private void cbconsumoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbconsumoItemStateChanged
        txtdescripcion.requestFocus();
    }//GEN-LAST:event_cbconsumoItemStateChanged

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    int fila= Ttabla.getSelectedRow();
    if(fila>=0){
        codigo.setText(Ttabla.getValueAt(fila, 0).toString());
        cbconsumo.setSelectedItem(Ttabla.getValueAt(fila, 1).toString());
        txtdescripcion.setText(Ttabla.getValueAt(fila, 2).toString());
        txtcantidad.setText(Ttabla.getValueAt(fila, 3).toString());
        txtprecio.setText(Ttabla.getValueAt(fila, 4).toString());
    }else{
       JOptionPane.showMessageDialog(null,"no seleciono fila");
    }
       bnmodificar.setVisible(true);
       Habilitar();
       bnguardar.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void bnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnmodificarActionPerformed
       productodao producto = new productodao();
       Productos pd = new Productos();
       pd.setId_productos(Integer.parseInt(codigo.getText()));
       pd.setDescripcion(txtdescripcion.getText());
       pd.setCantidad(Integer.parseInt(txtprecio.getText()));
       pd.setPrecio(Double.parseDouble(txtprecio.getText()));
       producto.modificarproducto(pd);
       JOptionPane.showMessageDialog(rootPane,"PRODUCTO MODIFICADO CORRECTAMENTE..");
       CargarTabla();
    }//GEN-LAST:event_bnmodificarActionPerformed

    public void guardar() throws SQLException{  
         Limpiar();
    }
    
    public void modificar() throws SQLException{     
         Limpiar();
    }
    private void TtablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TtablaMouseClicked
       int seleccion=Ttabla.rowAtPoint(evt.getPoint());
       codigo.setText(String.valueOf(Ttabla.getValueAt(seleccion,0 )));
       txtdescripcion.setText(String.valueOf(Ttabla.getValueAt(seleccion,1 )));
       txtcantidad.setText(String.valueOf(Ttabla.getValueAt(seleccion,2 )));
       txtprecio.setText(String.valueOf(Ttabla.getValueAt(seleccion,2 )));
    }//GEN-LAST:event_TtablaMouseClicked

    private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
       CargarTabla();
    }//GEN-LAST:event_txtbuscarKeyReleased

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        menu.main(null);
        this.setVisible(false);
    }//GEN-LAST:event_salirMouseClicked

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed

    }//GEN-LAST:event_codigoActionPerformed

    private void cbconsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbconsumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbconsumoActionPerformed

    private void cbconsumoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbconsumoKeyTyped
         try {
             // TODO add your handling code here:
             cnn=ConexionBD.Open();
             try{
              Statement stm = cnn.createStatement();
              String sql= "select id_consumo from consumo where descripcion= '"+ cbconsumo.getSelectedItem().toString()+"'";
              ResultSet rs = stm.executeQuery(sql);
              rs.next();
              codigo.setText(rs.getString(1));
            
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
            }
         } catch (SQLException ex) {}  
    }//GEN-LAST:event_cbconsumoKeyTyped

    public void mostrardatos(){
        String consulta = " SELECT *  FROM productos WHERE id_producto='"+codigo.getText()+"'";
        try {
            Statement stm= cnn.createStatement();
            ResultSet rs=stm.executeQuery(consulta);
            if(rs.next()){
                this.codigo.setText(Integer.toString(rs.getInt(1)));
                this.cbconsumo.setSelectedItem(2);
                this.txtdescripcion.setText(rs.getString(3));
                this.txtcantidad.setText(Integer.toString(rs.getInt(4)));
                this.txtprecio.setText(Double.toString(rs.getDouble(5)));
               
            }else{
               JOptionPane.showMessageDialog(null, "NO EXISTE EN LA BASE DE DATOS","MENSAJE", JOptionPane.QUESTION_MESSAGE);
            }
        }catch(SQLException ex){
           System.out.println(ex.getMessage());
        }
    }
    

    //------- CONSULTAR LOS TIPOS DE PRODUCTOS ---------
    public void CargarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("TIPO CONSUMO");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("PRECIO");
        String sql="";
        if(txtbuscar.getText().equals("")){
            sql="select a.id_producto,e.descripcion,a.descripcion,a.cantidad,a.precio from productos a inner join " +
                   "consumo e on id_consumo=id_consumo; ";
        }else{
            sql="select a.id_producto,e.descripcion,a.descripcion,a.cantidad,a.precio from productos a inner join " +
               " consumo e on id_consumo=id_consumo where e.descripcion like '%" + txtbuscar.getText().toUpperCase()+"%'";
        }
        modelo.removeTableModelListener(Ttabla);
        String []registro= new String[5];
        try{
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                registro[0]= Integer.toString(rs.getInt(1));
                registro[1]= rs.getString(2);
                registro[2]= rs.getString(3);
                registro[3]= Integer.toString(rs.getInt(4));
                registro[4]= Double.toString(rs.getDouble(5));
                modelo.addRow(registro);  
            }
            Ttabla.setModel(modelo);
        }catch(Exception x){
            System.out.println(x.getMessage());
        }
        if(txtbuscar.getText().equals("")){
            this.Limpiar();
        }
    }
    
   
    public void Habilitar(){
        txtdescripcion.setEnabled(true);
        txtcantidad.setEnabled(true);
        txtprecio.setEnabled(true);
        cbconsumo.setEnabled(true);
        
        bnnuevo.setVisible(false);
        bnguardar.setVisible(true);
        bncancelar.setVisible(true);
    }
    public void Desabilitar(){
        txtdescripcion.setEnabled(false);
        txtcantidad.setEnabled(false);
        txtprecio.setEnabled(false);
        cbconsumo.setEnabled(false);
        //Botones
        bnnuevo.setVisible(true);
        bnguardar.setVisible(false);
        bncancelar.setVisible(false);
        bnmodificar.setVisible(false);
    }
    
    productodao pd=new productodao();
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
            java.util.logging.Logger.getLogger(formularioproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formularioproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formularioproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formularioproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formularioproducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Ttabla;
    private javax.swing.JButton bncancelar;
    private javax.swing.JButton bnguardar;
    private javax.swing.JButton bnmodificar;
    private javax.swing.JButton bnnuevo;
    private javax.swing.JComboBox<String> cbconsumo;
    private javax.swing.JTextField codigo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel salir;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
