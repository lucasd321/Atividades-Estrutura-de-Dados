/*
Crie um validador de senha segura. O programa deve ler uma string (cadeia de caracteres)
digitada pelo usuário e verificar se ela atende aos seguintes critérios de segurança:
• A senha deve possuir pelo menos 8 caracteres.
• A senha deve conter pelo menos um caractere especial (ex: @, #, $, %, & ou *).
Ao final, o programa deve imprimir se a senha é “Válida” ou “Inválida”. Caso seja inválida, o programa
deve informar qual critério não foi atendido
*/

#include <stdio.h>
#include <string.h>

int main() {
    char senha[50];
    int temEspecial = 0; // 0 significa falso, 1 significa verdadeiro
    int tamanhoSuficiente = 0;

    printf("Digite sua senha: ");
    scanf("%s", senha); // Lê a senha do usuário

    // 1. Verificar o tamanho (pelo menos 8 caracteres)
    int tamanho = strlen(senha);
    if (tamanho >= 8) {
        tamanhoSuficiente = 1;
    }

    // 2. Verificar caracteres especiais percorrendo a string
    for (int i = 0; i < tamanho; i++) {
        if (senha[i] == '@' || senha[i] == '#' || senha[i] == '$' || 
            senha[i] == '%' || senha[i] == '&' || senha[i] == '*') {
            temEspecial = 1;
            break; // Já encontrou um, não precisa continuar o laço
        }
    }

    // 3. Exibir resultados e erros específicos
    if (tamanhoSuficiente && temEspecial) {
        printf("\nSenha Valida!\n");
    } else {
        printf("\nSenha Invalida!\n");
        
        if (!tamanhoSuficiente) {
            printf("- Erro: A senha deve possuir pelo menos 8 caracteres (a sua tem %d).\n", tamanho);
        }
        if (!temEspecial) {
            printf("- Erro: A senha deve conter pelo menos um caractere especial (@, #, $, %%, & ou *).\n");
        }
    }

    return 0;
}