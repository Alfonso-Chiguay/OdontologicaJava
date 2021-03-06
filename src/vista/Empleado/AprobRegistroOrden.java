package vista.Empleado;
import controlador.ConOrdenPedido;
import java.awt.Color;
import vista.*;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import modelo.Empleado;


public class AprobRegistroOrden extends javax.swing.JFrame {


    public AprobRegistroOrden() {
        initComponents();
    }
   public Empleado empleado;
   public int id_opedido;
   
   public AprobRegistroOrden(Empleado emp) {
        initComponents();
        empleado=emp;
        //Caracteristicas de la ventana
        lbl_usuario.setText(lbl_usuario.getText().replace("(usuario)", emp.getUsuario()));
        lbl_usuario.setHorizontalAlignment(SwingConstants.RIGHT);
        this.setResizable(false);
        this.setTitle("Clinica Odontológica Linda Sonrisa | Menú empleado | Orden de pedido | Gestion orden de pedido");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo.png")));
        
        //Asignar colores a los botones
        btn_regCliente.setBackground(colorBotonTop.getBackground());
        btn_resHora.setBackground(colorBotonTop.getBackground());
        btn_regProveedor.setBackground(colorBotonTop.getBackground());
        btn_logout.setBackground(colorTop.getBackground());
        
        //Anchos de columnas
        TableColumnModel columnModel = tbl_opedido.getColumnModel();
        columnModel.getColumn(0).setMaxWidth(40);
        columnModel.getColumn(1).setMaxWidth(200);
        columnModel.getColumn(2).setMaxWidth(80);
        columnModel.getColumn(3).setMaxWidth(150);
        columnModel.getColumn(4).setMaxWidth(150);
        
        lbl_fechaCreacion.setVisible(false);
        lbl_autor.setVisible(false);
        lbl_estado.setVisible(false);
        lbl_recepcionado.setVisible(false);

        
        tbl_opedido.setBackground(Color.WHITE);
        panel_resumen.setVisible(false);
        panel_resumen.setBackground(jPanel3.getBackground());
        
    }

           

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        colorTop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        colorBotonTop = new javax.swing.JPanel();
        btn_regCliente = new javax.swing.JButton();
        btn_resHora = new javax.swing.JButton();
        btn_regProveedor = new javax.swing.JButton();
        btn_ordenPedido = new javax.swing.JButton();
        btn_genBolServicio = new javax.swing.JButton();
        btn_informe = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_nPedido = new javax.swing.JTextField();
        btn_buscarNPedido = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_aprobar = new javax.swing.JButton();
        btn_rechazar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_opedido = new javax.swing.JTable();
        lbl_estado = new javax.swing.JLabel();
        panel_resumen = new javax.swing.JPanel();
        lbl_autor = new javax.swing.JLabel();
        lbl_fechaCreacion = new javax.swing.JLabel();
        lbl_recepcionado = new javax.swing.JLabel();
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

        btn_regCliente.setBackground(new java.awt.Color(12, 140, 153));
        btn_regCliente.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_regCliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_regCliente.setText("Registrar cliente");
        btn_regCliente.setBorderPainted(false);
        btn_regCliente.setFocusPainted(false);
        btn_regCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regClienteActionPerformed(evt);
            }
        });

        btn_resHora.setBackground(new java.awt.Color(12, 140, 153));
        btn_resHora.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_resHora.setForeground(new java.awt.Color(255, 255, 255));
        btn_resHora.setText("Reserva de hora");
        btn_resHora.setBorderPainted(false);
        btn_resHora.setFocusPainted(false);
        btn_resHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resHoraActionPerformed(evt);
            }
        });

        btn_regProveedor.setBackground(new java.awt.Color(12, 140, 153));
        btn_regProveedor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_regProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btn_regProveedor.setText("Registro proveedor");
        btn_regProveedor.setBorderPainted(false);
        btn_regProveedor.setFocusPainted(false);
        btn_regProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regProveedorActionPerformed(evt);
            }
        });

        btn_ordenPedido.setBackground(new java.awt.Color(12, 140, 153));
        btn_ordenPedido.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_ordenPedido.setForeground(new java.awt.Color(255, 255, 255));
        btn_ordenPedido.setText("Orden de pedido");
        btn_ordenPedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0), 3));
        btn_ordenPedido.setFocusPainted(false);
        btn_ordenPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ordenPedidoActionPerformed(evt);
            }
        });

        btn_genBolServicio.setBackground(new java.awt.Color(12, 140, 153));
        btn_genBolServicio.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_genBolServicio.setForeground(new java.awt.Color(255, 255, 255));
        btn_genBolServicio.setText("Generar boleta de servicio");
        btn_genBolServicio.setBorderPainted(false);
        btn_genBolServicio.setFocusPainted(false);
        btn_genBolServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_genBolServicioActionPerformed(evt);
            }
        });

        btn_informe.setBackground(new java.awt.Color(12, 140, 153));
        btn_informe.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_informe.setForeground(new java.awt.Color(255, 255, 255));
        btn_informe.setText("Informe");
        btn_informe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_informeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout colorBotonTopLayout = new javax.swing.GroupLayout(colorBotonTop);
        colorBotonTop.setLayout(colorBotonTopLayout);
        colorBotonTopLayout.setHorizontalGroup(
            colorBotonTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorBotonTopLayout.createSequentialGroup()
                .addComponent(btn_regCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_resHora, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_regProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_ordenPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_genBolServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_informe, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        colorBotonTopLayout.setVerticalGroup(
            colorBotonTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_regCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
            .addComponent(btn_resHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_regProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_genBolServicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_ordenPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_informe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(181, 213, 212));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("N° Pedido");

        txt_nPedido.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_nPedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nPedidoKeyTyped(evt);
            }
        });

        btn_buscarNPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/searchicon.png"))); // NOI18N
        btn_buscarNPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarNPedidoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Resumen de orden de pedido");

        btn_aprobar.setBackground(new java.awt.Color(17, 175, 191));
        btn_aprobar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_aprobar.setText("Aprobar");
        btn_aprobar.setEnabled(false);
        btn_aprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aprobarActionPerformed(evt);
            }
        });

        btn_rechazar.setBackground(new java.awt.Color(204, 0, 0));
        btn_rechazar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_rechazar.setText("Rechazar");
        btn_rechazar.setEnabled(false);
        btn_rechazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rechazarActionPerformed(evt);
            }
        });

        tbl_opedido.setBackground(new java.awt.Color(240, 240, 240));
        tbl_opedido.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        tbl_opedido.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tbl_opedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Detalle", "Cantidad ", "Costo unit", "Costo total"
            }
        ));
        tbl_opedido.setEnabled(false);
        tbl_opedido.setGridColor(new java.awt.Color(204, 255, 255));
        tbl_opedido.setPreferredSize(new java.awt.Dimension(280, 160));
        tbl_opedido.setSelectionBackground(new java.awt.Color(0, 153, 153));
        jScrollPane1.setViewportView(tbl_opedido);

        lbl_estado.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_estado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_estado.setText("ESTADO");

        lbl_autor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbl_autor.setText("Autor: (autor)");

        lbl_fechaCreacion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbl_fechaCreacion.setText("Fecha creacion: (fecha c)");

        lbl_recepcionado.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbl_recepcionado.setText("Recepcionado: (recepcion)");

        javax.swing.GroupLayout panel_resumenLayout = new javax.swing.GroupLayout(panel_resumen);
        panel_resumen.setLayout(panel_resumenLayout);
        panel_resumenLayout.setHorizontalGroup(
            panel_resumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
            .addGroup(panel_resumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_resumenLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_resumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_fechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_autor, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_recepcionado, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );
        panel_resumenLayout.setVerticalGroup(
            panel_resumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
            .addGroup(panel_resumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_resumenLayout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(lbl_autor)
                    .addGap(0, 0, 0)
                    .addComponent(lbl_fechaCreacion)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_recepcionado, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_aprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_rechazar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(panel_resumen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_nPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_buscarNPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(314, 314, 314)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_buscarNPedido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_nPedido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel_resumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_aprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_rechazar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        lbl_usuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuario.setText("Bienvenido, (usuario)");

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
            .addGroup(colorTopLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGroup(colorTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(colorTopLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, colorTopLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_logout)
                        .addGap(30, 30, 30))))
            .addGroup(colorTopLayout.createSequentialGroup()
                .addComponent(colorBotonTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        colorTopLayout.setVerticalGroup(
            colorTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorTopLayout.createSequentialGroup()
                .addGroup(colorTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(colorTopLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, colorTopLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(5, 5, 5)
                        .addGroup(colorTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_usuario)
                            .addComponent(btn_logout))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colorBotonTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(colorTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(colorTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regClienteActionPerformed
        this.dispose();
        MenuRegCliente ventanaRegistro = new MenuRegCliente(empleado);
        ventanaRegistro.setVisible(true);
    }//GEN-LAST:event_btn_regClienteActionPerformed

    private void btn_resHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resHoraActionPerformed
       ReservaHora ventanaReserva = new ReservaHora(empleado);
       ventanaReserva.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btn_resHoraActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        this.dispose();
        Login ventanaLogin = new Login();
        ventanaLogin.setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_informeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_informeActionPerformed
        this.dispose();
        RegistrarInforme ventanaRegInfo = new RegistrarInforme(empleado);
        ventanaRegInfo.setVisible(true);
    }//GEN-LAST:event_btn_informeActionPerformed

    private void btn_regProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regProveedorActionPerformed
        this.dispose();
        RegistroProv ventanaRegprov = new RegistroProv(empleado);
        ventanaRegprov.setVisible(true);
    }//GEN-LAST:event_btn_regProveedorActionPerformed

    private void btn_ordenPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordenPedidoActionPerformed
        this.dispose();
        RegistrarOrden ventanaOrdenped = new RegistrarOrden(empleado);
        ventanaOrdenped.setVisible(true);
    }//GEN-LAST:event_btn_ordenPedidoActionPerformed

    private void buscarNPedido(){
        int npedido = Integer.parseInt(txt_nPedido.getText());
        ConOrdenPedido controlador = new ConOrdenPedido();
        ArrayList<Object[]> lista = controlador.obtenerOPedido(npedido);
        DefaultTableModel table = (DefaultTableModel) tbl_opedido.getModel();
        table.setRowCount(0);
        boolean existe=false;
        for(Object[] o: lista){
            if(!((String)o[0]).equals("NO EXISTE")){
                existe=true;
                lbl_fechaCreacion.setVisible(true);
                lbl_autor.setVisible(true);
                lbl_estado.setVisible(true);
                lbl_recepcionado.setVisible(true);

                panel_resumen.setVisible(true);
                
                lbl_autor.setText("Autor: "+(String)o[0]);
                lbl_fechaCreacion.setText("Fecha creacion: "+(String)o[2]);
                lbl_recepcionado.setText("Recepcionado: "+(String)o[1]);
                
                //P=Pendiente, R=Rechazado, A=Aprobado
                if(((String)o[3]).equals("P")){
                    lbl_estado.setText("PENDIENTE");
                    lbl_estado.setForeground(Color.yellow);
                    btn_aprobar.setEnabled(true);
                    btn_rechazar.setEnabled(true);
                    btn_aprobar.setVisible(true);
                    btn_rechazar.setVisible(true);
                }
                else if(((String)o[3]).equals("A")){
                    lbl_estado.setText("APROBADO");
                    lbl_estado.setForeground(colorTop.getBackground());
                    btn_aprobar.setVisible(false);
                    btn_rechazar.setVisible(false);
                }
                else{
                    lbl_estado.setText("RECHAZADO");
                    lbl_estado.setForeground(Color.red);
                    btn_aprobar.setVisible(false);
                    btn_rechazar.setVisible(false);
                }
                
                Object[] fila = {
                    (int)o[4],
                    (String)o[8],
                    (int)o[5],
                    (int)o[6],
                    (int)o[7]                    
                };
                
                table.addRow(fila);
            }
        }
        
        if(!existe){
            lbl_fechaCreacion.setVisible(false);
            lbl_autor.setVisible(false);
            lbl_estado.setVisible(false);
            lbl_recepcionado.setVisible(false);
            panel_resumen.setVisible(false);
        }
        else{
            id_opedido=npedido;
        }
    }
    
    private void btn_buscarNPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarNPedidoActionPerformed
        buscarNPedido();                   
                
    }//GEN-LAST:event_btn_buscarNPedidoActionPerformed

    private void btn_aprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aprobarActionPerformed
        ConOrdenPedido controlador = new ConOrdenPedido();
        if(controlador.aprobarRechazar(id_opedido, "A")==1){
            JOptionPane.showMessageDialog(this, "La orden n° "+String.valueOf(id_opedido)+" se ha marcado como aprobada y recepcionada");
            buscarNPedido();     
        }
        else{
            JOptionPane.showMessageDialog(this, "Hubo un problema aprobando la orden, por favor pongase en contacto con el departamento de informatica");
        }
    }//GEN-LAST:event_btn_aprobarActionPerformed

    private void btn_genBolServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_genBolServicioActionPerformed
        this.dispose();
        RegistrarBoleta ventanaRegBol = new  RegistrarBoleta(empleado);
        ventanaRegBol.setVisible(true);
    }//GEN-LAST:event_btn_genBolServicioActionPerformed

    private void txt_nPedidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nPedidoKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))) evt.consume();  
    }//GEN-LAST:event_txt_nPedidoKeyTyped

    private void btn_rechazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rechazarActionPerformed
        ConOrdenPedido controlador = new ConOrdenPedido();
        if(controlador.aprobarRechazar(id_opedido, "R")==1){
            JOptionPane.showMessageDialog(this, "La orden n° "+String.valueOf(id_opedido)+" se ha marcado como rechazada");
            buscarNPedido();     
        }
        else{
            JOptionPane.showMessageDialog(this, "Hubo un problema rechazando la orden, por favor pongase en contacto con el departamento de informatica");
        }
    }//GEN-LAST:event_btn_rechazarActionPerformed

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
            java.util.logging.Logger.getLogger(AprobRegistroOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AprobRegistroOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AprobRegistroOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AprobRegistroOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AprobRegistroOrden().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aprobar;
    private javax.swing.JButton btn_buscarNPedido;
    private javax.swing.JButton btn_genBolServicio;
    private javax.swing.JButton btn_informe;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_ordenPedido;
    private javax.swing.JButton btn_rechazar;
    private javax.swing.JButton btn_regCliente;
    private javax.swing.JButton btn_regProveedor;
    private javax.swing.JButton btn_resHora;
    private javax.swing.JPanel colorBotonTop;
    private javax.swing.JPanel colorTop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_autor;
    private javax.swing.JLabel lbl_estado;
    private javax.swing.JLabel lbl_fechaCreacion;
    private javax.swing.JLabel lbl_recepcionado;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JPanel panel_resumen;
    private javax.swing.JTable tbl_opedido;
    private javax.swing.JTextField txt_nPedido;
    // End of variables declaration//GEN-END:variables
}
