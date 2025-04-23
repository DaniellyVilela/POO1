package aula22_04;

import java.util.Locale;
import java.util.Scanner;
public class ex01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        System.out.println("Idade: ");
        int idade = leia.nextInt();

        System.out.println("Peso");
        double peso = leia.nextDouble();
        leia.nextLine();

        System.out.println("Nome completo: ");
        String nome = leia.nextLine();

        System.out.println("Média:");
        double media = leia.nextDouble();
        leia.nextLine();

        System.out.println("Nome do pai completo: ");
        String pai = leia.nextLine();

        System.out.println("Idade: " + idade
                + "\nPeso: " + peso
                + "\nNome: " + nome
                + "\nMedia: " + media
                 + "\nPai: " + pai);

    }


}
