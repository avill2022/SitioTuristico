package sitioturistico;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import java.util.logging.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class From1 extends javax.swing.JFrame {
    private Connection connection=null;
    DefaultTableModel modeloTabla;
    
    public From1() {
        initComponents();
        this.abrir_conexion();
        obtnerDatosBD("Persona.Empleado", dataGridEmpleados);
        obtnerDatosBD("Persona.Cliente", dataGridClientes);
        obtnerDatosBD("Venta.Transporte", dataGridTransportes);
        obtnerDatosBD("Venta.Equipo", dataGridEquipo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNomEmp = new javax.swing.JTextField();
        txtDirEmp = new javax.swing.JTextField();
        txtTelEmp = new javax.swing.JTextField();
        txtIdEmp = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnNuevEmp = new javax.swing.JButton();
        btnGuardarEmp = new javax.swing.JButton();
        btnBuscarEmp = new javax.swing.JButton();
        btnElimEmp = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataGridEmpleados = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNomCliente = new javax.swing.JTextField();
        txtDirCliente = new javax.swing.JTextField();
        txtTelCliente = new javax.swing.JTextField();
        txtIdCliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDDNacCliente = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNumVisClie = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtMMNacCliente = new javax.swing.JTextField();
        txtAAAANacCliente = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtAAAAInsCliente = new javax.swing.JTextField();
        txtMMInsCliente = new javax.swing.JTextField();
        txtDDInsCliente = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnNuevoClie = new javax.swing.JButton();
        btnGuardarClie = new javax.swing.JButton();
        btnBuscarClie = new javax.swing.JButton();
        btnEliminarClie = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        dataGridClientes = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtIdPqt = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        rtxtDescripPqt = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtCostoPqt = new javax.swing.JTextField();
        txtNumBolPqt = new javax.swing.JTextField();
        cmEquipo = new javax.swing.JComboBox();
        cmTransporte = new javax.swing.JComboBox();
        txtNumE = new javax.swing.JTextField();
        txtNumT = new javax.swing.JTextField();
        btnEquipo = new javax.swing.JButton();
        btnTransporte = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        btnNuevoPqt = new javax.swing.JButton();
        btnGuardarPqt = new javax.swing.JButton();
        btnBuscarPqt = new javax.swing.JButton();
        btnEliminarPqt = new javax.swing.JButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        dataGridPaquetes = new javax.swing.JTable();
        jScrollPane15 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtNomTransp = new javax.swing.JTextField();
        txtCapTransp = new javax.swing.JTextField();
        txtIdTranps = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txtCanTransp = new javax.swing.JTextField();
        rtxtDescpTransp = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        btnNuevoTransporte = new javax.swing.JButton();
        btnGuardarTranps = new javax.swing.JButton();
        BtnBuscarTransp = new javax.swing.JButton();
        BtnEliminarTransp = new javax.swing.JButton();
        jScrollPane16 = new javax.swing.JScrollPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        dataGridTransportes = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtNomEquipo = new javax.swing.JTextField();
        txtCantEquipo = new javax.swing.JTextField();
        txtIdEquipo = new javax.swing.JTextField();
        rtxtDescEquipo = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        btnNuevoEquipo = new javax.swing.JButton();
        BtnGuardarEquipo = new javax.swing.JButton();
        btnBuscarEquipo = new javax.swing.JButton();
        btnEliminarEquipo = new javax.swing.JButton();
        jScrollPane17 = new javax.swing.JScrollPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        dataGridEquipo = new javax.swing.JTable();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtIdEquipoVenta = new javax.swing.JTextField();
        txtIdBoletoVenta = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        btnAceptarClienteVenta = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        txtIdClienteVenta = new javax.swing.JTextField();
        btnBuscarClienteVenta = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        txtIdEmpleadoVenta = new javax.swing.JTextField();
        btnAceptarEmpleadoVenta = new javax.swing.JButton();
        BtnBuscarEmpleadoVenta = new javax.swing.JButton();
        txtIdVentaVenta = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        txtFechaVenta = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        txtDDNacCliente1 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        txtMMNacCliente1 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        txtAAAANacCliente1 = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        dataGridView7 = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        dataGridViewConsultaVentas = new javax.swing.JTable();
        jLabel57 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel26 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos:"));

        jLabel1.setText("Id Empleado:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Telefono:");

        jLabel4.setText("Direccion:");

        txtNomEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeyCarTyped(evt);
            }
        });

        txtTelEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NumeroTelefono(evt);
                txtKeyNumTyped(evt);
            }
        });

        txtIdEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeyNumTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomEmp)
                    .addComponent(txtDirEmp)
                    .addComponent(txtTelEmp)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(txtNomEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDirEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones:"));

        btnNuevEmp.setText("Nuevo");
        btnNuevEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevEmpActionPerformed(evt);
            }
        });

        btnGuardarEmp.setText("Guardar");
        btnGuardarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEmpActionPerformed(evt);
            }
        });

        btnBuscarEmp.setText("Buscar");
        btnBuscarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEmpActionPerformed(evt);
            }
        });

        btnElimEmp.setText("Eliminar");
        btnElimEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnBuscarEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnElimEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardarEmp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(btnNuevEmp)
                .addGap(30, 30, 30)
                .addComponent(btnGuardarEmp)
                .addGap(31, 31, 31)
                .addComponent(btnBuscarEmp)
                .addGap(34, 34, 34)
                .addComponent(btnElimEmp)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        dataGridEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        dataGridEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataGridEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dataGridEmpleados);

        jScrollPane12.setViewportView(jScrollPane1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane12))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Empleados", jPanel2);

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos:"));

        jLabel7.setText("Id Cliente:");

        jLabel8.setText("Nombre:");

        jLabel9.setText("Telefono:");

        jLabel10.setText("Direccion:");

        txtNomCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeyCarTyped(evt);
            }
        });

        txtTelCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeyNumTyped(evt);
                NumeroTelefonCliente(evt);
            }
        });

        txtIdCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeyNumTyped(evt);
            }
        });

        jLabel13.setText("Fecha de Nacimiento:(AAAA/DD/MM)");

        txtDDNacCliente.setMaximumSize(new java.awt.Dimension(4, 4));
        txtDDNacCliente.setMinimumSize(new java.awt.Dimension(0, 0));
        txtDDNacCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDDNacClienteKeyTyped(evt);
            }
        });

        jLabel14.setText("Fecha de Inscripcion:(AAAA/DD/MM)");

        jLabel15.setText("Numero de visitas:");

        txtNumVisClie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeyNumTyped(evt);
            }
        });

        jLabel16.setText("-");
        jLabel16.setIconTextGap(43);

        txtMMNacCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMMNacClienteKeyTyped(evt);
            }
        });

        txtAAAANacCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAAAANacClienteKeyTyped(evt);
            }
        });

        jLabel17.setText("-");

        txtAAAAInsCliente.setEnabled(false);

        txtMMInsCliente.setEnabled(false);

        txtDDInsCliente.setEnabled(false);

        jLabel18.setText("-");

        jLabel19.setText("-");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomCliente)
                    .addComponent(txtDirCliente)
                    .addComponent(txtTelCliente)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtDDNacCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMMNacCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAAAANacCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtDDInsCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMMInsCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAAAAInsCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumVisClie)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(5, 5, 5)
                .addComponent(txtNomCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDDNacCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtMMNacCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtAAAANacCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDDInsCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtMMInsCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtAAAAInsCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtNumVisClie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones:"));

        btnNuevoClie.setText("Nuevo");
        btnNuevoClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClieActionPerformed(evt);
            }
        });

        btnGuardarClie.setText("Guardar");
        btnGuardarClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClieActionPerformed(evt);
            }
        });

        btnBuscarClie.setText("Buscar");
        btnBuscarClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClieActionPerformed(evt);
            }
        });

        btnEliminarClie.setText("Eliminar");
        btnEliminarClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnBuscarClie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarClie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevoClie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardarClie, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(btnNuevoClie)
                .addGap(30, 30, 30)
                .addComponent(btnGuardarClie)
                .addGap(31, 31, 31)
                .addComponent(btnBuscarClie)
                .addGap(34, 34, 34)
                .addComponent(btnEliminarClie)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dataGridClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        dataGridClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataGridClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(dataGridClientes);

        jScrollPane13.setViewportView(jScrollPane2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane13)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Clientes", jPanel5);

        jPanel8.setBackground(new java.awt.Color(204, 255, 255));

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos:"));

        jLabel20.setText("Id Paquete");

        txtIdPqt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeyNumTyped(evt);
            }
        });

        jLabel22.setText("Descripcion:");

        rtxtDescripPqt.setColumns(20);
        rtxtDescripPqt.setRows(5);
        jScrollPane3.setViewportView(rtxtDescripPqt);

        jLabel23.setText("Costo:");

        jLabel24.setText("Numero de boletos:");

        jLabel25.setText("Equipo:");

        jLabel26.setText("Transporte:");

        txtCostoPqt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeyNumTyped(evt);
            }
        });

        txtNumBolPqt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeyNumTyped(evt);
            }
        });

        cmEquipo.setToolTipText("");

        txtNumE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeyNumTyped(evt);
            }
        });

        txtNumT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeyNumTyped(evt);
            }
        });

        btnEquipo.setText("+");

        btnTransporte.setText("+");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCostoPqt))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumBolPqt))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(txtNumT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTransporte)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNumE, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEquipo))))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel22)
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addComponent(jLabel20)
                                    .addGap(39, 39, 39)
                                    .addComponent(txtIdPqt, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtIdPqt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtCostoPqt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtNumBolPqt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(cmEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEquipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(cmTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTransporte))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones:"));

        btnNuevoPqt.setText("Nuevo");

        btnGuardarPqt.setText("Guardar");

        btnBuscarPqt.setText("Buscar");

        btnEliminarPqt.setText("Eliminar");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnBuscarPqt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarPqt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevoPqt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardarPqt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(btnNuevoPqt)
                .addGap(30, 30, 30)
                .addComponent(btnGuardarPqt)
                .addGap(31, 31, 31)
                .addComponent(btnBuscarPqt)
                .addGap(34, 34, 34)
                .addComponent(btnEliminarPqt)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        dataGridPaquetes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(dataGridPaquetes);

        jScrollPane14.setViewportView(jScrollPane5);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_detalle_paq", "id_paquete", "id_equipo", "id_transporte", "cantidad_equipo", "cantidad_transporte"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        jScrollPane15.setViewportView(jScrollPane4);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                    .addComponent(jScrollPane15))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Paquetes", jPanel8);

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos:"));

        jLabel28.setText("Id Transporte:");

        jLabel29.setText("Nombre:");

        jLabel30.setText("Capacidad:");

        jLabel31.setText("Descripcion:");

        txtNomTransp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeyCarTyped(evt);
            }
        });

        txtCapTransp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeyNumTyped(evt);
            }
        });

        txtIdTranps.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeyNumTyped(evt);
            }
        });

        jLabel40.setText("Cantidad:");

        txtCanTransp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeyNumTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rtxtDescpTransp)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdTranps))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(txtCapTransp, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCanTransp, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNomTransp)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel29))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtIdTranps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel29)
                .addGap(5, 5, 5)
                .addComponent(txtNomTransp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rtxtDescpTransp, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtCapTransp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(txtCanTransp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones:"));

        btnNuevoTransporte.setText("Nuevo");
        btnNuevoTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoTransporteActionPerformed(evt);
            }
        });

        btnGuardarTranps.setText("Guardar");
        btnGuardarTranps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTranpsActionPerformed(evt);
            }
        });

        BtnBuscarTransp.setText("Buscar");
        BtnBuscarTransp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarTranspActionPerformed(evt);
            }
        });

        BtnEliminarTransp.setText("Eliminar");
        BtnEliminarTransp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarTranspActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BtnBuscarTransp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnEliminarTransp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevoTransporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardarTranps, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(btnNuevoTransporte)
                .addGap(30, 30, 30)
                .addComponent(btnGuardarTranps)
                .addGap(31, 31, 31)
                .addComponent(BtnBuscarTransp)
                .addGap(34, 34, 34)
                .addComponent(BtnEliminarTransp)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        dataGridTransportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        dataGridTransportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataGridTransportesMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(dataGridTransportes);

        jScrollPane16.setViewportView(jScrollPane6);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane16)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Transportes", jPanel4);

        jPanel13.setBackground(new java.awt.Color(204, 255, 255));

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos:"));

        jLabel34.setText("Id Equipo:");

        jLabel35.setText("Nombre:");

        jLabel36.setText("Cantidad Disponible:");

        jLabel37.setText("Descripcion:");

        txtNomEquipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeyCarTyped(evt);
            }
        });

        txtCantEquipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantEquipoKeyTyped(evt);
            }
        });

        txtIdEquipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeyNumTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomEquipo)
                    .addComponent(rtxtDescEquipo)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCantEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel35)
                            .addComponent(jLabel37))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(txtIdEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addGap(5, 5, 5)
                .addComponent(txtNomEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rtxtDescEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addGap(46, 46, 46)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(txtCantEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones:"));

        btnNuevoEquipo.setText("Nuevo");
        btnNuevoEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoEquipoActionPerformed(evt);
            }
        });

        BtnGuardarEquipo.setText("Guardar");
        BtnGuardarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarEquipoActionPerformed(evt);
            }
        });

        btnBuscarEquipo.setText("Buscar");
        btnBuscarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEquipoActionPerformed(evt);
            }
        });

        btnEliminarEquipo.setText("Eliminar");
        btnEliminarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEquipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnBuscarEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevoEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnGuardarEquipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(btnNuevoEquipo)
                .addGap(30, 30, 30)
                .addComponent(BtnGuardarEquipo)
                .addGap(31, 31, 31)
                .addComponent(btnBuscarEquipo)
                .addGap(34, 34, 34)
                .addComponent(btnEliminarEquipo)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        dataGridEquipo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        dataGridEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataGridEquipoMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(dataGridEquipo);

        jScrollPane17.setViewportView(jScrollPane7);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane17)
                    .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Equipo", jPanel13);

        jTabbedPane1.addTab("Administracion de Negocio", jTabbedPane2);

        jPanel16.setBackground(new java.awt.Color(204, 255, 255));

        jPanel17.setBackground(new java.awt.Color(204, 204, 204));

        jLabel41.setText("Datos de Venta");

        jLabel42.setText("Id Venta:");

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Venta"));

        jLabel43.setText("Id Paquete:");

        jLabel44.setText("Cantidad:");

        txtIdEquipoVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeyNumTyped(evt);
            }
        });

        txtIdBoletoVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeyNumTyped(evt);
            }
        });

        jButton3.setText("+");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdBoletoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdEquipoVenta)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(txtIdEquipoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(txtIdBoletoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        btnAceptarClienteVenta.setText("Aceptar");

        jLabel46.setText("Id:");

        txtIdClienteVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeyNumTyped(evt);
            }
        });

        btnBuscarClienteVenta.setText("Buscar");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIdClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarClienteVenta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptarClienteVenta)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(txtIdClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarClienteVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAceptarClienteVenta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("Empleado"));

        jLabel48.setText("Id:");

        txtIdEmpleadoVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeyNumTyped(evt);
            }
        });

        btnAceptarEmpleadoVenta.setText("Aceptar");

        BtnBuscarEmpleadoVenta.setText("Buscar");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAceptarEmpleadoVenta))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdEmpleadoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnBuscarEmpleadoVenta)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(txtIdEmpleadoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscarEmpleadoVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptarEmpleadoVenta)
                .addContainerGap())
        );

        txtIdVentaVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeyNumTyped(evt);
            }
        });

        jLabel50.setText("Fecha:");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel41)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                .addGap(0, 39, Short.MAX_VALUE)
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdVentaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel50)
                                .addGap(24, 24, 24)
                                .addComponent(txtFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel41)
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(txtIdVentaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50)
                    .addComponent(txtFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel51.setText("Detalle de Venta");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id_dventa", "id_venta", "Paquete", "cantidad", "subtotal"
            }
        ));
        jScrollPane8.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jLabel51)
                .addGap(0, 339, Short.MAX_VALUE))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel52.setText("Fecha en que se desea usar:");

        jLabel53.setText("Total a pagar");

        jButton9.setText("Aceptar");

        jButton10.setText("Cancelar");

        jLabel54.setText("-");

        jLabel55.setText("-");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel52)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                                        .addComponent(jLabel53)
                                        .addGap(26, 26, 26)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                                        .addComponent(jButton9)
                                        .addGap(30, 30, 30)
                                        .addComponent(jButton10))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                                        .addComponent(txtDDNacCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel54)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMMNacCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel55)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAAAANacCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(40, 40, 40))))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDDNacCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel54)
                                .addComponent(txtMMNacCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel55)
                                .addComponent(txtAAAANacCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel52))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel53)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton9)
                            .addComponent(jButton10))
                        .addGap(20, 20, 20))))
        );

        jTabbedPane3.addTab("Registrar Ventas", jPanel16);

        jPanel22.setBackground(new java.awt.Color(204, 255, 255));

        jLabel56.setText("Detalle de Venta");

        dataGridView7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id_dventa", "id_venta", "paquete", "cantidad", "subtotal"
            }
        ));
        jScrollPane9.setViewportView(dataGridView7);

        dataGridViewConsultaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id_venta", "Cliente", "Empleado", "fecha_compra", "total"
            }
        ));
        jScrollPane10.setViewportView(dataGridViewConsultaVentas);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jLabel56)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(137, Short.MAX_VALUE)))
        );

        jLabel57.setText("Id de la venta:");

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeyNumTyped(evt);
            }
        });

        jButton2.setText("Buscar");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2))
                .addGap(77, 77, 77)
                .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton2)
                .addContainerGap(226, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Consultar Ventas", jPanel22);

        jTabbedPane1.addTab("Ventas", jTabbedPane3);

        jPanel24.setBackground(new java.awt.Color(204, 204, 204));

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder("Registrar Entrada"));

        jLabel59.setText("id del boleto");

        jButton1.setText("Registrar");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeyNumTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane11.setViewportView(jTable2);

        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Entrada"));

        jLabel61.setText("id de la entrada");

        jButton4.setText("Buscar");

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeyNumTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton4)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registrar Entrada", jPanel24);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // <editor-fold defaultstate="collapsed" desc="Empleados">  
    private void btnNuevEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevEmpActionPerformed
       if (txtNomEmp.getText().length()!=0 && txtDirEmp.getText().length()!=0 && txtTelEmp.getText().length()!=0)
        try
        { 
            String sql = "INSERT INTO Persona.Empleado(nombre_empleado,direccion,telefono)VALUES('" + txtNomEmp.getText() + "','" + txtDirEmp.getText() + "','" + txtTelEmp.getText() + "')";
            try
            {
                Statement a = null;
                a = connection.createStatement();
                int result = a.executeUpdate(sql);
                if(result == 1){
                    limiarEmplado();
                    dataGridEmpleados.clearSelection();
                    obtnerDatosBD("Persona.Empleado", dataGridEmpleados);
                    System.out.println("Agregado correctamente");
                }else{
                    System.out.println("Error al agregar");
                }
            }
            catch (SQLException ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        else
            JOptionPane.showMessageDialog(rootPane,"Hay campos vacios. \nPor favor llenalos antes de continuar.");
    }//GEN-LAST:event_btnNuevEmpActionPerformed

    private void dataGridEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataGridEmpleadosMouseClicked
        int Registro = dataGridEmpleados.getSelectedRow();
        txtIdEmp.setText(dataGridEmpleados.getValueAt(Registro, 0).toString());
        txtNomEmp.setText(dataGridEmpleados.getValueAt(Registro, 1).toString());
        txtDirEmp.setText(dataGridEmpleados.getValueAt(Registro, 2).toString());
        txtTelEmp.setText(dataGridEmpleados.getValueAt(Registro, 3).toString());   
    }//GEN-LAST:event_dataGridEmpleadosMouseClicked

    private void btnGuardarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEmpActionPerformed
        if (txtNomEmp.getText().length() != 0 && txtDirEmp.getText().length() != 0 && txtTelEmp.getText().length() != 0)
            try
            {
                String textoCmd = "UPDATE Persona.Empleado SET nombre_empleado='" + txtNomEmp.getText() + "', direccion = '" + txtDirEmp.getText() + "',telefono = '" + txtTelEmp.getText() + "'" + "WHERE id_empleado = " + txtIdEmp.getText();
                try
                {
                    Statement a = null;
                    a = connection.createStatement();
                    int result = a.executeUpdate(textoCmd);
                    if(result == 1){
                        limiarEmplado();
                        dataGridEmpleados.clearSelection();
                        obtnerDatosBD("Persona.Empleado", dataGridEmpleados);
                        System.out.println("Actualizado correctamente");
                    }else{
                        System.out.println("Error al Actualizar");
                    }
                }
                catch (SQLException ex)
                {
                    JOptionPane.showMessageDialog(rootPane, ex);
                }
            }
            catch (Exception ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex);
            }
        else
            JOptionPane.showMessageDialog(rootPane,"Hay campos vacios. \nPor favor llenalos antes de continuar.");
    }//GEN-LAST:event_btnGuardarEmpActionPerformed

    private void btnBuscarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEmpActionPerformed
        boolean encontro = false;
        if (txtIdEmp.getText().length()> 0)
        {
            for (int i = 0; i < dataGridEmpleados.getRowCount(); i++)
            {
                if (txtIdEmp.getText().equals(dataGridEmpleados.getValueAt(i, 0).toString()))
                {
                    dataGridEmpleados.getSelectionModel().setSelectionInterval(i, i);
                    System.out.println("Indice buscdo: "+txtIdEmp.getText()+"\nIndice actual: "+dataGridEmpleados.getValueAt(i, 0).toString());
                    encontro = true;
                    break;
                }
            }
            if (encontro == false)
                JOptionPane.showMessageDialog(rootPane,"Elemento no encontrado");
        }
        else
            JOptionPane.showMessageDialog(rootPane,"Ingresa el codigo del empleado que deseas buscar");
    }//GEN-LAST:event_btnBuscarEmpActionPerformed

    private void btnElimEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimEmpActionPerformed
        try
        {
            String textoCmd = "DELETE FROM Persona.Empleado  WHERE id_empleado = " + txtIdEmp.getText();
            try
            {
                Statement a = null;
                a = connection.createStatement();
                int result = a.executeUpdate(textoCmd);
                if(result == 1){
                    limiarEmplado();
                    dataGridEmpleados.clearSelection();
                    obtnerDatosBD("Persona.Empleado", dataGridEmpleados);
                    System.out.println("Eliminado correctamente");
                }else{
                    System.out.println("Error al Eliminar");
                }
            }
            catch (SQLException ex)
            {
                JOptionPane.showMessageDialog(null,ex);
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_btnElimEmpActionPerformed
    private void limiarEmplado()
    {
        txtNomEmp.setText(null);
        txtDirEmp.setText(null);
        txtTelEmp.setText(null);
        txtIdEmp.setText(null);
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Clientes"> 
    private void btnGuardarClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClieActionPerformed
        if (txtNomCliente.getText().length() != 0 && txtDirCliente.getText().length() != 0 && txtTelCliente.getText().length() != 0)
            try
            {
                String textoCmd = "UPDATE Persona.Cliente SET nombre_cliente='" + txtNomCliente.getText() + "', direccion = '" + txtDirCliente.getText() + "',telefono = '" + txtTelCliente.getText() 
                        + "',fecha_inscripcion = '" + txtDDInsCliente.getText() + "-" + txtMMInsCliente.getText() + "-" + txtAAAAInsCliente.getText() 
                        + "',fecha_nacimiento = '" + txtDDNacCliente.getText() + "-" + txtMMNacCliente.getText() + "-" + txtAAAANacCliente.getText() 
                        +"',numero_visitas='" +Integer.parseInt(txtNumVisClie.getText())+"'WHERE id_cliente = " + txtIdCliente.getText();
                try
                {
                    Statement a = null;
                    a = connection.createStatement();
                    int result = a.executeUpdate(textoCmd);
                    if(result == 1){
                        limiarCliente();
                        dataGridClientes.clearSelection();
                        obtnerDatosBD("Persona.Cliente", dataGridClientes);
                        System.out.println("Actualizado correctamente");
                    }else{
                        System.out.println("Error al Actualizar");
                    }
                }
                catch (SQLException ex)
                {
                    JOptionPane.showMessageDialog(rootPane, ex);
                }
            }
            catch (Exception ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex);
            }
        else
            JOptionPane.showMessageDialog(rootPane,"Hay campos vacios. \nPor favor llenalos antes de continuar.");
    }//GEN-LAST:event_btnGuardarClieActionPerformed

    private void btnBuscarClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClieActionPerformed
        boolean encontro = false;
        if (txtIdCliente.getText().length()> 0)
        {
            for (int i = 0; i < dataGridClientes.getRowCount(); i++)
            {
                if (txtIdCliente.getText().equals(dataGridClientes.getValueAt(i, 0).toString()))
                {
                    dataGridClientes.getSelectionModel().setSelectionInterval(i, i);
                    System.out.println("Indice buscdo: "+txtIdCliente.getText()+"\nIndice actual: "+dataGridClientes.getValueAt(i, 0).toString());
                    encontro = true;
                    break;
                }
            }
            if (encontro == false)
                JOptionPane.showMessageDialog(rootPane,"Elemento no encontrado");
        }
        else
            JOptionPane.showMessageDialog(rootPane,"Ingresa el codigo del empleado que deseas buscar");
    }//GEN-LAST:event_btnBuscarClieActionPerformed

    private void btnEliminarClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClieActionPerformed
        try
        {
            String textoCmd = "DELETE FROM Persona.Cliente  WHERE id_cliente = " + txtIdCliente.getText();
            try
            {
                Statement a = null;
                a = connection.createStatement();
                int result = a.executeUpdate(textoCmd);
                if(result == 1){
                    limiarCliente();
                    dataGridClientes.clearSelection();
                    obtnerDatosBD("Persona.Cliente", dataGridClientes);
                }else{
                    System.out.println("Error al Eliminar");
                }
            }
            catch (SQLException ex)
            {
                JOptionPane.showMessageDialog(null,ex);
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_btnEliminarClieActionPerformed

    private void btnNuevoClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClieActionPerformed
        if (txtNomCliente.getText().length() != 0 && txtDirCliente.getText().length() != 0 && txtTelCliente.getText().length() != 0 && txtDDNacCliente.getText().length() != 0 && txtMMNacCliente.getText().length() != 0&& 
                txtAAAANacCliente.getText().length() != 0)
        try
        {
            Date now = new Date(System.currentTimeMillis());
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            String sql = "INSERT INTO Persona.Cliente  (nombre_cliente,direccion,telefono,fecha_inscripcion,"
                    + "fecha_nacimiento,numero_visitas) VALUES "
                    + "('"+txtNomCliente.getText()+"' ,'"+txtDirCliente.getText()+"' "
                    + ",'"+txtTelCliente.getText()+"' ,'"+date.format(now)+"','"+txtDDNacCliente.getText()+"-"+txtMMNacCliente.getText()+"-"+txtAAAANacCliente.getText()+"',0)";
            try
            {
                Statement a = null;
                a = connection.createStatement();
                int result = a.executeUpdate(sql);
                if(result == 1){
                    limiarCliente();
                    dataGridClientes.clearSelection();
                    obtnerDatosBD("Persona.Cliente", dataGridClientes);
                    System.out.println("Agregado correctamente");
                }else{
                    System.out.println("Error al agregar");
                }
            }
            catch (SQLException ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        else
            JOptionPane.showMessageDialog(rootPane,"Hay campos vacios. \nPor favor llenalos antes de continuar.");
    }//GEN-LAST:event_btnNuevoClieActionPerformed

    private void dataGridClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataGridClientesMouseClicked
        int Registro = dataGridClientes.getSelectedRow();
        
        txtIdCliente.setText(dataGridClientes.getValueAt(Registro, 0).toString());
        txtNomCliente.setText(dataGridClientes.getValueAt(Registro, 1).toString());
        txtDirCliente.setText(dataGridClientes.getValueAt(Registro, 2).toString());
        txtTelCliente.setText(dataGridClientes.getValueAt(Registro, 3).toString());
        cargarFechas(dataGridClientes.getValueAt(Registro, 5).toString(),dataGridClientes.getValueAt(Registro, 4).toString());
        txtNumVisClie.setText(dataGridClientes.getValueAt(Registro, 6).toString());
    }//GEN-LAST:event_dataGridClientesMouseClicked
    private void limiarCliente()
    {
        txtNomCliente.setText(null);
        txtDirCliente.setText(null);
        txtTelCliente.setText(null);
        txtIdCliente.setText(null);
        
        
        txtDDNacCliente.setText(null);
        txtMMNacCliente.setText(null);
        txtAAAANacCliente.setText(null);
        
        txtDDInsCliente.setText(null);
        txtMMInsCliente.setText(null);
        txtAAAAInsCliente.setText(null);
    }
    public void cargarFechas(String fechaInscripcion,String fechaNacimiento)
    {
        System.out.println(fechaNacimiento+"\n");
        System.out.println(fechaInscripcion);
        String fecha ="";
        int i=0;
        for(char x: fechaNacimiento.toCharArray()){ 
            if(x == '-'){
                switch(i){
                    case 0:
                        txtDDNacCliente.setText(fecha);
                        break;
                    case 1:
                        txtMMNacCliente.setText(fecha);
                        break;
                }
                i++;
                fecha="";
            }else
                fecha += x;
        }
        txtAAAANacCliente.setText(fecha);
        fecha="";
        i=0;
        for(char y: fechaInscripcion.toCharArray()){ 
            if(y == '-'){
                switch(i){
                    case 0:
                        txtDDInsCliente.setText(fecha);
                        break;
                    case 1:
                        txtMMInsCliente.setText(fecha);
                        break;
                }
                i++;
                fecha="";
            }else
                fecha += y;
        }
        txtAAAAInsCliente.setText(fecha);
    }
    // </editor-fold> 
    
    private void btnNuevoTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoTransporteActionPerformed
        if(txtNomTransp.getText().length()!=0&& rtxtDescpTransp.getText().length()!=0 &&txtCanTransp.getText().length()!=0)
        {
        try
        {
            //y la capacidad cantidad?? no esta en la base de datos " + Integer.parseInt(txtCapTransp.getText()) + ",
            String textoCmd = "INSERT INTO Venta.Transporte(nombre_transporte,descripcion,capacidad)VALUES('" + txtNomTransp.getText() + "','" + rtxtDescpTransp.getText() + "',"+Integer.parseInt(txtCanTransp.getText())+")";
            try
            {
                Statement a = null;
                a = connection.createStatement();
                int result = a.executeUpdate(textoCmd);
                if(result == 1){
                    limiarTransporte();
                    dataGridTransportes.clearSelection();
                    obtnerDatosBD("Venta.Transporte", dataGridTransportes);
                    System.out.println("Agregado correctamente");
                }else{
                    System.out.println("Error al agregar");
                }
            }
            catch (SQLException ex){
                JOptionPane.showMessageDialog(rootPane, ex);
            }
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(rootPane, ex);
        }
        }else
            JOptionPane.showMessageDialog(rootPane,"Hay campos vacios. \nPor favor llenalos antes de continuar.");
    }//GEN-LAST:event_btnNuevoTransporteActionPerformed
    private void limiarTransporte()
    {
        txtNomTransp.setText(null);
        rtxtDescpTransp.setText(null);
        txtCapTransp.setText(null);
        txtCanTransp.setText(null);
    }
    
    private void btnGuardarTranpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTranpsActionPerformed
        try
        {
            String textoCmd = "UPDATE Venta.Transporte SET nombre_transporte='" +txtNomTransp.getText() + "',descripcion='"+rtxtDescpTransp.getText()+"',capacidad=" + Integer.parseInt(txtCapTransp.getText())+",cantidad="+Integer.parseInt(txtCanTransp.getText()) + " WHERE id_Transporte =" + txtIdTranps.getText();
            try
            {
                Statement a = null;
                a = connection.createStatement();
                int result = a.executeUpdate(textoCmd);
                if(result == 1){
                    limiarEmplado();
                    dataGridTransportes.clearSelection();
                    obtnerDatosBD("Venta.Transporte", dataGridTransportes);
                    System.out.println("Actualizado correctamente");
                }else{
                    System.out.println("Error al Actualizar");
                }
            }
            catch (SQLException ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex);
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_btnGuardarTranpsActionPerformed

    private void BtnBuscarTranspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarTranspActionPerformed
        boolean encontro = false;
        if (txtIdTranps.getText().length()> 0)
        {
            for (int i = 0; i < dataGridTransportes.getRowCount(); i++)
            {
                if (txtIdTranps.getText().equals(dataGridTransportes.getValueAt(i, 0).toString()))
                {
                    dataGridTransportes.getSelectionModel().setSelectionInterval(i, i);
                    System.out.println("Indice buscdo: "+txtIdTranps.getText()+"\nIndice actual: "+dataGridTransportes.getValueAt(i, 0).toString());
                    encontro = true;
                    break;
                }
            }
            if (encontro == false)
                JOptionPane.showMessageDialog(rootPane,"Elemento no encontrado");
        }
        else
            JOptionPane.showMessageDialog(rootPane,"Ingresa el codigo del empleado que deseas buscar");
    }//GEN-LAST:event_BtnBuscarTranspActionPerformed

    private void BtnEliminarTranspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarTranspActionPerformed
                try
        {
            String textoCmd = "DELETE FROM Venta.Transporte  WHERE id_Transporte = " + txtIdTranps.getText();
            try
            {
                Statement a = null;
                a = connection.createStatement();
                int result = a.executeUpdate(textoCmd);
                if(result == 1){
                    limiarEmplado();
                    dataGridTransportes.clearSelection();
                    obtnerDatosBD("Venta.Transporte", dataGridTransportes);
                    System.out.println("Eliminado correctamente");
                }else{
                    System.out.println("Error al Eliminar");
                }
            }
            catch (SQLException ex)
            {
                JOptionPane.showMessageDialog(null,ex);
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_BtnEliminarTranspActionPerformed
    
    
    private void txtCantEquipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantEquipoKeyTyped
        char caracter = evt.getKeyChar();
        if(Character.isLetter(caracter))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCantEquipoKeyTyped

    private void dataGridTransportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataGridTransportesMouseClicked
        int Registro = dataGridTransportes.getSelectedRow();
        txtIdTranps.setText(dataGridTransportes.getValueAt(Registro, 0).toString());
        txtNomTransp.setText(dataGridTransportes.getValueAt(Registro, 1).toString());
        rtxtDescpTransp.setText(dataGridTransportes.getValueAt(Registro, 2).toString());
        txtCapTransp.setText(dataGridTransportes.getValueAt(Registro, 3).toString()); 
        /*Falta la cantidad, no esta en la base de datos
            txtCanTransp.setText(dataGridTransportes.getValueAt(Registro, 4).toString()); 
        */
    }//GEN-LAST:event_dataGridTransportesMouseClicked
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Equipo"> 
    private void btnNuevoEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoEquipoActionPerformed
        if(txtNomEquipo.getText().length()!=0&&rtxtDescEquipo.getText().length()!=0 &&txtCantEquipo.getText().length()!=0)
        {
        try
        {
            String sql = "INSERT INTO Venta.Equipo (nombre_equipo, descripcion, cantidad_disponible) VALUES ('" + txtNomEquipo.getText() + "','" + rtxtDescEquipo.getText() + "'," + Integer.parseInt(txtCantEquipo.getText()) + ")";
            try
            {
                Statement a = null;
                a = connection.createStatement();
                int result = a.executeUpdate(sql);
                if(result == 1){
                    limiarEquipo();
                    dataGridEquipo.clearSelection();
                    obtnerDatosBD("Venta.Equipo", dataGridEquipo);
                    System.out.println("Agregado correctamente");
                }else{
                    System.out.println("Error al agregar");
                }
            }
            catch (SQLException ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        }else
            JOptionPane.showMessageDialog(rootPane,"Hay campos vacios. \nPor favor llenalos antes de continuar.");
    }//GEN-LAST:event_btnNuevoEquipoActionPerformed

    private void BtnGuardarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarEquipoActionPerformed
        try
        {
            String sql = "UPDATE Venta.Equipo SET nombre_equipo ='" + txtNomEquipo.getText() + "', descripcion ='" + rtxtDescEquipo.getText() + "', cantidad_disponible =" + Integer.parseInt(txtCantEquipo.getText()) + " WHERE id_equipo =" + txtIdEquipo.getText();
            try
            {
                Statement a = null;
                a = connection.createStatement();
                int result = a.executeUpdate(sql);
                if(result == 1){
                    limiarEmplado();
                    dataGridEquipo.clearSelection();
                    obtnerDatosBD("Venta.Equipo", dataGridEquipo);
                    System.out.println("Actualizado correctamente");
                }else{
                    System.out.println("Error al Actualizar");
                }
            }
            catch (SQLException ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_BtnGuardarEquipoActionPerformed

    private void btnBuscarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEquipoActionPerformed
        boolean encontro = false;
        if (txtIdEquipo.getText().length()> 0)
        {
            for (int i = 0; i < dataGridEquipo.getRowCount(); i++)
            {
                if (txtIdEquipo.getText().equals(dataGridEquipo.getValueAt(i, 0).toString()))
                {
                    dataGridEquipo.getSelectionModel().setSelectionInterval(i, i);
                    System.out.println("Indice buscdo: "+txtIdEquipo.getText()+"\nIndice actual: "+dataGridEquipo.getValueAt(i, 0).toString());
                    encontro = true;
                    break;
                }
            }
            if (encontro == false)
                JOptionPane.showMessageDialog(rootPane,"Elemento no encontrado");
        }
        else
            JOptionPane.showMessageDialog(rootPane,"Ingresa el codigo del empleado que deseas buscar");
    }//GEN-LAST:event_btnBuscarEquipoActionPerformed

    private void btnEliminarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEquipoActionPerformed
        try
        {
            String textoCmd = "DELETE FROM Venta.Equipo  WHERE id_equipo = " + txtIdEquipo.getText();
            try
            {
                Statement a = null;
                a = connection.createStatement();
                int result = a.executeUpdate(textoCmd);
                if(result == 1){
                    limiarEquipo();
                    dataGridEquipo.clearSelection();
                    obtnerDatosBD("Venta.Equipo", dataGridEquipo);
                    System.out.println("Eliminado correctamente");
                }else{
                    System.out.println("Error al Eliminar");
                }
            }
            catch (SQLException ex)
            {
                JOptionPane.showMessageDialog(null,ex);
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_btnEliminarEquipoActionPerformed

    private void dataGridEquipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataGridEquipoMouseClicked
        int Registro = dataGridEquipo.getSelectedRow();
        txtIdEquipo.setText(dataGridEquipo.getValueAt(Registro, 0).toString());
        txtNomEquipo.setText(dataGridEquipo.getValueAt(Registro, 1).toString());
        rtxtDescEquipo.setText(dataGridEquipo.getValueAt(Registro, 2).toString());
        txtCantEquipo.setText(dataGridEquipo.getValueAt(Registro, 3).toString());
    }//GEN-LAST:event_dataGridEquipoMouseClicked

    private void txtKeyCarTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyCarTyped
      
        char caracter = evt.getKeyChar();
        if(Character.isDigit(caracter))
        {
            getToolkit().beep();//Sonido
            evt.consume();
        }
    }//GEN-LAST:event_txtKeyCarTyped

    private void txtKeyNumTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyNumTyped

        char caracter = evt.getKeyChar();
        if(Character.isLetter(caracter))
        {
            getToolkit().beep();//Sonido
            evt.consume();
        }
    }//GEN-LAST:event_txtKeyNumTyped

    private void txtDDNacClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDDNacClienteKeyTyped
        char caracter = evt.getKeyChar();
        if(Character.isLetter(caracter) || txtDDNacCliente.getText().length()>3)
        {
            getToolkit().beep();//Sonido
            evt.consume();
        }
    }//GEN-LAST:event_txtDDNacClienteKeyTyped

    private void txtMMNacClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMMNacClienteKeyTyped
        char caracter = evt.getKeyChar();
        if(Character.isLetter(caracter) || txtMMNacCliente.getText().length()>1)
        {
            getToolkit().beep();//Sonido
            evt.consume();
        }
    }//GEN-LAST:event_txtMMNacClienteKeyTyped

    private void txtAAAANacClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAAAANacClienteKeyTyped
        char caracter = evt.getKeyChar();
        if(Character.isLetter(caracter) || txtAAAANacCliente.getText().length()>1)
        {
            getToolkit().beep();//Sonido
            evt.consume();
        }
    }//GEN-LAST:event_txtAAAANacClienteKeyTyped

    private void NumeroTelefono(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NumeroTelefono
        if(txtTelEmp.getText().length()>9 )
        {
            getToolkit().beep();//Sonido
            evt.consume();
        }
    }//GEN-LAST:event_NumeroTelefono

    private void NumeroTelefonCliente(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NumeroTelefonCliente
        if(txtTelCliente.getText().length()>9)
        {
            getToolkit().beep();//Sonido
            evt.consume();
        }
    }//GEN-LAST:event_NumeroTelefonCliente
    
    private void limiarEquipo()
    {
        txtIdEquipo.setText(null);
        txtNomEquipo.setText(null);
        rtxtDescEquipo.setText(null);
        txtCantEquipo.setText(null);
    }
    // </editor-fold>
    
    
    private void obtnerDatosBD(String NombreTabla,JTable datagrid)
    {
        String textocmd = "SELECT * FROM " + NombreTabla;
        System.out.println(textocmd);
        try{
            if(connection!=null)
            {
                Statement stm = connection.createStatement();
                ResultSet rst = stm.executeQuery(textocmd);
                ResultSetMetaData rsMd = rst.getMetaData();
                int numeroColumnas = rsMd.getColumnCount();
                
                DefaultTableModel modelo = new DefaultTableModel();
                datagrid.setModel(modelo);
                
                for(int i=0;i<numeroColumnas;i++)
                {
                    modelo.addColumn(rsMd.getColumnLabel(i+1));
                }
                while(rst.next())
                {
                    Object [] fila = new Object [numeroColumnas];
                    for(int j=0;j<numeroColumnas;j++)
                    {
                        fila[j] = rst.getObject(j+1);
                    }
                    modelo.addRow(fila);
                }
            }
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }
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
            java.util.logging.Logger.getLogger(From1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(From1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(From1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(From1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new From1().setVisible(true);
            }
        });
    }
    public void abrir_conexion()
    {
        if(connection !=null){
		return;
	}
	String url ="jdbc:postgresql://localhost:5432/sitio_turistico";
	String password ="caracteres";
	try{
	   Class.forName("org.postgresql.Driver");	   
	   connection=DriverManager.getConnection(url,"postgres",password);
	   if(connection!=null){
		   System.out.println("Conectado a Base de Datos...");
	   }
	} catch (Exception e){
		System.out.println("Problemas de Conexion");
	}
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscarEmpleadoVenta;
    private javax.swing.JButton BtnBuscarTransp;
    private javax.swing.JButton BtnEliminarTransp;
    private javax.swing.JButton BtnGuardarEquipo;
    private javax.swing.JButton btnAceptarClienteVenta;
    private javax.swing.JButton btnAceptarEmpleadoVenta;
    private javax.swing.JButton btnBuscarClie;
    private javax.swing.JButton btnBuscarClienteVenta;
    private javax.swing.JButton btnBuscarEmp;
    private javax.swing.JButton btnBuscarEquipo;
    private javax.swing.JButton btnBuscarPqt;
    private javax.swing.JButton btnElimEmp;
    private javax.swing.JButton btnEliminarClie;
    private javax.swing.JButton btnEliminarEquipo;
    private javax.swing.JButton btnEliminarPqt;
    private javax.swing.JButton btnEquipo;
    private javax.swing.JButton btnGuardarClie;
    private javax.swing.JButton btnGuardarEmp;
    private javax.swing.JButton btnGuardarPqt;
    private javax.swing.JButton btnGuardarTranps;
    private javax.swing.JButton btnNuevEmp;
    private javax.swing.JButton btnNuevoClie;
    private javax.swing.JButton btnNuevoEquipo;
    private javax.swing.JButton btnNuevoPqt;
    private javax.swing.JButton btnNuevoTransporte;
    private javax.swing.JButton btnTransporte;
    private javax.swing.JComboBox cmEquipo;
    private javax.swing.JComboBox cmTransporte;
    private javax.swing.JTable dataGridClientes;
    private javax.swing.JTable dataGridEmpleados;
    private javax.swing.JTable dataGridEquipo;
    private javax.swing.JTable dataGridPaquetes;
    private javax.swing.JTable dataGridTransportes;
    private javax.swing.JTable dataGridView7;
    private javax.swing.JTable dataGridViewConsultaVentas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField rtxtDescEquipo;
    private javax.swing.JTextField rtxtDescpTransp;
    private javax.swing.JTextArea rtxtDescripPqt;
    private javax.swing.JTextField txtAAAAInsCliente;
    private javax.swing.JTextField txtAAAANacCliente;
    private javax.swing.JTextField txtAAAANacCliente1;
    private javax.swing.JTextField txtCanTransp;
    private javax.swing.JTextField txtCantEquipo;
    private javax.swing.JTextField txtCapTransp;
    private javax.swing.JTextField txtCostoPqt;
    private javax.swing.JTextField txtDDInsCliente;
    private javax.swing.JTextField txtDDNacCliente;
    private javax.swing.JTextField txtDDNacCliente1;
    private javax.swing.JTextField txtDirCliente;
    private javax.swing.JTextField txtDirEmp;
    private javax.swing.JTextField txtFechaVenta;
    private javax.swing.JTextField txtIdBoletoVenta;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdClienteVenta;
    private javax.swing.JTextField txtIdEmp;
    private javax.swing.JTextField txtIdEmpleadoVenta;
    private javax.swing.JTextField txtIdEquipo;
    private javax.swing.JTextField txtIdEquipoVenta;
    private javax.swing.JTextField txtIdPqt;
    private javax.swing.JTextField txtIdTranps;
    private javax.swing.JTextField txtIdVentaVenta;
    private javax.swing.JTextField txtMMInsCliente;
    private javax.swing.JTextField txtMMNacCliente;
    private javax.swing.JTextField txtMMNacCliente1;
    private javax.swing.JTextField txtNomCliente;
    private javax.swing.JTextField txtNomEmp;
    private javax.swing.JTextField txtNomEquipo;
    private javax.swing.JTextField txtNomTransp;
    private javax.swing.JTextField txtNumBolPqt;
    private javax.swing.JTextField txtNumE;
    private javax.swing.JTextField txtNumT;
    private javax.swing.JTextField txtNumVisClie;
    private javax.swing.JTextField txtTelCliente;
    private javax.swing.JTextField txtTelEmp;
    // End of variables declaration//GEN-END:variables
}
