// ed01/Jogo.java
package ed01;

import java.util.Random;

/**
 * Gerencia a lógica de uma rodada do jogo de adivinhação.
 */
public class Jogo {
    private Jogador jogador;
    private int numeroSecreto;

    /**
     * Construtor da classe Jogo.
     *
     * @param jogador O jogador que está participando desta rodada.
     */
    public Jogo(Jogador jogador) {
        this.jogador = jogador;
        Random rand = new Random();
        this.numeroSecreto = rand.nextInt(100) + 1;
    }

    /**
     * Realiza uma tentativa de adivinhar o número secreto.
     *
     * @param tentativa O número que o jogador está tentando adivinhar.
     * @return Uma string informando se o número é "maior", "menor" ou "acertou".
     */
    public String jogar(int tentativa) {
        jogador.incrementarTentativas();
        if (tentativa < numeroSecreto) {
            return "maior";
        } else if (tentativa > numeroSecreto) {
            return "menor";
        } else {
            // Calcula a pontuação: 100 - (tentativas - 1) * 10
            int pontuacao = Math.max(0, 100 - (jogador.getTentativas() - 1) * 10);
            jogador.atualizarPontuacao(pontuacao);
            return "acertou";
        }
    }

    /**
     * Obtém o número secreto (para fins de teste ou depuração).
     *
     * @return O número secreto.
     */
    public int getNumeroSecreto() {
        return numeroSecreto;
    }

    /**
     * Gera um novo número secreto para uma nova rodada.
     */
    public void gerarNovoNumeroSecreto() {
        Random rand = new Random();
        this.numeroSecreto = rand.nextInt(100) + 1;
    }
}