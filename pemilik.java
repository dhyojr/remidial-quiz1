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
public class pemilik {
    private String nama;
    sniper [] sniperku;
    private int jumlah;
    
    String getnama() { return nama; };
    public pemilik (String nm){
        nama = nm; jumlah = 0;
        sniperku = new sniper [10];
        System.out.println("selamat datang, "+ nm);
        
    }
    void beliSniper(long harga, sniper snip){
        sniperku[jumlah] = snip;
        jumlah++;
        System.out.println(nama+" membeli Sniper "+ snip.getType()+" seharga Rp."+harga);
    }
    void listSniper(){
        System.out.println("Snipernya "+nama+ " :");
        for(int i=0; i<jumlah; i++)
        {   System.out.println(sniperku[i].getType());
        }
    }
    
}
