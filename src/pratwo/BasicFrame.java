/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratwo;

import javax.swing.JFrame;

/**
 *
 * @author Денис
 */
public abstract class BasicFrame extends javax.swing.JFrame {
    
    protected final JFrame parent;
    protected abstract void initComponents();
    
    public BasicFrame(JFrame parent) {
        this.parent = parent;
        this.parent.setVisible(false);
        // this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        this.initComponents(); 
        this.setVisible(true);
    }
    
    public void wakeUp()
    {
        this.parent.setVisible(false);
        this.setVisible(true);
    }
}
