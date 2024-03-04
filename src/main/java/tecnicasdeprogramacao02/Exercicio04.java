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
 * @brief Class Exercicio04
 */

/*
Bee 1037 - Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem 
dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) 
este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, 
deverá ser impressa a mensagem “Fora de intervalo”.
O símbolo ( representa "maior que". Por exemplo:
[0,25]  indica valores entre 0 e 25.0000, inclusive eles.
(25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000
Entrada
O arquivo de entrada contém um número com ponto flutuante qualquer.
Saída
 */
import java.util.Locale; //Importa a bibliteca locale
import java.util.Scanner;//Importa a biblioteca Scanner

public class Exercicio04 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); //Define padrão americano para ponto flutuante
        Scanner sc = new Scanner(System.in); //Habilita o teclado

        double numero = sc.nextDouble(); //Declara uma variável do tipo double e armazena nela o que o usuário digitar

        if (numero >= 0 && numero <= 25) { //Condição para executar o próximo comando
            System.out.println("Intervalo [0,25]"); //Imprime o conteudo entre as aspas
        } else if (numero > 25 && numero <= 50) { //Condição para executar o próximo comando
            System.out.println("Intervalo (25,50]"); //Imprime o conteudo entre as aspas
        } else if (numero > 50 && numero <= 75) { //Condição para executar o próximo comando
            System.out.println("Intervalo (50,75]"); //Imprime o conteudo entre as aspas
        } else if (numero > 75 && numero <= 100) { //Condição para executar o próximo comando
            System.out.println("Intervalo (75,100]"); //Imprime o conteudo entre as aspas
        } else { //Se todos as condições anteriores forem falsas, executa o próximo comando
            System.out.println("Fora de intervalo"); //Imprime o conteudo entre as aspas
        }
        sc.close(); //Desabilita o teclado
    }

}
