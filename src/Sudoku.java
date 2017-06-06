import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ghada
 */
public class Sudoku extends JFrame {

    static Sudoku frame = new Sudoku();
    static JPanel current;
    
    public static void main(String[] args) {
        frame.setLayout(new BorderLayout());
        current = new JPanel();
        mainPanel();    
        frame.setSize(447, 404);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null); // Center the frame 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
   
      
    }
    static void mainPanel() {
        frame.remove(current);
        current = new main();
        frame.add(current);
        frame.validate();
    }
    
    static void playPanel() {
        frame.remove(current);
        current = new Play();
        frame.add(current);
        frame.validate();
    }
    static void gamePanel() {
        frame.remove(current);
        current = new GamePanel();
        frame.add(current);
        frame.validate();
    }


    static void rulesPanel() {
        frame.remove(current);
        current = new Rules();
        frame.add(current);
        frame.validate();
    }

        
  
    }   

