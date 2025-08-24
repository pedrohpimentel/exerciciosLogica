package application;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Crie um programa que declare duas variáveis inteiras, num1 e num2,
        e atribua a elas os valores 10 e 20, respectivamente.
        Depois, crie uma terceira variável soma que receba a soma de num1 e num2.
        Por fim, imprima na tela o resultado da soma. */

        System.out.println("Digite dois valores!");

        System.out.print("Valor 1: ");
        int valor1 = sc.nextInt();

        System.out.print("Valor 2: ");
        int valor2 = sc.nextInt();

        int media = valor1 + valor2;
        System.out.println("Soma destes dois valores = " + media);

        sc.close();
        }
}