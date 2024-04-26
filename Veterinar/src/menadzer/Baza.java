/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menadzer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Zoran
 */
public class Baza {

    private String url = "jdbc:sqlite:";

    public String getUrl() {
        try {
            String linija;
            FileReader fr = new FileReader("NazivBaze.txt");
            BufferedReader in = new BufferedReader(fr);
            while ((linija = in.readLine()) != null) {
                if (linija.equals("Veterinari")) {
                    System.out.println("Baza" + linija);
                    return url + linija + ".db";
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Greska prilikom ucitavanja baze!");
            return url;
        }
        return url;
    }
 }

