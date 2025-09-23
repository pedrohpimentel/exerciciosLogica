package LogicaDeProgramacao;

import java.util.Locale;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Exercício 1
Problema: Crie um programa que declare duas variáveis inteiras, num1 e num2,
e atribua a elas os valores 10 e 5,
respectivamente. Em seguida, calcule a soma, a subtração,
a multiplicação e a divisão desses números e imprima cada resultado na tela.*/

        int num1 = 10;
        int num2 = 5;

        int soma = num1 + num2;
        int mult = num1 * num2;
        int div = num1 / num2;
        int sub = num1 - num2;

        System.out.println("A soma de " + num1 + " + " + num2 + " é = " + soma);
        System.out.println("A subtração de " + num1 + " - " + num2 + " é = " + sub);
        System.out.println("A multiplicação de " + num1 + " * " + num2 + " é = " + mult);
        System.out.println("A divisão de " + num1 + " / " + num2 + " é = " + div);

        sc.close();
    }

}
