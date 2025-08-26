package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Validador de Senha
Crie um programa que declare duas variáveis String: uma para a senhaCorreta e outra para a senhaDigitada.
O programa deve pedir para o usuário digitar uma senha.

A senhaCorreta deve ser "Java123".

A senhaDigitada deve ser a entrada do usuário.

Use uma estrutura if-else para verificar se as senhas são iguais.
Se forem, imprima "Acesso concedido.". Se não forem, imprima "Acesso negado."

Desafio adicional: No else (acesso negado), adicione uma verificação aninhada.
Se a senha tiver mais de 8 caracteres, imprima "Dica: A senha tem 8 caracteres.".
Se não, imprima "Tente novamente.". */

        String senhaCorreta = "Java123";

        System.out.print("Digite a senha correta: ");
        String senhaDigitada = sc.next();

        if (senhaDigitada.equals(senhaCorreta)){
            System.out.println("Acesso concedido.");
        }
        else {
            System.out.println("Acesso negado.");
        }

        if (senhaDigitada.length() > 8){
            System.out.println("Dica: A senha tem 8 caracteres.");
        }
        else {
            System.out.println("Tente novamente.");
        }


        sc.close();
    }
}
