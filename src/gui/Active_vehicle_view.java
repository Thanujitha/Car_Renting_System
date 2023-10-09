/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.MySql;

/**
 *
 * @author Thanujitha
 */
public class Active_vehicle_view extends javax.swing.JPanel {

    /**
     * Creates new form Active_vehicle
     */
    public Active_vehicle_view() {
        initComponents();
        lordTable();
    }

    public void lordTable() {
        try {

            ResultSet rs = MySql.search("SELECT * FROM add_new_vehical INNER JOIN user ON user.id=add_new_vehical.user_id INNER JOIN vehicle_brand ON vehicle_brand.id=add_new_vehical.vehicle_brand_id\n"
                    + "INNER JOIN vehicle_model ON vehicle_model.id=add_new_vehical.vehicle_model_id INNER JOIN vehicle_status ON vehicle_status.id = add_new_vehical.vehicle_status_id\n"
                    + "INNER JOIN vehicle_colity ON vehicle_colity.id= add_new_vehical.vehicle_colity_id INNER JOIN vehicle_type ON vehicle_type.id = add_new_vehical.vehicle_type_id \n"
                    + "WHERE vehicle_colity.name='Yes' AND `vehicle_status`.`name`='Pending' ORDER BY add_new_vehical.id ASC;");

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("add_new_vehical.id"));
                v.add(rs.getString("add_new_vehical.vehical_no"));
                v.add(rs.getString("add_new_vehical.chassi_no"));
                v.add(rs.getString("user.fname") + " " + rs.getString("user.lname"));
                v.add(rs.getString("user.contact_no"));
                v.add(rs.getString("vehicle_brand.name"));
                v.add(rs.getString("vehicle_model.name"));
                v.add(rs.getString("vehicle_type.name"));

                dtm.addRow(v);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void lordTable(String i) {
        try {

            ResultSet rs = MySql.search("SELECT * FROM add_new_vehical INNER JOIN user ON user.id=add_new_vehical.user_id INNER JOIN vehicle_brand ON vehicle_brand.id=add_new_vehical.vehicle_brand_id\n"
                    + "INNER JOIN vehicle_model ON vehicle_model.id=add_new_vehical.vehicle_model_id INNER JOIN vehicle_status ON vehicle_status.id = add_new_vehical.vehicle_status_id\n"
                    + "INNER JOIN vehicle_colity ON vehicle_colity.id= add_new_vehical.vehicle_colity_id INNER JOIN vehicle_type ON vehicle_type.id = add_new_vehical.vehicle_type_id \n"
                    + "WHERE vehicle_colity.name='Yes' AND `vehicle_status`.`name`='Pending' AND `add_new_vehical`.`vehical_no` LIKE '%" + i + "%' ORDER BY add_new_vehical.id ASC;");

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("add_new_vehical.id"));
                v.add(rs.getString("add_new_vehical.vehical_no"));
                v.add(rs.getString("add_new_vehical.chassi_no"));
                v.add(rs.getString("user.fname") + " " + rs.getString("user.lname"));
                v.add(rs.getString("user.contact_no"));
                v.add(rs.getString("vehicle_brand.name"));
                v.add(rs.getString("vehicle_model.name"));
                v.add(rs.getString("vehicle_type.name"));

                dtm.addRow(v);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this cod e. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Activate the vehicle");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Vehicle Number:");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Vehicle No", "Chassis Number", "Supplier Name", "Supplier Contact number", "Brand", "Model", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("Check the vehicle colity (click the vehicle)");
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1183, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

        if (evt.getClickCount() == 2) {
            int r = jTable1.getSelectedRow();

            if (r == -1) {
                JOptionPane.showMessageDialog(this, "Please select a vehicle", "Warning", JOptionPane.WARNING_MESSAGE);

            } else {
                String id = jTable1.getValueAt(r, 0).toString();

                Active_vehicle av = new Active_vehicle(id,this);
                av.setVisible(true);

            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        String vn = jTextField1.getText();
        lordTable(vn);
    }//GEN-LAST:event_jTextField1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
