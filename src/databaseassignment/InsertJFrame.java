/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseassignment;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Shaafi
 */
public class InsertJFrame extends javax.swing.JFrame {

    // array list for storing the jtext fields
    ArrayList<JTextField> colTextFields = new ArrayList<>();

    /**
     * Creates new form InsertJFrame
     */
    public InsertJFrame() {
        initComponents();

        addInsertingTextFields();

        tableNameJlabel.setText("Inserting data into table: " + MainJFrame.getSelectedTableName());
        this.setTitle("Insert Data");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableNameJlabel = new javax.swing.JLabel();
        insertBtn = new javax.swing.JButton();
        containerPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 350));
        setMinimumSize(new java.awt.Dimension(400, 350));
        setPreferredSize(new java.awt.Dimension(400, 350));

        tableNameJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableNameJlabel.setText("jLabel1");

        insertBtn.setText("Insert");
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });

        containerPanel.setPreferredSize(new java.awt.Dimension(400, 350));

        javax.swing.GroupLayout containerPanelLayout = new javax.swing.GroupLayout(containerPanel);
        containerPanel.setLayout(containerPanelLayout);
        containerPanelLayout.setHorizontalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        containerPanelLayout.setVerticalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 218, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(tableNameJlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 325, Short.MAX_VALUE)
                        .addComponent(insertBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tableNameJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed

        ArrayList<String> newRowDatas = new ArrayList<>();

        for (JTextField field : colTextFields) {
            String data = field.getText();

            if (!data.isEmpty()) {

                newRowDatas.add(data);
                System.out.println("data: " + field.getText());
            } else {
                JOptionPane.showMessageDialog(null, "All Fields Are Required");
                break;
            }
        }
        if (newRowDatas.size() == MainJFrame.mConnector.getColumns(MainJFrame.getSelectedTableName()).size()) {
            boolean result = MainJFrame.mConnector.insertNewData(MainJFrame.getSelectedTableName(), newRowDatas);

            if (result) {
                this.dispose();
            }
        }
    }//GEN-LAST:event_insertBtnActionPerformed

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
            java.util.logging.Logger.getLogger(InsertJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel containerPanel;
    private javax.swing.JButton insertBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tableNameJlabel;
    // End of variables declaration//GEN-END:variables

    private void addInsertingTextFields() {

        ArrayList<String> columns = MainJFrame.mConnector.getColumns(MainJFrame.getSelectedTableName());
        containerPanel.setBackground(Color.gray);

        // Clear panel
        containerPanel.removeAll();

        containerPanel.setLayout(new GridLayout(0, 2));
        containerPanel.setBorder(LineBorder.createBlackLineBorder());

        columns.forEach((colName) -> {
            JTextField field = new JTextField();
            field.setSize(new Dimension(400, 350));

            JLabel label = new JLabel(colName);
            label.setHorizontalAlignment((int) CENTER_ALIGNMENT);

            // Add them to panel
            containerPanel.add(label);
            containerPanel.add(field);

            // adding the text fields into the array
            colTextFields.add(field);
        });

        revalidate();
        repaint();
    }
}
