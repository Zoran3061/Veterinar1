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
public class Model {
    
    private String iD;
    
    public Model (String iD) {
        this.iD = iD;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    @Override
    public String toString() {
        return "Model{" + "iD=" + iD + '}';
    }
    
    
}
