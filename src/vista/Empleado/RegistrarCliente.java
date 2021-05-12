package vista.Empleado;
import java.awt.Color;
import vista.*;
import java.awt.Toolkit;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class RegistrarCliente extends javax.swing.JFrame {
    public String username;

    public RegistrarCliente() {
        initComponents();
    }
    
   public RegistrarCliente(String usuario) {
        initComponents();
        username=usuario;
        //Caracteristicas de la ventana
        lbl_usuario.setText(lbl_usuario.getText().replace("(usuario)", usuario));
        lbl_usuario.setHorizontalAlignment(SwingConstants.RIGHT);
        this.setResizable(false);
        this.setTitle("Clinica Odontológica Linda Sonrisa | Menú empleado | Registrar cliente");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo.png")));
        
        //Asignar colores a los botones
        btn_regCliente.setBackground(colorBotonTop.getBackground());
        btn_resHora.setBackground(colorBotonTop.getBackground());
        btn_regProveedor.setBackground(colorBotonTop.getBackground());
        btn_logout.setBackground(colorTop.getBackground());
        cb_rangoIngreso.setBackground(Color.WHITE);
        btn_crear.setBackground(colorBotonTop.getBackground());
        btn_cancelar.setBackground(colorBotonTop.getBackground());
        btn_limpiarCampos.setBackground(colorBotonTop.getBackground());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_regCliente1 = new javax.swing.JButton();
        btn_resHora1 = new javax.swing.JButton();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_rut = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_dv = new javax.swing.JTextField();
        txt_nombres = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_passUno = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        txt_passDos = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cb_rangoIngreso = new javax.swing.JComboBox<>();
        btn_limpiarCampos = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_crear = new javax.swing.JButton();
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

        btn_regCliente.setBackground(new java.awt.Color(12, 140, 153));
        btn_regCliente.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_regCliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_regCliente.setText("Registrar cliente");
        btn_regCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0), 3));
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
        btn_ordenPedido.setBorderPainted(false);
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
        btn_informe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_informe.setBorderPainted(false);
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
                .addComponent(btn_regCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_resHora, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_regProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_ordenPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_genBolServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_informe, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        colorBotonTopLayout.setVerticalGroup(
            colorBotonTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_regCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
            .addComponent(btn_resHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_regProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_ordenPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_informe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_genBolServicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(181, 213, 212));

        jPanel1.setBackground(new java.awt.Color(181, 213, 212));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RUT");

        txt_rut.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_rut.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel4.setText("-");

        txt_dv.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_dv.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_nombres.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_nombres.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Apellidos");

        txt_apellidos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_apellidos.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefono");

        txt_telefono.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Correo electrónico");

        txt_email.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_email.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nombres");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_rut, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_dv, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_email)
                    .addComponent(jLabel9)
                    .addComponent(txt_nombres))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txt_dv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(181, 213, 212));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nueva contraseña");

        txt_passUno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Repita contraseña");

        txt_passDos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txt_passUno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txt_passDos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_passUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_passDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(181, 213, 212));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Rango de ingresos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Seleccione rango de ingresos mensuales");

        cb_rangoIngreso.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cb_rangoIngreso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione un rango-", "Rango 1", "Rango 2", "Rango 3", "Rango 4", "Rango 5" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_rangoIngreso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(cb_rangoIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_limpiarCampos.setBackground(new java.awt.Color(17, 175, 191));
        btn_limpiarCampos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_limpiarCampos.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiarCampos.setText("Limpiar campos");
        btn_limpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarCamposActionPerformed(evt);
            }
        });

        btn_cancelar.setBackground(new java.awt.Color(17, 175, 191));
        btn_cancelar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_crear.setBackground(new java.awt.Color(17, 175, 191));
        btn_crear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_crear.setForeground(new java.awt.Color(255, 255, 255));
        btn_crear.setText("Confirmar y crear");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btn_limpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(468, 468, 468))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_limpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
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
            .addComponent(colorBotonTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_logout)
                        .addContainerGap())))
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
                            .addComponent(btn_logout))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
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

    private void btn_regClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regClienteActionPerformed
        this.dispose();
        RegistrarCliente ventanaRegistrar = new RegistrarCliente(username);
        ventanaRegistrar.setVisible(true); 
    }//GEN-LAST:event_btn_regClienteActionPerformed

    private void btn_regCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regCliente1ActionPerformed

    }//GEN-LAST:event_btn_regCliente1ActionPerformed

    private void btn_resHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resHoraActionPerformed
        this.dispose();
        ReservaHora ventanaReshora = new ReservaHora(username);
        ventanaReshora.setVisible(true);
    }//GEN-LAST:event_btn_resHoraActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        this.dispose();
        Login ventanaLogin = new Login();
        ventanaLogin.setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_limpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarCamposActionPerformed
        txt_rut.setText("");
        txt_dv.setText("");
        txt_nombres.setText("");
        txt_apellidos.setText("");
        txt_telefono.setText("");
        txt_email.setText("");
        txt_passUno.setText("");
        txt_passDos.setText("");
        cb_rangoIngreso.setSelectedIndex(0);
       
        JOptionPane.showMessageDialog(this, "Formulario reestablecido");
    }//GEN-LAST:event_btn_limpiarCamposActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        MainEmpleado ventanaMain = new MainEmpleado(username);
        ventanaMain.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_regProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regProveedorActionPerformed
        this.dispose();
        RegistroProv ventanaRegprov = new RegistroProv(username);
        ventanaRegprov.setVisible(true);
    }//GEN-LAST:event_btn_regProveedorActionPerformed

    private void btn_ordenPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordenPedidoActionPerformed
        this.dispose();
        RegistrarOrden ventanaOrdenped = new RegistrarOrden(username);
        ventanaOrdenped.setVisible(true);
    }//GEN-LAST:event_btn_ordenPedidoActionPerformed

    private void btn_genBolServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_genBolServicioActionPerformed
        this.dispose();
        RegistrarBoleta ventanaRegBol = new  RegistrarBoleta(username);
        ventanaRegBol.setVisible(true);
    }//GEN-LAST:event_btn_genBolServicioActionPerformed

    private void btn_informeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_informeActionPerformed
        this.dispose();
        RegistrarInforme ventanaRegInfo = new RegistrarInforme(username);
        ventanaRegInfo.setVisible(true);
    }//GEN-LAST:event_btn_informeActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_crear;
    private javax.swing.JButton btn_genBolServicio;
    private javax.swing.JButton btn_informe;
    private javax.swing.JButton btn_limpiarCampos;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_ordenPedido;
    private javax.swing.JButton btn_regCliente;
    private javax.swing.JButton btn_regCliente1;
    private javax.swing.JButton btn_regProveedor;
    private javax.swing.JButton btn_resHora;
    private javax.swing.JButton btn_resHora1;
    private javax.swing.JComboBox<String> cb_rangoIngreso;
    private javax.swing.JPanel colorBotonTop;
    private javax.swing.JPanel colorTop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_dv;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JPasswordField txt_passDos;
    private javax.swing.JPasswordField txt_passUno;
    private javax.swing.JTextField txt_rut;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
