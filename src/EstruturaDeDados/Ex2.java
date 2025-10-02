package EstruturaDeDados;

import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Exercício 2: Intermediário (Usando HashSet)
Você está desenvolvendo um sistema para gerenciar números de CPF que já foram cadastrados.
O sistema precisa garantir que não haja duplicatas.

Crie um HashSet de Strings chamado cpfsCadastrados.

Adicione os seguintes CPFs: "123.456.789-00", "987.654.321-99", "123.456.789-00".

Imprima o tamanho do HashSet. Qual é o resultado? Explique o porquê em um comentário no código.

Verifique se o CPF "987.654.321-99" está presente no conjunto e imprima o resultado (true ou false).*/

        HashSet<String> cpfsCadastrados = new HashSet<>();

        cpfsCadastrados.add("123.456.789-00");
        cpfsCadastrados.add("987.654.321-99");
        cpfsCadastrados.add("123.456.789-00");

        System.out.print("Tamanho do conjunto de CPFs: ");
        System.out.println(cpfsCadastrados.size());
        /* * Explicação: O resultado é 2 porque a estrutura Set (HashSet)
         * não permite elementos duplicados. O segundo "123.456.789-00"
         * é automaticamente ignorado.
         */

        String cpfParaVerificar = "987.654.321-99";
        boolean estaPresente = cpfsCadastrados.contains(cpfParaVerificar);

        System.out.print("O CPF " + cpfParaVerificar + " está presente? ");
        System.out.println(estaPresente);

        System.out.print("O CPF '000.000.000-00' está presente? ");
        System.out.println(cpfsCadastrados.contains("000.000.000-00"));
        sc.close();
    }
}
