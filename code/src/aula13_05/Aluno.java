package aula13_05;

import java.util.Scanner;

public class Aluno {
    void media(String nome,double nota1, double nota2, double nota3, double nota4){
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Media final: " + media);
        
        if (media < 4){
            System.out.println("Aluno(a): "+nome+" \nReprovado!");

        } else if (4 <= media && media < 6) {
            System.out.println("Aluno(a): "+nome+" \nRecuperação!");
            
        }
        else {
            System.out.println("Aluno(a): "+nome+" \nAprovado!");
        }
    }

    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);

        Aluno al = new Aluno();
        System.out.print("Nome do aluno: ");
        String nome = notas.nextLine();
        System.out.print("Nota 1: ");
        double nota1 = notas.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = notas.nextDouble();
        System.out.print("Nota 3: ");
        double nota3 = notas.nextDouble();
        System.out.print("Nota 4: ");
        double nota4 = notas.nextDouble();

        al.media(nome,nota1, nota2, nota3, nota4);

        
        
    }
}
