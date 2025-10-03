package EstruturaDeDados;

import java.util.*;

public class Ex4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /* Encontrando o Maior
Crie um Array de 6 números inteiros.
Percorra o array usando um laço e uma condicional if para encontrar e imprimir qual é o maior número
contido no array.*/

        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(8);
        numeros.add(24);
        numeros.add(4);
        numeros.add(10);
        numeros.add(13);

        int maiorNumeroEncontrado = numeros.get(0);

        for (Integer numAtual : numeros){
            if (numAtual > maiorNumeroEncontrado){
                maiorNumeroEncontrado = numAtual;
            }
        }

        System.out.println("O maior número da lista é: " + maiorNumeroEncontrado);

        sc.close();
    }
}
