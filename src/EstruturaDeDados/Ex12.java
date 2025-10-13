package EstruturaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*Cálculo da Média
Objetivo: Iterar, somar e calcular.

Crie um vetor de double chamado notas com 3 posições.

Preencha o vetor com 3 notas lidas do usuário.

Calcule a soma de todas as notas e, em seguida, a média aritmética.

Imprima a média final.*/

        double[] notas = new double[3];
        System.out.println("Digite 3 notas ");
        for (int i = 0; i < 3; i++) {
            System.out.print("nota " + (1 + i) + ": ");
            notas[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (double nota : notas){
            soma += nota;
        }

        double media = soma / notas.length;

        System.out.printf("Soma das notas: %.2f", soma);
        System.out.printf("\nMedia das notas: %.2f", media);

        sc.close();
    }
}
