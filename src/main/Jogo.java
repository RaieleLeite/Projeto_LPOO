package main;

import baralho.Baralho;
import jogadores.Jogador;
import cartas.Carta;
import cartas.Criatura;
import cartas.Feitico;
import cartas.Encantamento;

import java.util.Scanner;

public class Jogo {

    private Jogador jogador1;
    private Jogador jogador2;
    private Scanner scanner;

    public Jogo() {
        scanner = new Scanner(System.in);
        inicializarJogo();
    }

    private void inicializarJogo() {
        System.out.println("Digite o nome do jogador 1:");
        jogador1 = new Jogador(scanner.nextLine());

        System.out.println("Digite o nome do jogador 2:");
        jogador2 = new Jogador(scanner.nextLine());

        Baralho baralho = new Baralho();

        jogador1.getDeck().addAll(baralho.sortearCartas(30));
        jogador2.getDeck().addAll(baralho.sortearCartas(30));

        for (int i = 0; i < 5; i++) {
            jogador1.comprarCarta();
            jogador2.comprarCarta();
        }
    }

    public void jogar() {
        boolean fimDeJogo = false;
        Jogador jogadorAtual = jogador1;
        Jogador jogadorOponente = jogador2;

        while (!fimDeJogo) {
            System.out.println("\n" + jogadorAtual.getNome() + ", sua vez!");
            System.out.println("Vida: " + jogadorAtual.getVida() + " | Mana: " + jogadorAtual.getMana());
            System.out.println("Mão:");

            for (int i = 0; i < jogadorAtual.getMao().size(); i++) {
                Carta carta = jogadorAtual.getMao().get(i);
                System.out.println(i + " - " + carta.detalhes());
            }

            System.out.println("Escolha uma ação:");
            System.out.println("1 - Jogar uma carta");
            System.out.println("2 - Passar a vez");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Escolha o índice da carta:");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < jogadorAtual.getMao().size()) {
                        Carta cartaJogada = jogadorAtual.getMao().get(indice);
                        if (jogadorAtual.getMana() >= cartaJogada.getCustoMana()) {
                            jogadorAtual.subtrairMana(cartaJogada.getCustoMana());
                            executarCarta(cartaJogada, jogadorAtual, jogadorOponente);
                            jogadorAtual.getMao().remove(indice);
                        } else {
                            System.out.println("Mana insuficiente para jogar essa carta!");
                        }
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;
                case 2:
                    System.out.println(jogadorAtual.getNome() + " passou a vez.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            Jogador temp = jogadorAtual;
            jogadorAtual = jogadorOponente;
            jogadorOponente = temp;

            if (jogador1.getVida() <= 0 || jogador2.getVida() <= 0) {
                fimDeJogo = true;
            }
        }

        System.out.println("\nFim de jogo!");
        if (jogador1.getVida() <= 0) {
            System.out.println(jogador2.getNome() + " venceu!");
        } else if (jogador2.getVida() <= 0) {
            System.out.println(jogador1.getNome() + " venceu!");
        }
    }

    private void executarCarta(Carta carta, Jogador jogadorAtual, Jogador jogadorOponente) {
        if (carta instanceof Criatura) {
            Criatura criatura = (Criatura) carta;
            jogadorOponente.subtrairVida(criatura.getPoder());
            System.out.println("A criatura '" + criatura.getNome() + "' atacou e causou " + criatura.getPoder() + " de dano.");
        } else if (carta instanceof Feitico) {
            Feitico feitico = (Feitico) carta;
            feitico.aplicarEfeito(jogadorAtual, jogadorOponente);
        } else if (carta instanceof Encantamento) {
            Encantamento encantamento = (Encantamento) carta;
            System.out.println("Efeito contínuo ativado: " + encantamento.getEfeitoContinuo());
        }
    }
}
