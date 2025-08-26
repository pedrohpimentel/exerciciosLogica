package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Mês por Extenso
Crie um programa que declare uma variável inteira mes de 1 a 12.
Use uma estrutura switch para imprimir o nome do mês correspondente.

Por exemplo, se mes for 1, imprima "Janeiro".

Se o número não corresponder a um mês válido, use o default para imprimir "Mês inválido.".*/

    int numMes= 11;

        System.out.print("O mês é: ");
    switch (numMes){
        case 1:
            System.out.println("Janeiro");
            break;
        case 2:
            System.out.println("Fevereiro");
            break;
        case 3:
            System.out.println("Março");
            break;
        case 4:
            System.out.println("Maio");
            break;
        case 5:
            System.out.println("Abril");
            break;
        case 6:
            System.out.println("Junho");
            break;
        case 7:
            System.out.println("Julho");
            break;
        case 8:
            System.out.println("Agosto");
            break;
        case 9:
            System.out.println("Setembro");
            break;
        case 10:
            System.out.println("Outubro");
            break;
        case 11:
            System.out.println("Novembro");
            break;
        case 12:
            System.out.println("Dezembro");
            break;
        default:
            System.out.println("Mês inválido.");
            break;
    }

        sc.close();
    }
}

