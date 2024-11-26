package baralho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cartas.Carta;
import cartas.Feitico;
import cartas.Criatura;
import cartas.Encantamento;



public class Baralho {

    private List<Carta> cartas;

    public Baralho() {
        cartas = new ArrayList<>();
        gerarCartas();
    }

    private void gerarCartas() {
    	//Deck Pyrathos (Reino de Fogo)
        //Criaturas
    	cartas.add(new Criatura("Dragão de Lava", 7, 6, 5));
    	cartas.add(new Criatura("Fênix Incandescente", 5, 3, 3));
    	cartas.add(new Criatura("Elemental de Fogo", 4, 4, 2));
    	cartas.add(new Criatura("Golem de Magma", 6, 5, 4));
    	cartas.add(new Criatura("Mago Flamívoro", 4, 2, 3));
    	cartas.add(new Criatura("Estátua de Cinzas", 3, 2, 4));
    	cartas.add(new Criatura("Dragão de Lava", 7, 6, 5));
        
        //Feiticos
    	cartas.add(new Feitico("Salva de Meteoros", 6, 4));
    	cartas.add(new Feitico("Labareda Devastadora", 5, 5));
    	cartas.add(new Feitico("Vulcão Despertado", 8, 2));
    	cartas.add(new Feitico("Fúria Flamejante", 3, 3));
    	cartas.add(new Feitico("Estrela Cadente", 4, 3));
        
        //Encantamentos
    	cartas.add(new Encantamento("Forja de Pyrathos", 4, 1));
    	cartas.add(new Encantamento("Inferno Crescente", 3, 1));
    	cartas.add(new Encantamento("Aura de Chamas", 3, 2));
    	cartas.add(new Encantamento("Círculo de Lava", 5, 1));
        
        
        
        //Deck Eldragor (Reino de Gelo)
        //Criaturas
    	cartas.add(new Criatura("Dragão de Gelo Antigo", 7, 5, 6));
    	cartas.add(new Criatura("Yeti de Eldragor", 4, 3, 4));
    	cartas.add(new Criatura("Serpente de Neve", 3, 2, 3));
    	cartas.add(new Criatura("Sentinela Glacial", 5, 2, 6));
    	cartas.add(new Criatura("Mago do Ártico", 4, 2, 3));
    	cartas.add(new Criatura("Estátua Glacial", 6, 4, 7));
        
        //Feiticos
    	cartas.add(new Feitico("Tempestade de Gelo", 5, 0));
    	cartas.add(new Feitico("Geada Mortal", 3, 2));
    	cartas.add(new Feitico("Congelamento Instantâneo", 2, 0));
    	cartas.add(new Feitico("Frio Implacável", 4, 0));
    	cartas.add(new Feitico("Nevasca", 4, 0));
        
        //Encantamentos
    	cartas.add(new Encantamento("Muralha de Gelo", 3, 0));
    	cartas.add(new Encantamento("Tundra Viva", 4, 1));
    	cartas.add(new Encantamento("Aura de Gelo", 3, 3));
        
        
        
        //Deck Sylvanya (Reino da Terra)
        //Criaturas
    	cartas.add(new Criatura("Ent Ancião", 6, 4, 7));
    	cartas.add(new Criatura("Lobo de Sylvanya", 3, 2, 2));
    	cartas.add(new Criatura("Druida Ancestral", 4, 2, 3));
    	cartas.add(new Criatura("Árvore Ancestral", 5, 3, 6));
    	cartas.add(new Criatura("Cervo Místico", 3, 1, 3));
    	cartas.add(new Criatura("Fera da Floresta", 5, 4, 4));
    	cartas.add(new Criatura("Guardião da Floresta", 4, 3, 5));
        
        //Feiticos
    	cartas.add(new Feitico("Vinhas Crescentes", 4, 0));
    	cartas.add(new Feitico("Força da Natureza", 3, 3));
    	cartas.add(new Feitico("Bênção de Sylvanya", 2, 4));
    	cartas.add(new Feitico("Renascimento Selvagem", 5, 0));
    	cartas.add(new Feitico("Raízes Espinhosas", 3, 1));
    	cartas.add(new Feitico("Chamado da Natureza", 4, 1));
        
        //Encantamentos
    	cartas.add(new Encantamento("Aura de Crescimento", 3, 1));
        
        
        
        //Deck Umbra (Reino de Umbra)
        //Criaturas
    	cartas.add(new Criatura("Espectro Sombrio", 3, 2, 2));
    	cartas.add(new Criatura("Necromante das Sombras", 5, 2, 3));
        cartas.add(new Criatura("Assassino de Umbra", 4, 3, 2));
        cartas.add(new Criatura("Fantasmas da Ruína", 4, 2, 2));
        cartas.add(new Criatura("Devorador de Almas", 6, 5, 4));
        cartas.add(new Criatura("Senhor das Sombras", 7, 6, 6));
        cartas.add(new Criatura("Cavaleiro Espectral", 4, 3, 3));
        
        //Feiticos
        cartas.add(new Feitico("Feitiço de Tormento", 3, 0));
        cartas.add(new Feitico("Nuvem de Trevas", 4, 0));
        cartas.add(new Feitico("Poço de Desespero", 5, 1));
        cartas.add(new Feitico("Feitiço de Corrupção", 4, 0));
        cartas.add(new Feitico("Feitiço de Agonia", 3, 1));
        cartas.add(new Feitico("Drenagem de Vida", 4, 3));
        cartas.add(new Feitico("Manipulação Sombria", 6, 0));
        
        //Encantamentos
        cartas.add(new Encantamento("Poço de Desespero", 5, 1));
        cartas.add(new Encantamento("Marca da Perdição", 2, 2));
        
        
        
        // Deck Lumenia (Reino de Luz)
        // Criaturas
        cartas.add(new Criatura("Cavaleiro da Aurora", 4, 3, 3));
        cartas.add(new Criatura("Arcanjo Luminoso", 7, 5, 7));
        cartas.add(new Criatura("Guerreiro da Luz", 3, 2, 3));
        cartas.add(new Criatura("Sacerdote Solar", 3, 1, 4));
        cartas.add(new Criatura("Guerreiro Celestial", 4, 3, 3));
        cartas.add(new Criatura("Guardião do Sol", 5, 4, 5));

        // Feiticos
        cartas.add(new Feitico("Raio de Sol", 3, 2));
        cartas.add(new Feitico("Cura Sagrada", 4, 0));
        cartas.add(new Feitico("Escudo de Luz", 3, 0));
        cartas.add(new Feitico("Bênção do Sol", 5, 0));

        // Encantamentos
        cartas.add(new Encantamento("Campo de Luz", 4, 2));
        cartas.add(new Encantamento("Aura Divina", 6, 1));
    

    
        // Embaralhar cartas
        Collections.shuffle(cartas);
    }

    public List<Carta> sortearCartas(int quantidade) {
        List<Carta> sorteadas = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) {
            sorteadas.add(cartas.get(i)); // Aqui você pode modificar o algoritmo para sortear aleatoriamente
        }
        return sorteadas;
    }
}