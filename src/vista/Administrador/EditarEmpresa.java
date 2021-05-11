package vista.Administrador;
import vista.*;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

public class EditarEmpresa extends javax.swing.JFrame {

    public EditarEmpresa() {
        initComponents();
        
    }
    public String username = "";
    
    public EditarEmpresa(String usuario) {
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
        btn_admEmpleados = new javax.swing.JButton();
        btn_informes = new javax.swing.JButton();
        btn_admEmpresa = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        btn_guardarCambios = new javax.swing.JButton();
        btn_Volver = new javax.swing.JButton();
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

        btn_admEmpleados.setBackground(new java.awt.Color(12, 140, 153));
        btn_admEmpleados.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_admEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        btn_admEmpleados.setText("Adm.Empleados");
        btn_admEmpleados.setBorderPainted(false);
        btn_admEmpleados.setFocusPainted(false);
        btn_admEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_admEmpleadosActionPerformed(evt);
            }
        });

        btn_informes.setBackground(new java.awt.Color(12, 140, 153));
        btn_informes.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_informes.setForeground(new java.awt.Color(255, 255, 255));
        btn_informes.setText("Informes");
        btn_informes.setBorderPainted(false);
        btn_informes.setFocusPainted(false);
        btn_informes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_informesActionPerformed(evt);
            }
        });

        btn_admEmpresa.setBackground(new java.awt.Color(12, 140, 153));
        btn_admEmpresa.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_admEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        btn_admEmpresa.setText("Adm. Empresa");
        btn_admEmpresa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));
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
                .addComponent(btn_admEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_admEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_informes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        colorBotonTopLayout.setVerticalGroup(
            colorBotonTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_admCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
            .addComponent(btn_admProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_ordenPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_informes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_admBoleta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_admEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_admEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(181, 213, 212));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Editar Informacion Empresa");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Datos Empresa");

        jPanel1.setBackground(new java.awt.Color(181, 213, 212));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Rut");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Razón social");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Dirección casa matriz");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        btn_guardarCambios.setBackground(new java.awt.Color(0, 102, 0));
        btn_guardarCambios.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_guardarCambios.setForeground(new java.awt.Color(240, 240, 240));
        btn_guardarCambios.setText("Guardar cambios");

        btn_Volver.setBackground(new java.awt.Color(204, 0, 0));
        btn_Volver.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_Volver.setForeground(new java.awt.Color(255, 255, 255));
        btn_Volver.setText("Volver");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(423, 423, 423)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(btn_guardarCambios)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardarCambios, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btn_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(221, 221, 221))
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

    private void btn_admEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_admEmpleadosActionPerformed
        this.dispose();
        AdmEmpleados ventanaEmpleados = new AdmEmpleados(username);
        ventanaEmpleados.setVisible(true);          
    }//GEN-LAST:event_btn_admEmpleadosActionPerformed

    private void btn_admEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_admEmpresaActionPerformed
        AdmEmpresa ventanaEmpresa = new AdmEmpresa(username);
        ventanaEmpresa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_admEmpresaActionPerformed

    private void btn_ordenPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordenPedidoActionPerformed
        AdmOrden ventanaOrden = new AdmOrden(username);
        ventanaOrden.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ordenPedidoActionPerformed

    private void btn_admBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_admBoletaActionPerformed
        this.dispose();
        AdmBoleta ventanaBoleta = new AdmBoleta(username);
        ventanaBoleta.setVisible(true);
    }//GEN-LAST:event_btn_admBoletaActionPerformed

    private void btn_informesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_informesActionPerformed
        this.dispose();
        Informe ventanaInformes = new Informe(username);
        ventanaInformes.setVisible(true);
    }//GEN-LAST:event_btn_informesActionPerformed

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
            java.util.logging.Logger.getLogger(EditarEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Volver;
    private javax.swing.JButton btn_admBoleta;
    private javax.swing.JButton btn_admCliente;
    private javax.swing.JButton btn_admEmpleados;
    private javax.swing.JButton btn_admEmpresa;
    private javax.swing.JButton btn_admProveedor;
    private javax.swing.JButton btn_guardarCambios;
    private javax.swing.JButton btn_informes;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_ordenPedido;
    private javax.swing.JButton btn_regCliente1;
    private javax.swing.JButton btn_resHora1;
    private javax.swing.JPanel colorBotonTop;
    private javax.swing.JPanel colorTop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lbl_usuario;
    // End of variables declaration//GEN-END:variables
}
