package EstruturaSequencial;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Olá, Mundo! com Nome
Objetivo: Praticar a entrada de dados e a exibição de uma mensagem.

Descrição: Crie um programa que peça ao usuário para digitar seu nome. Em seguida,
o programa deve exibir a mensagem "Olá, [nome do usuário]! Bem-vindo(a) ao mundo da programação.".*/

        System.out.print("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Olá, " + nome + "!" + " Bem-vindo(a) ao mundo da programação.");

        sc.close();
        }
}