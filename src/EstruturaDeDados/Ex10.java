package EstruturaDeDados;

public class Ex10 {
    public static void main(String[] args) {

        /*Inicialização e Impressão Simples
Objetivo: Declarar, inicializar e percorrer um vetor.

Crie um vetor de inteiros chamado idades com 5 posições.

Preencha-o com valores à sua escolha (ex: 20, 25, 30, 35, 40).

Utilize um loop for simples para imprimir cada valor do vetor.*/

       int[] idades = new int[]{20, 25, 30, 35, 40};

        for (Integer idade : idades){
            System.out.println(idade);
        }
    }
}
