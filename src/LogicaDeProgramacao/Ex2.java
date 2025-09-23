package LogicaDeProgramacao;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

        /* Escreva um programa que solicite ao usuário que digite um número inteiro.
        Verifique se o número é par ou ímpar.
        Imprima a mensagem "O número é par" ou "O número é ímpar", de acordo com o resultado.*/

    System.out.print("Digite um valor inteiro: ");
    int num = sc.nextInt();

    if (num % 2 == 0) {
        System.out.println("O número é par.");
    } else {
        System.out.println("O número é ímpar.");
    }

    sc.close();
}
}
