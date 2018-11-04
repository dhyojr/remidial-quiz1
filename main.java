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
public class main {
    
    public static void main(String[] args){
        
        pemilik dhyo = new pemilik("Dhyo");
        pemilik falcao = new pemilik("Falcao");
        pemilik diablo = new pemilik("Diablo");
        
        sniper snip1 = new sniper("Barret M90");
        sniper snip2 = new sniper("Cheytac M2000");
        sniper snip3 = new sniper("Magnum L1151");
        
        dhyo.beliSniper(42500000, snip1);
        falcao.beliSniper(54000000, snip2);
        diablo.beliSniper(38500000, snip3);
        
        dhyo.listSniper();
        falcao.listSniper();
        diablo.listSniper();
    }
}
