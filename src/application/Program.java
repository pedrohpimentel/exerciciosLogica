package application;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Desenvolva um programa que peça ao usuário para digitar um número inteiro.
        O programa deve verificar se o número é par ou ímpar. Se for par, imprima a mensagem "O número é par.".
        Se for ímpar, imprima "O número é ímpar.". */

        System.out.println("Verifique se um número é par ou ímpar");
        System.out.println();
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("É PAR!");
        }
        else {
            System.out.println("É ÍMPAR");
        }

        sc.close();
        }
}