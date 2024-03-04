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
 * @brief Class Exercicio08
 */

/*
Bee 1157 - Ler um número inteiro N e calcular todos os seus divisores.
Entrada
O arquivo de entrada contém um valor inteiro.
Saída
Escreva todos os divisores positivos de N, um valor por linha.
 */
import java.util.Scanner; //Importa a biblioteca Scanner

public class Exercicio08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Habilita o teclado
        int N = sc.nextInt(); //Declara e armazena em uma variável o valor digitado pelo usuário

        for (int i = 1; i <= N; i++) { //Laço de repetição até o resultado ser falso

            if (N % i == 0) { //Condição para executar o próximo comando
                System.out.println(i); //Imprime na tela o resultado de i
            }
        }

    }

}
