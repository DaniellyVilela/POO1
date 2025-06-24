package aula17_06;

public class Aluno {
    String nome;
    int idade;
    static int qtdAlunos = 0;

    public Aluno(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
    qtdAlunos++;}

    public static void main(String[] args) {
        Aluno aluno = new Aluno("ALuno",20);
        System.out.println(Aluno.qtdAlunos);
    }
}
