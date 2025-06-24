package aula24_06.Casa;

public class Academia {
    String nome;
    int idade;
    double nota1;
    double nota2;
    double nota3;

    public Academia(String nome,double nota1, double nota2, double nota3){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        double media = (nota1 + nota2 + nota3 ) / 3;
        System.out.println("Media final: " + media);

        if (media < 4){
            System.out.println("Aluno(a): "+nome+" \n!");

        } else if (4 <= media && media < 6) {
            System.out.println("Aluno(a): "+nome+" \n!");

        }
        else {
            System.out.println("Aluno(a): "+nome+" \n!");
        }
    }    public Academia(String nome, int idade){
        this.nome = nome;
        this.idade = idade;}

    public static void main(String[] args) {
        Academia academia = new Academia("Aluno", 10, 20, 30);

    }
}
