/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menadzer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import modeli.Veterinar;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Zoran
 */
public class MenadzerBaze extends BazaKonekcija {

    private String sql;

    public MenadzerBaze() {
    }

    public void dodaj(Veterinar s) {
        sql = "INSERT INTO Tabela (Ime,Prezime,Mesto,Telefon,Drzava,Godina) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            Connection konekcija = konektuj();
            PreparedStatement pstmt = konekcija.prepareStatement(sql);
            pstmt.setString(1, s.getIme());
            pstmt.setString(2, s.getPrezime());
            pstmt.setString(3, s.getMesto());
            pstmt.setString(4, s.getTelefon());
            pstmt.setString(5, s.getDrzava());
            pstmt.setString(6, s.getGodina());
            pstmt.executeUpdate();
            pstmt.close();
            konekcija.close();
            JOptionPane.showMessageDialog(null, "Podaci uspesno dodati!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Greska!");
        }
    }
    
    public void promeni(Veterinar s) {
        sql = "UPDATE Tabela SET Ime = ?, Prezime = ?, Mesto = ?, Telefon = ?, Drzava = ?, Godina = ? WHERE ID = ?";
        try {
            Connection konekcija = konektuj();
            PreparedStatement pstmt = konekcija.prepareStatement(sql);
            pstmt.setString(1, s.getIme());
            pstmt.setString(2, s.getPrezime());
            pstmt.setString(3, s.getMesto());
            pstmt.setString(4, s.getTelefon());
            pstmt.setString(5, s.getDrzava());
            pstmt.setString(6, s.getGodina());
            pstmt.setString(7, s.getiD());
            
            pstmt.executeUpdate();
            pstmt.close();
            konekcija.close();
            JOptionPane.showMessageDialog(null, "Podaci uspesno promenjeni!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Greska!");
        }
    }
    
    public void obrisi(String indeks) {
        sql = "DELETE FROM Tabela WHERE ID = ?";
        try {
            Connection konekcija = konektuj();
            PreparedStatement pstmt = konekcija.prepareStatement(sql);
            pstmt.setInt(1, Integer.parseInt(indeks));
            pstmt.executeUpdate();
            pstmt.close();
            konekcija.close();
            JOptionPane.showMessageDialog(null, "Podaci uspesno obrisani!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Greska!");
        }
    }
    
    public TableModel veterinari(String mesto) {
        sql = "SELECT * FROM Tabela WHERE Mesto = ?";
        try {
            Connection konekcija = konektuj();
            PreparedStatement pstmt = konekcija.prepareStatement(sql);
            pstmt.setString(1, mesto);
            ResultSet rS = pstmt.executeQuery();
            
            return DbUtils.resultSetToTableModel(rS);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Greska!");
        }
        
        return null;
    }
    
    public TableModel tabelaModel() {
        sql = "SELECT * FROM Tabela";
        try {
            Connection konekcija = konektuj();
            PreparedStatement pstmt = konekcija.prepareStatement(sql);
            ResultSet rS = pstmt.executeQuery();
            return DbUtils.resultSetToTableModel(rS);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return null;
    }
}
