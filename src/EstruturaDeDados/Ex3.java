package EstruturaDeDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*
         Média Simples
Crie um Array de 5 notas inteiras. Usando um laço for,
* calcule a soma total das notas e, em seguida, a média dessas notas. Imprima a média.*/

        List<Integer> notas = new ArrayList<>();
        notas.add(8);
        notas.add(5);
        notas.add(6);
        notas.add(3);
        notas.add(9);

        int media  = 0;
        int total = 0;
       for (Integer nota : notas){
            total += nota;
       }

       media = total/notas.size();

        System.out.println("Soma total das notas: " + total);
        System.out.println("Média das notas: " + media);


        sc.close();
    }
}
