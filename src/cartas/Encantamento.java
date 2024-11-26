package cartas;
import jogadores.*;

public class Encantamento extends Carta {

    private int efeitoContinuo; 

    
    public Encantamento(String nome, int custoMana, int efeitoContinuo) {
        super(nome, custoMana);  
        this.efeitoContinuo = efeitoContinuo;
    }

    public int getEfeitoContinuo() {
        return efeitoContinuo;
    }

    @Override
    public String detalhes() {
        return "Encantamento: " + getNome() + " - Custo: " + getCustoMana() + " - Efeito contínuo: " + efeitoContinuo;
    }
}
