package jogadores;
import cartas.Carta;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private String nome;
    private int vida = 30;
    private int mana = 10;
    private List<Carta> deck = new ArrayList<>();
    private List<Carta> mao = new ArrayList<>();

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getMana() {
        return mana;
    }

    public List<Carta> getDeck() {
        return deck;
    }

    public List<Carta> getMao() {
        return mao;
    }

    public void subtrairVida(int quantidade) {
        vida -= quantidade;
        if (vida < 0) vida = 0;
    }

    public void adicionarVida(int quantidade) {
        vida += quantidade;
    }

    public void subtrairMana(int quantidade) {
        mana -= quantidade;
        if (mana < 0) mana = 0;
    }

    public void comprarCarta() {
        if (!deck.isEmpty()) {
            mao.add(deck.remove(0));
        }
    }
}
