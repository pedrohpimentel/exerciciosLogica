package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /* Conversor de Dólar para Real
Objetivo: Trabalhar com conversão e variáveis do tipo double.

Descrição: Crie um programa que converta um valor em dólar para real.
O programa deve pedir ao usuário para inserir a cotação atual do dólar e,
em seguida, o valor em dólar que ele deseja converter. O resultado deve ser exibido na tela.

Fórmula: ValorEmReal = ValorEmDolar * cotação
*/

        System.out.println("======Conversor de Dólar para Real======");

        System.out.printf("Digite a cotação atual do dolar: $");
        double cotacaoDolar = sc.nextDouble();

        System.out.print("Digite o valor que deseja converter: $");
        double valorEmDolar = sc.nextDouble();

        double valorEmReal = valorEmDolar * cotacaoDolar;
        System.out.printf("O valor de %.2f dólares em reais é igual a R$%.2f", valorEmDolar, valorEmReal);

        sc.close();
    }
}
