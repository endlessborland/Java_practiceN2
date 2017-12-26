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
public class FloatFrame extends BasicFrame {

    float Ginput = 0;
    float Gresult = 0;
    
    /**
     * Creates new form FloatFrame
     */
    public FloatFrame(JFrame parent) {
        super(parent);
        this.setTitle("float");        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    protected void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        startStraight = new javax.swing.JButton();
        startReverse = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        inputDec = new javax.swing.JTextField();
        resultF = new javax.swing.JTextField();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Обратный перевод");

        jLabel2.setText("Число");

        startStraight.setText("Перевод");
        startStraight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startStraightActionPerformed(evt);
            }
        });

        startReverse.setText("Обратный перевод");
        startReverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startReverseActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Байт", "Б", "А", "Й", "Т", "№", "3", null, null, "Б", "А", "Й", "Т", "№", "2", null, null, "Б", "А", "Й", "Т", "№", "1", null, null, "Б", "А", "Й", "Т", "№", "0", null, null},
                {"№ бита", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Вес бита", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"бит", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "Зн.", "Х", "А", "Р", "А", "К", "Т", "Е", "Р.", "М", "А", "Н", "Т", "И", "С", "С", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        int j = 8;
        for (int i = 1; i < 33; i++)
        {
            jTable2.setValueAt(32 - i, 1, i);
            jTable2.setValueAt(Math.pow(2, j), 2, i);
            j--;
        }
        jScrollPane2.setViewportView(jTable2);

        inputDec.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputDecFocusLost(evt);
            }
        });

        resultF.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1510, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputDec, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(startStraight))
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resultF, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(startReverse))
                    .addComponent(jLabel1))
                .addContainerGap(1178, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startStraight)
                    .addComponent(inputDec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startReverse)
                    .addComponent(resultF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        parent.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void startStraightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startStraightActionPerformed
        long bytes = Float.floatToRawIntBits(Ginput);
        
        for (int i = 31; i >=0; i--)
        {
            int num = (bytes & (long) Math.pow(2, i)) > 0 ? 1 : 0;
            this.jTable2.setValueAt(num, 3, 32-i);
        }
        
    }//GEN-LAST:event_startStraightActionPerformed

    private void startReverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startReverseActionPerformed
        String a = "";
        for (int i = 2; i < 10; i++)
        {
            a += this.jTable2.getValueAt(3, i).toString();
        }
        long charac = Long.parseLong(a, 2) - 127;
        double result = Math.pow(2, charac);
        for (int i = 10; i < 33; i++)
        {
            charac--;
            result += (this.jTable2.getValueAt(3,i).toString().contains("0") ? 0 : 1) * Math.pow(2, charac);
        }
        result *= this.jTable2.getValueAt(3,1).toString().contains("0") ? 1 : -1;
        this.resultF.setText(result + "");
    }//GEN-LAST:event_startReverseActionPerformed

    private void inputDecFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputDecFocusLost
        String input = this.inputDec.getText().toString();
        try
        {
            Ginput = Float.parseFloat(input);
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Введите число типа float");
        }
    }//GEN-LAST:event_inputDecFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputDec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField resultF;
    private javax.swing.JButton startReverse;
    private javax.swing.JButton startStraight;
    // End of variables declaration//GEN-END:variables
}
