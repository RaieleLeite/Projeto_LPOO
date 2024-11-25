package cartas;

public class Encantamento extends Carta {
    private String efeitoContinuo;

    public Encantamento(String nome, int custoMana, String efeitoContinuo) {
        super(nome, custoMana);
        this.efeitoContinuo = efeitoContinuo;
    }

    public String getEfeitoContinuo() {
        return efeitoContinuo;
    }

    @Override
    public String detalhes() {
        return "[Tipo: Encantamento] Nome: " + getNome() + ", Custo de Mana: " + getCustoMana() +
                ", Efeito Contínuo: " + efeitoContinuo;
    }
}
