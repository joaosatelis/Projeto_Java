// ed01/Main.java
package ed01;

import java.util.Scanner;

/**
 * Classe principal que executa o jogo de adivinhação.
 */
public class Main {
    /**
     * Método principal que inicia e controla o fluxo do jogo.
     *
     * @param args Argumentos da linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Placar placar = new Placar();
        boolean continuarJogando = true;

        while (continuarJogando) {
            System.out.println("\n--- Novo Jogo ---");
            System.out.print("Digite seu nome: ");
            String nomeJogador = teclado.nextLine();

            Jogador jogador = new Jogador(nomeJogador);
            Jogo jogo = new Jogo(jogador);

            int tentativa;
            String resultado;

            System.out.println("\nTente adivinhar o número secreto entre 1 e 100.");

            do {
                System.out.print("Digite sua tentativa: ");
                tentativa = teclado.nextInt();
                teclado.nextLine(); // Consumir a quebra de linha

                resultado = jogo.jogar(tentativa);
                System.out.println("O número secreto é " + resultado + " que a sua tentativa.");

            } while (!resultado.equals("acertou"));

            System.out.println("\nParabéns, " + jogador.getNome() + "! Você acertou o número secreto (" + jogo.getNumeroSecreto() + ") em " + jogador.getTentativas() + " tentativas.");
            System.out.println("Sua pontuação nesta rodada: " + jogador.getPontuacao() + " pontos.");

            placar.adicionarJogador(jogador);
            placar.mostrarRanking();

            System.out.print("\nDeseja jogar novamente? (s/n): ");
            String resposta = teclado.nextLine().toLowerCase();
            if (!resposta.equals("s")) {
                continuarJogando = false;
            }
        }

        System.out.println("\nObrigado por jogar!");
        teclado.close();
    }
}