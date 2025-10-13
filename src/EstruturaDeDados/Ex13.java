package EstruturaDeDados;

public class Ex13 {
    public static void main(String[] args) {
        /*Encontrar o Maior Elemento
Objetivo: Comparação e atualização de variável dentro do loop.

Crie um vetor de inteiros chamado numeros com 6 posições e preencha-o com valores aleatórios.

Percorra o vetor e encontre o maior valor armazenado.

Imprima o maior valor encontrado.*/

        int[] numeros = new int[]{29,87,12,53,23,19};

        int maior = numeros[0];

        System.out.println("Elementos do vetor: " );
        for (int numero : numeros){
            System.out.println(numero);
            if (numero > maior){
                maior = numero;
            }
        }
        System.out.println("O maior número encontrado foi: " + maior);
    }
}
