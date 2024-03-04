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
 * @brief Class Exercicio10
 */

/*
Bee 1789 - A corrida de lesmas é um esporte que cresceu muito nos últimos anos, fazendo com 
que várias pessoas dediquem suas vidas tentando capturar lesmas velozes, e 
treina-las para faturar milhões em corridas pelo mundo. Porém a tarefa de capturar 
lesmas velozes não é uma tarefa muito fácil, pois praticamente todas as lesmas são 
muito lentas. Cada lesma é classificada em um nível dependendo de sua velocidade:
Nível 1: Se a velocidade é menor que 10 cm/h .
Nível 2: Se a velocidade é maior ou igual a 10 cm/h e menor que 20 cm/h .
Nível 3: Se a velocidade é maior ou igual a 20 cm/h .
Sua tarefa é identificar qual nível de velocidade da lesma mais veloz de um grupo 
de lesmas.
Entrada
A entrada consiste de múltiplos casos de teste, e cada um consiste em duas linhas: 
A primeira linha contém um inteiro L (1 ≤ L ≤ 500) representando o número de lesmas 
do grupo, e a segunda linha contém L inteiros Vi (1 ≤ Vi ≤ 50) representando as 
velocidades de cada lesma do grupo.
A entrada termina com o fim do arquivo (EOF).
Saída
Para cada caso de teste, imprima uma única linha indicando o nível de velocidade da lesma mais veloz do grupo.
 */
import java.util.Scanner; //Importa a biblioteca Scanner

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //habilita o teclado

        while (scanner.hasNextInt()) { //Repete o comando enquanto for verdadeiro
            int L = scanner.nextInt(); //Declara e armazena em uma variável o valor digitado pelo usuário

            int velocMax = 0; //Declara e inicializa variável do tipo inteira

            for (int i = 0; i < L; i++) { //Repete o laço até a condição ser falsa
                if (scanner.hasNextInt()) { //Condição para executar o próximo comando
                    int V = scanner.nextInt(); //Declara e armazena em uma variável o valor digitado pelo usuário
                    if (V > velocMax) { //Condição para executar o próximo comando
                        velocMax = V; //Variável velocMax recebe V
                    }
                }
            }

            int nivel = (velocMax < 10) ? 1 : (velocMax < 20) ? 2 : 3; ////Condição para executar o próximo comando
            System.out.println(nivel); //Imprime o resultado na tela
        }

    }
}
