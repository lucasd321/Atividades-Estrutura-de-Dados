/*Questão 1.– Escreva um programa que processe um ranking de notas. Utilize o seguinte vetor prédefinido:
float notas[] = {7.5, 4.0, 9.2, 5.5, 8.0, 6.5, 3.2, 10.0, 7.0, 5.8}; (em C) ou
double[] notas = {7.5, 4.0, 9.2, 5.5, 8.0, 6.5, 3.2, 10.0, 7.0, 5.8}; (em Java).
O seu programa deve:
• Calcular e exibir a média aritmética de todas as notas.
• Contar e exibir quantos alunos ficaram com nota acima da média calculada.
• Encontrar e exibir a maior nota da lista sem utilizar funções prontas de ordenação
*/

#include <stdio.h>
#include <stdlib.h>
int main()
{
//variaveis
int i = 0, acima = 0;
float media = 0;
float notas[] = {7.5, 4.0, 9.2, 5.5, 8.0, 6.5, 3.2, 10.0, 7.0, 5.8};
float maior = notas[0];

//somar todos os números do vetor
for(i=0; i<10; i++)
{
    media = media + notas[i];
}

//fazer a media, com tudo somado, ai divide pela qtd de itens
media = media / 10;

//ver quantos são acima que a media
for(i=0; i<9; i++)
{
    if(notas[i]>media)
    acima = acima + 1;
}

//encontrar o maior numero
for(i=0; i<10; i++)
{
    if (notas[i] > maior) 
    {
    maior = notas[i]; // Atualizamos o maior se encontrarmos um valor superior
    }
}

//mostrando na tela
printf("Media dos alunos: %f \n", media);
printf("Quantos alunos que ficaram acima da media: %d \n", acima);
printf("Maior nota da lista: %f", maior);

return 0;
}
