/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ghada
 */import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
 

public class main extends javax.swing.JPanel implements MouseListener {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        playBtn = new javax.swing.JButton();
        rulesBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(203, 227, 190));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 0, 374, -1));

        playBtn.setBackground(new java.awt.Color(238, 196, 196));
        playBtn.setFont(new java.awt.Font("Shree Devanagari 714", 1, 14)); // NOI18N
        playBtn.setText("Play");
        playBtn.setMargin(new java.awt.Insets(6, 2, 2, 2));
        playBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playBtnMouseClicked(evt);
            }
        });
        playBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playBtnActionPerformed(evt);
            }
        });
        playBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                playBtnKeyPressed(evt);
            }
        });
        add(playBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 140, -1));

        rulesBtn.setFont(new java.awt.Font("Shree Devanagari 714", 1, 14)); // NOI18N
        rulesBtn.setText("Rules");
        rulesBtn.setMargin(new java.awt.Insets(6, 2, 2, 2));
        rulesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rulesBtnMouseClicked(evt);
            }
        });
        add(rulesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 140, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void playBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_playBtnKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_playBtnKeyPressed

    private void playBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playBtnActionPerformed

    private void playBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playBtnMouseClicked
            Sudoku.playPanel();
    }//GEN-LAST:event_playBtnMouseClicked

    private void rulesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rulesBtnMouseClicked
            Sudoku.rulesPanel();
    }//GEN-LAST:event_rulesBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton playBtn;
    private javax.swing.JButton rulesBtn;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
                java.awt.Toolkit.getDefaultToolkit().beep();

    }

    @Override
    public void mousePressed(MouseEvent e) {
 java.awt.Toolkit.getDefaultToolkit().beep();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
     java.awt.Toolkit.getDefaultToolkit().beep();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
