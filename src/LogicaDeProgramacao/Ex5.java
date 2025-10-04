package LogicaDeProgramacao;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*Cálculo Simples
Crie um programa que declare três variáveis do tipo inteiro: num1, num2 e num3.
Atribua valores a elas (por exemplo, 10, 5 e 2).
Calcule e imprima na tela o resultado da expressão: (num1+num2)×num3.*/

        int num1 = 10;
        int num2 = 5;
        int num3 = 2;

        int calc = (num1 + num2) * num3;

        System.out.println("O resultado do cálculo (num1 + num2) * num3 é igual = " + calc );

        sc.close();
    }

}
