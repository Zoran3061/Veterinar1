/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pocetniekran;

import komponentegui.Dugme;
import komponentegui.Label;
import komponentegui.TextField;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import menadzer.MenadzerBaze;
import modeli.Veterinar;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Zoran
 */
public class PocetniEkran extends JFrame {
    private Dugme dugmeDodaj = new Dugme("Dodaj");
    private Dugme dugmePromeni = new Dugme("Promeni");
    private Dugme dugmeObrisi = new Dugme("Obrisi");
    private Dugme dugmeOsvezi = new Dugme("Osvezi");
    private Dugme dugmeTrazi = new Dugme("Trazi");
    private Label label = new Label("Mesto");
    private TextField mestoTField = new TextField();
    private JScrollPane jScrollPane;
    private JTable tabela;
    private MenadzerBaze mBaze = new MenadzerBaze();
    private VeterinarEkran veterinarEkran;

    public PocetniEkran() {
        setTitle("Veterinar");
        setSize(580, 240);
        setLocationRelativeTo(null);
        //setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        dodajKomponente();
        initListeners();
    }

    private void initListeners() {
        dugmePromeni.addActionListener(e -> {
            if (tabela.getSelectedRow() != -1) {
                new VeterinarEkran(tabela.getModel(), tabela.getSelectedRow());
            }
        });
        dugmeDodaj.addActionListener(e -> {
            new VeterinarEkran();
        });
        dugmeObrisi.addActionListener(e -> {
            if (tabela.getSelectedRow() != -1) {
                mBaze.obrisi(tabela.getModel().getValueAt(tabela.getSelectedRow(), 0).toString());
                tabela.setModel(mBaze.tabelaModel());
            }
        });
        dugmeOsvezi.addActionListener(e -> {
            tabela.setModel(mBaze.tabelaModel());
        });
        dugmeTrazi.addActionListener(e -> {
            tabela.setModel(mBaze.veterinari(mestoTField.getText()));
        });
    }

    private void dodajKomponente() {
        tabela = new JTable(2, 7);
        tabela.setModel(mBaze.tabelaModel());
        tabela.setBounds(0, 0, 545, 110);
        jScrollPane = new JScrollPane(tabela);
        jScrollPane.setBounds(10, 10, 540, 110);
        dugmeDodaj.setBounds(10, 130, 100, 20);
        label.setBounds(10, 160, 60, 20);
        mestoTField.setBounds(120, 160, 100, 20);
        dugmeTrazi.setBounds(230, 160, 100, 20);
        dugmePromeni.setBounds(120, 130, 100, 20);
        dugmeObrisi.setBounds(230, 130, 100, 20);
        dugmeOsvezi.setBounds(340, 130, 100, 20);
        
        add(dugmeDodaj);
        add(dugmePromeni);
        add(dugmeObrisi);
        add(dugmeOsvezi);
        add(label);
        add(mestoTField);
        add(dugmeTrazi);
        add(jScrollPane);
    }
}
