package EstruturaDeDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Filtrando Pares e Ímpares
Crie um ArrayList de Integer e adicione 10 números inteiros de sua escolha. Percorra essa lista.
Usando o operador módulo (%) e uma condicional,
adicione os números pares em um segundo ArrayList e os ímpares em um terceiro.
Imprima ambas as novas listas.*/

        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(45);
        numeros.add(123);
        numeros.add(35);
        numeros.add(85);
        numeros.add(189);
        numeros.add(98);
        numeros.add(27);
        numeros.add(12);
        numeros.add(93);

        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();

        for (Integer numero : numeros){
            if (numero % 2 == 0) {
                numerosPares.add(numero);
            } else {
                numerosImpares.add(numero);
            }
        }

        System.out.println("Lista Original: " + numeros);
        System.out.println("------------------------------------");
        System.out.println("Números Pares: " + numerosPares);
        System.out.println("Números Ímpares: " + numerosImpares);

        sc.close();
    }
}
