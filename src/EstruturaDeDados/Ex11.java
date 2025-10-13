package EstruturaDeDados;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Leitura de Dados do Usuário
Objetivo: Preencher um vetor com entrada do usuário.

Crie um vetor de String chamado nomes com 4 posições.

Use um loop for e o Scanner para pedir ao usuário que digite 4 nomes e os armazene no vetor.

Após preencher, use um for-each para imprimir todos os nomes.*/

        String[] nomes = new String[4];
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome n " + (i+1) + ": ");
            nomes[i] = sc.nextLine();
        }

        System.out.println("\nNomes digitados:");
        for (String nome : nomes){
            System.out.println(nome);
        }
        sc.close();
    }
}
