/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick
 */
import javax.swing.JButton;
import javax.swing.JPanel;
public class MainPanel extends JPanel{
    MainPanel(){
        JButton blueButton = new JButton("Blue");
        add(blueButton);
        
        JButton redButton = new JButton("Red");
        add(redButton);
        
        JButton nickButton = new JButton("Nick");
        add(nickButton);
        
        JButton mButton = new JButton("Wei");
        add(mButton);
    }
}
