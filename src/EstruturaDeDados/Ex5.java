package EstruturaDeDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Palavras Invertidas
Crie um Array de String com 4 nomes.
Percorra o array do último elemento para o primeiro (índice decrescente) e imprima cada nome.*/

        String[] nomes = {"Craque Neto", "Soza", "Mococa", "Pedro"};

        for (int i = nomes.length - 1; i >= 0 ; i--) {
            System.out.println(nomes[i]);

        }
       
        sc.close();
    }
}
