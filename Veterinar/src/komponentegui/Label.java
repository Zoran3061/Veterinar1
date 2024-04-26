/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komponentegui;

import javax.swing.JLabel;

/**
 *
 * @author Zoran
 */
public class Label extends JLabel {
    
    private String naziv;
    
    public Label (String naziv) {
        super(naziv);
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
}
