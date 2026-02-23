/*
Crie um programa que receba um valor inteiro representando um tempo total em segundos. O algoritmo deve converter e exibir esse tempo no formato composto de Horas, Minutos e
Segundos.
Exemplo: 3665 segundos deve resultar em 1h, 1min e 5seg
*/

#include <stdio.h>
int main()
{
    int h, m, s;
    float resto;
    printf("Digite a quantidade de segundos: ");
    scanf("%d", &s);

    m = s / 60;
    h = m / 60;
    m = m % 60;
    s = s - ((h * 60 * 60) + (m * 60));

    printf("h= %d, m= %d, s= %d", h, m, s);

return 0;
}

