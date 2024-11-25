package cartas;

import jogadores.Jogador;

public class Feitico extends Carta {
    private String efeito;
    private int impactoVida; // Positivo para curar, negativo para dano.

    public Feitico(String nome, int custoMana, String efeito, int impactoVida) {
        super(nome, custoMana);
        this.efeito = efeito;
        this.impactoVida = impactoVida;
    }

    public String getEfeito() {
        return efeito;
    }

    public int getImpactoVida() {
        return impactoVida;
    }

    @Override
    public String detalhes() {
        return "[Tipo: Feitiço] Nome: " + getNome() + ", Custo de Mana: " + getCustoMana() +
                ", Efeito: " + efeito + ", Impacto: " + impactoVida;
    }

    public void aplicarEfeito(Jogador jogadorAtual, Jogador jogadorOponente) {
        System.out.println("Efeito do feitiço '" + getNome() + "' ativado: " + efeito);
        if (impactoVida > 0) {
            jogadorAtual.adicionarVida(impactoVida);
            System.out.println(jogadorAtual.getNome() + " recuperou " + impactoVida + " pontos de vida.");
        } else if (impactoVida < 0) {
            jogadorOponente.subtrairVida(-impactoVida);
            System.out.println(jogadorOponente.getNome() + " perdeu " + (-impactoVida) + " pontos de vida.");
        }
    }
}
