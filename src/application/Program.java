package application;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite suas três notas! ");

        // Declara e inicializa a variável 'soma' com 0.
        // Ela será usada para acumular o valor das notas.
        double soma = 0;

        // Inicia um laço de repetição (for) que irá executar 3 vezes.
        // O contador 'i' começa em 1 e vai até 3.
        for (int i = 1; i <= 3 ; i++) {

            // Exibe uma mensagem para o usuário, indicando qual nota ele deve digitar (ex: "nota 1 : ").
            System.out.print("nota " + i + " : ");

            // Lê o valor digitado pelo usuário (que é um número decimal) e armazena na variável 'notas'.
            double notas = sc.nextDouble();

            // Adiciona o valor da 'notas' à variável 'soma'. É o mesmo que 'soma = soma + notas;'.
            soma += notas;
        }

        // Calcula a média, dividindo a soma total das notas pelo número de notas (3).
        double media = soma / 3;

        // Exibe o resultado final, mostrando o valor da média calculada.
        System.out.println("A sua média é = " + media);

        // Inicia uma estrutura de decisão (if/else).
        // Se a média for maior ou igual a 60, executa o bloco 'if'.
        if (media >= 60.00){

            // Se a condição for verdadeira, exibe a mensagem de aprovação.
            System.out.println("Você foi aprovado!");
        }

        // Se a condição 'if' for falsa, executa o bloco 'else'.
        else {
            // Se a condição for falsa, exibe a mensagem de reprovação.
            System.out.println("Você foi reprovado!");
        }

        sc.close();
        }
}