public class Filme extends Item{
    private String genero;
    private String nomeDiretor;
    //duração em minutos
    private int duracao;

    public Filme(String nome, float avaliacao, int anoDeLancamento) {
        super(nome, avaliacao, anoDeLancamento);
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
