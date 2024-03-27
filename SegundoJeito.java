/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secaoAtividade;

import java.util.Arrays;


/**
 *
 * @author paulo
 */


/*
Exercício 01

R: Mediana é a melhor escolha para se adquirir um número central ao se tratar de números exorbitantes,
assim sendo mais representativo do que a média,
que tem problemas com números grandes e muito baixo. 
*/

//Exercício 02
public class SegundoJeito {
    
    public static double media(int Criancas[]){
        int i;
        double media, somatoria = 0;
        
        //iterar no array a soma de todos os valores
        for(i = 0; i < Criancas.length; i++){
            somatoria += Criancas[i];
        }
        
        //pega todos os valores somados e divide pelo numero de elementos (160/7)
        media = somatoria / Criancas.length;
        return media;
    }
    
    public static double mediana (int Criancas[]){
        //sort vai ordenas os valores
        Arrays.sort(Criancas);
        double mediana;
        //pega o numero do meio
        int metade = Criancas.length / 2;

        // verifica se o array possui um número par de elementos
        if (Criancas.length % 2 == 0) {
            //se o array possui um número par de elementos, a mediana é a média dos dois elementos do meio
            mediana = (Criancas[metade - 1] + Criancas[metade]) / 2;
        } else {
            mediana = Criancas[metade];
        }

        return mediana;
    }
    
        public static double moda(int[] Criancas) {
            //ordena novamente os elementos
            Arrays.sort(Criancas);

        // Variáveis para armazenar o número que mais se repete (moda) e sua frequência máxima
        int numeroQueMaisSeRepete = Criancas[0];
        int frequenciaMaxima = 1;
        int frequenciaAtual = 1; //inicializa a frequência atual como 1 para contar o primeiro valor

        // Loop para percorrer o array e contar as ocorrências consecutivas de cada valor
        for (int i = 1; i < Criancas.length; i++) {
            if (Criancas[i] == Criancas[i - 1]) {
                //se o valor atual for igual ao anterior, incrementa a frequência atual
                frequenciaAtual++;
            } else {
                //se não for igual, verifica se a frequência atual é maior que a máxima
                if (frequenciaAtual > frequenciaMaxima) {
                    //se sim, atualiza o número que mais se repete (moda) e a frequência máxima
                    frequenciaMaxima = frequenciaAtual;
                    numeroQueMaisSeRepete = Criancas[i - 1];
                }
                // Reinicia a contagem da frequência atual para o novo valor
                frequenciaAtual = 1;
            }
        }

        // Verifica a última sequência de valores iguais
        if (frequenciaAtual > frequenciaMaxima) {
            frequenciaMaxima = frequenciaAtual;
            numeroQueMaisSeRepete = Criancas[Criancas.length - 1];
        }

        // Retorna o número que mais se repete (moda)
        return numeroQueMaisSeRepete;
            }
    
    public static void main(String[] args) {
        int Criancas[] = {12, 13, 22, 50, 31, 22, 10};
        
        System.out.println("A média é de: " + media(Criancas));
        System.out.println("A mediana é de: " + mediana(Criancas));
        System.out.println("A moda é de: " + moda(Criancas));
    }
}


