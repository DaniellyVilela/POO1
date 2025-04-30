package aula29_04;

import java.util.Locale;
import java.util.Scanner;

public class atividade01 {
    public static void main(String[] args) {
        Scanner li = new Scanner(System.in);
        System.out.println("___________________________________________");
        System.out.println("Venda 1;");
        System.out.print("Nome do vendendor: ");
        String nome = li.nextLine();
        System.out.print("Nome do produto vendido: ");
        String produto = li.nextLine();
        System.out.print("Quantidade vendidos: ");
        int quantidade = li.nextInt();
        li.nextLine();
        System.out.println("Preço: ");
        double preco = li.nextDouble();
        li.nextLine();
        double total = quantidade * preco;

        System.out.printf("Vendedor: %s \nProduto: %s \nQuantidade: %d \nPreço: R$ %.2f \nTotal: R$ %.2f", nome, produto, quantidade, preco, total);

        System.out.println("\n___________________________________________");
        System.out.println("Venda 2;");
        System.out.print("Nome do vendendor: ");
        String nome2 = li.nextLine();
        System.out.print("Nome do produto vendido: ");
        String produto2 = li.nextLine();
        System.out.print("Quantidade vendidos: ");
        int quantidade2 = li.nextInt();
        li.nextLine();
        System.out.println("Preço: ");
        double preco2 = li.nextDouble();
        li.nextLine();
        double total2 = quantidade2 * preco2;

        System.out.printf("Vendedor: %s \nProduto: %s \nQuantidade: %d \nPreço: R$ %.2f \nTotal: R$ %.2f", nome2, produto2, quantidade2, preco2, total2);

        System.out.println("\n___________________________________________");
        System.out.println("Venda 3;");
        System.out.print("Nome do vendendor: ");
        String nome3 = li.nextLine();
        System.out.print("Nome do produto vendido: ");
        String produto3 = li.nextLine();
        System.out.print("Quantidade vendidos: ");
        int quantidade3 = li.nextInt();
        li.nextLine();
        System.out.println("Preço: ");
        double preco3= li.nextDouble();
        li.nextLine();
        double total3 = quantidade3 * preco3;

        System.out.printf("Vendedor: %s \nProduto: %s \nQuantidade: %d \nPreço: R$ %.2f \nTotal: R$ %.2f", nome3, produto3, quantidade3, preco3, total3);
        double total4 =  total + total3 + total2;
        System.out.println("\n___________________________________________");
        System.out.printf("Total Geral das Vendas: R$ %.2f", total4);




    }
}
