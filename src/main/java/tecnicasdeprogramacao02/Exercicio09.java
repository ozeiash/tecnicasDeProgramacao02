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
 * @brief Class Exercicio09
 */

/*
Bee 1164 - Na matemática, um número perfeito é um número inteiro para o qual a soma de todos 
os seus divisores positivos próprios (excluindo ele mesmo) é igual ao próprio 
número. Por exemplo o número 6 é perfeito, pois 1+2+3 é igual a 6. Sua tarefa é 
escrever um programa que imprima se um determinado número é perfeito ou não.
Entrada
A entrada contém vários casos de teste. A primeira linha da entrada contém um 
inteiro N (1 ≤ N ≤ 20), indicando o número de casos de teste da entrada. Cada 
uma das N linhas seguintes contém um valor inteiro X (1 ≤ X ≤ 108), que pode ser 
ou não, um número perfeito.
Saída
Para cada caso de teste de entrada, imprima a mensagem “X eh perfeito” ou “X nao 
eh perfeito”, de acordo com a especificação fornecida.
 */
import java.util.Scanner; //Importa a biblioteca 

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Habilita o teclado

        int N, X; //Declara variáveis do tipo inteiras

        N = sc.nextInt(); //Armazena em uma variável o valor digitado pelo usuário
        for (int i = 0; i < N; i++) { //Repete o laço até a condição ser falsa
            int soma = 0; //Declara e inicializa variáveis do tipo inteiras
            X = sc.nextInt(); //Declara e armazena em uma variável o valor digitado pelo usuário

            for (int j = 1; j < X; j++) { //Repete o laço até a condição ser falsa
                if (X % j == 0) { //Condição para executar o próximo comando
                    soma += j; //Variável recebe incremento soma + j
                }
            }

            if (soma == X) { //Condição para executar o próximo comando
                System.out.println(X + " eh perfeito"); //Imprime na tela o valor encontrado
            } else { //Condição a ser executada se as anteriores forem falsas
                System.out.println(X + " nao eh perfeito"); //Imprime na tela o valor encontrado
            }

        }

    }
}
