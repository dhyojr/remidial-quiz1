/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RemidiQuiz1;

/**
 *
 * @author Falcao
 */
public class sniper {
    private String type;
    private pemilik pemilik;
    
    sniper(String s) {type = s;}
    
    public sniper(String type, pemilik pemilik) {
        this.type = type;
        this.pemilik = pemilik;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public pemilik getPemilik() {
        return pemilik;
    }

    public void setPemilik(pemilik pemilik) {
        this.pemilik = pemilik;
    }
    
    
}
