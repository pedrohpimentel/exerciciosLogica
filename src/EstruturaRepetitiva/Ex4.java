package EstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            /* Tabuada
Crie um programa que imprima a tabuada de um número inteiro fornecido pelo usuário, de 1 a 10.*/
            System.out.print("Digite um número inteiro para descobrir a sua tabuada: ");
            int num = sc.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " x " + num + " = " + num * i);
            }

            sc.close();
        }
}
