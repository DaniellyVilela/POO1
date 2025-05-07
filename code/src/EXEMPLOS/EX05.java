package EXEMPLOS;

import java.util.Locale;
import java.util.Scanner;

public class EX05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        String nome = ler.next();
        int idade = ler.nextInt();
        double peso = ler.nextDouble();

        System.out.println("Dados Digitados: ");
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(peso);
    }
}