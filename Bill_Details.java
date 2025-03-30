
import java.awt.event.KeyEvent;
import javax.swing.event.AncestorEvent;
import java.sql.*;
public class Bill_Details extends javax.swing.JFrame {

    /**
     * Creates new form Bill_Details
     */
    static String a,prev,cur,unit,phase;
    public Bill_Details() {
        initComponents();
        try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/consumer";
                Connection con = DriverManager.getConnection(url,"root", "Trisha@16");
                Statement s = con.createStatement();
                String query = String.format("Select * from signup where userId='"+Loginform.name+"'");
                System.out.println(query);
                ResultSet rs = s.executeQuery(query);
                boolean f = rs.next();
                txtcname.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16));
                txtcname.setText(rs.getString(2));
                txtcid.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16));
                txtcid.setText(rs.getString(1));
                setTitle("Bill Details");
                txtmeterid.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16));
                txtmeterid.setText(rs.getString(6));
                txtpreread.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16));
                prev=rs.getString(7);
                txtpreread.setText(prev);
                phase=rs.getString(5);
            }
            catch(ClassNotFoundException e){}
            catch(SQLIntegrityConstraintViolationException se){
            }
            catch(SQLException e){
                System.out.println(e);
            }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcurread = new javax.swing.JTextField();
        txtunit= new javax.swing.JTextField();
        Submit = new javax.swing.JButton();
        Home=new javax.swing.JButton();
        txtcname = new javax.swing.JTextField();
        txtcid = new javax.swing.JTextField();
        txtmeterid = new javax.swing.JTextField();
        txtpreread= new javax.swing.JTextField();
        txtbill = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 22)); // NOI18N
        jLabel1.setText("                 BILL DETAILS");

        JPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("CUSTOMER NAME");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("CUSTOMER ID");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("METER ID");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("PREVIOUS READING");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("PRESENT READING");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setText("UNITS CONSUMED");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setText("BILL AMOUNT");

        txtcurread.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16));
        txtunit.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16));
        txtbill.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16));
        
        txtpreread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt2) {
                txtprereadActionPerformed(evt2);
            }
        });

        txtcurread.addKeyListener(new java.awt.event.KeyAdapter() {
            public void KeyPressed(java.awt.event.KeyEvent evt) {
                txtcurreadKeyPressed(evt);
            }
        });

        Submit.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Submit.setText("HOME");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        
        Home.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Home.setText("PROCEED TO PAY");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        

        txtcname.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        
        txtcname.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtcnameAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }

            private void txtcnameAncestorAdded(AncestorEvent evt) {
                // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });

        txtcid.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        txtmeterid.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        txtpreread.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        txtbill.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(JPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(110, 110, 110)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcurread, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(txtunit)
                            .addComponent(txtcname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtcid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtmeterid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtpreread, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtbill)))
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtcname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(28, 28, 28))
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtcid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmeterid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtpreread))
                .addGap(18, 18, 18)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtcurread, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtunit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtbill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Submit, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

        
    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) { 
        // TODO add your handling code here:    
        new Home().setVisible(true);
        dispose();
    }
    private void HomeActionPerformed(java.awt.event.ActionEvent evt){
        new PaymentFrame().setVisible(true); 
        dispose();
        }
         
                                         

    private void txtcurreadKeyPressed(java.awt.event.KeyEvent evt) {                                           
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            try{
        cur=txtcurread.getText();
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/consumer";
        Connection con = DriverManager.getConnection(url,"root", "Trisha@16");
        Statement s1 = con.createStatement();
        String query2="Update signup set prevread= '"+cur+"' where userId= '"+Loginform.name+"'";
        s1.executeUpdate(query2);
        
        int c=Integer.parseInt(cur);
        int p=Integer.parseInt(prev);
        int u=c-p;
        double amount=0;
        unit=Integer.toString(u);
        txtunit.setText(unit);
        if(phase.equals("1A"))
        {
           if(u<=100)amount+=0;
           else if(u<=200){
           u=u-100;
           amount+=u*1.50;
           }
           else if(u<=500){
           u=u-100;
           if(u>100||u<401)
           {    
            int un=u-100;
            amount+=un*3;
            amount+=200;
           }
           else if(u>0&&u<101)
           amount+=u*2;
           }
           else if(u>500)
           {
            u=u-100;
            if(u>400)
            {
               int un=u-400;
               amount+=un*6.6;
               amount+=300*4.6;
               amount+=350; 
            }
            else if(u>100&&u<401)
           {    
            int un=u-100;
            amount+=un*4.6;
            amount+=350;
           }
           else if(u>0&&u<101)
           amount+=u*3.5;
           }
        }
        else if(phase.equals("1B"))
        {
            amount+=u*6.35;
        }
        else if(phase.equals("2A"))
            amount+=u*6.35;
        
        else if(phase.equals("2B"))
            amount+=u*6.35;
        
        else if(phase.equals("3A")||phase.equals("3B"))
          amount+=u*8;
        else if(phase.equals("4A")||phase.equals("4B"))
           amount=0;
        a=Double.toString(amount);
        txtbill.setText(a);
        }
        catch(ClassNotFoundException ea){}
        catch(SQLIntegrityConstraintViolationException se){
            }
       catch(SQLException ea){
         System.out.println(ea);
            }
        
        }
        
    }                                          

    private void txtprereadActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
       

    }                                          

    private void txtcnameAncestorAdded(javax.swing.event.AncestorEvent evt) {                                     
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
            java.util.logging.Logger.getLogger(Bill_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill_Details().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify 
    private javax.swing.JPanel JPanel;
    private javax.swing.JButton Submit;
    private javax.swing.JButton Home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtbill;
    private javax.swing.JTextField txtcid;
    private javax.swing.JTextField txtcname;
    private javax.swing.JTextField txtmeterid;
    private javax.swing.JTextField txtcurread;
    private javax.swing.JTextField txtpreread;
    private javax.swing.JTextField txtunit;
    // End of variables declaration                   
}