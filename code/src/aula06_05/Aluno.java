package aula06_05;

public class Aluno {
    //Atributo ↓
    String nome;
    String matricula;
    String telefone;

    //Metodo sem parametros ↓
    void mostrarSejaBemVindo() {
        System.out.println("Sejam bem-vindo ao cuso de POO!");
    }


    //Metodo com parametros ↓
    void mediaCurso(double media) {
        System.out.println("A sua média do curso é: " + media);
    }


    //Principal ↓
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.nome = "Poppy";
        a.matricula = "12345";
        a.telefone = "(12) 3456-4789";

        System.out.println("______________________________________________________________");
        a.mostrarSejaBemVindo();
        System.out.println("______________________________________________________________");
        System.out.println("Nome: " + a.nome);
        System.out.println("Matricula: " + a.matricula);
        System.out.println("Telefone: " + a.telefone);
        System.out.println("_______________________________________________________________");
        a.mediaCurso(5.6);
        System.out.println("_______________________________________________________________");
    }
}
