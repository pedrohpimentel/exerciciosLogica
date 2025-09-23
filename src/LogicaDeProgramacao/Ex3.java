package LogicaDeProgramacao;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Desenvolva um programa que imprima os primeiros 20 números da sequência de Fibonacci.
        A sequência de Fibonacci é uma série de números onde cada número é a soma dos dois anteriores,
        começando com 0 e 1. */

        int n = 20;
        int primeiroTermo = 0;
        int segundoTermo = 1;

        System.out.println("Série de Fibonacci até o " + n + "º termo:");

        System.out.print(primeiroTermo + ", " + segundoTermo);

        for (int i = 2; i < n; i++) {
            int proximoTermo = primeiroTermo + segundoTermo;

            System.out.print(", " + proximoTermo);

            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }

        System.out.println();
        sc.close();
    }
}
