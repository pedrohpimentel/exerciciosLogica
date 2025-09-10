package EstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /* NúmeroPrimo
Crie um programa que peça um número inteiro positivo ao usuário e determine se ele é um número primo.
Um número primo é aquele que é divisível apenas por 1 e por ele mesmo.

Dica: Você precisará usar um loop for para verificar a divisibilidade do número.
Lembre-se que você não precisa verificar divisões por 1 ou pelo próprio número,
pois a definição de primo já os inclui.*/

        System.out.print("Digite um número inteiro positivo: ");
        int num = sc.nextInt();

        if (num <= 1){
            System.out.println(num + "não é um número primo. ");
            return;
        }

        boolean numPrimo = true;

        for (int i = 2; i <= num / 2 ; i++) {
            if (num % i == 0){
                numPrimo = false;
                break;
            }
        }

        if (numPrimo){
            System.out.println(num + " é um número primo.");
        }
        else {
            System.out.println(num + " não é um número primo.");
        }

        sc.close();
    }

}
