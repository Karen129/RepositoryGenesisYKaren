/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formulario.dao;

import Conexion.ConexionBD;
import com.dominio.dao.Trabajador;
import com.proyecto.implementacion.trabajadordao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alaña
 */
public class formulariotrabajador extends javax.swing.JFrame {
       Connection cnn;

    public formulariotrabajador() {
        initComponents();
        txtcedula.requestFocus();
        idcargo.setVisible(true);
        //Poner el formulario en el centro
        this.setLocationRelativeTo(null);
        //Desabilitar botones
        bnguardar.setVisible(false); bnmodificar.setVisible(false); bneliminar.setVisible(false);bncancelar.setVisible(false); 
        lblmensaje.setVisible(false);codigo.setVisible(false);
        Desabilitar();
        Cargo();
        
    }

    public void Cargo(){
         try {
             cnn=ConexionBD.Open();
             String sql= "select cargo from cargo";
            try{
               Statement stm= cnn.createStatement();
               ResultSet rs=stm.executeQuery(sql);
               while(rs.next()){
                  cbcargo.addItem(rs.getString(1));
               }
                  cbcargo.setSelectedIndex(-1);
            }catch(Exception x){
                JOptionPane.showMessageDialog(null, "ERROR... AL CARGAR CARGO" + x);
            } 
        } catch (SQLException ex) {} 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        txtnombres = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txttelefono1 = new javax.swing.JTextField();
        txttelefono2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pfcontrasena = new javax.swing.JPasswordField();
        pfconfirmarcont = new javax.swing.JPasswordField();
        cbsexo = new javax.swing.JComboBox<>();
        codigo = new javax.swing.JLabel();
        lblmensaje = new javax.swing.JLabel();
        lblsalir = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JTextField();
        Buscar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bnnuevo = new javax.swing.JToggleButton();
        bncancelar = new javax.swing.JToggleButton();
        bnguardar = new javax.swing.JToggleButton();
        bnmodificar = new javax.swing.JToggleButton();
        bneliminar = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        cbcargo = new javax.swing.JComboBox<>();
        idcargo = new javax.swing.JTextField();
        dcfecha = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos de Empleados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans Ultra Bold", 0, 18), new java.awt.Color(51, 51, 255))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel8.setText("C.i");

        jLabel9.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel9.setText("Nombres");

        jLabel10.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel10.setText("Apellidos");

        jLabel11.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel11.setText("Fecha Nacimiento");

        jLabel12.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel12.setText("Sexo");

        jLabel14.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel14.setText("Dirección");

        jLabel13.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel13.setText("Telefono");

        jLabel19.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel19.setText("Contraseña");

        jLabel20.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel20.setText("Confirmar Contraseña");

        txtcedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaActionPerformed(evt);
            }
        });
        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcedulaKeyTyped(evt);
            }
        });

        txtnombres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtnombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombresActionPerformed(evt);
            }
        });
        txtnombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombresKeyTyped(evt);
            }
        });

        txtapellidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtapellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidosActionPerformed(evt);
            }
        });
        txtapellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidosKeyTyped(evt);
            }
        });

        txtdireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });
        txtdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdireccionKeyTyped(evt);
            }
        });

        txttelefono1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txttelefono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefono1ActionPerformed(evt);
            }
        });
        txttelefono1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefono1KeyTyped(evt);
            }
        });

        txttelefono2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txttelefono2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefono2ActionPerformed(evt);
            }
        });
        txttelefono2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefono2KeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        jLabel2.setText("-");

        pfcontrasena.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pfcontrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfcontrasenaActionPerformed(evt);
            }
        });
        pfcontrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pfcontrasenaKeyTyped(evt);
            }
        });

        pfconfirmarcont.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pfconfirmarcont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfconfirmarcontActionPerformed(evt);
            }
        });
        pfconfirmarcont.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pfconfirmarcontKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pfconfirmarcontKeyTyped(evt);
            }
        });

        cbsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FEMENINO", "MASCULINO" }));
        cbsexo.setSelectedIndex(-1);
        cbsexo.setBorder(null);
        cbsexo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbsexoItemStateChanged(evt);
            }
        });

        codigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        codigo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblmensaje.setForeground(new java.awt.Color(255, 51, 51));
        lblmensaje.setText("La Contraseña no coincide ");

        lblsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton salir.gif"))); // NOI18N
        lblsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblsalirMouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel16.setText("Cargo");

        txtcontraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Consultar.png"))); // NOI18N
        Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        bnnuevo.setBackground(new java.awt.Color(255, 255, 51));
        bnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/new.png"))); // NOI18N
        bnnuevo.setBorder(null);
        bnnuevo.setBorderPainted(false);
        bnnuevo.setContentAreaFilled(false);
        bnnuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bnnuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bnnuevo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/new_1.png"))); // NOI18N
        bnnuevo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/new_2.png"))); // NOI18N
        bnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnnuevoActionPerformed(evt);
            }
        });

        bncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        bncancelar.setBorder(null);
        bncancelar.setBorderPainted(false);
        bncancelar.setContentAreaFilled(false);
        bncancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bncancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bncancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar1.png"))); // NOI18N
        bncancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar2.png"))); // NOI18N
        bncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bncancelarActionPerformed(evt);
            }
        });

        bnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/add_user.png"))); // NOI18N
        bnguardar.setToolTipText("");
        bnguardar.setBorder(null);
        bnguardar.setBorderPainted(false);
        bnguardar.setContentAreaFilled(false);
        bnguardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/add_user_1.png"))); // NOI18N
        bnguardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/add_user_2.png"))); // NOI18N
        bnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnguardarActionPerformed(evt);
            }
        });

        bnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modificar.png"))); // NOI18N
        bnmodificar.setBorder(null);
        bnmodificar.setBorderPainted(false);
        bnmodificar.setContentAreaFilled(false);
        bnmodificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bnmodificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modificar1.png"))); // NOI18N
        bnmodificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modificar2.png"))); // NOI18N
        bnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnmodificarActionPerformed(evt);
            }
        });

        bneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/delete_user.png"))); // NOI18N
        bneliminar.setBorder(null);
        bneliminar.setBorderPainted(false);
        bneliminar.setContentAreaFilled(false);
        bneliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bneliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bneliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/delete_user_1.png"))); // NOI18N
        bneliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/delete_user_2.png"))); // NOI18N
        bneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bneliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bnguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bncancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnnuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bnmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(bnnuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bnmodificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bneliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Imgpersona.jpg"))); // NOI18N

        cbcargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcargoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(32, 32, 32)
                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Buscar)
                        .addGap(29, 29, 29)
                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(4, 4, 4)
                        .addComponent(cbcargo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(idcargo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dcfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(cbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txttelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txttelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(pfcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(10, 10, 10)
                        .addComponent(pfconfirmarcont, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(lblmensaje)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(lblsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbcargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idcargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel10))
                    .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel11)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dcfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(pfcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel20))
                    .addComponent(pfconfirmarcont, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(lblmensaje))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addComponent(lblsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaActionPerformed
        cbcargo.requestFocus();
    }//GEN-LAST:event_txtcedulaActionPerformed

    private void txtcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyTyped
        //Validar solo numeros del rango 1 al 10
        if(txtcedula.getText().length()==10){
            evt.consume();
        }
        char c=evt.getKeyChar();
        if (c<'0'|| c>'9' ){
            evt.consume();
        }
    }//GEN-LAST:event_txtcedulaKeyTyped

    private void txtnombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombresActionPerformed
        txtapellidos.requestFocus();
    }//GEN-LAST:event_txtnombresActionPerformed

    private void txtnombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombresKeyTyped
        //Validar hasta el rango de acuerdo a la base de datos "limite 50"
        if(txtnombres.getText().length() == 50){
            evt.consume();
        }
        //Validar solo letras
        char c = evt.getKeyChar();
        if((c < 'a' || c > 'z') && (c< 'A' || c > 'Z')&&(c!=32)){
            evt.consume();
        }
        
    }//GEN-LAST:event_txtnombresKeyTyped

    private void txtapellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidosActionPerformed
        dcfecha.requestFocus();
    }//GEN-LAST:event_txtapellidosActionPerformed

    private void txtapellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidosKeyTyped
        //Validar hasta el rango de acuerdo a la base de datos "limite 50"
        if(txtapellidos.getText().length() == 50){
            evt.consume();
        }
        //Validar solo letras
        char c = evt.getKeyChar();
        if((c < 'a' || c > 'z') && (c< 'A' || c > 'Z')&&(c!=32)){
            evt.consume();
        }
    }//GEN-LAST:event_txtapellidosKeyTyped

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        txttelefono1.requestFocus();
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void txttelefono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefono1ActionPerformed
        txttelefono2.requestFocus();
    }//GEN-LAST:event_txttelefono1ActionPerformed

    private void txttelefono1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefono1KeyTyped
        //Validar solo numeros y -
        char c=evt.getKeyChar();
        if (c<'0'|| c>'9' ){
            evt.consume();
        }
        //Validar hasta el rando de la base de datos
        if(txttelefono1.getText().length() == 3){
            evt.consume();
        }
    }//GEN-LAST:event_txttelefono1KeyTyped

    private void txttelefono2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefono2ActionPerformed
        pfcontrasena.requestFocus();
    }//GEN-LAST:event_txttelefono2ActionPerformed

    private void txttelefono2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefono2KeyTyped
        //Validar solo numeros y -
        char c=evt.getKeyChar();
        if (c<'0'|| c>'9' ){
            evt.consume();
        }
        //Validar hasta el rando de la base de datos
        String telefono = txttelefono2.getText();
        if(telefono.length() == 6){
            evt.consume();
        }
    }//GEN-LAST:event_txttelefono2KeyTyped

    private void pfcontrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfcontrasenaActionPerformed
        pfconfirmarcont.requestFocus();
    }//GEN-LAST:event_pfcontrasenaActionPerformed

    private void pfcontrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfcontrasenaKeyTyped
        //Validar hasta el rango de la base de datos "4"
        String telefono = pfcontrasena.getText();
        if(telefono.length() == 4){
            evt.consume();
        }
    }//GEN-LAST:event_pfcontrasenaKeyTyped

    private void pfconfirmarcontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfconfirmarcontActionPerformed

    }//GEN-LAST:event_pfconfirmarcontActionPerformed

    private void pfconfirmarcontKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfconfirmarcontKeyReleased
        ConfirmarContraseña();           
    }//GEN-LAST:event_pfconfirmarcontKeyReleased

    private void pfconfirmarcontKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfconfirmarcontKeyTyped
        //Validar hasta el rango de la base de datos "4"
        String telefono = pfconfirmarcont.getText();
        if(telefono.length() == 4){
            evt.consume();
        }
    }//GEN-LAST:event_pfconfirmarcontKeyTyped

    private void cbsexoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbsexoItemStateChanged
        txtdireccion.requestFocus();
    }//GEN-LAST:event_cbsexoItemStateChanged

    private void lblsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsalirMouseClicked
        menu.main(null);
        this.setVisible(false);
    }//GEN-LAST:event_lblsalirMouseClicked

    private void txtdireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyTyped
        //Validar hasta el rango de acuerdo a la base de datos "limite 50"
        if(txtdireccion.getText().length() == 100){
            evt.consume();
        }
        
    }//GEN-LAST:event_txtdireccionKeyTyped

    private void txtcedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyReleased
   
    }//GEN-LAST:event_txtcedulaKeyReleased

    private void bnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnmodificarActionPerformed
          if(txtcedula.getText().equals(" ")|| txtnombres.getText().equals("") ||txtapellidos.getText().equals("") ||
            dcfecha.getDate()==null || cbsexo.getActionCommand().equals("")||
               txtdireccion.getText().equals("")||txttelefono2.getText().equals("")||txtcontraseña.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Falta datos por ingresar","Error",JOptionPane.ERROR_MESSAGE);
        }else
        if(JOptionPane.showConfirmDialog(null,"Actualizar Datos", "Confirmar",1)==0){
            Modificar();
        }
    }//GEN-LAST:event_bnmodificarActionPerformed

    public void Modificar(){
           try {
             cnn=ConexionBD.Open();
             Trabajador t=new  Trabajador();
             t.setCedula(txtcedula.getText());  
             t.setNombres(txtnombres.getText().toUpperCase());
             t.setApellidos(txtapellidos.getText().toUpperCase());
             t.setFecha_nac(Date.valueOf(dcfecha.getDateFormatString()));
             t.setSexo(cbsexo.getSelectedItem().toString());
             t.setDireccion(txtdireccion.getText().toUpperCase());
             t.setTelefono(txttelefono2.getText());
             t.setContraseña(txtcontraseña.getText().toUpperCase());
             t.setId_cargo(Integer.parseInt(idcargo.getText()));
             td.modificarTrabajador(t);
             Limpiar();
         Limpiar();
           } catch (SQLException ex) {}
         
    }
    private void bneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bneliminarActionPerformed
//        Eliminar();
    }//GEN-LAST:event_bneliminarActionPerformed

    private void bnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnguardarActionPerformed
        
        if(txtcedula.getText().length()<10){
            JOptionPane.showMessageDialog(null, "Digitos Incompletos","Error",JOptionPane.ERROR_MESSAGE);
            txtcedula.requestFocus();
        }else{
            if(txtcedula.getText().equals("")||txtnombres.getText().equals("") ||txtapellidos.getText().equals("") ||
            dcfecha.getDate()==null || cbsexo.getActionCommand().equals("")||
               txtdireccion.getText().equals("")|| txttelefono1.getText().equals("")||txttelefono2.getText().equals("")||
                pfcontrasena.getText().equals(" ")){
            JOptionPane.showMessageDialog(null, "Falta datos por ingresar","Error",JOptionPane.ERROR_MESSAGE);
        }else
        if(JOptionPane.showConfirmDialog(null,"Guardar Datos", "Confirmar",1)==0){
            guardar();
        }
            
        }
                
    }//GEN-LAST:event_bnguardarActionPerformed

     //----- GUARDAR -----
    public void guardar(){
         try {
             cnn=ConexionBD.Open();
             Trabajador t =new Trabajador();
             t.setCedula(txtcedula.getText());  
             t.setNombres(txtnombres.getText().toUpperCase());
             t.setApellidos(txtapellidos.getText().toUpperCase());
             t.setFecha_nac(Date.valueOf(dcfecha.getDateFormatString()));
             t.setSexo(cbsexo.getSelectedItem().toString());
             t.setDireccion(txtdireccion.getText().toUpperCase());
             t.setTelefono(txttelefono2.getText());
             t.setContraseña(txtcontraseña.getText().toUpperCase());
             t.setId_cargo(Integer.parseInt(idcargo.getText()));
             td.ingresarTrabajador(t);
             Limpiar();
             } catch (SQLException ex) {} 
    }
    private void BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseClicked
//        ConsultarTrabajador();
        
    }//GEN-LAST:event_BuscarMouseClicked

    private void bnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnnuevoActionPerformed
 
        Limpiar();
        Habilitar();
        txtcontraseña.setVisible(false);
        bnnuevo.setVisible(false);Buscar.setEnabled(false);
        bnguardar.setVisible(true); bncancelar.setVisible(true);
//        CodigoTrabajador();
    }//GEN-LAST:event_bnnuevoActionPerformed

    private void bncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bncancelarActionPerformed

       if(JOptionPane.showConfirmDialog(null, "Desea Cancelar", "Error", JOptionPane.ERROR_MESSAGE)==0){
            Desabilitar();
            bncancelar.setVisible(false);bnguardar.setVisible(false);
            bnmodificar.setVisible(false); bneliminar.setVisible(false);
            bnnuevo.setVisible(true);Buscar.setEnabled(true);
            Limpiar();
            txtcedula.requestFocus();
        }
    }//GEN-LAST:event_bncancelarActionPerformed

    private void cbcargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcargoActionPerformed
        try {
             // TODO add your handling code here:
             cnn=ConexionBD.Open();
             try{
              Statement stm = cnn.createStatement();
              String sql= "select id_cargo from cargo where cargo= '"+ cbcargo.getSelectedItem().toString()+"'";
              ResultSet rs = stm.executeQuery(sql);
              rs.next();
              idcargo.setText(Integer.toString(rs.getInt(1)));
            
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
            }
         } catch (SQLException ex) {} 
    }//GEN-LAST:event_cbcargoActionPerformed

    //------- TIPOS DE CONSULTA EN LA BASE DE DATOS -----------
    public void ConsultarTrabajador(){
           //Buscar Trabajadores
        String consulta = " select e.id_trabajador, e.cedula, e.nombres, e.apellidos, e.fecha_nac, e.sexo, e.direccion,"
                + " e.telefono, e.contraseña, c.cargo from trabajador e "
                + " inner join cargo c on c.id_cargo=e.id_carg "
                + "where e.cedula='"+txtcedula.getText()+"'";
        
        try {
            Statement stm= cnn.createStatement();
            ResultSet rs=stm.executeQuery(consulta);
            if(rs.next()){
                this.codigo.setText(rs.getString(1));
                this.txtnombres.setText(rs.getString(3));
                this.txtapellidos.setText(rs.getString(4));
                this.dcfecha.setDate(rs.getDate(5));
                this.cbsexo.setSelectedItem(rs.getString(6));
                this.txtdireccion.setText(rs.getString(7));
                this.txttelefono2.setText(rs.getString(8));
                this.txtcontraseña.setText(rs.getString(9));
                this.cbcargo.setSelectedItem(rs.getString(10));
                
                this.Habilitar();
                txttelefono1.setVisible(false);jLabel2.setVisible(false);
                bnnuevo.setVisible(false);Buscar.setEnabled(false);
                pfcontrasena.setVisible(false);pfconfirmarcont.setVisible(false);jLabel20.setVisible(false);
                bnmodificar.setVisible(true);bneliminar.setVisible(true);bncancelar.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "NO EXISTE EN LA BASE DE DATOS","MENSAJE", JOptionPane.QUESTION_MESSAGE);
                Limpiar();
                bnmodificar.setVisible(false);bneliminar.setVisible(false);bncancelar.setVisible(false);
                bnnuevo.setVisible(true);
                txtcedula.requestFocus(true);
            }
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
   
//    public void CodigoTrabajador(){
//        String consulta = "SELECT id_trabajador  FROM trabajador order by id_trabajador desc";
//       try {
//            Statement stm = conex.createStatement();
//            ResultSet rs = stm.executeQuery(consulta);
//                if(rs.next()){
//                   codigo.setText(Integer.toString(Integer.parseInt(rs.getString(1))+1));
//                }      
//       }
//       catch (SQLException e) {
//           System.out.println(e.getMessage());
//       } 
//
//    }
    
    //--------- CONFIRMAR LA CONTRASEÑA SI ES CORRECTA O NO -----------
    public void ConfirmarContraseña(){
         if(pfconfirmarcont.getText().length()==4){ 
            if(pfconfirmarcont.getText().equals(pfcontrasena.getText())){
                bnguardar.requestFocus();
            }else{
                lblmensaje.setVisible(true);
                pfconfirmarcont.requestFocus();  
            }
          
        }
        if(pfconfirmarcont.getText().equals("")){
            lblmensaje.setVisible(false);
        }
    }
    public void Habilitar(){
         //Cajas de texto
        txtcedula.setEnabled(true);
        cbcargo.setEnabled(true);
        txtnombres.setEnabled(true);
        txtapellidos.setEnabled(true);
        dcfecha.setEnabled(true);
        cbsexo.setEnabled(true);
        txtdireccion.setEnabled(true);
        txttelefono1.setEnabled(true);
        txttelefono2.setEnabled(true);
        pfcontrasena.setEnabled(true);
        pfconfirmarcont.setEnabled(true);
        txtcontraseña.setEnabled(true);
        txtcontraseña.setVisible(true);

    }
    public void Desabilitar(){
         //Cajas de texto
        txtcedula.setEnabled(true);
        cbcargo.setEnabled(false);
        txtnombres.setEnabled(false);
        txtapellidos.setEnabled(false);
        dcfecha.setEnabled(false);
        cbsexo.setEnabled(false);
        txtdireccion.setEnabled(false);
        txttelefono1.setEnabled(false);
        txttelefono2.setEnabled(false);
        pfcontrasena.setEnabled(false);
        pfconfirmarcont.setEnabled(false);
        txtcontraseña.setEnabled(false);
        
        txtcontraseña.setVisible(false);
    }
    public void Limpiar(){
       codigo.setText("");
       cbcargo.setSelectedIndex(-1);
       txtcedula.setText("");
       txtnombres.setText("");
       txtapellidos.setText("");
       dcfecha.setDate(null);
       cbsexo.setSelectedIndex(-1);
       txtdireccion.setText("");
       txttelefono1.setText("");
       txttelefono2.setText("");
       pfcontrasena.setText("");
       pfconfirmarcont.setText(""); 
       txtcontraseña.setText(" ");
    }
    //------- CONVERTIDOR DE FECHA  ------------
    public java.sql.Date Convertirfecha(){
        java.sql.Date fecha = new   java.sql.Date(dcfecha.getDate().getTime());
        return fecha;
    }
     trabajadordao td=new trabajadordao();
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
            java.util.logging.Logger.getLogger(formulariotrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulariotrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulariotrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulariotrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulariotrabajador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Buscar;
    private javax.swing.JToggleButton bncancelar;
    private javax.swing.JToggleButton bneliminar;
    private javax.swing.JToggleButton bnguardar;
    private javax.swing.JToggleButton bnmodificar;
    private javax.swing.JToggleButton bnnuevo;
    private javax.swing.JComboBox<String> cbcargo;
    private javax.swing.JComboBox<String> cbsexo;
    private javax.swing.JLabel codigo;
    private com.toedter.calendar.JDateChooser dcfecha;
    private javax.swing.JTextField idcargo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblmensaje;
    private javax.swing.JLabel lblsalir;
    private javax.swing.JPasswordField pfconfirmarcont;
    private javax.swing.JPasswordField pfcontrasena;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcontraseña;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txttelefono1;
    private javax.swing.JTextField txttelefono2;
    // End of variables declaration//GEN-END:variables
}
