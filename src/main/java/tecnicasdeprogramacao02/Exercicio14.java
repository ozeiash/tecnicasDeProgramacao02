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
 * @brief Class Exercicio14
 */

/*
Bee 1062 - A tradição local é que todos os comboios que chegam vindo da direção A continuam 
na direção B com os vagões  reorganizados, de alguma forma. Suponha que o trem que 
está chegando da direção A tem N <= 1000 vagões numerados sempre em ordem 
crescente 1,2, ..., N. O primeiro que chega é o 1 e o último que chega é o N. 
Existe um chefe de reorganizações de trens que quer saber se é possível reorganizar 
os vagões para que os mesmos saiam na direção B na ordem a1, a2, an..
O  chefe pode utilizar qualquer estratégia para obter a saída desejada. 
No caso do desenho ilustrado acima, por exemplo, basta o chefe deixar todos os 
vagões entrarem na estação (do 1 ao 5) e depois retirar um a um: retira o 5, 
retira o 4, retira o 3, retira o 2 e por último retira o 1.  Desta forma, se o 
chefe quer saber se a saída 5,4,3,2,1 é possível em B, a resposta seria Yes. 
Vagão que entra na estação só pode sair para a direção B e é possível incluir 
quantos forem necessários para retirar o primeiro vagão desejado.
Entrada
O arquivo de entrada consiste de um bloco de linhas, cada bloco, com exceção do 
último, descreve um trem e possivelmente mais do que uma requisição de reorganização. 
Na primeira linha de cada bloco há um inteiro N que é a quantidade de vagões. 
Em cada uma das próximas linhas de entrada haverá uma permutação dos valores 1,2, …, N. 
A última linha de cada bloco contém apenas 0. Um bloco iniciando com zero (0) 
indica o final da entrada.
Saída
O arquivo de saída contém a quantidade de linhas correspondente às linhas com 
permutações no arquivo de entrada. Cada linha de saída deve ser Yes se for possível 
organizar os vagões da forma solicitada e No, caso contrário. Há também uma linha 
em branco após cada bloco de entrada. No exemplo abaixo,  O primeiro caso de teste 
tem 3 permutações para 5 vagões. O ultimo zero dos testes de entrada não devem ser 
processados.
 */
import java.util.Scanner; //Importa a biblioteca Scnner
import java.util.Stack; //Importa a biblioteca Stack

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Habilita o teclado
        int N; //Declara variável do tipo inteira

        while ((N = sc.nextInt()) != 0) { //Repete o laço até a condição ser falsa
            while (true) { //Repete o laço até a condição ser falsa
                int vagao = sc.nextInt(); //Declara e armazena em uma variável o valor digitado pelo usuário
                if (vagao == 0) { //Condição para executar o próximo comando
                    System.out.println(); //pula uma linha
                    break; //Interrompe a execução do laço de repetição
                }

                Stack<Integer> estacao = new Stack<>(); //Cria uma instância de uma pilha (stack) chamada estacao. 
                int a = 1; //Declara e inicializa variável do tipo inteira
                boolean possivel = true; //Declara e inicializa variável do tipo boolean

                for (int i = 0; i < N; i++) { ////Repete o laço até a condição ser falsa
                    int vagao2 = (i == 0) ? vagao : sc.nextInt(); //Condição para executar o próximo comando

                    while (a <= N && (estacao.isEmpty() || estacao.peek() != vagao2)) { //Repete o laço até a condição ser falsa
                        estacao.push(a++); //Incrementa + 1
                    }

                    if (estacao.peek() == vagao2) { //Condição para executar o próximo comando
                        estacao.pop(); //Faz a remoção do elemento no topo da pilha (Stack) chamada estacao
                    } else { //Se a condição anterior for falsa, executa o próximo comando.
                        possivel = false; //Condição para executar o próximo comando
                        break; //Interrompe a execução do laço de repetição
                    }
                }

                System.out.println(possivel ? "Yes" : "No"); //Imprime o resultado
                if (sc.hasNextLine()) //Condição para executar o próximo comando
                {
                    sc.nextLine(); //Consome a quebra de linha pendente após a leitura de um número inteiro (vagao) dentro do loop interno.
                }
            }
        }

    }

}
