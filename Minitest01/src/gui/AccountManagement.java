package gui;

import Controller.Controller_Account;
import Model.Account;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AccountManagement extends javax.swing.JFrame {

    String id_ACC;
    Controller_Account controll = new Controller_Account();

    public AccountManagement() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        AccID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        AccNumber = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        AccName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        AccSoDu = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        AccTrangThai = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        ListBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbACC = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUẢN LÝ TÀI KHOẢN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("ID");

        AccID.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        AccID.setForeground(new java.awt.Color(51, 51, 51));
        AccID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccIDActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Số tài khoản ");

        AccNumber.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        AccNumber.setForeground(new java.awt.Color(51, 51, 51));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Tên tài khoản");

        AccName.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        AccName.setForeground(new java.awt.Color(51, 51, 51));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Số dư");

        AccSoDu.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        AccSoDu.setForeground(new java.awt.Color(51, 51, 51));
        AccSoDu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccSoDuMouseClicked(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("Trạng thái");

        AccTrangThai.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        AccTrangThai.setForeground(new java.awt.Color(51, 51, 51));

        AddBtn.setBackground(new java.awt.Color(255, 153, 51));
        AddBtn.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(51, 51, 51));
        AddBtn.setText("ADD");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        EditBtn.setBackground(new java.awt.Color(255, 153, 51));
        EditBtn.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(51, 51, 51));
        EditBtn.setText("EDIT");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(255, 153, 51));
        DeleteBtn.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(51, 51, 51));
        DeleteBtn.setText("DEL");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        ClearBtn.setBackground(new java.awt.Color(255, 153, 51));
        ClearBtn.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(51, 51, 51));
        ClearBtn.setText("CLEAR");
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });

        ListBtn.setBackground(new java.awt.Color(255, 153, 51));
        ListBtn.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ListBtn.setForeground(new java.awt.Color(51, 51, 51));
        ListBtn.setText("LIST");
        ListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(AddBtn)
                        .addGap(28, 28, 28)
                        .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(ClearBtn)
                        .addGap(29, 29, 29)
                        .addComponent(ListBtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AccID, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(AccNumber)
                            .addComponent(AccName))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AccSoDu, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(AccTrangThai))))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AccID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AccNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AccSoDu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AccTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AccName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn)
                    .addComponent(EditBtn)
                    .addComponent(DeleteBtn)
                    .addComponent(ClearBtn)
                    .addComponent(ListBtn))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tbACC.setBackground(new java.awt.Color(0, 0, 0));
        tbACC.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tbACC.setForeground(new java.awt.Color(255, 255, 255));
        tbACC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Số tài khoản", "Tên tài khoản", "Số dư", "Trạng thái"
            }
        ));
        tbACC.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbACC.setRowHeight(25);
        tbACC.setSelectionBackground(new java.awt.Color(255, 153, 51));
        tbACC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbACCMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbACC);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void fillDataTable() {
        DefaultTableModel model = (DefaultTableModel) tbACC.getModel();
        model.setRowCount(0);
        for (Account acc : controll.getAllAccounts()) {
            Object dataRow[] = new Object[5];
            dataRow[0] = acc.getId();
            dataRow[1] = acc.getAccountNumber();
            dataRow[2] = acc.getAccountName();
            dataRow[3] = acc.getBalance();
            dataRow[4] = acc.getStatus();
            model.addRow(dataRow);
        }
    }

    private void resetFrom() {
        AccID.setText("");
        AccName.setText("");
        AccNumber.setText("");
        AccSoDu.setText("");
        AccTrangThai.setText("");
    }

    public boolean validateForm() {
        if (AccID.getText().isEmpty() || AccNumber.getText().isEmpty() || AccName.getText().isEmpty() || AccTrangThai.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    public Account getModel() {
        Account acc = new Account();
        acc.setId(Long.parseLong(AccID.getText()));
        acc.setAccountNumber(AccNumber.getText());
        acc.setAccountName(AccName.getText());
        acc.setBalance(Double.parseDouble(AccSoDu.getText()));
        acc.setStatus(Integer.parseInt(AccTrangThai.getText()));
        return acc;
    }

    public void setModel(Account acc) {
        AccID.setText(String.valueOf(acc.getId()));
        AccNumber.setText(acc.getAccountNumber());
        AccName.setText(acc.getAccountName());
        AccSoDu.setText(String.valueOf(acc.getBalance()));
        AccTrangThai.setText(String.valueOf(acc.getStatus()));
    }

    private void AccIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccIDActionPerformed

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_AddBtnMouseClicked

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        int status = Integer.parseInt(AccTrangThai.getText());
        String tenTK = AccName.getText();
        String soTK = AccNumber.getText();
        String trangthai = AccTrangThai.getText();
        if (validateForm()) {
            Account acc = getModel();
            try {
                if (controll.add(acc) > 0 && controll.CheckDoDaiSoAcc(soTK) == 0 && controll.CheckTenAcc(tenTK) > 0) {
                    if (controll.Status(status) == 0) {
                        AccTrangThai.setText("Hết hiệu lực");
                        JOptionPane.showMessageDialog(this, "Thêm thành công");
                        fillDataTable();
                    } else if (controll.Status(status) == 1) {
                        AccTrangThai.setText("Hiệu lực");
                        JOptionPane.showMessageDialog(this, "Thêm thành công");
                        fillDataTable();
                    } else if (controll.Status(status) == 2) {
                        AccTrangThai.setText("Tạm khóa");
                        JOptionPane.showMessageDialog(this, "Thêm thành công");
                        fillDataTable();
                    }
                } else if(controll.CheckDoDaiSoAcc(soTK) == 1){
                    JOptionPane.showMessageDialog(this, "Số tài khoản phải có 12 chữ số");
                }else if(controll.CheckTenAcc(tenTK) <0){
                    JOptionPane.showMessageDialog(this, "Tên tài khoản phải có độ dài ít nhất là 5");
                }else {
                    JOptionPane.showMessageDialog(this, "Trùng ID");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Lỗi:" + e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn hãy nhập đầy đủ thông tin");
        }
    }//GEN-LAST:event_AddBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        if (validateForm()) {
            Account acc = getModel();
            try {
                if (controll.edit(acc) > 0) {
                    JOptionPane.showMessageDialog(this, "Sửa thành công");
                    fillDataTable();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Lỗi:" + e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn hãy nhập đầy đủ thông tin");
        }
    }//GEN-LAST:event_EditBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        if (AccID.getText().isEmpty() || id_ACC.length() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập id để xóa");
        } else {
            try {
                if (id_ACC.length() > 0) {
                    controll.del(id_ACC);
                } else {
                    controll.del(AccID.getText());
                }
                fillDataTable();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Lỗi:" + e.toString());
            }
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        resetFrom();
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void ListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListBtnActionPerformed
        fillDataTable();

    }//GEN-LAST:event_ListBtnActionPerformed

    private void tbACCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbACCMouseClicked
        int id = tbACC.rowAtPoint(evt.getPoint());
        id_ACC = tbACC.getValueAt(id, 0).toString();
        try {
            Account acc = controll.findByID(id_ACC);
            setModel(acc);
        } catch (Exception ex) {
        }

    }//GEN-LAST:event_tbACCMouseClicked

    private void AccSoDuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccSoDuMouseClicked
        AccSoDu.setText("100000");
    }//GEN-LAST:event_AccSoDuMouseClicked

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
            java.util.logging.Logger.getLogger(AccountManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccID;
    private javax.swing.JTextField AccName;
    private javax.swing.JTextField AccNumber;
    private javax.swing.JTextField AccSoDu;
    private javax.swing.JTextField AccTrangThai;
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JButton ListBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbACC;
    // End of variables declaration//GEN-END:variables
}
