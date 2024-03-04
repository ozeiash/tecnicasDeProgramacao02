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
 * @brief Class Exercicio06
 */

/*
Bee 1042 - Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os 
valores em ordem crescente, uma linha em branco e em seguida, os valores na 
sequência como foram lidos.
Entrada
A entrada contem três números inteiros.
Saída
Imprima a saída conforme foi especificado.
 */
import java.util.Scanner;//Importa a biblioteca Scanner

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Habilita o teclado

        int A, B, C, min, med = 0, max = 0; //Declara e inicializa variáveis do tipo inteiras

        A = sc.nextInt(); //Declara e armazena em uma variável o valor digitado pelo usuário
        B = sc.nextInt(); //Declara e armazena em uma variável o valor digitado pelo usuário
        C = sc.nextInt(); //Declara e armazena em uma variável o valor digitado pelo usuário

        min = Math.min(A, Math.min(B, C)); //Executa a expressão matemática e guardo o resultado em uma variável

        if (min == A) { //Condição para executar o próximo comando
            med = Math.min(B, C); //Executa a expressão matemática e guardo o resultado em uma variável
            max = Math.max(B, C); //Executa a expressão matemática e guardo o resultado em uma variável
        }
        if (min == B) { //Condição para executar o próximo comando
            med = Math.min(A, C); //Executa a expressão matemática e guardo o resultado em uma variável
            max = Math.max(A, C); //Executa a expressão matemática e guardo o resultado em uma variável
        }
        if (min == C) { //Condição para executar o próximo comando
            med = Math.min(A, B); //Executa a expressão matemática e guardo o resultado em uma variável
            max = Math.max(A, B); //Executa a expressão matemática e guardo o resultado em uma variável
        }

        System.out.println(min); //Imprime o valor encontrado
        System.out.println(med); //Imprime o valor encontrado
        System.out.println(max); //Imprime o valor encontrado
        System.out.println(""); //Salta uma linha
        System.out.println(A); //Imprime o valor encontrado
        System.out.println(B); //Imprime o valor encontrado
        System.out.println(C);	//Imprime o valor encontrado
        sc.close(); //Desabilita o teclado
    }
}
