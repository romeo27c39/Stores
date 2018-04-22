
package mapp;
import javax.swing.*;
import java.awt.*;

public class JMain extends JFrame {
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension d = tk.getScreenSize();
    
    public JMain() {
        initComponents();
        this.setTitle("KsTU STORE");
        int x = (d.width-this.getWidth())/2;
        int y = (d.height-this.getHeight())/2;
        this.setLocation(x,y);
        utility.DBconnection.connection();
        displayForm(new jplLogin(jplMain)); 
    }

    public void displayForm(JPanel jp){
        jplMain.removeAll();
        jplMain.add(jp);
        jplMain.validate();
        jplMain.repaint();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jplMain = new javax.swing.JPanel();
        mnuBar = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mnuItems = new javax.swing.JMenuItem();
        mnuTransaction = new javax.swing.JMenuItem();
        mnuPurchaseTransaction = new javax.swing.JMenuItem();
        mnuSuppliers = new javax.swing.JMenuItem();
        mnuAccounts = new javax.swing.JMenuItem();
        mnuPrint = new javax.swing.JMenu();
        mnuPrintTransaction = new javax.swing.JMenuItem();
        mnuPrintPurchaseTransaction = new javax.swing.JMenuItem();
        mnuUsers = new javax.swing.JMenu();
        mnuChangePassword = new javax.swing.JMenuItem();
        mnuSwitchUser = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jplMain.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout jplMainLayout = new javax.swing.GroupLayout(jplMain);
        jplMain.setLayout(jplMainLayout);
        jplMainLayout.setHorizontalGroup(
            jplMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 964, Short.MAX_VALUE)
        );
        jplMainLayout.setVerticalGroup(
            jplMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );

        mnuFile.setText("File");

        mnuItems.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_MASK));
        mnuItems.setText("Items");
        mnuItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemsActionPerformed(evt);
            }
        });
        mnuFile.add(mnuItems);

        mnuTransaction.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_MASK));
        mnuTransaction.setText("Transaction");
        mnuTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTransactionActionPerformed(evt);
            }
        });
        mnuFile.add(mnuTransaction);

        mnuPurchaseTransaction.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
        mnuPurchaseTransaction.setText("Purchase Transaction");
        mnuFile.add(mnuPurchaseTransaction);

        mnuSuppliers.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK));
        mnuSuppliers.setText("Suppliers");
        mnuSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSuppliersActionPerformed(evt);
            }
        });
        mnuFile.add(mnuSuppliers);

        mnuAccounts.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        mnuAccounts.setText("Accounts");
        mnuAccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAccountsActionPerformed(evt);
            }
        });
        mnuFile.add(mnuAccounts);

        mnuBar.add(mnuFile);

        mnuPrint.setText("Print");

        mnuPrintTransaction.setText("Transaction");
        mnuPrint.add(mnuPrintTransaction);

        mnuPrintPurchaseTransaction.setText("Purchase Transaction");
        mnuPrint.add(mnuPrintPurchaseTransaction);

        mnuBar.add(mnuPrint);

        mnuUsers.setText("Users");

        mnuChangePassword.setText("Change Password");
        mnuUsers.add(mnuChangePassword);

        mnuSwitchUser.setText("Switch User");
        mnuUsers.add(mnuSwitchUser);

        mnuBar.add(mnuUsers);

        setJMenuBar(mnuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jplMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jplMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTransactionActionPerformed
     displayForm(new jplTransaction(jplMain));  
    }//GEN-LAST:event_mnuTransactionActionPerformed

    private void mnuItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemsActionPerformed
        displayForm(new jplItems(jplMain));
    }//GEN-LAST:event_mnuItemsActionPerformed

    private void mnuAccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAccountsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuAccountsActionPerformed

    private void mnuSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSuppliersActionPerformed
        displayForm(new jplSuppliers(jplMain));
    }//GEN-LAST:event_mnuSuppliersActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jplMain;
    private javax.swing.JMenuItem mnuAccounts;
    private javax.swing.JMenuBar mnuBar;
    private javax.swing.JMenuItem mnuChangePassword;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenuItem mnuItems;
    private javax.swing.JMenu mnuPrint;
    private javax.swing.JMenuItem mnuPrintPurchaseTransaction;
    private javax.swing.JMenuItem mnuPrintTransaction;
    private javax.swing.JMenuItem mnuPurchaseTransaction;
    private javax.swing.JMenuItem mnuSuppliers;
    private javax.swing.JMenuItem mnuSwitchUser;
    private javax.swing.JMenuItem mnuTransaction;
    private javax.swing.JMenu mnuUsers;
    // End of variables declaration//GEN-END:variables
}
