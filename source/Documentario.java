public class Documentario extends Item{
    private int duracao;
    private String assunto;

    public Documentario(String nome, float avaliacao, int anoDeLancamento) {
        super(nome, avaliacao, anoDeLancamento);
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
}
