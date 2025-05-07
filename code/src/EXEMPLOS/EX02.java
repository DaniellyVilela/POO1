package EXEMPLOS;

import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {
        System.out.println("_____________EXEMPLO 01_______________");

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o peso: ");
        double peso = leia.nextDouble();
        System.out.println("Peso: "+peso);
        System.out.println("____________________________");

        System.out.println("_____________EXEMPLO 02_______________");
        Scanner leia2 = new Scanner(System.in);
        System.out.println("Digite o 1° nome: ");
        String nome = leia2.next(); // apenas o next para quando não utilizar espaço
        System.out.println("Nome: "+nome);
        System.out.println("____________________________");

        System.out.println("_____________EXEMPLO 03_______________");
        Scanner leia3 = new Scanner(System.in);
        System.out.println("Digite o nome completo: ");
        String nomeCompleto = leia3.nextLine(); // usado o nextline para palavras que contém espaços
        System.out.println("Nome Completo: "+nomeCompleto);
        System.out.println("____________________________");

        System.out.println("_____________EXEMPLO 04_______________");
        Scanner leia4 = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        int idade = leia4.nextInt(); // para captura numeros inteiros
        System.out.println("Idade: "+idade);}
}
