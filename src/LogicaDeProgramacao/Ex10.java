package LogicaDeProgramacao;

import java.util.Locale;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /* Soma Cumulativa
Crie um programa que utilize um laço de repetição (while)
para calcular e imprimir a soma de todos os números inteiros de 1 até 50.*/

        int soma = 0;
        int i = 1;
        while (i <= 50){
            soma += i;
            System.out.println("Somando: " + i + ", Soma atual: " + soma);
            i++;
        }

        System.out.println("A soma de todos os número de 1 até 50 é : " + soma);


        sc.close();
    }
}
