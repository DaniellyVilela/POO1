package aula22_04;

import java.util.Scanner;

public class atividade01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o nome do professor: ");
        String nomeProf = leia.nextLine();

        System.out.println("Digite a idade do professor: ");
        int idadeProf = leia.nextInt();
        leia.nextLine();

        System.out.println("Nome do curso: ");
        String curso = leia.nextLine();

        System.out.println("Quantidade de Alunos: ");
        int alunos = leia.nextInt();
        leia.nextLine();

        System.out.println("Nome do coordenador do curso: ");
        String coord = leia.nextLine();

        System.out.println("___________________________________________");
        System.out.println("Professor: " + nomeProf);
        System.out.println("Idade do Professor: " + idadeProf);
        System.out.println("Curso: " + curso);
        System.out.println("Quantidade de alunos: " + alunos);
        System.out.println("Coordenador do curso: " + coord);
        System.out.println("___________________________________________");




    }
}
