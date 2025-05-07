package aula06_05;

public class Pessoa {
    String nome;
    String cpf;
    String telefone;

    //Metodo ↓
    void mostrarCPF(){

        System.out.println("O CPF da pessoa é " + cpf);
    }

    //Principal ↓
    public static void main(String[] args) {
       Pessoa p = new Pessoa();
       p.nome = "Pedro";
       p.cpf = "000.555.444.65";
       p.telefone = "(62) 9887-5486";

       System.out.println("___________________________________________________");
       System.out.println("Nome: "+p.nome);
       System.out.println("Telefone: "+p.telefone);
       System.out.println("___________________________________________________");
       p.mostrarCPF();
       System.out.println("___________________________________________________");

    }
}
