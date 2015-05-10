package View;

import java.awt.event.KeyEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Axel
 */
public class ShowResultPanel extends javax.swing.JPanel {

    DictFrame d;

    /**
     * Creates new form ShowResultPanel
     */
    public ShowResultPanel(DictFrame d) {
        initComponents();
        this.d = d;
        logoutButton.setVisible(false);
        addButton.setVisible(false);
        editButton.setVisible(false);
        removeButton.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        searchTF1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        searchTF = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DefinitionTA = new javax.swing.JTextArea();

        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setLayout(null);

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        add(removeButton);
        removeButton.setBounds(300, 230, 90, 23);

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        add(editButton);
        editButton.setBounds(240, 230, 51, 23);

        searchTF1.setEditable(false);
        add(searchTF1);
        searchTF1.setBounds(28, 60, 151, 30);

        jLabel1.setText("Word");
        add(jLabel1);
        jLabel1.setBounds(28, 40, 90, 14);
        add(searchTF);
        searchTF.setBounds(136, 12, 151, 30);

        searchButton.setText("Search");
        add(searchButton);
        searchButton.setBounds(293, 11, 90, 23);

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        add(addButton);
        addButton.setBounds(180, 230, 51, 23);

        jLabel2.setText("Definition");
        add(jLabel2);
        jLabel2.setBounds(30, 100, 120, 14);

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        add(logoutButton);
        logoutButton.setBounds(28, 11, 65, 23);

        DefinitionTA.setEditable(false);
        DefinitionTA.setColumns(20);
        DefinitionTA.setRows(5);
        jScrollPane1.setViewportView(DefinitionTA);

        add(jScrollPane1);
        jScrollPane1.setBounds(30, 120, 360, 96);
    }// </editor-fold>//GEN-END:initComponents

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
        d.enter(5);

    }//GEN-LAST:event_removeButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        d.enter(3);
    }//GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        d.enter(4);
    }//GEN-LAST:event_editButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        d.enter(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        if (d.login.isLogin) {
            logoutButton.setVisible(true);
            addButton.setVisible(true);
            editButton.setVisible(true);
            removeButton.setVisible(true);
            d.enter(0);
        }

    }//GEN-LAST:event_logoutButtonActionPerformed

    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_SHIFT + KeyEvent.VK_CONTROL + KeyEvent.VK_L:
                d.enter(0);
                break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DefinitionTA;
    private javax.swing.JButton addButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTF;
    private javax.swing.JTextField searchTF1;
    // End of variables declaration//GEN-END:variables
}
