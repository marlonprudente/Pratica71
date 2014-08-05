
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
public class Pratica71 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero de jogadores:");
        int num = scanner.nextInt();
        System.out.println("Quantidade:" + num);
        ArrayList<Jogador> time = new ArrayList<>();
        for(int i = 0; i<num;i++){
            System.out.println("Digite o numero e o nome:");
            time.add(new Jogador(scanner.nextInt(),scanner.next()));
        }
        
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
