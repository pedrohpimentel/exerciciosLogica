package LogicaDeProgramacao;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Conversão de Temperatura
Escreva um programa que declare uma variável de ponto flutuante (double) chamada temperaturaCelsius
e atribua o valor 30. Converta essa temperatura para Fahrenheit e imprima o resultado.
Fórmula: F=(C×1.8)+32.*/

        double temperaturaCelsius = 30;
        double farhrenheit = (temperaturaCelsius * 1.8) + 32;

        System.out.println("Convertendo " + temperaturaCelsius + "C para fahrenheit ficará = " + farhrenheit);

        sc.close();
    }
}
