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
 * @brief Class Exercicio07
 */

/*
Bee 1115 - Escreva um programa para ler as coordenadas (X,Y) de uma quantidade 
indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o 
quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma 
de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
Entrada
A entrada contém vários casos de teste. Cada caso de teste contém 2 valores inteiros.
Saída
Para cada caso de teste mostre em qual quadrante do sistema cartesiano se encontra 
a coordenada lida, conforme o exemplo.
 */
import java.util.Scanner; //Importa a biblioteca Scanner

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Habilita o teclado

        int X = 0; //Declara e inicializa variável do tipo inteira
        int Y = 0; //Declara e inicializa variável do tipo inteira

        while (((X = sc.nextInt()) != 0) && ((Y = sc.nextInt()) != 0)) { //Estrutura de repetição até a condição ser falsa

            if (X > 0 && Y > 0) { //Condição para executar o próximo comando
                System.out.println("primeiro"); //Imprime na tela a mensagem entre as aspas
            } else if (X < 0 && Y > 0) { //Condição para executar o próximo comando
                System.out.println("segundo"); //Imprime na tela a mensagem entre as aspas
            } else if (X < 0 && Y < 0) { //Condição para executar o próximo comando
                System.out.println("terceiro"); //Imprime na tela a mensagem entre as aspas
            } else { //Se as condições anteriores forem falsas, executa o próximo comando
                System.out.println("quarto"); //Imprime na tela a mensagem entre as aspas
            }
        }
    }
}
