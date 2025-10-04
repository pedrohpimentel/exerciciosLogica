package LogicaDeProgramacao;

import java.util.Locale;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Verificação de Paridade
Crie um programa que declare uma variável inteira numero (atribua qualquer valor).
Use uma estrutura condicional (if/else) para verificar se o número é par ou ímpar
e imprima a mensagem correspondente.*/

        int numero = 13;

        if (numero % 2 == 0){
            System.out.println("Este número é par.");
        }
        else {
            System.out.println("Este número é ímpar.");
        }

        sc.close();
    }
}
