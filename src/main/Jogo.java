package main;

import baralho.*;
import jogadores.*;
import cartas.*;


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
        // Inicia o jogo com o nome dos jogadores
        System.out.println("Digite o nome do jogador 1:");
        jogador1 = new Jogador(scanner.nextLine());

        System.out.println("Digite o nome do jogador 2:");
        jogador2 = new Jogador(scanner.nextLine());

        // Cria o baralho e sorteia 30 cartas para cada jogador
        Baralho baralho = new Baralho();

        // Sorteia 30 cartas para cada jogador
        jogador1.getDeck().addAll(baralho.sortearCartas(30));
        jogador2.getDeck().addAll(baralho.sortearCartas(30));

        // Cada jogador compra 5 cartas iniciais
        for (int i = 0; i < 5; i++) {
            jogador1.comprarCarta();
            jogador2.comprarCarta();
        }
    }

    public void jogar() {
        boolean fimDeJogo = false;
        Jogador jogadorAtual = jogador1;
        Jogador jogadorOponente = jogador2;

        // Loop principal do jogo
        while (!fimDeJogo) {
            System.out.println("\n" + jogadorAtual.getNome() + ", sua vez!");
            System.out.println("Vida: " + jogadorAtual.getVida() + " | Mana: " + jogadorAtual.getMana());

            // Exibe as cartas na mão do jogador
            System.out.println("Mão:");
            for (int i = 0; i < jogadorAtual.getMao().size(); i++) {
                Carta carta = jogadorAtual.getMao().get(i);
                System.out.println(i + " - " + carta.detalhes());
            }

            // Exibe as opções de ações do jogador
            System.out.println("Escolha uma ação:");
            System.out.println("1 - Comprar carta do deck");
            System.out.println("2 - Jogar uma carta");
            System.out.println("3 - Passar a vez");

            // Lê a escolha do jogador
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    // Comprar uma carta do deck se a mão não estiver cheia
                    if (jogadorAtual.getMao().size() < 5) {
                        if (!jogadorAtual.getDeck().isEmpty()) {
                            jogadorAtual.comprarCarta();
                            System.out.println(jogadorAtual.getNome() + " comprou uma carta.");
                        } else {
                            System.out.println("Você não tem mais cartas no deck!");
                        }
                    } else {
                        System.out.println("Sua mão já está cheia! Jogue ou passe a vez.");
                    }
                    break;
                case 2:
                    // Jogar uma carta da mão
                    System.out.println("Escolha o índice da carta:");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < jogadorAtual.getMao().size()) {
                        Carta cartaJogada = jogadorAtual.getMao().get(indice);
                        if (jogadorAtual.getMana() >= cartaJogada.getCustoMana()) {
                            // Subtrai a mana e executa a carta
                            jogadorAtual.subtrairMana(cartaJogada.getCustoMana());
                            executarCarta(cartaJogada, jogadorAtual, jogadorOponente);
                            jogadorAtual.getMao().remove(indice); // Remove a carta da mão
                        } else {
                            System.out.println("Mana insuficiente para jogar essa carta!");
                        }
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;
                case 3:
                    // Passa a vez para o outro jogador
                    System.out.println(jogadorAtual.getNome() + " passou a vez.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            // Troca de jogador
            if (escolha == 3 || escolha == 2) { 
                Jogador temp = jogadorAtual;
                jogadorAtual = jogadorOponente;
                jogadorOponente = temp;
            }

            // Verifica se o jogo acabou
            if (jogador1.getVida() <= 0 || jogador2.getVida() <= 0) {
                fimDeJogo = true;
            }
        }

        // Exibe o resultado final do jogo
        System.out.println("\nFim de jogo!");
        if (jogador1.getVida() <= 0) {
            System.out.println(jogador2.getNome() + " venceu!");
        } else if (jogador2.getVida() <= 0) {
            System.out.println(jogador1.getNome() + " venceu!");
        }
    }

    private void executarCarta(Carta carta, Jogador jogadorAtual, Jogador jogadorOponente) {
        if (carta instanceof Criatura) {
            // Se a carta for uma criatura, causa dano ao oponente
            Criatura criatura = (Criatura) carta;
            jogadorOponente.subtrairVida(criatura.getPoder());
            System.out.println("A criatura '" + criatura.getNome() + "' atacou e causou " + criatura.getPoder() + " de dano.");
        } else if (carta instanceof Feitico) {
            // Se a carta for um feitiço, aplica o efeito
            Feitico feitico = (Feitico) carta;
            feitico.aplicarEfeito(jogadorAtual, jogadorOponente);
        } else if (carta instanceof Encantamento) {
            // Se a carta for um encantamento, exibe o efeito contínuo
            Encantamento encantamento = (Encantamento) carta;
            System.out.println("Efeito contínuo ativado: " + encantamento.getEfeitoContinuo());
        }
    }
}
