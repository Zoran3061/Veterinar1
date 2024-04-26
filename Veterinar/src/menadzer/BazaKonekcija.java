/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menadzer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Zoran
 */
public class BazaKonekcija extends Baza{

    public BazaKonekcija() {
    }
    
    public Connection konektuj(){
        Connection konekcija = null;
        try{
            konekcija = DriverManager.getConnection(getUrl());
            System.out.println(getUrl());
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return konekcija;
    }
    
}
