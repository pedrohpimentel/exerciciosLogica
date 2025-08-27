package EstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Exercício 1
Crie um programa que use um laço for para imprimir todos os números pares de 2 a 20.*/

        System.out.println("Número pares até 20: ");
        for (int i = 2; i <= 20 ; i += 2) {
            System.out.println(i);
        }

        sc.close();
    }

}
