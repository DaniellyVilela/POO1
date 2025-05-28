package atividadeCasa;

import java.util.Scanner;

public class atividade27_05 {
    double percentual = 10.0;
    double preco = 100.0;

    void desconto(double preco, double percentual) {
        double desconto = (preco - percentual);
        System.out.printf("NOVO PREÇO: R$ %.2f\n", desconto);
        System.out.printf("PREÇO ANTIGO: R$ %.2f\n", preco);
        System.out.print("DESCONTO FEITO: "+percentual+"%");

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        atividade27_05 p = new atividade27_05();
        System.out.print("Preço: R$");
        p.preco = sc.nextDouble();
        System.out.print("Desconto: ");
        p.percentual = sc.nextDouble();
        sc.nextLine();
        System.out.println("________________________");

        p.desconto(p.preco, p.percentual);


    }
}
