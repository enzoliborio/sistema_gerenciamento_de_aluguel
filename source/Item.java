public class Item {
    protected String nome;
    protected float avaliacao;
    protected int anoDeLancamento;
    protected float multa;
    protected int vezesAlugado;
    protected boolean disponivel;


    public Item(String nome, float avaliacao, int anoDeLancamento) {
        this.nome = nome;
        this.avaliacao = avaliacao;
        this.anoDeLancamento = anoDeLancamento;
        vezesAlugado = 0;
        disponivel = true;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public boolean alugar(){
        if (disponivel) {
            System.out.println("Você acabou de alugar o programa, aproveite!");
            disponivel = false;
            vezesAlugado++;
            return true;
        } else {
            System.out.println("Infelizmente o programa não está disponível no momento, temos muitas outras opções!");
            return false;
        }
    }

    public void devolver() {
        disponivel = true;
        System.out.println("Programa devolvido");
    }
}
