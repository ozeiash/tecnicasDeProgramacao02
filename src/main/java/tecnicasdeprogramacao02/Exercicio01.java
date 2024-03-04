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
 * @brief Class Exercicio01
 */

/*
Bee 1019 - Leia um valor inteiro, que é o tempo de duração em segundos de um determinado 
evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.
Entrada
O arquivo de entrada contém um valor inteiro N.
Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para 
horas:minutos:segundos, conforme exemplo fornecido.
 */
import java.util.*;

public class Exercicio01 {

    public static void main(String[] args) {

        int N; //Dlecara variável do tipo inteira

        Scanner sc = new Scanner(System.in); //Habilita o teclado para o usuário
        N = sc.nextInt(); //Recebe a entrada do usuário e armazena em uma variável

        int horas = N / 3600; //Declara e inicializa uma variável
        int minutos = (N % 3600) / 60; //Declara e inicializa uma variável e armazena o resultado da expressão matemática nessa variável
        int segundos = N % 60; //Declara e inicializa uma variável e armazena o resultado da expressão matemática nessa variável

        System.out.printf("%d:%d:%d%n", horas, minutos, segundos); //Imprime na tela o resultado 
    }
}
