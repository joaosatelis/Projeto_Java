// ed01/Jogador.java
package ed01;

/**
 * Representa um jogador no jogo de adivinhação.
 */
public class Jogador {
    private String nome;
    private int tentativas;
    private int pontuacao;

    /**
     * Construtor da classe Jogador.
     *
     * @param nome O nome do jogador.
     */
    public Jogador(String nome) {
        this.nome = nome;
        this.tentativas = 0;
        this.pontuacao = 0;
    }

    /**
     * Obtém o nome do jogador.
     *
     * @return O nome do jogador.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do jogador.
     *
     * @param nome O novo nome do jogador.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o número de tentativas do jogador.
     *
     * @return O número de tentativas.
     */
    public int getTentativas() {
        return tentativas;
    }

    /**
     * Define o número de tentativas do jogador.
     *
     * @param tentativas O novo número de tentativas.
     */
    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    /**
     * Obtém a pontuação do jogador.
     *
     * @return A pontuação do jogador.
     */
    public int getPontuacao() {
        return pontuacao;
    }

    /**
     * Define a pontuação do jogador.
     *
     * @param pontuacao A nova pontuação do jogador.
     */
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    /**
     * Incrementa o número de tentativas do jogador em 1.
     */
    public void incrementarTentativas() {
        this.tentativas++;
    }

    /**
     * Atualiza a pontuação do jogador.
     *
     * @param valor O valor a ser adicionado à pontuação.
     */
    public void atualizarPontuacao(int valor) {
        this.pontuacao += valor;
    }

    /**
     * Reseta as tentativas do jogador para uma nova rodada.
     */
    public void resetarTentativas() {
        this.tentativas = 0;
    }

    /**
     * Reseta a pontuação do jogador para uma nova rodada (opcional, dependendo da lógica do jogo).
     */
    public void resetarPontuacao() {
        this.pontuacao = 0;
    }
}