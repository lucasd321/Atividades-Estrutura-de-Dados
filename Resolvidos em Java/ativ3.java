/*
Questão 3.– Crie um validador de senha segura. O programa deve ler uma string (cadeia de caracteres)
digitada pelo usuário e verificar se ela atende aos seguintes critérios de segurança:
• A senha deve possuir pelo menos 8 caracteres.
• A senha deve conter pelo menos um caractere especial (ex: @, #, $, %, & ou *).
Ao final, o programa deve imprimir se a senha é “Válida” ou “Inválida”. Caso seja inválida, o programa
deve informar qual critério não foi atendido.
Dica para C: Lembre-se de percorrer o array de caracteres até encontrar o terminador nulo ’\0’.

*/

import java.util.Scanner;

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite sua senha: ");
        String senha = leitor.nextLine(); // Em Java usamos nextLine() para ler strings com segurança

        boolean temEspecial = false;
        boolean tamanhoSuficiente = false;

        // 1. Verificar o tamanho (usando o método .length())
        int tamanho = senha.length();
        if (tamanho >= 8) {
            tamanhoSuficiente = true;
        }

        // 2. Verificar caracteres especiais (usando charAt(i) para pegar a letra)
        for (int i = 0; i < tamanho; i++) {
            char c = senha.charAt(i);
            if (c == '@' || c == '#' || c == '$' || c == '%' || c == '&' || c == '*') {
                temEspecial = true;
                break; 
            }
        }

        // 3. Exibir resultados
        if (tamanhoSuficiente && temEspecial) {
            System.out.println("\nSenha Válida!");
        } else {
            System.out.println("\nSenha Inválida!");
            
            if (!tamanhoSuficiente) {
                System.out.println("- Erro: A senha deve possuir pelo menos 8 caracteres (a sua tem " + tamanho + ").");
            }
            if (!temEspecial) {
                System.out.println("- Erro: A senha deve conter pelo menos um caractere especial (@, #, $, %, & ou *).");
            }
        }
        
        leitor.close();
    }
