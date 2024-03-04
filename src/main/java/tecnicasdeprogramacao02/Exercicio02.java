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
 * @brief Class Exercicio02
 */

/*
Bee 1035 - Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D 
for maior do que A, e a soma de C com D for maior que a soma de A e B e se C e D, 
ambos, forem positivos e se a variável A for par escrever a mensagem 
"Valores aceitos", senão escrever "Valores nao aceitos".
Entrada
Quatro números inteiros A, B, C e D.
Saída
Mostre a respectiva mensagem após a validação dos valores.
 */
import java.util.Scanner; //Importa a biblioteca Scanner

public class Exercicio02 {

    public class Main {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in); //Habilita o teclado para o usuário digitar
            int A = sc.nextInt(); //Declara uma variável e libera o teclado para o usuário digitar e armazena o valor na váriavel
            int B = sc.nextInt(); //Declara uma variável e libera o teclado para o usuário digitar e armazena o valor na váriavel
            int C = sc.nextInt(); //Declara uma variável e libera o teclado para o usuário digitar e armazena o valor na váriavel
            int D = sc.nextInt(); //Declara uma variável e libera o teclado para o usuário digitar e armazena o valor na váriavel

            if (B > C && D > A && (C + D) > (A + B) && C > 0 && D > 0 && A % 2 == 0) { //Estrutura apresentando as condições para seguir em frente
                System.out.println("Valores aceitos"); //Imprime os valores aceitos
            } else { //Caso a condição anterior seja falsa, executa o próximo comando
                System.out.println("Valores nao aceitos"); //Imprime os valores não aceitos
            }
            sc.close(); //Desabilita o teclado
        }
    }
}
