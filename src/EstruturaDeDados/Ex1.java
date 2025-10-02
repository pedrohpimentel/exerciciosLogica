package EstruturaDeDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Exercício 1: Básico (Usando ArrayList)
Crie um programa que faça o seguinte:

Crie uma ArrayList de Strings chamada tarefas.

Adicione as seguintes tarefas: "Comprar pão", "Estudar Java", "Pagar contas".

Imprima a lista inteira.

Remova a tarefa "Comprar pão".

Adicione uma nova tarefa na posição 0: "Fazer café".

Imprima a lista novamente.*/

        List<String> tarefas = new ArrayList<>();

        tarefas.add("Comprar pão");
        tarefas.add("Estudar Java");
        tarefas.add("Pagar contas");

        System.out.println("Lista de tarefas original: " + tarefas);

        tarefas.remove("Comprar pão");
        tarefas.add(0, "Fazer café");

        System.out.println("Lista atualizada: " + tarefas);

        sc.close();
    }

}
