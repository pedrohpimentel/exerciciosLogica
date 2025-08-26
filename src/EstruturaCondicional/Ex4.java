package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*  Classificador de Vogal ou Consoante
Crie um programa que declare uma variável do tipo char chamada letra.
Use uma estrutura switch ou if-else if para determinar se a letra é uma vogal (a, e, i, o, u) ou uma consoante.

Se a letra for uma vogal (maiúscula ou minúscula), imprima "A letra é uma vogal."

Se a letra não for uma vogal, imprima "A letra é uma consoante."

Considere que a entrada será sempre uma letra do alfabeto.*/

       char letra = 'z';

       switch (letra){
           case 'a' , 'A':
               System.out.println("A letra é uma vogal.");
               break;
           case 'e' , 'E':
               System.out.println("A letra é uma vogal.");
               break;
           case 'i' , 'I':
               System.out.println("A letra é uma vogal.");
               break;
           case 'o' , 'O':
               System.out.println("A letra é uma vogal.");
               break;
           case 'u' , 'U':
               System.out.println("A letra é uma vogal.");
               break;
           default:
               System.out.println("A letra é uma consoante.");
               break;
       }

        sc.close();
    }

}
