package LogicaDeProgramacao;

import java.util.Locale;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /* Contagem Progressiva
Escreva um programa que utilize um laço de repetição (for)
para imprimir na tela todos os números inteiros de 1 a 100*/

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}
