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
 * @brief Class Exercicio11
 */

/*
Bee 1039 - Nos dias atuais uma flor de fogo não é algo considerado estranho para muitos 
jovens.  Isso porque um famoso jogo de videogame popularizou esse tipo de flor. 
Nesse jogo o protagonista ganhava superpoderes ao tocar em uma flor de fogo, 
passando a atirar pequenas bolas de fogo para derrotar seus inimigos.
No entanto, já se falava sobre flores de fogo há muito tempo atrás. Na mitologia 
polonesa, flores de fogo são flores místicas de grande poder guardadas por 
espíritos malignos. Ela possuía esse nome porque brilhava tanto que era impossível 
olhá-la diretamente. Quem possuísse uma flor dessas ganharia a habilidade de ler 
a mente de outras pessoas, encontrar tesouros escondidos e repelir todos os males.
Para obter uma flor de fogo, a pessoa deveria procurá-la em uma floresta antes da 
meia-noite na véspera do Noc Kupały. Exatamente à meia-noite ela floresceria. 
Para colhê-la seria preciso desenhar um círculo em volta dela. Parece uma tarefa 
fácil, no entanto, os espíritos malignos que guardam a flor tentariam de tudo para 
distrair qualquer um tentando colher a flor. Se a pessoa falhasse ao tentar desenhar 
um círculo em volta da flor, teria sua vida sacrificada.
Dados dois círculos, um desenhado por um ambicioso caçador de flores de fogo e outro representando a área da flor, sua tarefa é determinar se o caçador morre ou fica rico com sua conquista.
Entrada
A entrada é composta por diversas instâncias e termina com final de arquivo (EOF). 
Cada instância consiste em uma linha com seis inteiros, R1 (1 ≤ R1) , X1(|X1|), 
Y1(|Y1|), R2 (R2 ≤ 1000), X2(|X2|), Y2 (Y2 ≤ 1000). O círculo desenhado pelo 
caçador possui raio R1 e centro (X1; Y1). O círculo representando a área da flor 
possui raio R2 e centro (X2; Y2).
Saída
Para cada instância imprima uma única linha contendo MORTO, se o caçador morre, 
ou RICO se o caçador consegue colher a flor.
 */
import java.util.Scanner; //Importa a biblioteca Scanner

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in); //Habilita o teclado

        while (ler.hasNext()) { //Condição para executar o próximo comando
            int raio = ler.nextInt(); //Declara e armazena em uma variável o valor digitado pelo usuário
            int X = ler.nextInt(); //Declara e armazena em uma variável o valor digitado pelo usuário
            int Y = ler.nextInt(); //Declara e armazena em uma variável o valor digitado pelo usuário
            int raioF = ler.nextInt(); //Declara e armazena em uma variável o valor digitado pelo usuário
            int centroX = ler.nextInt(); //Declara e armazena em uma variável o valor digitado pelo usuário
            int centroY = ler.nextInt(); //Declara e armazena em uma variável o valor digitado pelo usuário

            double distancia = Math.sqrt(Math.pow(centroX - X, 2) + Math.pow(centroY - Y, 2)); //Declara variável, executa e armazena a expressão matemática

            if (distancia <= raio - raioF) { //Condição para executar o próximo comando
                System.out.println("RICO"); //Imprime o texte entre as aspas
            } else { //Executa o próximo comando caso o comando anterior seja falso
                System.out.println("MORTO"); //Imprime o texte entre as aspas
            }
        }
        ler.close(); //Desabilita o teclado
    }
}
