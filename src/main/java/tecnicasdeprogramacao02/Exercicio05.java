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
 * @brief Class Exercicio05
 */

/*
Bee 1041 - Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas 
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o 
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
Entrada
A entrada contem as coordenadas de um ponto.
Saída
A saída deve apresentar o quadrante em que o ponto se encontra.
 */
import java.util.Locale; //Importa a biblioteca Locale
import java.util.Scanner; //Importa a biblioteca Scanner

public class Exercicio05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); //Configura o padrão americano para ponto flutante
        Scanner sc = new Scanner(System.in); //Habilita o teclado

        float X = sc.nextFloat(); //Declara e armazena em uma variável o valor digitado pelo usuário
        float Y = sc.nextFloat(); //Declara e armazena em uma variável o valor digitado pelo usuário

        if (X > 0 && Y > 0) { //Condição para executar o próximo comando
            System.out.println("Q1"); //Imprime o conteudo entre as aspas	
        } else if (X < 0 && Y > 0) { //Condição para executar o próximo comando
            System.out.println("Q2"); //Imprime o conteudo entre as aspas
        } else if (X < 0 && Y < 0) { //Condição para executar o próximo comando
            System.out.println("Q3"); //Imprime o conteudo entre as aspas
        } else if (X > 0 && Y < 0) { //Condição para executar o próximo comando
            System.out.println("Q4"); //Imprime o conteudo entre as aspas
        } else if (X == 0 && Y == 0) { //Condição para executar o próximo comando
            System.out.println("Origem"); //Imprime o conteudo entre as aspas
        } else if (X == 0 && Y != 0) {//Condição para executar o próximo comando
            System.out.println("Eixo Y"); //Imprime o conteudo entre as aspas
        } else if (X != 0 && Y == 0) { //Condição para executar o próximo comando
            System.out.println("Eixo X"); //Imprime o conteudo entre as aspas
        }
        sc.close(); //Desabilita o teclado

    }

}
