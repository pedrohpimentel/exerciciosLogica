package EstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Exercício 2
Usando um laço while, crie um programa que peça ao usuário para digitar um número inteiro.
O programa deve continuar pedindo um novo número até que o usuário digite um valor negativo.
No final, o programa deve imprimir a soma de todos os números positivos digitados.*/

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        int soma = 0;
        while (numero >= 0 ){
            soma += numero;

            System.out.print("Digite um número inteiro: ");
            numero = sc.nextInt();
        }

        System.out.println("Você digitou um número negativo.");
        System.out.print("Soma dos números positivos digitados é: "  + soma);

        sc.close();
    }
}
