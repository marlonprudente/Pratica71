
import java.util.*;
import utfpr.dainf.if62c.pratica.Jogador;
import utfpr.dainf.if62c.pratica.JogadorComparator;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná DAINF - Departamento
 * Acadêmico de Informática IF62C - Fundamentos de Programação 2
 *
 * Template de projeto de programa Java usando Maven.
 *
 * @author 
 */
public class Pratica62 {

    public static void main(String[] args) {

        ArrayList<Jogador> time = new ArrayList<>();
        time.add(new Jogador(10,"Neymar"));     
        time.add(new Jogador(11,"Pele"));
        time.add(new Jogador(12,"Romario"));
        time.add(new Jogador(13,"Fulano"));
        time.add(new Jogador(14,"Cliclano"));
        
        Collections.sort(time, new JogadorComparator(true,false));
        
        for(Jogador j: time){
            System.out.println(j);
        }
        Jogador pesquisa;
       int indice = Collections.binarySearch(time, new Jogador(10,"Neymar"), new JogadorComparator(true, false));
       if (indice>=0){
            pesquisa= time.get(indice);
            System.out.println(" Posicao = "+ pesquisa);
        }
    }
}
