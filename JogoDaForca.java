import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class JogoDaForca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // cria o leitor de dados do teclado
        Random random = new Random(); // usado pra escolher uma palavra aleatória

        ArrayList<String> palavras = new ArrayList<>(); // lista com as palavras do jogo
        ArrayList<Character> letrasUsadas = new ArrayList<>(); // guarda as letras já tentadas

        // adiciona as palavras possíveis
        palavras.add("golfinho");    
        palavras.add("pindamonhangaba"); 
        palavras.add("interessante"); 
        palavras.add("linguagem"); 
        palavras.add("metamorfose"); 
        palavras.add("microscopio");

        // escolhe uma palavra aleatória da lista
        int indice = random.nextInt(palavras.size());
        String palavraAleatoria = palavras.get(indice);

        System.out.println(palavraAleatoria); // mostra a palavra (só pra testar, depois dá pra tirar)

        // cria um array pra mostrar as letras escondidas com "_"
        char[] escondida = new char[palavraAleatoria.length()];
        for (int i = 0; i < palavraAleatoria.length(); i++) {
            escondida[i] = '_'; // coloca "_" no lugar das letras
        }

        int chance = 7; // número de chances que o jogador tem
        boolean venceu = true; // controla se o jogador ganhou

        // começa o jogo, roda enquanto ainda tiver chance e não tiver vencido
        do {
            boolean temLetra = false; // marca se achou a letra ou não
            System.out.print("\nDigite uma letra: ");
            String tentativa = sc.next().toLowerCase(); // lê a letra e deixa minúscula

            char letra = tentativa.charAt(0); // pega o primeiro caractere da tentativa

            // verifica se o jogador já tentou essa letra
            if (letrasUsadas.contains(letra)) {
                System.out.println("Você já tentou essa letra, tente outra");
                continue; // pula pra próxima rodada
            }

            // verifica se a letra está na palavra
            for (int i = 0; i < palavraAleatoria.length(); i++) {
                if (palavraAleatoria.charAt(i) == letra) {
                    escondida[i] = letra; // mostra a letra certa no lugar
                    temLetra = true; // achou a letra
                } 
            }

            // se errou a letra, perde uma chance
            if (temLetra == false) {
                chance--;
            }

            // guarda a letra usada (certa ou errada)
            letrasUsadas.add(letra);

            // mostra como está a palavra no momento
            System.out.println(escondida);

            // mostra quantas chances ainda tem
            System.out.println("\nVocê tem mais " + chance + " chances");

            // mostra as letras que já foram tentadas
            System.out.print("Letras erradas: ");
            for (int i = 0; i < letrasUsadas.size(); i++) {
                System.out.print(letrasUsadas.get(i) + "  ");
            }

            // verifica se o jogador já completou a palavra
            venceu = true;
            for (char c : escondida) {
                if (c == '_') { // se ainda tiver "_" é porque não venceu ainda
                    venceu = false;
                    break;
                }
            }

        } while (chance > 0 && !venceu); // repete enquanto tiver chance e não tiver vencido

        // mostra o resultado final
        if (venceu == true) {
            System.out.println("\nParabéns, você venceu");
        } else {
            System.out.println("\nVocê perdeu, a palavra correta era " + palavraAleatoria);
        }
    }
}
