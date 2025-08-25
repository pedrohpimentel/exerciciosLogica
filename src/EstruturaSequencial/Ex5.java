package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /* Cálculo de Troco com Notas
Objetivo: Desafio extra! Combinar diferentes cálculos e exibir o resultado de forma organizada.

Descrição: Crie um programa para um caixa de loja.
O programa deve solicitar o valor total da compra e o valor pago pelo cliente.
Calcule o troco. Em seguida, exiba quantas notas de R$ 10,00, R$ 5,00, R$ 2,00 e R$ 1,00 esse troco pode "dar",
usando a maior quantidade de notas de maior valor possível.

Dica: Você pode usar o operador de divisão (/) para saber a quantidade de notas e o operador de resto da divisão
 (%) para saber o que "sobra" para o próximo cálculo.
*/
        System.out.print("Digite o valor total da compra: R$ ");
        double valorTotal = sc.nextDouble();

        System.out.print("Digite o valor pago pelo cliente: R$ ");
        double valorPago = sc.nextDouble();

        double trocoDouble = valorPago - valorTotal;

        int troco = (int) Math.round(trocoDouble);

        System.out.println("---------------------------------");
        System.out.printf("O troco a ser dado é de: R$ %.2f\n", trocoDouble);
        System.out.println("---------------------------------");
        System.out.println("Distribuição das notas:");

        int notas10 = troco / 10;

        troco = troco % 10;

        int notas5 = troco / 5;
        troco = troco % 5;

        int notas2 = troco / 2;
        troco = troco % 2;

        int notas1 = troco;

        System.out.println("Notas de R$ 10,00: " + notas10);
        System.out.println("Notas de R$ 5,00: " + notas5);
        System.out.println("Notas de R$ 2,00: " + notas2);
        System.out.println("Notas de R$ 1,00: " + notas1);

        sc.close();
    }

}
