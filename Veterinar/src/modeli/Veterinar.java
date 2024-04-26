/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeli;

/**
 *
 * @author Zoran
 */
public class Veterinar extends Model{
    
    private String ime, prezime, mesto, telefon, drzava, godina;
    
    public Veterinar(String iD) {
        super(iD);
    }
    
    public Veterinar(String iD, String ime, String prezime, String mesto, String telefon, String drzava, String godina){
        super(iD);
        setIme(ime);
        setPrezime(prezime);
        setMesto(mesto);
        setTelefon(telefon);
        setDrzava(drzava);
        setGodina(godina);
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public String getGodina() {
        return godina;
    }

    public void setGodina(String godina) {
        this.godina = godina;
    }

    @Override
    public String toString() {
        return "Veterinar{" + "ime=" + ime + ", prezime=" + prezime + ", mesto=" + mesto + ", telefon=" + telefon + ", drzava=" + drzava + ", godina=" + godina + '}';
    }
}
