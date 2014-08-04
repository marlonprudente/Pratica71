
import java.util.*;
import utfpr.dainf.if62c.pratica.Jogador;

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
        
        time.sort((Comparator<? super Jogador>) time);
    }
}
