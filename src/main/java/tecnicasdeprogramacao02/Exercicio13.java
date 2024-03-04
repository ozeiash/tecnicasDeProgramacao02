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
 * @brief Class Exercicio13
 */

/*
Solicitaram para que você construisse um programa simples de criptografia. 
Este programa deve possibilitar enviar mensagens codificadas sem que alguém 
consiga lê-las. O processo é muito simples. São feitas três passadas em todo o texto.

Na primeira passada, somente caracteres que sejam letras minúsculas e maiúsculas 
devem ser deslocadas 3 posições para a direita, segundo a tabela ASCII: letra 'a' 
deve virar letra 'd', letra 'y' deve virar caractere '|' e assim sucessivamente. 
Na segunda passada, a linha deverá ser invertida. Na terceira e última passada, 
todo e qualquer caractere a partir da metade em diante (truncada) devem ser 
deslocados uma posição para a esquerda na tabela ASCII. Neste caso, 'b' vira 'a' 
e 'a' vira '`'.

Por exemplo, se a entrada for “Texto #3”, o primeiro processamento sobre esta 
entrada deverá produzir “Wh{wr #3”. O resultado do segundo processamento inverte 
os caracteres e produz “3# rw{hW”. Por último, com o deslocamento dos caracteres da 
metade em diante, o resultado final deve ser “3# rvzgV”.

Entrada

A entrada contém vários casos de teste. A primeira linha de cada caso de teste 
contém um inteiro N (1 ≤ N ≤ 1*104), indicando a quantidade de linhas que o problema 
deve tratar. As N linhas contém cada uma delas M (1 ≤ M ≤ 1*103) caracteres.

Saída

Para cada entrada, deve-se apresentar a mensagem criptografada.
 */
import java.util.Scanner; //Importa a biblioteca Scanner

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Habilita o teclado

        int num = Integer.parseInt(sc.nextLine()); //Declara e armazena em uma variável o valor digitado pelo usuário

        for (int i = 0; i < num; i++) { //Condição para executar o próximo comando
            String entrada = sc.nextLine(); //Declara e armazena em uma variável o valor digitado pelo usuário
            StringBuilder ini = new StringBuilder(); //Cria uma instância da classe StringBuilder chamada ini
            for (char c : entrada.toCharArray()) { //Repete o laço até a condição ser falsa
                if (Character.isLetter(c)) { //Condição para executar o próximo comando
                    ini.append((char) (c + 3)); //Construindo uma nova sequência de caracteres (ini) modificando cada caractere da string original (entrada). 
                } else { //Se a condiçãso anterior for falsa, executa o próximo comando.
                    ini.append(c); //Anexa o caractere c à sequência de caracteres em construção (ini).
                }
            }
            String ini2 = ini.reverse().toString(); //Uma nova string que contém os caracteres de ini na ordem inversa
            StringBuilder ini3 = new StringBuilder(ini2.substring(0, ini2.length() / 2)); //Ini3 é uma instância de StringBuilder que contém a primeira metade da string ini2.
            for (int j = ini2.length() / 2; j < ini2.length(); j++) { //Condição para executar o próximo comando -  percorre os caracteres da segunda metade da string ini2,
                ini3.append((char) (ini2.charAt(j) - 1)); //Construindo a segunda metade da string ini3 (um StringBuilder) com base na segunda metade da string ini2. 
            }
            System.out.println(ini3.toString()); //Imprime no console a string resultante da manipulação realizada no StringBuilder chamado ini3. 
        }
        sc.close(); //Desabilita o teclado
    }

}
