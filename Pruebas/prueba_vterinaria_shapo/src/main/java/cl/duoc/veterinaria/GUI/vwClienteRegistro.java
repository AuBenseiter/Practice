/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package cl.duoc.veterinaria.GUI;

import cl.duoc.veterinaria.DTO.dtoCliente;
import cl.duoc.veterinaria.Services.App.ListarCliente;
import javax.swing.JButton;


public class vwClienteRegistro extends javax.swing.JInternalFrame {

    
    //ArrayList<dtoCliente> lista = new ArrayList();
    
    ListarCliente Ilista;
    
    
    public vwClienteRegistro( ListarCliente Ilista) {
        this.Ilista = Ilista;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRegisCliente = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtRut = new javax.swing.JTextField();
        txtDv = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        comboComuna = new javax.swing.JComboBox<>();
        txtDireccion = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtMostrar = new javax.swing.JScrollPane();
        txtMostrarAA = new javax.swing.JTextArea();
        comboEmpresa = new javax.swing.JCheckBox();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        pnlRegisCliente.setAutoscrolls(true);
        pnlRegisCliente.setDoubleBuffered(true);
        pnlRegisCliente.setFocusTraversalPolicyProvider(true);
        pnlRegisCliente.setInheritsPopupMenu(true);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Porfavor complete todos los datos con su informacion personal");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre completo");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Rut");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Direccion");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Correo");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefono");

        btnRegistro.setText("Registrar");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        comboComuna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione su comuna", "Santiago", "Curico", "Colina", "San Joaquin", "Melipilla", " " }));

        txtMostrarAA.setColumns(20);
        txtMostrarAA.setRows(5);
        txtMostrar.setViewportView(txtMostrarAA);

        comboEmpresa.setText("Marque si es empresa");

        pnlRegisCliente.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlRegisCliente.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlRegisCliente.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlRegisCliente.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlRegisCliente.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlRegisCliente.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlRegisCliente.setLayer(btnRegistro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlRegisCliente.setLayer(btnLimpiar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlRegisCliente.setLayer(txtNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlRegisCliente.setLayer(txtRut, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlRegisCliente.setLayer(txtDv, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlRegisCliente.setLayer(txtTelefono, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlRegisCliente.setLayer(comboComuna, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlRegisCliente.setLayer(txtDireccion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlRegisCliente.setLayer(txtCorreo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlRegisCliente.setLayer(txtMostrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlRegisCliente.setLayer(comboEmpresa, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pnlRegisClienteLayout = new javax.swing.GroupLayout(pnlRegisCliente);
        pnlRegisCliente.setLayout(pnlRegisClienteLayout);
        pnlRegisClienteLayout.setHorizontalGroup(
            pnlRegisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegisClienteLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(pnlRegisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegisClienteLayout.createSequentialGroup()
                        .addGroup(pnlRegisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(pnlRegisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre)
                            .addGroup(pnlRegisClienteLayout.createSequentialGroup()
                                .addComponent(comboComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlRegisClienteLayout.createSequentialGroup()
                                .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDv))
                            .addComponent(txtDireccion)))
                    .addGroup(pnlRegisClienteLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(pnlRegisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(31, 31, 31)
                        .addGroup(pnlRegisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboEmpresa))))
                .addGap(31, 31, 31))
            .addGroup(pnlRegisClienteLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegisClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlRegisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlRegisClienteLayout.createSequentialGroup()
                        .addComponent(btnRegistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiar))
                    .addComponent(txtMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(174, 174, 174))
        );
        pnlRegisClienteLayout.setVerticalGroup(
            pnlRegisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisClienteLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(pnlRegisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRegisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(pnlRegisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlRegisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(comboComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlRegisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRegisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(comboEmpresa)
                .addGap(18, 18, 18)
                .addGroup(pnlRegisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistro)
                    .addComponent(btnLimpiar))
                .addGap(18, 18, 18)
                .addComponent(txtMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlRegisCliente)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlRegisCliente)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        //Validaciones 
        String nombre = txtNombre.getText();
        int rut = Integer.parseInt(txtRut.getText());
        String dv = txtDv.getText();
        String direccion = txtDireccion.getText();
        String comuna = comboComuna.getSelectedItem().toString();
        int telefono= Integer.parseInt(txtTelefono.getText());
        String correo = txtCorreo.getText();
        boolean empresa = comboEmpresa.isSelected();
        
        dtoCliente regisCliente = new dtoCliente(empresa, rut, dv, nombre, correo, direccion, comuna);
        Ilista.GuardarCliente(regisCliente);
        
        txtMostrarAA.setText(regisCliente.toString());
        
      
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNombre.setText("");
        txtRut.setText("");
        txtDv.setText("");
        txtDireccion.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
        comboComuna.setSelectedIndex(0);
        comboEmpresa.setSelected(false);
        txtMostrarAA.setText("");
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    public JButton getBtnRegistro() {
        return btnRegistro;
    }

    public void setBtnRegistro(JButton btnRegistro) {
        this.btnRegistro = btnRegistro;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JComboBox<String> comboComuna;
    private javax.swing.JCheckBox comboEmpresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JDesktopPane pnlRegisCliente;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDv;
    private javax.swing.JScrollPane txtMostrar;
    private javax.swing.JTextArea txtMostrarAA;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
