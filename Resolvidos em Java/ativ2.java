/*
Questão 2.– Implemente um simulador de caixa eletrônico que ajude a entregar o menor número
possível de cédulas. O programa deve ler um valor inteiro (múltiplo de 10) e calcular a quantidade de
notas de R$ 50, R$ 20 e R$ 10 necessárias.
Exemplo: Para R$ 180, o programa deve retornar 3 notas de R$ 50, 1 nota de R$ 20 e 1 nota de R$
10. Utilize os operadores de divisão (/) e resto (%) para resolver o problema
*/

import java.util.Scanner; // Import necessário para ler o teclado

    public static void main(String[] args) {
        // Criamos o scanner para ler a entrada do usuário
        Scanner leitor = new Scanner(System.in);
        
        int n, resto, d50, d20, d10;
        
        System.out.print("Digite o valor (múltiplo de 10): ");
        n = leitor.nextInt(); // Equivalente ao scanf("%d", &n)
        
        // Lógica de cálculo (igual ao seu C)
        d50 = n / 50;
        resto = n % 50;
        
        d20 = resto / 20;
        resto = resto % 20; // Aqui usei o operador % para encurtar o caminho
        
        d10 = resto / 10;

        // Exibição dos resultados
        System.out.printf("Cedulas: %d notas de 50, %d notas de 20, %d notas de 10%n", 
                          d50, d20, d10);
        
        leitor.close(); // Boa prática: fechar o scanner
    }
