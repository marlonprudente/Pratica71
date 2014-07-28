
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utfpr.dainf.if62c.pratica;
import java.util.*;

/**
 *
 * @author a1562339
 */
public class JogadorComparator implements Comparator<Jogador>{
    private boolean alfab;
    private boolean numeric;
    
    public JogadorComparator(){
        alfab = false;
        numeric = true;
    }
    
    public JogadorComparator(boolean a, boolean n){
        this.alfab = a;
        this.numeric = n;
    }
    

    @Override
    public int compare(Jogador o1, Jogador o2) {
    
        if(o1.getNum() == o2.getNum()){
            
        }
        else if(o1.getNom() == o2.getNom()){
            
        }
        else{
            
        }
        return 1;
    }
    
    public int comparanome(Jogador o1, Jogador o2){       
        return 1;
    }
    
    public int comparenumero(){
        return 1;
    }
    
}
