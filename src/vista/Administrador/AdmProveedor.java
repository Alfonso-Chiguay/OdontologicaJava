package vista.Administrador;
import vista.*;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import modelo.Empleado;



public class AdmProveedor extends javax.swing.JFrame {

    public AdmProveedor() {
        initComponents();
        
    }
    public Empleado empleado;
    
    public AdmProveedor(Empleado emp) {
        initComponents();
        empleado = emp;
        //Caracteristicas de la ventana
        lbl_usuario.setText(lbl_usuario.getText().replace("(usuario)", emp.getUsuario()));
        lbl_usuario.setHorizontalAlignment(SwingConstants.RIGHT);
        this.setResizable(false);
        this.setTitle("Clinica Odontológica Linda Sonrisa | Menú Administrador | Administrar Proveedor");
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

        colorTop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        colorBotonTop = new javax.swing.JPanel();
        btn_admCliente = new javax.swing.JButton();
        btn_admProveedor = new javax.swing.JButton();
        btn_ordenPedido = new javax.swing.JButton();
        btn_admBoleta = new javax.swing.JButton();
        btn_admEmpleado = new javax.swing.JButton();
        btn_Informe = new javax.swing.JButton();
        btn_admEmpresa = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn_editarProveedor = new javax.swing.JButton();
        btn_crearProveedor = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();

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
        btn_admProveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0), 3));
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
        btn_ordenPedido.setBorderPainted(false);
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
        btn_admBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_admBoletaActionPerformed(evt);
            }
        });

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

        btn_Informe.setBackground(new java.awt.Color(12, 140, 153));
        btn_Informe.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_Informe.setForeground(new java.awt.Color(255, 255, 255));
        btn_Informe.setText("Informes");
        btn_Informe.setBorderPainted(false);
        btn_Informe.setFocusPainted(false);
        btn_Informe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InformeActionPerformed(evt);
            }
        });

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
                .addComponent(btn_Informe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        colorBotonTopLayout.setVerticalGroup(
            colorBotonTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_admCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
            .addComponent(btn_admProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_ordenPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_Informe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_admBoleta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_admEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_admEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(181, 213, 212));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        btn_editarProveedor.setBackground(new java.awt.Color(12, 140, 153));
        btn_editarProveedor.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_editarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btn_editarProveedor.setText("Editar/Eliminar");
        btn_editarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarProveedorActionPerformed(evt);
            }
        });

        btn_crearProveedor.setBackground(new java.awt.Color(12, 140, 153));
        btn_crearProveedor.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_crearProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btn_crearProveedor.setText("Crear Proveedor");
        btn_crearProveedor.setActionCommand("");
        btn_crearProveedor.setAutoscrolls(true);
        btn_crearProveedor.setBorderPainted(false);
        btn_crearProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_crearProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_crearProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(496, 496, 496))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(btn_crearProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btn_editarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
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
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        AdmCliente ventanaCliente = new AdmCliente(empleado);
        ventanaCliente.setVisible(true);
        this.dispose();      
    }//GEN-LAST:event_btn_admClienteActionPerformed

    private void btn_admProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_admProveedorActionPerformed
        this.dispose();
        AdmProveedor ventanaProveedor = new AdmProveedor(empleado);
        ventanaProveedor.setVisible(true);
        
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

    private void btn_crearProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearProveedorActionPerformed
        this.dispose();
        CrearProveedor ventana = new CrearProveedor(empleado);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_crearProveedorActionPerformed

    private void btn_editarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarProveedorActionPerformed
        this.dispose();
        EditarProveedor ventana = new EditarProveedor(empleado);
        ventana.setVisible(true);
        
    }//GEN-LAST:event_btn_editarProveedorActionPerformed

    private void btn_ordenPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordenPedidoActionPerformed
        this.dispose();
        AdmOrden ventana = new AdmOrden(empleado);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_ordenPedidoActionPerformed

    private void btn_admBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_admBoletaActionPerformed
        this.dispose();
        AdmBoleta ventanaBoleta = new AdmBoleta(empleado);
        ventanaBoleta.setVisible(true);
    }//GEN-LAST:event_btn_admBoletaActionPerformed

    private void btn_InformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InformeActionPerformed
        Informe ventanaInforme = new Informe(empleado);
        ventanaInforme.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_InformeActionPerformed

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
            java.util.logging.Logger.getLogger(AdmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdmProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Informe;
    private javax.swing.JButton btn_admBoleta;
    private javax.swing.JButton btn_admCliente;
    private javax.swing.JButton btn_admEmpleado;
    private javax.swing.JButton btn_admEmpresa;
    private javax.swing.JButton btn_admProveedor;
    private javax.swing.JButton btn_crearProveedor;
    private javax.swing.JButton btn_editarProveedor;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_ordenPedido;
    private javax.swing.JPanel colorBotonTop;
    private javax.swing.JPanel colorTop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_usuario;
    // End of variables declaration//GEN-END:variables
}
