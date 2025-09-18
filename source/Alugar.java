public class Alugar {
    private Cliente cliente;
    private Item item;

    public Alugar(Cliente cliente, Item item) {
        this.cliente = cliente;
        this.item = item;
    }

    public void alugar(){
        item.alugar();
    }
    public void devolver(){
        item.devolver();
    }
}
