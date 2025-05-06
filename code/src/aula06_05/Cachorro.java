package aula06_05;

public class Cachorro {
    String nome;
    int idade;
    double peso;

    public static void main(String[] args) {
        Cachorro c = new Cachorro(); //objeto acabado de criar

        c.nome = "Rodriga";
        c.idade = 2;
        c.peso = 10.4;

        System.out.println("Nome: " + c.nome);
        System.out.println("Idade: " + c.idade);
        System.out.println("Peso: " + c.peso);
    }
}
