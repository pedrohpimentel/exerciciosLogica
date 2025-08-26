package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /* Verificador de Par ou Ímpar
Crie um programa que declare uma variável inteira numero.
Use uma estrutura condicional if-else para verificar se o número é par ou ímpar.

Se o número for par, imprima "O número é par."
Se o número for ímpar, imprima "O número é ímpar."

Dica: O operador de módulo (%) pode ser muito útil para verificar se um número é divisível por 2.*/

    int num = 18;

    if(num % 2 == 0){
        System.out.println("O número é par.");
    }
    else {
        System.out.println("O número é ímpar.");
    }

        sc.close();
    }

}
