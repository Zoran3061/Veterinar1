/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komponentegui;

import javax.swing.JButton;

/**
 *
 * @author Zoran
 */
public class Dugme extends JButton{
    
    private String naziv;
    
    public Dugme(String naziv) {
        super(naziv);
        
        addActionListener(e -> {
            
        });
    }
}
