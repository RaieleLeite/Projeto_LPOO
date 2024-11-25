package cartas;

public class Criatura extends Carta {
    private int poder;
    private int resistencia;
    private String habilidadeEspecial;

    public Criatura(String nome, int custoMana, int poder, int resistencia, String habilidadeEspecial) {
        super(nome, custoMana);
        this.poder = poder;
        this.resistencia = resistencia;
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public int getPoder() {
        return poder;
    }

    public int getResistencia() {
        return resistencia;
    }

    public String getHabilidadeEspecial() {
        return habilidadeEspecial;
    }

    @Override
    public String detalhes() {
        return "[Tipo: Criatura] Nome: " + getNome() + ", Custo de Mana: " + getCustoMana() +
                ", Poder: " + poder + ", Resistência: " + resistencia +
                ", Habilidade Especial: " + habilidadeEspecial;
    }
}
