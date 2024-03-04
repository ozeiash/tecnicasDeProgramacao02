/*
 * Copyright (C) 2024 ozeias
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package tecnicasdeprogramacao02;

/**
 *
 * @author ozeias
 * @date 03/03/2024
 * @brief Class Exercicio13
 */

/*
Bee 1085 - Joãozinho e Mariazinha são dois irmãos que estão muito empolgados com suas aulas 
de idiomas, cada um está fazendo vários diferentes cursinhos. Ao chegar em casa 
comentam sobre gramática, vocabulário, cultura dos países etc. Numa dessas 
conversas perceberam que algumas palavras são comuns a mais de um idioma, mesmo 
que não necessariamente tenham o mesmo significado. Por exemplo, “amigo” existe 
em português e espanhol e tem o mesmo significado, enquanto que “date” é uma 
palavra comum entre francês e inglês mas que pode ter significados diferentes, 
uma vez que “date” também se refere a um encontro em inglês, além de “data” de 
calendário. Já “red” em espanhol se refere a uma rede, enquanto que em inglês se 
refere à cor vermelha. Outro exemplo seria “actual” que, em inglês significa algo 
real e, em espanhol, tem o significado de presente, atual (como em português).
Empolgados com essas descobertas, resolveram escrever num caderno todas as 
palavras em comum que conseguiram pensar, associando cada uma a um par de 
idiomas. Observador como é, Joãozinho propˆos um desafio a Mariazinha: dados um 
idioma de origem e um de destino, escrever uma série de palavras sendo que a 
primeira necessariamente deveria pertencer ao idioma de origem e a última ao de 
destino. Duas palavras adjacentes nessa seqüência deveriam necessariamente 
pertencer a um mesmo idioma. Por exemplo, se o idioma de origem fosse português 
e o de destino francês, Mariazinha poderia escrever a seqüência amigo actual date 
(português/espanhol, espanhol/inglês, inglês/francês).
Para a surpresa de Joãozinho, Mariazinha conseguiu resolver o problema com muita 
facilidade. Irritado com o sucesso de sua irmã, ele resolveu complicar ainda mais 
o problema com duas restrições: Mariazinha deve encontrar a solução que tenha o 
menor comprimento da seqüência total não contando os espaços entre as palavras e 
duas palavras consecutivas não podem ter a mesma letra inicial.

Sendo assim, a solução anterior passa a ser inválida, pois “amigo” e “actual” 
têm a mesma letra inicial. é possível, porém, encontrar outra solução, que no 
caso seria amigo red date, cujo comprimento total é 12. Joãozinho fez uma extensa 
pesquisa na internet e compilou uma enorme lista de palavras e desafiou Mariazinha 
a resolver o problema. Como é possível que haja mais de uma solução, ele pediu para 
que ela apenas respondesse o comprimento da seqüência encontrada dadas as restrições 
ou se não há solução possível. Você seria capaz de ajudar Mariazinha?

Entrada

A entrada contém vários casos de teste. A primeira linha de um caso de teste 
contém um inteiro M (1 ≤ M ≤ 2000), representando o total de palavras compiladas 
por Joãozinho. A segunda linha contém duas cadeias de caracteres distintas O e D, 
separadas por um espaço em branco, indicando os idiomas de origem e destino 
respectivamente. Cada uma das M linhas seguintes contém três cadeias de caracteres 
I1, I2 e P, separadas por um espaço em branco, representando dois idiomas e uma 
palavra comum entre ambos (I1 e I2 são sempre diferentes). Todas as cadeias de 
caracteres terão tamanho mínimo 1 e máximo 50 e conterão apenas letras minúsculas. 
Um mesmo par de idiomas pode ter várias palavras diferentes associadas a ele, 
porém uma mesma palavra P nunca será repetida.
O final da entrada é indicado por uma linha que contém apenas um zero.
Saída
Para cada caso de teste da entrada seu programa deve imprimir um único inteiro, 
o comprimento da menor seqüência que satisfaça as restrições de Joãozinho, ou 
impossivel (em minúsculas, sem acento) caso não seja possível.
 */
import java.util.*; //Importa a biblioteca util

public class Exercicio12 {

    static final int INF = 999999; //Define uma constante INF para representar infinito.
    static int[][] dist = new int[4005][26]; //Matriz para armazenar as distâncias

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); //Habilita o teclado

        while (true) { //Condição para executar o próximo comando
            int N = ler.nextInt(); //Declara e armazena em uma variável o valor digitado pelo usuário
            if (N == 0) {
                break; //Condição para executar o próximo comando
            }
            String O = ler.next(); //Declara e armazena em uma variável o valor digitado pelo usuário
            String D = ler.next(); //Declara e armazena em uma variável o valor digitado pelo usuário

            Map<String, Integer> mapa = new HashMap<>(); //Mapeia nome dos idiomas para indice
            mapa.put(O, 1); //registra no mapa que o idioma representado por O tem um índice associado igual a 1
            mapa.put(D, 2); //representa um índice associado ao idioma D
            final int[] contV = {3}; //Declara uma variável que náo pode ser alterada como array de inteiros e a inicializa

            List<List<Par<Integer, String>>> adj = new ArrayList<>(); //Cria uma lista de adjacência para representar um grafo. 
            for (int i = 0; i < 2 * N + 10; i++) { ////Condição para executar o próximo comando
                adj.add(new ArrayList<>()); //Cria uma nova instancia e atribui referência a adj
            }

            for (int i = 0; i < N; i++) { //Condição para executar o próximo comando
                String idioma1 = ler.next(); //Declara e armazena em uma variável o valor digitado pelo usuário
                String idioma2 = ler.next(); //Declara e armazena em uma variável o valor digitado pelo usuário
                String palavra = ler.next(); //Declara e armazena em uma variável o valor digitado pelo usuário

                int x = mapa.computeIfAbsent(idioma1, k -> contV[0]++); //Declara uma variáve e associa um valor único a uma chave específica no HashMap chamado mapa. O valor associado é um número que é incrementado a cada vez que uma nova chave única (idioma) é encontrada.
                int y = mapa.computeIfAbsent(idioma2, k -> contV[0]++); //Declara uma variável e associa um valor único a uma chave específica no HashMap chamado mapa. O valor associado é um número que é incrementado a cada vez que uma nova chave única (idioma) é encontrada.

                adj.get(x).add(new Par<>(y, palavra)); //adiciona uma aresta no grafo, conectando o vértice x ao vértice y, e associando uma palavra a essa aresta. 
                adj.get(y).add(new Par<>(x, palavra)); //adiciona uma aresta no grafo, conectando o vértice y ao vértice x, e associando uma palavra a essa aresta. 
            }

            for (int i = 0; i < 4005; i++) //Condição para executar o próximo comando
            {
                Arrays.fill(dist[i], INF); //inicializa a matriz dist, preenchendo todas as distâncias associadas a um vértice específico com o valor infinito, indicando que essas distâncias ainda não foram calculadas.
            }
            Arrays.fill(dist[1], 0); //preenche a linha 1 da matriz bidimensional dist com o valor 0.

            PriorityQueue<Tripla> filaPrioridade = new PriorityQueue<>(Comparator.comparingInt(tripla -> tripla.custo)); //cria uma fila de prioridade (PriorityQueue) que organiza as Triplas com base no atributo custo. 
            filaPrioridade.add(new Tripla(1, 'a', 0)); //adiciona um novo elemento à filaPrioridade.

            while (!filaPrioridade.isEmpty()) { //Condição para executar o próximo comando
                Tripla frente = filaPrioridade.poll(); //realiza a operação de remoção do elemento de maior prioridade (menor valor de custo) da fila de prioridade filaPrioridade e armazena esse elemento na variável frente, que é do tipo Tripla
                int d = frente.custo; //Atribui o valor do atributo custo da instância da classe Tripla referenciada por frente à variável d
                int v = frente.vertice; //Atribui o valor do atributo custo da instância da classe Tripla referenciada por frente à variável v
                char cx = frente.ultimoChar; //Atribui o valor do atributo ultimoChar da instância da classe Tripla referenciada por frente à variável cx.

                for (Par<Integer, String> proximo : adj.get(v)) { ////Condição para executar o próximo comando
                    char c = proximo.segundo.charAt(0); //Extrai o primeiro caractere da string associada ao objeto proximo e o atribui à variável c.
                    if (v != 1 && c == cx) {
                        continue; //Condição para executar o próximo comando
                    }
                    if (dist[proximo.primeiro][c - 'a'] > d + proximo.segundo.length()) { //Condição para executar o próximo comando
                        dist[proximo.primeiro][c - 'a'] = d + proximo.segundo.length(); //Atualiza a matriz de distâncias dist com a distância mínima entre dois vértices no grafo.
                        filaPrioridade.add(new Tripla(proximo.primeiro, c, dist[proximo.primeiro][c - 'a'])); //Adiciona um novo objeto do tipo Tripla à fila de prioridade filaPrioridade. 
                    }
                }
            }

            int minimo = Arrays.stream(dist[2]).min().getAsInt(); //Calcula o valor mínimo da matriz de distâncias associada a um vértice específico (neste caso, o vértice 2) e atribui esse valor à variável minimo.
            System.out.println(minimo == INF ? "impossivel" : minimo); //Imprime o resultado na tela
        }
        ler.close(); //Desabilita o teclado
    }

    static class Par<T1, T2> { //Define uma classe estática chamada Par com dois parâmetros de tipo genérico T1 e T2. Isso significa que a classe Par pode ser instanciada com diferentes tipos de dados para T1 e T2,

        T1 primeiro; //Declara uma variável chamada primeiro na classe Par.
        T2 segundo; //Declara uma variável chamada primeiro na classe Par.

        Par(T1 primeiro, T2 segundo) { //Define um construtor para a classe Par. 
            this.primeiro = primeiro; //Dentro do construtor da classe Par atribui o valor passado como argumento ao parâmetro primeiro ao campo primeiro da instância atual da classe.

            this.segundo = segundo; //Dentro do construtor da classe Par atribui o valor passado como argumento ao parâmetro segundo ao campo segundo da instância atual da classe.

        }
    }

    static class Tripla { //Pertence diretamente à classe exterior que a contém, em vez de pertencer a uma instância específica dessa classe exterior. 

        int vertice; //Declara uma váriavel
        char ultimoChar; // Declara uma variável
        int custo; //Declara uma Variável

        Tripla(int vertice, char ultimoChar, int custo) { //Define um construtor para a classe Tripla
            this.vertice = vertice; //Atribui o valor do parâmetro vertice (recebido pelo construtor) ao campo vertice da instância de Tripla. 
            this.ultimoChar = ultimoChar; //Atribui o valor do parâmetro ultimoChar (recebido pelo construtor) ao campo ultimoChar da instância de Tripla. 
            this.custo = custo; //Atribui o valor do parâmetro custo (recebido pelo construtor) ao campo custo da instância de Tripla. 
        }
    }

}
