/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui.UserandPoliceUI;

//import DB4OUtil.DB4OUtil;
import Business.Ecosystem;
import Model.Users.User;
import Model.Users.UserDirectory;
import SQL_Connection.SQL_Connect;
import java.sql.SQLException;
import static java.time.Clock.system;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author keerthanaakannan
 */
public class RegisterPanel extends javax.swing.JPanel {
private Ecosystem system;
    //private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    /**
     * Creates new form RegisterPanel
     */
    SQL_Connect sqlConnect;
    public RegisterPanel() throws SQLException {
        initComponents();
        //system = dB4OUtil.retrieveSystem();
        this.sqlConnect = new SQL_Connect();
//        Ecosystem.setInstance(system);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        register = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblUsername1 = new javax.swing.JLabel();
        UserTxt = new javax.swing.JTextField();
        lblPass2 = new javax.swing.JLabel();
        UserPassword = new javax.swing.JPasswordField();
        lblPass3 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 22)); // NOI18N
        jLabel2.setText("REGISTER");

        lblUsername1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblUsername1.setForeground(new java.awt.Color(0, 0, 0));
        lblUsername1.setText("Username:");

        UserTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserTxtActionPerformed(evt);
            }
        });

        lblPass2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblPass2.setForeground(new java.awt.Color(0, 0, 0));
        lblPass2.setText("Password:");

        lblPass3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblPass3.setForeground(new java.awt.Color(0, 0, 0));
        lblPass3.setText("Role");

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Police", "Prison", "LawFirmAdmin", "LawFirmManager", "HospAdmin", "Doctor", "Lawyer", "DistrictCourtJudge", "HighCourtJudge", "SupremeJudge" }));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
        register.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerLayout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsername1)
                    .addComponent(lblPass2)
                    .addComponent(lblPass3))
                .addGap(31, 31, 31)
                .addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UserTxt)
                    .addComponent(UserPassword)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(173, 173, 173))
            .addGroup(registerLayout.createSequentialGroup()
                .addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel2))
                    .addGroup(registerLayout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(89, 89, 89)
                .addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername1)
                    .addComponent(UserTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPass2)
                    .addComponent(UserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPass3)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103)
                .addComponent(jButton1)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1102, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(270, 270, 270)
                    .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(271, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(54, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void UserTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserTxtActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //login.setVisible(false);
        //register.setVisible(true);
        UserDirectory userDir=new UserDirectory();
//        User user=new User();
        String username=UserTxt.getText();
        String password=String.valueOf(UserPassword.getPassword());
        String usertype=(String) type.getSelectedItem();
        String query = "INSERT INTO public.\"User\"(\"Username\",\"Password\",\"Usertype\")\n" +
                       "VALUES ('"+ username + "','"+ password + "','"+ usertype +"');";
        java.sql.Statement stat = sqlConnect.retStatement();
    try {
        stat.execute(query);
    } catch (SQLException ex) {
        Logger.getLogger(RegisterPanel.class.getName()).log(Level.SEVERE, null, ex);
    }
        User user=userDir.createUserAccount(username, password, usertype);
        userDir.setUserList(user);
//        newUser.setUserName(username);
//        newUser.setPassword(password);
//        newUser.setUserType(usertype);
//        system.getUserDirectory().createCase(newUser);
//        dB4OUtil.storeSystem(system);
//        Ecosystem.setInstance(system);
//        system = dB4OUtil.retrieveSystem();
        //container.setVisible(true);
        //f=new JFrame();
        JOptionPane.showMessageDialog(null,"User Registered");
        //CardLayout layout = (CardLayout) container.getLayout();
        //layout.next(container);
        //CardLayout layout = (CardLayout) container.getLayout();
        //layout.next(container);
        

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField UserPassword;
    private javax.swing.JTextField UserTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblPass2;
    private javax.swing.JLabel lblPass3;
    private javax.swing.JLabel lblUsername1;
    private javax.swing.JPanel register;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
