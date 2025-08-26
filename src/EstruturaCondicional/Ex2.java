package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Calculadora de Média
Crie um programa que declare três variáveis do tipo double: nota1, nota2, nota3.
Elas representam as notas de um aluno. Calcule a média dessas notas.

Em seguida, use uma estrutura if-else if-else para determinar a situação do aluno:

Se a média for maior ou igual a 7.0, imprima "Aprovado."

Se a média for maior ou igual a 5.0 e menor que 7.0, imprima "Em recuperação."

Se a média for menor que 5.0, imprima "Reprovado."*/

        double nota1 = 8.25;
        double nota2 = 7.90;
        double nota3 = 9.45;

        double media = (nota1+nota2+nota3)/3;
        System.out.printf("Média do aluno: %.2f%n" , media);

        System.out.print("A situação do aluno é: ");
        if (media >= 7.0){
            System.out.println("Aprovado.");
        }
        else if (media >= 5.0 && media < 7.0) {
            System.out.println("Em recuperação.");
        }
        else {
            System.out.println("Reprovado.");
        }

        sc.close();
    }

}
