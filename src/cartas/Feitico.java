package cartas;

import jogadores.Jogador;

public class Feitico extends Carta {

    private int valorEfeito; // Valor do efeito do feitiço (ex: dano ou cura)

    // Construtor que recebe o nome, custo de mana e valor do efeito
    public Feitico(String nome, int custoMana, int valorEfeito) {
        super(nome, custoMana);  // Chama o construtor da classe base Carta
        this.valorEfeito = valorEfeito;
    }

    // Método para aplicar o efeito do feitiço, que pode ser no jogador atual ou oponente
    public void aplicarEfeito(Jogador jogadorAtual, Jogador jogadorOponente) {
        // A lógica do efeito do feitiço pode variar. Exemplo: diminuir vida do oponente
        System.out.println("Feitiço '" + getNome() + "' aplicado!");
        System.out.println("Valor do efeito: " + valorEfeito);
        
        // Aqui, o efeito pode ser qualquer coisa. Exemplo: redução de vida no oponente
        jogadorOponente.subtrairVida(valorEfeito);
    }

    @Override
    public String detalhes() {
        return "Feitiço: " + getNome() + " - Custo: " + getCustoMana() + " - Efeito: " + valorEfeito;
    }
}
