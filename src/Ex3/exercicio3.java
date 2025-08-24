package Ex3;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Crie um programa que calcule a média de um número indeterminado de notas digitadas pelo usuário.
        O programa deve pedir uma nota de cada vez e continuar pedindo até que o usuário digite um valor negativo (por exemplo, -1)
        para indicar que não há mais notas.
        No final, o programa deve imprimir a média de todas as notas válidas digitadas (não incluindo o valor negativo usado para encerrar).
        Se nenhuma nota válida for digitada, imprima uma mensagem informando isso.*/

        double somaDasNotas = 0;
        int quantidadeDeNotas = 0;
        double nota = 0;

        System.out.println("Calculadora de Média");
        System.out.println("Digite as notas (digite um número negativo para encerrar):");

        while (true) {
            System.out.print("Digite uma nota: ");
            nota = sc.nextDouble();

            if (nota < 0) {
                break;
            }

            somaDasNotas += nota;
            quantidadeDeNotas++;
        }

        if (quantidadeDeNotas > 0) {
            double media = somaDasNotas / quantidadeDeNotas;
            System.out.printf("A média das %d notas é: %.2f%n", quantidadeDeNotas, media);
        } else {
            System.out.println("Nenhuma nota válida foi digitada.");
        }

        sc.close();
    }
}
