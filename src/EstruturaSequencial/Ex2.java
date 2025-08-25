package EstruturaSequencial;

import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Calculadora de Área
Objetivo: Realizar um cálculo simples a partir de valores fornecidos pelo usuário.

Descrição: Desenvolva um programa que calcule a área de um retângulo.
O programa deve pedir ao usuário para digitar o valor da base e da altura.
 Ao final, ele deve exibir a área calculada.

Fórmula: Area=base×altura*/

        System.out.print("Digite o valor da base do retângulo: ");
        double base = sc.nextDouble();

        System.out.print("Digite o valor da altura do retângulo: ");
        double altura = sc.nextDouble();

        double area = base * altura;
        System.out.printf("ÁREA CALCULADA = %.2f" , area);

        sc.close();
    }
}
