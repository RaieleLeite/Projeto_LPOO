package baralho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cartas.Carta;
import cartas.Criatura;
import cartas.Feitico;
import cartas.Encantamento;

public class Baralho {

    private List<Carta> cartas;

    public Baralho() {
        cartas = new ArrayList<>();
        gerarCartas();
    }

    private void gerarCartas() {
        // Adicionando 20 cartas de Criatura
        cartas.add(new Criatura("Lobo Sombra", 2, 3, 2, "Rapidez"));
        cartas.add(new Criatura("Guerreiro da Floresta", 3, 4, 3, "Provocar"));
        cartas.add(new Criatura("Dragão Flamejante", 5, 7, 5, "Rapidez"));
        cartas.add(new Criatura("Golias Rochoso", 4, 5, 6, "Provocar"));
        cartas.add(new Criatura("Fênix do Vale", 6, 6, 4, "Rapidez"));
        cartas.add(new Criatura("Golem de Ferro", 3, 3, 7, "Provocar"));
        cartas.add(new Criatura("Espectro Sombrio", 4, 5, 3, "Rapidez"));
        cartas.add(new Criatura("Berserker da Tempestade", 5, 6, 4, "Rapidez"));
        cartas.add(new Criatura("Manticora", 5, 5, 6, "Provocar"));
        cartas.add(new Criatura("Guardião de Cristal", 3, 2, 8, "Provocar"));
        cartas.add(new Criatura("Unicórnio Celestial", 6, 7, 7, "Rapidez"));
        cartas.add(new Criatura("Troll das Cavernas", 4, 6, 6, "Provocar"));
        cartas.add(new Criatura("Hydra das Profundezas", 7, 8, 6, "Rapidez"));
        cartas.add(new Criatura("Anjo Guardião", 8, 7, 8, "Rapidez"));
        cartas.add(new Criatura("Demônio da Desolação", 7, 9, 5, "Rapidez"));
        cartas.add(new Criatura("Minotauro Selvagem", 6, 7, 6, "Provocar"));
        cartas.add(new Criatura("Serpente Abissal", 5, 6, 5, "Rapidez"));
        cartas.add(new Criatura("Cavaleiro de Ferro", 4, 5, 5, "Provocar"));
        cartas.add(new Criatura("Fera das Sombras", 6, 6, 4, "Rapidez"));
        cartas.add(new Criatura("Guerreiro do Sol", 3, 4, 4, "Rapidez"));

        // Adicionando 20 cartas de Feitiço
        cartas.add(new Feitico("Raio de Fogo", 3, "Causa 5 de dano ao oponente.", -5));
        cartas.add(new Feitico("Cura Rápida", 2, "Recupera 5 pontos de vida.", 5));
        cartas.add(new Feitico("Explosão Mágica", 4, "Causa 7 de dano a todas as criaturas inimigas.", 0)); // Este afeta criaturas, não vidas.
        cartas.add(new Feitico("Feitiço do Gelo", 3, "Congela uma criatura por 2 turnos.", 0));
        cartas.add(new Feitico("Tempestade Elétrica", 5, "Causa 6 de dano a todas as criaturas no campo.", 0));
        cartas.add(new Feitico("Veneno Mortal", 2, "Destrói uma criatura inimiga.", 0));
        cartas.add(new Feitico("Escudo Místico", 3, "Previne todo dano neste turno.", 0));
        cartas.add(new Feitico("Chama Divina", 4, "Causa 6 de dano a um oponente.", -6));
        cartas.add(new Feitico("Fórmula de Invisibilidade", 2, "Faz com que uma criatura não possa ser atacada por 1 turno.", 0));
        cartas.add(new Feitico("Barreira de Luz", 4, "Aumenta em 5 a resistência de todas as criaturas aliadas.", 0));
        cartas.add(new Feitico("Dardo Envenenado", 3, "Causa 4 de dano e diminui o poder da criatura em 2.", -4));
        cartas.add(new Feitico("Transformação", 5, "Transforma uma criatura inimiga em uma criatura 1/1.", 0));
        cartas.add(new Feitico("Chuva de Meteoros", 7, "Causa 10 de dano a todas as criaturas no campo.", -10));
        cartas.add(new Feitico("Ressurreição", 6, "Revive uma criatura do cemitério.", 0));
        cartas.add(new Feitico("Onda de Choque", 3, "Causa 5 de dano a um oponente.", -5));
        cartas.add(new Feitico("Maldição da Lua", 4, "Diminui o poder de todas as criaturas inimigas em 3.", -3));
        cartas.add(new Feitico("Explosão Psíquica", 5, "Causa 8 de dano ao oponente.", -8));
        cartas.add(new Feitico("Encanto de Serenidade", 3, "Remove todos os encantamentos do campo.", 0));
        cartas.add(new Feitico("Planta Venenosa", 2, "Destrói a criatura com menor resistência no campo.", 0));
        cartas.add(new Feitico("Revitalização", 4, "Recupera 10 pontos de vida.", 10));

        // Adicionando 20 cartas de Encantamento
        cartas.add(new Encantamento("Aura de Força", 3, "Aumenta o poder de todas as criaturas aliadas em 2."));
        cartas.add(new Encantamento("Bênção de Vigor", 2, "Aumenta a resistência de uma criatura em 3."));
        cartas.add(new Encantamento("Domínio das Sombras", 4, "Diminui o poder das criaturas inimigas em 2."));
        cartas.add(new Encantamento("Selo de Proteção", 3, "Previne 3 de dano a cada turno."));
        cartas.add(new Encantamento("Fúria do Caçador", 4, "Aumenta o poder de uma criatura em 4."));
        cartas.add(new Encantamento("Cegueira Prolongada", 2, "Impede que uma criatura ataque por 2 turnos."));
        cartas.add(new Encantamento("Escudo Imortal", 5, "Previne todo dano recebido por uma criatura."));
        cartas.add(new Encantamento("Reflexo Mágico", 3, "Causa 2 de dano ao oponente sempre que ele jogar uma carta."));
        cartas.add(new Encantamento("Luz da Vitória", 4, "Aumenta o poder de todas as criaturas aliadas em 3."));
        cartas.add(new Encantamento("Coração de Ferro", 3, "Aumenta a resistência de todas as criaturas aliadas em 3."));
        cartas.add(new Encantamento("Olhar de Águia", 2, "Aumenta o poder de uma criatura em 1."));
        cartas.add(new Encantamento("Ritual do Sacrifício", 4, "Permite ao jogador comprar 2 cartas adicionais por turno."));
        cartas.add(new Encantamento("Força Ancestral", 5, "Aumenta o poder de todas as criaturas aliadas em 4."));
        cartas.add(new Encantamento("Selo da Ressurreição", 6, "Revive uma criatura aleatória do cemitério no final do turno."));
        cartas.add(new Encantamento("Escudo da Fênix", 4, "Previne 2 de dano a cada turno."));
        cartas.add(new Encantamento("Cura do Espírito", 3, "Recupera 2 pontos de vida por turno."));
        cartas.add(new Encantamento("Chama Eterna", 5, "Causa 3 de dano a todas as criaturas inimigas por turno."));
        cartas.add(new Encantamento("Escudo de Cristal", 3, "Previne 3 de dano a cada turno."));
        cartas.add(new Encantamento("Manto do Feiticeiro", 4, "Aumenta o poder de feitiços jogados pelo jogador em 2."));
        cartas.add(new Encantamento("Força Divina", 6, "Aumenta o poder e a resistência de todas as criaturas aliadas em 3."));
    
        // Embaralhar cartas
        Collections.shuffle(cartas);
    }

    public List<Carta> sortearCartas(int quantidade) {
        List<Carta> sorteadas = new ArrayList<>(cartas.subList(0, quantidade));
        cartas.removeAll(sorteadas);
        return sorteadas;
    }
}
