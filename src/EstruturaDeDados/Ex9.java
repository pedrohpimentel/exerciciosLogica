package EstruturaDeDados;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Implementando uma Fila para Atendimento
Simule uma fila de atendimento para clientes usando uma Fila (Queue), que segue a regra FIFO.
Em Java, você pode usar o LinkedList ou ArrayDeque para implementar a interface Queue.

Crie uma Queue<String> chamada filaDeEspera (use new LinkedList<>()).

Adicione os clientes: "Cliente A", "Cliente B" e "Cliente C" (método offer()).

Imprima o cliente que será atendido primeiro (peek()).

Simule o atendimento de dois clientes, removendo-os da fila (poll()),
e imprima o nome de cada cliente atendido.

Adicione um novo cliente: "Cliente D".

Imprima quem é o próximo cliente na fila após a adição.*/

        Queue<String> filaDeEspera = new LinkedList<>();
        filaDeEspera.offer("Cliente A");
        filaDeEspera.offer("Cliente B");
        filaDeEspera.offer("Cliente C");

        System.out.println("Cliente que será atendido primeiro: " + filaDeEspera.peek());
        System.out.println("===================================");
        System.out.println("Clientes que foram atendidos: " + filaDeEspera.poll());
        System.out.println("Clientes que foram atendidos: " + filaDeEspera.poll());
        System.out.println("===================================");

        filaDeEspera.offer("Cliente D");
        System.out.println("Próximo cliente para ser atendido: " + filaDeEspera.peek());


        sc.close();
    }
}
