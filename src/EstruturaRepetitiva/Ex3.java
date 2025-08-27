package EstruturaRepetitiva;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Exercício 3
Crie um programa que use um laço do-while para simular um jogo de adivinhação.
O programa deve gerar um número aleatório entre 1 e 100 e, em seguida,
pedir ao usuário para adivinhar esse número. O loop deve continuar enquanto o palpite do usuário for
diferente do número aleatório. A cada palpite, o programa deve dar uma dica,
dizendo se o número a ser adivinhado é maior ou menor que o palpite do usuário.
No final, deve exibir a quantidade de tentativas que o usuário precisou para acertar.*/

        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        int palpite;
        int tentativas = 0;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número secreto entre 1 e 100.");

        do{
            System.out.print("Digite seu palpite: ");
            palpite = sc.nextInt();
            tentativas++;

            if (palpite < numeroAleatorio) {
                System.out.println("O número é MAIOR.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número é MENOR.");
            } else {
                System.out.println("Parabéns! Você acertou o número " + numeroAleatorio + "!");
            }
        } while (palpite != numeroAleatorio);

        System.out.println("Você precisou de " + tentativas + " tentativa(s) para acertar.");


        sc.close();
    }

}
