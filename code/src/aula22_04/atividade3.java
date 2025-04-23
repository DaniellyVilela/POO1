package aula22_04;

import java.io.PrintStream;
import java.util.Locale;

public class atividade3 {
    public static void main(String[] args) {
        String produto1 = "Computador";
        String produto2 = "Mesa";

        int idade = 30;
        int id = 5290;
        char sexo = 'F';

        double preco1 = 2100.00;
        double preco2 = 650.00;
        double medida = 53.234567;

        System.out.println("Produtos: ");
        System.out.printf("%s \nPreço: %.2f \n_________________________________\n%s \nPreço: %.2f", produto1, preco1, produto2, preco2);

        System.out.println("\n_________________________________\nRegistros: ");
        System.out.printf("%d anos, codigo %d e sexo %s", idade, id, sexo);
        System.out.println("\n__________________________________________________________________________________________");
        System.out.printf("Medidas com 8 casas decimais: %.8f \n", medida);
        System.out.printf("Medidas com 3 casas decimais: %.3f \n", medida);
        Locale.setDefault(Locale.US);
        System.out.printf("Medidas com 8 casas decimais (SISTEMA DECIMAL AMERICANO): %.8f", medida);
    }
}
