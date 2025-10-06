package EstruturaDeDados;

import java.util.Locale;
import java.util.Scanner;
import java.util.Stack;

public class Ex8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /* Manipulando uma Pilha (Intermediário)
Simule um sistema de "Desfazer" (Undo) usando a estrutura de Pilha (Stack), que segue a regra LIFO.

Crie uma Stack<String> para armazenar as "Ações" de um usuário (ex: "Digitar Texto", "Aplicar Negrito").

Use o método push() para adicionar as seguintes ações em ordem:

"Abrir Documento"

"Digitar Título"

"Digitar Conteúdo"

"Aplicar Formatação"

Imprima a ação que está no topo (a última) sem removê-la (peek()).

Simule duas operações de "Desfazer" usando o método pop() e imprima cada ação desfeita.

Imprima a pilha restante.*/

        Stack<String> acoes = new Stack<>();
        acoes.push("Abrir documento");
        acoes.push("Digitar Título");
        acoes.push("Digitar Conteúdo");
        acoes.push("Aplicar Formatação");

        System.out.println("Item do topo da lista: " + acoes.peek());
        System.out.println("Removendo o terceiro item: " + acoes.pop());
        System.out.println("Removendo o segundo item : " + acoes.pop());

        System.out.println("Ações que permaneceram na lista: " );
        for (String veriAcoes : acoes ){
            System.out.println(veriAcoes);
        }

        sc.close();
    }
}
