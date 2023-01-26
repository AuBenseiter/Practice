
package cl.duoc.veterinaria.GUI;

import cl.duoc.veterinaria.Services.App.ListarCliente;

public class vwClienteListar extends javax.swing.JInternalFrame {

    ListarCliente Ilista;
            
    public vwClienteListar( ListarCliente Ilista) {
        this.Ilista = Ilista;
        initComponents();
               
        
        String matriz [][] = new String [Ilista.Listar().size()][8];

        for (int i = 0; i < Ilista.Listar().size(); i++) {
            String id= Integer.toString(Ilista.Listar().get(i).getId());
            String rut = Integer.toString(Ilista.Listar().get(i).getRut());
            matriz[i][0]=id;
            matriz[i][1] = Ilista.Listar().get(i).getNombre();
            matriz[i][2]=rut;
            matriz[i][3]=Ilista.Listar().get(i).getDv();
            matriz[i][4]=Ilista.Listar().get(i).getDireccion();
            matriz[i][5]=Ilista.Listar().get(i).getComuna();
            matriz[i][6]=Ilista.Listar().get(i).getCorreo();
            matriz[i][7]=Ilista.Listar().get(i).getEmpresa();
        }
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
        matriz,
        new String [] {
                "Id", "Nombre", "Rut", "dv", "Direccion", "Comuna", "Correo", "Empresa"
            }
        ));
        jScrollPane2.setViewportView(jTable1);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Lista de Clientes");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Rut", "dv", "Direccion", "Comuna", "Correo", "Empresa"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addContainerGap(484, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(396, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
