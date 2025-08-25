package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Média de Notas de Aluno
Objetivo: Calcular uma média a partir de múltiplos valores de entrada.

Descrição: Escreva um programa que calcule a média de três notas de um aluno.
O programa deve solicitar as três notas (que podem ser números com casas decimais) e,
ao final, exibir a média calculada.*/

    double nota1,nota2,nota3;

        System.out.println("Digite três notas para calcular sua média ");
        System.out.print("Valor da nota 1 = ");
        nota1 = sc.nextDouble();

        System.out.print("Valor da nota 2 = ");
        nota2 = sc.nextDouble();

        System.out.print("Valor da nota 3 = ");
        nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) /3;
        System.out.printf("A média das suas notas é: %.2f" , media);

        sc.close();

    }
}
