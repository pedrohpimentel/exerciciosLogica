package LogicaDeProgramacao;

import java.util.Locale;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /* Maior de Três
Crie um programa que declare três variáveis inteiras (a, b, c) e atribua valores diferentes a elas.
Use estruturas condicionais aninhadas ou múltiplas (if/else if/else) para determinar
e imprimir qual dos três números é o maior.*/

        int num1 = 18;
        int num2 = 25;
        int num3 = 20;

        if (num1 > num2 && num1 > num3){
            System.out.println("O maior número é : " + num1 );
        } else if (num2 > num3) {
            System.out.println("O maior número é : " + num2);
        }
        else {
            System.out.println("O maior número é : " + num3);
        }

        sc.close();
    }
}
