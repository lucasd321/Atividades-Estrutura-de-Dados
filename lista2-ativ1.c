/*
Implemente um simulador de caixa eletrônico que ajude a entregar o menor número
possível de cédulas. O programa deve ler um valor inteiro (múltiplo de 10) e calcular a quantidade de
notas de R$ 50, R$ 20 e R$ 10 necessárias.
Exemplo: Para R$ 180, o programa deve retornar 3 notas de R$ 50, 1 nota de R$ 20 e 1 nota de R$
10. Utilize os operadores de divisão (/) e resto (%) para resolver o problema
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

