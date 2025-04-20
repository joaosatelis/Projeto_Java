// ed01/Placar.java
package ed01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Responsável por armazenar e exibir a pontuação dos jogadores.
 */
public class Placar {
    private ArrayList<Jogador> ranking;

    /**
     * Construtor da classe Placar.
     */
    public Placar() {
        this.ranking = new ArrayList<>();
    }

    /**
     * Adiciona um jogador ao ranking.
     *
     * @param jogador O jogador a ser adicionado.
     */
    public void adicionarJogador(Jogador jogador) {
        this.ranking.add(jogador);
        // Ordena o ranking após adicionar um novo jogador
        Collections.sort(this.ranking, Comparator.comparingInt(Jogador::getPontuacao).reversed());
    }

    /**
     * Exibe o ranking dos jogadores, mostrando nome e pontuação.
     */
    public void mostrarRanking() {
        System.out.println("\n--- Ranking ---");
        if (ranking.isEmpty()) {
            System.out.println("Nenhum jogador no ranking ainda.");
        } else {
            for (int i = 0; i < ranking.size(); i++) {
                System.out.println((i + 1) + ". " + ranking.get(i).getNome() + ": " + ranking.get(i).getPontuacao() + " pontos");
            }
        }
        System.out.println("----------------");
    }
}