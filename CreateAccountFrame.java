/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Harshiprabhu
 */
import java.sql.*;
import java.util.*;
import java.util.regex.Pattern;
import javax.swing.*;



public class CreateAccountFrame extends javax.swing.JFrame {

    /**
     * Creates new form CreateAccountFrame
     */
    
    static String FullName;
    static String UserId;
    static String Address;
    static String Password;
    static String Phase;
    static JLabel tfMeterid;
    static JTextField tfFullName;

    
    public CreateAccountFrame() {
        setTitle("Create New Account");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        pCreateAccount = new javax.swing.JPanel();
        lTitle = new javax.swing.JLabel();
        lFullName = new javax.swing.JLabel();
        tfFullName = new javax.swing.JTextField();
        lUserId = new javax.swing.JLabel();
        tfUserId = new javax.swing.JTextField();
        lEmailId = new javax.swing.JLabel();
        tfEmailId = new javax.swing.JTextField();
        lPassword = new javax.swing.JLabel();
        tfPassword = new javax.swing.JTextField();
        lConfirmPassword = new javax.swing.JLabel();
        tfConfirmPassword = new javax.swing.JTextField();
        bSubmit = new javax.swing.JButton();
        bGoBack = new javax.swing.JButton();
        lFullNameWarning = new javax.swing.JLabel();
        lUserIdWarning = new javax.swing.JLabel();
        lEmailIdWarning = new javax.swing.JLabel();
        lPasswordWarning = new javax.swing.JLabel();
        lConfirmPasswordWarning = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                
        lTitle.setFont(new java.awt.Font("Segoe UI Semibold", 0, 22)); // NOI18N
        lTitle.setText("Enter the Details");

        lFullName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        lFullName.setText("Full Name:");

        tfFullName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N

        lUserId.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        lUserId.setText("Customer ID: ");

        tfUserId.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        tfUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUserIdActionPerformed(evt);
            }
        });

        lEmailId.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        lEmailId.setText("Address: ");

        tfEmailId.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N

        lPassword.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        lPassword.setText("Password:");

        tfPassword.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        tfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPasswordActionPerformed(evt);
            }
        });

        lConfirmPassword.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        lConfirmPassword.setText("Phase");

        tfConfirmPassword.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N

        bSubmit.setText("Submit");
        bSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubmitActionPerformed(evt);
            }
        });

        bGoBack.setText("Go Back");
        bGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGoBackActionPerformed(evt);
            }
        });

        lFullNameWarning.setForeground(new java.awt.Color(255, 0, 0));

        lUserIdWarning.setForeground(new java.awt.Color(255, 0, 0));

        lEmailIdWarning.setForeground(new java.awt.Color(255, 0, 0));

        lPasswordWarning.setForeground(new java.awt.Color(255, 0, 0));

        lConfirmPasswordWarning.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout pCreateAccountLayout = new javax.swing.GroupLayout(pCreateAccount);
        pCreateAccount.setLayout(pCreateAccountLayout);
        pCreateAccountLayout.setHorizontalGroup(
            pCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCreateAccountLayout.createSequentialGroup()
                .addGroup(pCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCreateAccountLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(lTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pCreateAccountLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(pCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pCreateAccountLayout.createSequentialGroup()
                                    .addGroup(pCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfFullName, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                        .addComponent(lEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lFullNameWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(38, 38, 38)
                                    .addGroup(pCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfUserId, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                        .addComponent(lUserIdWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(pCreateAccountLayout.createSequentialGroup()
                                    .addGroup(pCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pCreateAccountLayout.createSequentialGroup()
                                            .addGap(167, 167, 167)
                                            .addComponent(bSubmit))
                                        .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pCreateAccountLayout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(lPasswordWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(32, 32, 32)
                                    .addGroup(pCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfConfirmPassword)
                                        .addGroup(pCreateAccountLayout.createSequentialGroup()
                                            .addGroup(pCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(bGoBack)
                                                .addComponent(lConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 91, Short.MAX_VALUE))
                                        .addComponent(lConfirmPasswordWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(tfEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lEmailIdWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        pCreateAccountLayout.setVerticalGroup(
            pCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCreateAccountLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(pCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pCreateAccountLayout.createSequentialGroup()
                        .addComponent(tfUserId)
                        .addGap(3, 3, 3)))
                .addGap(5, 5, 5)
                .addGroup(pCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lFullNameWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lUserIdWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEmailIdWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfPassword)
                    .addGroup(pCreateAccountLayout.createSequentialGroup()
                        .addComponent(tfConfirmPassword)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lConfirmPasswordWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lPasswordWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSubmit)
                    .addComponent(bGoBack))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pCreateAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pCreateAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void bGoBackActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        dispose();
        new Loginform().setVisible(true);
    }                                       

    private void bSubmitActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        
        lFullNameWarning.setText("");
        lUserIdWarning.setText("");
        lEmailIdWarning.setText("");
        lPasswordWarning.setText("");
        lConfirmPasswordWarning.setText("");
        
        FullName = tfFullName.getText();
        UserId = tfUserId.getText();
        Address = tfEmailId.getText();
        Password = tfPassword.getText();
        Phase = tfConfirmPassword.getText();
        
        
        boolean ValidForm = true;
        
        if(FullName.isEmpty()){
            lFullNameWarning.setText("*Full name can't be empty");
            ValidForm = false;
        }
        if(UserId.isEmpty()){
            lUserIdWarning.setText("*UserID can't be empty");
            ValidForm = false;
        }
        else if(Pattern.compile("[^A-Za-z0-9._]").matcher(UserId).find()){
            lUserIdWarning.setText("*Special Characters aren't allowed");
            ValidForm = false;
        }
        if(Address.isEmpty()){
            lEmailIdWarning.setText("*Address can't be empty");
            ValidForm = false;
        }
        if(Password.isEmpty()){
            lPasswordWarning.setText("*Password can't be empty");
            ValidForm = false;
        }
        else{
        if(Password.length()<5){
            lPasswordWarning.setText("*Password is too short");
            ValidForm = false;
        }}
        if(Phase.isEmpty()){
            lConfirmPasswordWarning.setText("*Phase can't be empty");
            ValidForm=false;
        }
        
        boolean done = true;
        if (ValidForm){
           
 try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3308/consumer";
                Connection con = DriverManager.getConnection(url,"root", "1234");
                Statement s = con.createStatement();
                Random r=new Random();
                long number=r.nextLong(1000000)+1;
                String kb=""+number;
                String query = String.format("Insert into signup(userId,FullName,pass,address,phase,meterId,prevread) values('%s','%s','%s','%s','%s','%s','%s')",UserId,FullName, Password,Address,Phase,kb,"0");
                System.out.println(query);
                int n = s.executeUpdate(query);   
            }
            catch(ClassNotFoundException e){}
            catch(SQLIntegrityConstraintViolationException se){
                done=false;
                lUserIdWarning.setText("Customer Name Already Taken");
            }
            catch(SQLException e){
                System.out.println(e);
            }
            
            if (done){ dispose();
            JOptionPane.showMessageDialog(this,"New Account Created Successfully");
            new Loginform().setVisible(true); /*AccountCreatedDialogue.main(new String[1]);*/}
        }
    }                                       

    private void tfPasswordActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void tfUserIdActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        
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
            java.util.logging.Logger.getLogger(CreateAccountFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccountFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccountFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccountFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccountFrame().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton bGoBack;
    private javax.swing.JButton bSubmit;
    private javax.swing.JLabel lConfirmPassword;
    private javax.swing.JLabel lConfirmPasswordWarning;
    private javax.swing.JLabel lEmailId;
    private javax.swing.JLabel lEmailIdWarning;
    private javax.swing.JLabel lFullName;
    private javax.swing.JLabel lFullNameWarning;
    private javax.swing.JLabel lPassword;
    private javax.swing.JLabel lPasswordWarning;
    private javax.swing.JLabel lTitle;
    private javax.swing.JLabel lUserId;
    private javax.swing.JLabel lUserIdWarning;
    private javax.swing.JPanel pCreateAccount;
    private javax.swing.JTextField tfConfirmPassword;
    private javax.swing.JTextField tfEmailId;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfUserId;
    // End of variables declaration                   
}