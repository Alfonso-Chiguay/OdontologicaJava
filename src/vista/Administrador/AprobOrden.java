package vista.Administrador;
import vista.*;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import vista.Administrador.AdmCliente;
import vista.Administrador.AdmProveedor;
import vista.Administrador.AdmOrden;

public class AprobOrden extends javax.swing.JFrame {

    public AprobOrden() {
        initComponents();
        
    }
    public String username = "";
    
    public AprobOrden(String usuario) {
        initComponents();
        username = usuario;
        //Caracteristicas de la ventana
        lbl_usuario.setText(lbl_usuario.getText().replace("(usuario)", usuario));
        lbl_usuario.setHorizontalAlignment(SwingConstants.RIGHT);
        this.setResizable(false);
        this.setTitle("Clinica Odontológica Linda Sonrisa | Menú Administrador");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo.png")));
        
        //Asignar colores a los botones
        btn_admCliente.setBackground(colorBotonTop.getBackground());
        btn_admProveedor.setBackground(colorBotonTop.getBackground());
        btn_ordenPedido.setBackground(colorBotonTop.getBackground());
        btn_logout.setBackground(colorTop.getBackground());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_regCliente1 = new javax.swing.JButton();
        btn_resHora1 = new javax.swing.JButton();
        colorTop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        colorBotonTop = new javax.swing.JPanel();
        btn_admCliente = new javax.swing.JButton();
        btn_admProveedor = new javax.swing.JButton();
        btn_ordenPedido = new javax.swing.JButton();
        btn_admBoleta = new javax.swing.JButton();
        btn_admEmpleado = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_admEmpresa = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_orden = new javax.swing.JTable();
        btn_aprobar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn_aprobar1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();

        btn_regCliente1.setBackground(new java.awt.Color(12, 140, 153));
        btn_regCliente1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_regCliente1.setForeground(new java.awt.Color(255, 255, 255));
        btn_regCliente1.setText("Registrar cliente");
        btn_regCliente1.setBorderPainted(false);
        btn_regCliente1.setFocusPainted(false);
        btn_regCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regCliente1ActionPerformed(evt);
            }
        });

        btn_resHora1.setBackground(new java.awt.Color(12, 140, 153));
        btn_resHora1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_resHora1.setForeground(new java.awt.Color(255, 255, 255));
        btn_resHora1.setText("Reserva de hora");
        btn_resHora1.setBorderPainted(false);
        btn_resHora1.setFocusPainted(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1270, 720));

        colorTop.setBackground(new java.awt.Color(17, 175, 191));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Clínica Odontológica Linda Sonrisa");

        colorBotonTop.setBackground(new java.awt.Color(12, 140, 153));

        btn_admCliente.setBackground(new java.awt.Color(12, 140, 153));
        btn_admCliente.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_admCliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_admCliente.setText("Adm. Cliente");
        btn_admCliente.setBorderPainted(false);
        btn_admCliente.setFocusPainted(false);
        btn_admCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_admClienteActionPerformed(evt);
            }
        });

        btn_admProveedor.setBackground(new java.awt.Color(12, 140, 153));
        btn_admProveedor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_admProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btn_admProveedor.setText("Adm. Proveedor");
        btn_admProveedor.setBorderPainted(false);
        btn_admProveedor.setFocusPainted(false);
        btn_admProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_admProveedorActionPerformed(evt);
            }
        });

        btn_ordenPedido.setBackground(new java.awt.Color(12, 140, 153));
        btn_ordenPedido.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_ordenPedido.setForeground(new java.awt.Color(255, 255, 255));
        btn_ordenPedido.setText("Adm. Orden de pedido");
        btn_ordenPedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));
        btn_ordenPedido.setFocusPainted(false);
        btn_ordenPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ordenPedidoActionPerformed(evt);
            }
        });

        btn_admBoleta.setBackground(new java.awt.Color(12, 140, 153));
        btn_admBoleta.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_admBoleta.setForeground(new java.awt.Color(255, 255, 255));
        btn_admBoleta.setText("Adm. Boleta de servicio");
        btn_admBoleta.setBorderPainted(false);
        btn_admBoleta.setFocusPainted(false);

        btn_admEmpleado.setBackground(new java.awt.Color(12, 140, 153));
        btn_admEmpleado.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_admEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btn_admEmpleado.setText("Adm. Empleados");
        btn_admEmpleado.setBorderPainted(false);
        btn_admEmpleado.setFocusPainted(false);
        btn_admEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_admEmpleadoActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(12, 140, 153));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Informes");
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);

        btn_admEmpresa.setBackground(new java.awt.Color(12, 140, 153));
        btn_admEmpresa.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_admEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        btn_admEmpresa.setText("Adm. Empresa");
        btn_admEmpresa.setBorderPainted(false);
        btn_admEmpresa.setFocusPainted(false);
        btn_admEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_admEmpresaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout colorBotonTopLayout = new javax.swing.GroupLayout(colorBotonTop);
        colorBotonTop.setLayout(colorBotonTopLayout);
        colorBotonTopLayout.setHorizontalGroup(
            colorBotonTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorBotonTopLayout.createSequentialGroup()
                .addComponent(btn_admCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_admProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_ordenPedido)
                .addGap(0, 0, 0)
                .addComponent(btn_admBoleta)
                .addGap(0, 0, 0)
                .addComponent(btn_admEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_admEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
        );
        colorBotonTopLayout.setVerticalGroup(
            colorBotonTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_admCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
            .addComponent(btn_admProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_ordenPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_admBoleta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_admEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_admEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(181, 213, 212));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("N° Pedido");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        tbl_orden.setBackground(new java.awt.Color(240, 240, 240));
        tbl_orden.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tbl_orden.setForeground(new java.awt.Color(240, 240, 240));
        tbl_orden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Detalle", "Cantidad ", "Costo"
            }
        ));
        jScrollPane1.setViewportView(tbl_orden);

        btn_aprobar.setBackground(new java.awt.Color(204, 0, 0));
        btn_aprobar.setText("Rechazar");

        jButton2.setBackground(new java.awt.Color(17, 175, 191));
        jButton2.setText("Aprobar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btn_aprobar1.setBackground(new java.awt.Color(102, 0, 0));
        btn_aprobar1.setText("Anular");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Resumen orden de pedido ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btn_aprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_aprobar1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(414, 414, 414))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_aprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_aprobar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(234, 234, 234))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        lbl_usuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuario.setText("Bienvenido, (usuario)");
        lbl_usuario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        btn_logout.setBackground(new java.awt.Color(17, 175, 191));
        btn_logout.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout.setText("Cerrar sesión");
        btn_logout.setBorderPainted(false);
        btn_logout.setFocusPainted(false);
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout colorTopLayout = new javax.swing.GroupLayout(colorTop);
        colorTop.setLayout(colorTopLayout);
        colorTopLayout.setHorizontalGroup(
            colorTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, colorTopLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGroup(colorTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(colorTopLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, colorTopLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_logout))))
            .addComponent(colorBotonTop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, colorTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        colorTopLayout.setVerticalGroup(
            colorTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorTopLayout.createSequentialGroup()
                .addGroup(colorTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, colorTopLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36))
                    .addGroup(colorTopLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(colorTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(colorTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_usuario)
                                .addComponent(btn_logout))
                            .addComponent(jLabel3))
                        .addGap(10, 10, 10)))
                .addComponent(colorBotonTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(colorTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(colorTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_admClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_admClienteActionPerformed
        AdmCliente ventanaCliente = new AdmCliente(username);
        ventanaCliente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_admClienteActionPerformed

    private void btn_regCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_regCliente1ActionPerformed

    private void btn_admProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_admProveedorActionPerformed
        AdmProveedor ventanaProveedor = new AdmProveedor(username);
        ventanaProveedor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_admProveedorActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        this.dispose();
        Login ventanaLogin = new Login();
        ventanaLogin.setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_admEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_admEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_admEmpleadoActionPerformed

    private void btn_admEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_admEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_admEmpresaActionPerformed

    private void btn_ordenPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordenPedidoActionPerformed
        AdmOrden ventanaOrden = new AdmOrden(username);
        ventanaOrden.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ordenPedidoActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AprobOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AprobOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AprobOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AprobOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AprobOrden().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_admBoleta;
    private javax.swing.JButton btn_admCliente;
    private javax.swing.JButton btn_admEmpleado;
    private javax.swing.JButton btn_admEmpresa;
    private javax.swing.JButton btn_admProveedor;
    private javax.swing.JButton btn_aprobar;
    private javax.swing.JButton btn_aprobar1;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_ordenPedido;
    private javax.swing.JButton btn_regCliente1;
    private javax.swing.JButton btn_resHora1;
    private javax.swing.JPanel colorBotonTop;
    private javax.swing.JPanel colorTop;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JTable tbl_orden;
    // End of variables declaration//GEN-END:variables
}
