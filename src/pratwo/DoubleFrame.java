/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratwo;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Денис
 */
public class DoubleFrame extends BasicFrame {

    /**
     * Creates new form Dobule
     */
    public DoubleFrame(JFrame parent) {
        super(parent);
        this.setTitle("Double");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    protected void initComponents() {

        inputField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        start = new javax.swing.JButton();
        resultField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Число");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Знак(63)", "Характеристика(62-52)", "Мантиса(51-0)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        start.setText("Go");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        jButton1.setText("Обратный перевод");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(start))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(resultField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(start))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(205, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        parent.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        String in = this.inputField.getText();   
        double temp = 0;
        try
        {
            temp = Double.parseDouble(in);
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Введите число типа float");
        }
        Long a = Double.doubleToRawLongBits(temp);
        this.table.setValueAt(temp >= 0 ? 0 : 1, 0, 0);
        int i;
        int p = 10;
        long res = 0;
        for (i = 62; i >=52; i--)
        {
            res += Math.pow(2, p) * ((a & (long) Math.pow(2,i)) > 0 ? 1: 0);
            p--;
        }
        this.table.setValueAt(res, 0, 1);
        res = 0;
        for (i = 51; i >= 0; i--)
        {
            res += Math.pow(2, i) * ((a & (long) Math.pow(2,i)) > 0 ? 1 : 0);
        }
        this.table.setValueAt(res, 0, 2);
    }//GEN-LAST:event_startActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String number = "";
        number += this.table.getValueAt(0, 0).toString();
        String charac = Long.toBinaryString(Long.parseLong(this.table.getValueAt(0, 1).toString()));
        while (charac.length() < 11)
            charac = "0" + charac;
        number += charac;
        String man = Long.toBinaryString(Long.parseLong(this.table.getValueAt(0, 2).toString()));
        number += man;
        //JOptionPane.showMessageDialog(null, number);
        String a = "";
        for (int i = 1; i < 12; i++)
        {
            a += number.charAt(i);
        }
        long _charac = Long.parseLong(a, 2) - 1023;
        double result = Math.pow(2, _charac);
        for (int i = 12; i < 64; i++)
        {
            _charac--;
            try {
            result += ((number.charAt(i) == '0') ? 0 : 1) * Math.pow(2, _charac);
            } catch (Exception e) {}
        }
        result *= number.charAt(0) == '0' ? 1 : -1;
        this.resultField.setText("" + result);

        
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField resultField;
    private javax.swing.JButton start;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
