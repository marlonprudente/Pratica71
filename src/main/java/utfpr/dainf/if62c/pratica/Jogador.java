/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utfpr.dainf.if62c.pratica;

/**
 *
 * @author a1562339
 */
public class Jogador {
    public int numero;
    public String nome;
    
    public Jogador(int numero, String nome){
        //this.posicao = posicao;
        this.numero = numero;
        this.nome = nome;
    }
    public int getNum(){
        return numero;
    }
    public String getNom(){
        return nome;
    }
    
        @Override
    public String toString() {
        // TODO: retona um String com as coordenadas do ponto no formato (x, y),
        // por exemplo, (1,11, 2,22) para um ponto com coordenadas x = 1.11 e
        // y = 2.22
         
        return "(" + numero + ", " + nome + ")";
    }

}
