/*
Questão 1.– Escreva um programa que processe um ranking de notas. Utilize o seguinte vetor prédefinido:
float notas[] = {7.5, 4.0, 9.2, 5.5, 8.0, 6.5, 3.2, 10.0, 7.0, 5.8}; (em C) ou
double[] notas = {7.5, 4.0, 9.2, 5.5, 8.0, 6.5, 3.2, 10.0, 7.0, 5.8}; (em Java).
O seu programa deve:
• Calcular e exibir a média aritmética de todas as notas.
• Contar e exibir quantos alunos ficaram com nota acima da média calculada.
• Encontrar e exibir a maior nota da lista sem utilizar funções prontas de ordenação.
*/
    public static void main(String[] args) {
        // Variáveis
        int acima = 0;
        double soma = 0;
        double media = 0;
        
        // Vetor pré-definido (em Java, double é o padrão para decimais)
        double[] notas = {7.5, 4.0, 9.2, 5.5, 8.0, 6.5, 3.2, 10.0, 7.0, 5.8};
        
        // Começamos assumindo que a primeira nota é a maior
        double maior = notas[0];

        // 1. Somar todos os números para a média
        for (int i = 0; i < notas.length; i++) {
            soma = soma + notas[i];
        }

        // 2. Calcular a média
        media = soma / notas.length;

        // 3. Contar quantos estão acima da média
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                acima = acima + 1;
            }
        }

        // 4. Encontrar a maior nota
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
        }

        // Exibindo os resultados na tela
        System.out.printf("Media dos alunos: %.2f %n", media);
        System.out.println("Quantos alunos ficaram acima da media: " + acima);
        System.out.printf("Maior nota da lista: %.2f %n", maior);
    }
