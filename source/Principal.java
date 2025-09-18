//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Sociedade dos poetas mortos",10,1989);
        filme1.setDuracao(128);
        filme1.setGenero("Drama");
        filme1.setNomeDiretor("Peter Weir");

        Filme filme2 = new Filme("Adoráveis mulheres",10,2020);
        filme1.setDuracao(135);
        filme1.setGenero("Drama");
        filme1.setNomeDiretor("Greta Gerwig");

        Serie serie1 = new Serie("Modern Family", 9,2009);
        serie1.setDuracao(20);
        serie1.setTemporada(4);
        serie1.setQuantEpisodios(24);

        Serie serie2 = new Serie("New Girl", 8, 2011);
        serie2.setDuracao(24);
        serie2.setTemporada(2);
        serie2.setQuantEpisodios(25);

        Cliente cliente1 = new Cliente("Beatriz", "278923");
        Cliente cliente2 = new Cliente("Enzo", "1479268");
        Cliente cliente3 = new Cliente("Gabriel", "1579464");

        serie1.alugar();
        serie1.alugar();
    }
}