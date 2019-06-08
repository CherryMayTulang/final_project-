
import DB.data;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import DB.data;
import javax.swing.table.TableColumnModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cherry may tulang
 */
public class InformationSystem extends javax.swing.JFrame {

    /**
     * Creates new form InformationSystem
     */
    public InformationSystem() {
        initComponents();
        setLocationRelativeTo(null);
        setInfo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblinformation = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnadd = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        tftsearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tftaddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tftfirstname = new javax.swing.JTextField();
        tftmiddlename = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbage = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        tftlastname = new javax.swing.JTextField();
        tfthighesteducationalattainment = new javax.swing.JTextField();
        cbgender = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        ibid = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel3.setText("THE EMPLOYEE DETAILS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(21, 21, 21))
        );

        tblinformation.setBackground(new java.awt.Color(255, 51, 51));
        tblinformation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblinformation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "First Name", "Middle Name", "Last Name", "Address", "Age", "Gender", "Highest Educational Attainment:"
            }
        ));
        tblinformation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblinformationMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblinformation);
        if (tblinformation.getColumnModel().getColumnCount() > 0) {
            tblinformation.getColumnModel().getColumn(0).setPreferredWidth(3);
        }

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));
        jPanel3.setForeground(new java.awt.Color(255, 102, 102));

        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnupdate.setText("update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        tftsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tftsearchActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnadd)
                .addGap(28, 28, 28)
                .addComponent(btnupdate)
                .addGap(38, 38, 38)
                .addComponent(btndelete)
                .addGap(70, 70, 70)
                .addComponent(tftsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(54, 54, 54))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd)
                    .addComponent(btndelete)
                    .addComponent(btnupdate)
                    .addComponent(tftsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(27, 27, 27))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setForeground(new java.awt.Color(102, 102, 255));

        jLabel2.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 153));
        jLabel2.setText("Age");

        jLabel4.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 153));
        jLabel4.setText("First Name:");

        jLabel7.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 153));
        jLabel7.setText("Address:");

        jLabel9.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 153));
        jLabel9.setText("Highest Educational Attainment:");

        jLabel5.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 153));
        jLabel5.setText("Middle Name:");

        tftfirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tftfirstnameActionPerformed(evt);
            }
        });

        tftmiddlename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tftmiddlenameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("NSimSun", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("FULL NAME");

        jLabel8.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 153));
        jLabel8.setText("Gender");

        cbage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "19", "20", "21", "23", "24", "25", "30", "31", "32", "29", "28", " " }));

        jLabel6.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 153));
        jLabel6.setText("Last Name:");

        tfthighesteducationalattainment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfthighesteducationalattainmentActionPerformed(evt);
            }
        });

        cbgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        cbgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbgenderActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jLabel11.setText("id");

        ibid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ibidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfthighesteducationalattainment)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tftaddress)
                            .addComponent(tftmiddlename)
                            .addComponent(tftfirstname)
                            .addComponent(tftlastname)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ibid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cbage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(cbgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(ibid, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tftfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tftmiddlename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tftlastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tftaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(13, 13, 13)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfthighesteducationalattainment, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfthighesteducationalattainmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfthighesteducationalattainmentActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tfthighesteducationalattainmentActionPerformed

    private void tftmiddlenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tftmiddlenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tftmiddlenameActionPerformed

    private void tftfirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tftfirstnameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tftfirstnameActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
//        DefaultTableModel model = (DefaultTableModel) tblinformation.getModel();
//       if(!tftfirstname.getText(). trim().equals("")){
//           model.addRow(new Object [] {tftfirstname.getText(),tftmiddlename.getText(), tftlastname.getText(),tftaddress.getText(),
//        cbgender.getSelectedItem(), cbage.getSelectedItem(),tfteducationalbackground.getText()});
//                   {
//           }
//       }

        DefaultTableModel model = (DefaultTableModel) tblinformation.getModel();
        if (ibid.getText().equals("") && !tftfirstname.getText().equals("")) {
            add();
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Profile", "Error", JOptionPane.ERROR_MESSAGE);
        }
        setInfo();
        clearFields();

    }//GEN-LAST:event_btnaddActionPerformed

    private void cbgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbgenderActionPerformed

    private void tftsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tftsearchActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_tftsearchActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
//        DefaultTableModel model = (DefaultTableModel) tblinformation.getModel();
//        if (tblinformation.getSelectedRow() == -1) {
//            if (tblinformation.getRowCount() == 0) {
//                /* JOptionPane.showMessageDialog(null,"Table is Empty","Warning",JOptionPane.ERROR_MESSAGE);
//                 */
//            } else {
//                JOptionPane.showMessageDialog(null, "You did not click the specific data in the table", "Warning", JOptionPane.ERROR_MESSAGE);
//            }
//        } else {
//            model.removeRow(tblinformation.getSelectedRow());
        int id = Integer.parseInt(lblID.getText());
        deleteInfo(id);
        clearFields();
        setTable();


    }//GEN-LAST:event_btndeleteActionPerformed
    
    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
//        // TODO add your handling code here: 
//
//        DefaultTableModel model = (DefaultTableModel) tblinformation.getModel();
//        if (tblinformation.getSelectedRow() == -1) {
//            if (tblinformation.getRowCount() == 0) {
//                /* JOptionPane.showMessageDialog(null,"Table is Empty","Warning",JOptionPane.ERROR_MESSAGE);
//                 */
//            } else {
//                JOptionPane.showMessageDialog(null, "You did not click the specific data in the table", "Warning", JOptionPane.ERROR_MESSAGE);
//
//            }
//
//        } else {
//
//            model.setValueAt(tftfirstname.getText(), tblinformation.getSelectedRow(), 0);
//            model.setValueAt(tftmiddlename.getText(), tblinformation.getSelectedRow(), 1);
//            model.setValueAt(tftlastname.getText(), tblinformation.getSelectedRow(), 2);
//            model.setValueAt(tftaddress.getText(), tblinformation.getSelectedRow(), 3);
//            model.setValueAt(cbage.getSelectedItem(), tblinformation.getSelectedRow(), 4);
//            model.setValueAt(cbgender.getSelectedItem(), tblinformation.getSelectedRow(), 5);
//            model.setValueAt(tfteducationalbackground.getText(), tblinformation.getSelectedRow(), 6);
//
//        }
             if (!ibid.getText().equals("")) {
                 int n = Integer.parseInt(ibid.getText());
            updateInformationSystem(n);
        } else {
            int id = Integer.parseInt(lblID.getText());
            updateInformationSystem(id);
        }
        
        setInfo();
        clearFields();
      


    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
          setTable();

    }//GEN-LAST:event_btnSearchActionPerformed

    private void tblinformationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblinformationMouseClicked
        int id = tblinformation.getSelectedRow();
        lblID.setText(tblinformation.getValueAt(id, 0).toString());
        tftfirstname.setText(tblinformation.getValueAt(id, 1).toString());
        tftmiddlename.setText(tblinformation.getValueAt(id, 2).toString());
        tftlastname.setText(tblinformation.getValueAt(id, 3).toString());
        tftaddress.setText(tblinformation.getValueAt(id, 4).toString());
        cbage.setSelectedItem(tblinformation.getValueAt(id, 5).toString());
        cbgender.setSelectedItem(tblinformation.getValueAt(id, 6).toString());
        tfthighesteducationalattainment.setText(tblinformation.getValueAt(id,7).toString());
        
    }//GEN-LAST:event_tblinformationMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       EmployeeSystem  E = new EmployeeSystem();
       E.setVisible(true);
       E.setLocationRelativeTo(null);
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ibidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ibidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ibidActionPerformed
    private void tfinformationKeyTyped(java.awt.event.KeyEvent evt) {
        char ch = evt.getKeyChar();
        if (!(Character.isDigit(ch) || (ch == KeyEvent.VK_BACK_SPACE) || ch == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
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
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InformationSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformationSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformationSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformationSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformationSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbage;
    private javax.swing.JComboBox<String> cbgender;
    private javax.swing.JTextField ibid;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblID;
    private javax.swing.JTable tblinformation;
    private javax.swing.JTextField tftaddress;
    private javax.swing.JTextField tftfirstname;
    private javax.swing.JTextField tfthighesteducationalattainment;
    private javax.swing.JTextField tftlastname;
    private javax.swing.JTextField tftmiddlename;
    private javax.swing.JTextField tftsearch;
    // End of variables declaration//GEN-END:variables

    private void setTable() {
        try {
            String s = tftsearch.getText();
            String[][] Data = employeedetails.arraylistTo2dArray(employeedetails.searchemployeeByName(s));
            String[] columnNames = {"ID", "firstname", "middleame", "lastname", "address", "age", "gender", "highesteducationalattainment",};

            tblinformation.setModel(new DefaultTableModel(Data, columnNames));
        } catch (SQLException ex) {
            Logger.getLogger(InformationSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addTable() {
        String firstname = tftfirstname.getText();
        String middlename = tftmiddlename.getText();
        String lastname = tftlastname.getText();
        String address = tftaddress.getText();
        String age = cbage.getSelectedItem().toString();
        String gender = cbgender.getSelectedItem().toString();
        String highesteducationalattainment = tfthighesteducationalattainment.getText();

        String q = "INSERT INTO `employeedetails` (`id`, `firstname`, `middlename`, `lastname`, `address`, `age`, `gender`,`highesteducationalattainment`)"
                + " VALUES (NULL, '%s', '%s', '%s', '%s', '%s', '%s',  '%s',  '%s');";

        q = String.format(q, firstname, middlename, lastname, address, age, gender, highesteducationalattainment );

        try {
            data.query(q, true);
            setEmployeeTable();
            clearFields();
            JOptionPane.showMessageDialog(null, "Successfully Added datas!");

        } catch (SQLException ex) {
            Logger.getLogger(InformationSystem.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void clearFields() {
        ibid.setText("");
        tftfirstname.setText("");
        tftmiddlename.setText("");
        tftlastname.setText("");
        tftaddress.setText("");
        cbage.setSelectedItem("");
        cbgender.setSelectedItem("");
        tfthighesteducationalattainment.setText("");
    }

    private void setEmployeeTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public void deleteInfo(int id){
     String q = "DELETE FROM `employeedetails` WHERE `employeedetails`.`id` = %d";

        q = String.format(q, id);

        try {
            data.query(q, true);
            JOptionPane.showMessageDialog(null, "Successfully Deleted");
        } catch (SQLException ex) {
            Logger.getLogger(InformationSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        setInfo();
        clearFields();
}
    private void updateInformationSystem(int id) {
        String firstname = tftfirstname.getText();
        String middlename = tftmiddlename.getText();
        String lastname = tftlastname.getText();
        String address = tftaddress.getText();
        String age = cbage.getSelectedItem().toString();
        String gender = cbgender.getSelectedItem().toString();
        String highesteducationalattainment = tfthighesteducationalattainment.getText();
        
//        UPDATE `employeeinformationsystem`.`employeedetails` SET `lastname` = 'nnkjhss' WHERE `employeedetails`.`id` =3;

//        String q = "UPDATE `employeedetails` SET `firstname` = '%s',`middlename` = '%s',`lastname` = '%s',"
//                + "`address` = '%s',`age` = '%s',`gender` = '%s',`educ` = '%s',"
//                + "WHERE `employeedetails`.`id` = %d";

        String q = "UPDATE `employeedetails` SET `firstname` = '%s',"
                + "`middlename` = '%s',`lastname` = '%s',`address` = '%s',`age` = '%s',`gender` = '%s',"
                + "`educ` = '%s' "
                + "WHERE `employeedetails`.`id` = '%d'";
        q = String.format(q, firstname, middlename, lastname, address, age, gender, highesteducationalattainment , id);
        System.out.println(q);
        try {
            data.query(q, true);
            JOptionPane.showMessageDialog(null, "Successfully Updated");
        } catch (SQLException ex) {
            Logger.getLogger(InformationSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void add() {
        String fname = tftfirstname.getText();
        String middlename = tftmiddlename.getText();
        String lastname = tftlastname.getText();
        String address = tftaddress.getText();
        String age = cbage.getSelectedItem().toString();
        String gender = cbgender.getSelectedItem().toString();
        String highesteducationalattainment = tfthighesteducationalattainment.getText();

//        String q = "INSERT INTO `activity` (`id`, `fname`, `mname`, `lname`, `time`, `date`, `activity`)"
//                + " VALUES (NULL, '%s', '%s', '%s', '%s', '%s', '%s')";
        String q = "INSERT INTO `employeeinformationsystem`.`employeedetails` (`id`, `firstname`, `middlename`, "
                + "`lastname`, `address`, `age`, `gender`, `educ`)"
                + " VALUES (NULL, '%s', '%s', '%s', '%s', '%s', '%s', '%s')";

        q = String.format(q, fname, middlename, lastname, address, age, gender,highesteducationalattainment );
        
        try {
            data.query(q, true);
            JOptionPane.showMessageDialog(null, "Successfully added");
        } catch (SQLException ex) {
            Logger.getLogger(InformationSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setInfo() {

        try {
            String s = tftsearch.getText();
            String[][] data = employeedetails.arraylistTo2dArray(employeedetails.searchemployeeByName(s));
            String[] columnNames = {"ID", "First Name", "Middle Name", "Last Name", "Address", "Age",
                "Gender", " highesteducationalattainment "};
            DefaultTableModel pro = new DefaultTableModel(data, columnNames);
            tblinformation.setModel(pro);
            TableColumnModel column = tblinformation.getColumnModel();
            tblinformation.setColumnModel(column);

        } catch (SQLException ex) {
            Logger.getLogger(InformationSystem.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
