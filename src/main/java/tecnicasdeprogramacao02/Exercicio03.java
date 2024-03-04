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
 * @brief Class Exercicio03
 */

/*
Bee 1036 - Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de 
Bhaskara. Se não for possível calcular as raízes, mostre a mensagem correspondente 
“Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.
Entrada
Leia três valores de ponto flutuante (double) A, B e C.
Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem 
"Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5 
dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. 
Imprima sempre o final de linha após cada mensagem.
 */
import java.util.Locale; //Importa a biblioteca Locale
import java.util.Scanner;//Importa a biblioteca Scanner

public class Exercicio03 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); //Configura formato padrão americano para pontos flutuantes
        Scanner sc = new Scanner(System.in); //Habilita o teclado 

        double A = sc.nextDouble(); //Declara e armazena em uma variável o valor digitado pelo usuário
        double B = sc.nextDouble(); //Declara e armazena em uma variável o valor digitado pelo usuário
        double C = sc.nextDouble(); //Declara e armazena em uma variável o valor digitado pelo usuário
        double delta = Math.pow(B, 2) - (4 * A * C); //Declara e armazena em uma variável o resultado da expressão matemática
        double R1 = (-B + Math.sqrt(delta)) / (2 * A); //Declara e armazena em uma variável o resultado da expressão matemática
        double R2 = (-B - Math.sqrt(delta)) / (2 * A); //Declara e armazena em uma variável o resultado da expressão matemática

        if (delta > 0 && A != 0) { //Condição para seguir os dois próximos comandos
            System.out.println("R1 = " + String.format("%.5f", R1)); //Imprime o resultado de R1
            System.out.println("R2 = " + String.format("%.5f", R2)); //Imprime o resultado de R2
        } else { //Se a condição anterior for falsa, executa o próximo comando
            System.out.println("Impossivel calcular"); //Imprime na tela a mensagem entre as aspas

        }
        sc.close(); //Desabilita o teclado
    }
}
