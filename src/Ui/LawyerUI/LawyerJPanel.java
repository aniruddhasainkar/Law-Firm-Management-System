/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui.LawyerUI;

import Ui.UserandPoliceUI.CreateCaseJPanel;

/**
 *
 * @author aniruddhasainkar
 */
public class LawyerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LawyerJPanel
     */
    public LawyerJPanel() {
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

        lawyerPanel = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnCreatecaseuser = new javax.swing.JButton();
        btnViewcaseuser = new javax.swing.JButton();
        btnViewcaseuser1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        lawyerPanel.setDividerLocation(-10);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        btnCreatecaseuser.setText("Create Case");
        btnCreatecaseuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatecaseuserActionPerformed(evt);
            }
        });

        btnViewcaseuser.setText("Appointments");
        btnViewcaseuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewcaseuserActionPerformed(evt);
            }
        });

        btnViewcaseuser1.setText("View Case");
        btnViewcaseuser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewcaseuser1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCreatecaseuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnViewcaseuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnViewcaseuser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(btnCreatecaseuser)
                .addGap(38, 38, 38)
                .addComponent(btnViewcaseuser1)
                .addGap(50, 50, 50)
                .addComponent(btnViewcaseuser)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        lawyerPanel.setLeftComponent(jPanel1);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("Lawyer Panel");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel1)
                .addContainerGap(264, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(409, Short.MAX_VALUE))
        );

        lawyerPanel.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lawyerPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lawyerPanel)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreatecaseuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatecaseuserActionPerformed
        // TODO add your handling code here:
        CreateCaseJPanel createcase=new CreateCaseJPanel();
        lawyerPanel.setRightComponent(createcase);
    }//GEN-LAST:event_btnCreatecaseuserActionPerformed

    private void btnViewcaseuser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewcaseuser1ActionPerformed
        // TODO add your handling code here:
        ViewCaseLawyer lawcase = new ViewCaseLawyer();
        lawyerPanel.setRightComponent(lawcase);
    }//GEN-LAST:event_btnViewcaseuser1ActionPerformed

    private void btnViewcaseuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewcaseuserActionPerformed
        // TODO add your handling code here:
        ViewAppointmentJPanel app=new ViewAppointmentJPanel();
        lawyerPanel.setRightComponent(app);
    }//GEN-LAST:event_btnViewcaseuserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreatecaseuser;
    private javax.swing.JButton btnViewcaseuser;
    private javax.swing.JButton btnViewcaseuser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane lawyerPanel;
    // End of variables declaration//GEN-END:variables
}
