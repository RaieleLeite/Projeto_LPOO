package cartas;

public class Criatura extends Carta {
    private int poder;
    private int resistencia;
    
   public Criatura(String nome, int custoMana, int poder, int resistencia) {
        super(nome, custoMana);
        this.poder = poder;
        this.resistencia = resistencia;
        
    }

    public int getPoder() {
        return poder;
    }

    public int getResistencia() {
        return resistencia;
    }

    

    @Override
    public String detalhes() {
        return "[Tipo: Criatura] Nome: " + getNome() + ", Custo de Mana: " + getCustoMana() +
                ", Poder: " + poder + ", Resistência: " + resistencia ;
    }
}