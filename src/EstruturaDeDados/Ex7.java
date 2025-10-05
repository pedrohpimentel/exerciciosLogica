package EstruturaDeDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. */
        int n;
        double soma,media;

        System.out.print("Quantos números você vai digitar? ");
        n = sc.nextInt();

        double[] vetor = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vetor[i];
        }

        media = soma/n;

        System.out.println("VALORES = ");


        for (int i=0; i<n; i++) {
            System.out.printf("%.1f  ", vetor[i]);
        }

        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);

        sc.close();
    }
}
