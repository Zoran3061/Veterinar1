/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pocetniekran;

import komponentegui.Label;
import komponentegui.Dugme;
import komponentegui.TextField;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import menadzer.MenadzerBaze;
import modeli.Veterinar;

/**
 *
 * @author Zoran
 */
public class VeterinarEkran extends JFrame {

    private MenadzerBaze mBaze = new MenadzerBaze();
    private GridLayout gridL = new GridLayout(8, 2);
    private Label idLabel = new Label("ID");
    private Label imeLabel = new Label("Ime");
    private Label prezimeLabel = new Label("Prezime");
    private Label mestoLabel = new Label("Mesto");
    private Label telefonLabel = new Label("Telefon");
    private Label drzavaLabel = new Label("Drzava");
    private Label godinaLabel = new Label("Godina");

    private TextField idTField = new TextField();
    private TextField imeTField = new TextField();
    private TextField prezimeTField = new TextField();
    private TextField mestoTField = new TextField();
    private TextField telefonTField = new TextField();
    private TextField drzavaTField = new TextField();
    private TextField godinaTField = new TextField();

    private Dugme okDugme = new Dugme("OK");

    public VeterinarEkran(TableModel tM, int id) {
        setTitle("Veterinar");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setLayout(gridL);
        dodajKomponente();

        okDugme.addActionListener(e -> {
            mBaze.promeni(new Veterinar(idTField.getText(), imeTField.getText(),
                    prezimeTField.getText(), mestoTField.getText(), telefonTField.getText(),
                    drzavaTField.getText(), godinaTField.getText()));
        });
        
        idTField.setEditable(false);
        idTField.setText(tM.getValueAt(id, 0).toString());
        imeTField.setText(tM.getValueAt(id, 1).toString());
        prezimeTField.setText(tM.getValueAt(id, 2).toString());
        mestoTField.setText(tM.getValueAt(id, 3).toString());
        telefonTField.setText(tM.getValueAt(id, 4).toString());
        drzavaTField.setText(tM.getValueAt(id, 5).toString());
        godinaTField.setText(tM.getValueAt(id, 6).toString());
    }

    public VeterinarEkran() {
        setTitle("Veterinar");
        setSize(400, 180);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setLayout(gridL);
        idTField.setEditable(false);
        dodajKomponente();
        initListeners();
    }
    
    private void initListeners() {
        okDugme.addActionListener(e -> {
            mBaze.dodaj(new Veterinar(idTField.getText(), imeTField.getText(),
                    prezimeTField.getText(), mestoTField.getText(), telefonTField.getText(),
                    drzavaTField.getText(), godinaTField.getText()));
        });
    }

    private void dodajKomponente() {
        add(idLabel);
        add(idTField);
        add(imeLabel);
        add(imeTField);
        add(prezimeLabel);
        add(prezimeTField);
        add(mestoLabel);
        add(mestoTField);
        add(telefonLabel);
        add(telefonTField);
        add(drzavaLabel);
        add(drzavaTField);
        add(godinaLabel);
        add(godinaTField);
        add(okDugme);
    }

}
