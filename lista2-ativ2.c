/*
Escreva uma função que receba um vetor de números inteiros e verifique se todos os seus
elementos são únicos (distintos). O programa deve retornar uma mensagem confirmando se há ou não
números repetidos na lista.
Dica: Você precisará comparar cada elemento com todos os outros elementos subsequentes do vetor.

*/

#include <stdio.h>

// Função que verifica se os elementos são únicos
void verificarUnicos(int vetor[], int tamanho) {
    int encontrouRepetido = 0; // Variável de controle (0 = Não, 1 = Sim)

    for (int i = 0; i < tamanho; i++) {
        // O segundo laço começa em i + 1 para evitar comparar o número com ele mesmo
        for (int j = i + 1; j < tamanho; j++) {
            if (vetor[i] == vetor[j]) {
                encontrouRepetido = 1;
                break; // Para o laço interno se achar um repetido
            }
        }
        if (encontrouRepetido) break; // Para o laço externo
    }

    // Mensagem de confirmação conforme solicitado
    if (encontrouRepetido) {
        printf("Resultado: Ha numeros repetidos na lista.\n");
    } else {
        printf("Resultado: Todos os elementos sao unicos (distintos).\n");
    }
}

int main() {
    // Exemplo de vetor para teste
    int meuVetor[] = {10, 5, 9, 2, 7, 3};
    int tam = 6;

    verificarUnicos(meuVetor, tam);

    return 0;
}