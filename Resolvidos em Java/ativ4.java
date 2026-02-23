/*
 Crie um programa que receba um valor inteiro representando um tempo total em segundos. O algoritmo deve converter e exibir esse tempo no formato composto de Horas, Minutos e
Segundos.
Exemplo: 3665 segundos deve resultar em 1h, 1min e 5seg.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int horas, minutos;

        System.out.printf("entre com os segundos:");
        int segundos = sc.nextInt();
        horas = segundos / 3600;
        segundos = segundos %3600;
        minutos = segundos/60;
        segundos = segundos%60;
        System.out.println(horas +" horas "+ " minutos "+ minutos+ " segundos "+ segundos );
        
    }
}