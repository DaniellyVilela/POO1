package aula06_05;

public class Pessoa {
    String nome;
    String cpf;
    String telefone;

    public static void main(String[] args) {
       Pessoa p = new Pessoa();
       p.nome = "Pedro";
       p.cpf = "000.555.444.65";
       p.telefone = "(62) 9887-5486";

       System.out.println("___________________________________________________");
       System.out.println("Nome: "+p.nome);
       System.out.println("CPF: "+p.cpf);
       System.out.println("Telefone: "+p.telefone);
       System.out.println("___________________________________________________");

    }
}
