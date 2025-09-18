public class Serie extends Item{
    private int temporada;
    private int quantEpisodios;
    private int duracao;
    private int totalDuracao;

    public Serie(String nome, float avaliacao, int anoDeLancamento) {
        super(nome, avaliacao, anoDeLancamento);
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public void setQuantEpisodios(int quantEpisodios) {
        this.quantEpisodios = quantEpisodios;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    private void TotalDuracao() {
        this.totalDuracao = duracao*quantEpisodios;
    }
}
