package LogicaDeProgramacao;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Exercício 1
Crie um programa que declare uma variável do tipo String para armazenar seu nome e outra variável do tipo int para armazenar sua idade.
Em seguida, exiba no console a seguinte mensagem: "Olá, [seu nome]! Você tem [sua idade] anos."*/

        String nome = "Pedro";
        int idade = 19;

        System.out.println("Olá, " + nome + "! " + "Você tem " + idade + " anos.");

        sc.close();
    }

}
