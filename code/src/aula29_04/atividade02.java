package aula29_04;

import java.util.Scanner;

public class atividade02 {
    public static void main(String[] args) {
        Scanner li = new Scanner(System.in);
        System.out.print("Entrada\n");
        System.out.println("__________________________________________________");

        System.out.println("Aluguel: R$ ");
        double aluguel = li.nextDouble();
        li.nextLine();
        System.out.println("Salário: R$ ");
        double salario = li.nextDouble();
        li.nextLine();
        System.out.println("Contas de Serviços Públicos: R$ ");
        double contas = li.nextDouble();
        li.nextLine();
        System.out.println("\n___________________________________________");

        System.out.println("Material de Escritorios: R$ ");
        double material = li.nextDouble();
        li.nextLine();
        System.out.println("Publicidade: R$ ");
        double publicidade = li.nextDouble();
        li.nextLine();
        System.out.println("\n___________________________________________");


        System.out.println("Vendas: R$ ");
        double vendas = li.nextDouble();
        li.nextLine();
        System.out.println("\n___________________________________________");

        double totalFixos = aluguel + salario + contas;
        double totalVariacao = publicidade + material;
        double total = totalFixos + totalVariacao;
        double totalVendas = vendas - total;

        System.out.println("\n__________________________________________________");
        System.out.print("Relatório Financeiro Empresarial");
        System.out.println("\n__________________________________________________");
        System.out.print("Despesas fixas mensais\n");
        System.out.printf("-Aluguel: R$ %.2f \n-Salários; R$ %.2f \n-Contas de Serviços Públicos: R$ %.2f", aluguel, salario, contas);
        System.out.println("\n     ");
        System.out.println("Despesas variaveis mensais\n");
        System.out.printf("\nMaterial de Escritorio: R$ %.2f \nPublicidade: R$ %2f", material, publicidade);
        System.out.println("\n    ");
        System.out.print("\nReceita Mensal \n");
        System.out.printf("-Vendas: R$ %.2f", vendas);

        System.out.println("\n__________________________________________________");

        System.out.printf("\nTotal de Despesas Fixas: R$ %.2f", totalFixos);
        System.out.printf("\nTotal de Despesas Variáveis: R$ %.2f", totalVariacao);
        System.out.printf("\nTotal de Receitas: R$ ");
        System.out.println("\n    ");
        System.out.printf("\nLucro Líquido: R$ %.2f", totalVendas);

    }
}
