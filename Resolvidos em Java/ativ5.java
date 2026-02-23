/*
Questão 5.– Escreva uma função que receba um vetor de números inteiros e verifique se todos os seus
elementos são únicos (distintos). O programa deve retornar uma mensagem confirmando se há ou não
números repetidos na lista.
Dica: Você precisará comparar cada elemento com todos os outros elementos subsequentes do vetor.

*/

import java.util.Scanner;


    // Função (método) que verifica se os elementos são distintos
    public static boolean verificarElementosUnicos(int[] vetor) {
        // Percorre cada elemento do vetor
        for (int i = 0; i < vetor.length; i++) {
            // Compara com os elementos subsequentes (Dica da questão)
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    return false; // Se achar igual, retorna falso (tem repetido)
                }
            }
        }
        return true; // Se terminar os laços, todos são únicos
    }

    public static void main(String[] args) {
        // Vetor pronto para teste
        int[] meuVetor = {10, 5, 8, 2, 7, 3, 5}; // Note que o '5' está repetido

        System.out.println("Analisando o vetor...");

        if (verificarElementosUnicos(meuVetor)) {
            System.out.println("Confirmado: Todos os numeros sao unicos.");
        } else {
            System.out.println("Aviso: Existem numeros repetidos na lista.");
        }
    }
