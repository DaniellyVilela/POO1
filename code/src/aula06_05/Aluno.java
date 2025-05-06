package aula06_05;

public class Aluno {
    String nome;
    String matricula;
    String telefone;

    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.nome = "Poppy";
        a.matricula = "12345";
        a.telefone = "(12) 3456-4789";

        System.out.println("______________________________________________________________");
        System.out.println("Nome: " + a.nome);
        System.out.println("Matricula: " + a.matricula);
        System.out.println("Telefone: " + a.telefone);
        System.out.println("_______________________________________________________________");
    }
}
