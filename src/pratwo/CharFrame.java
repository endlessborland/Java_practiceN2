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
public class CharFrame extends BasicFrame {
    
    private String input;
    
    /**
     * Creates new form CharSymbol
     * @param parent
     */
    public CharFrame(JFrame parent) {
        super(parent);
        this.setTitle("Char");
        this.inputTable.setValueAt("", 0, 0);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    protected void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        inputTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        run = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        inputTable.setShowGrid(true);
        inputTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Символ", "Десятичный код"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(inputTable);

        resultTable.setShowGrid(true);
        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Биты в тетраде", null, null, null, null},
                {"16-чная цифра", null, null, null, null}
            },
            new String [] {
                "Тетрады", "Тетрада 3 (15-12)", "Тетрада 2 (11-8)", "Тетрада 1 (7-4)", "Тетрада 0 (3-0)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(resultTable);

        run.setText("Выполнить перевод!");
        run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(run)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(run)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.parent.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void doMagic()
    {
        if ("".equals(input))
        {
            return;
        }
        String binresult = Long.toBinaryString(this.input.charAt(0));
        int intres = Integer.parseInt(binresult, 2);
        this.inputTable.setValueAt(intres, 0, 1);
        String[] array = new String[4];
        int length = binresult.length();
        String a = "";
        for (int i = 0; i < (16 - length); i++)
           a += "0";
        binresult = a + binresult;
        for (int i = 0; i < 4; i++)
        {
            String tmp = binresult.substring(i*4, (i+1)*4);
            this.resultTable.setValueAt(tmp, 0, i+1);
            int decimal = Integer.parseInt(tmp, 2);
            String tmphex = Integer.toString(decimal, 16);
            this.resultTable.setValueAt(tmphex, 1, i+1);
        }
    }
    
    private void runActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runActionPerformed
        this.input = this.inputTable.getValueAt(0,0).toString();
        if (this.input.length() > 1)
        {
            try { this.inputTable.setValueAt(this.input.substring(0, 1), 0, 0);
                  this.input = this.input.substring(0,1); }
            catch (Exception e) {this.inputTable.setValueAt("", 0, 0); 
                                 this.input = ""; }
        }
        doMagic();
    }//GEN-LAST:event_runActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable inputTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable resultTable;
    private javax.swing.JButton run;
    // End of variables declaration//GEN-END:variables
}
