package aula24_06.Aula;

public class Passageiros {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    void setIdade(int idade) {
        if(idade >= 0 && idade <= 120){
            this.idade = idade;
        }
        else{
            System.out.println("Digite uma idade válida!");
        }
    }

    void setNome(String nome) {

        if (nome == null || nome.isEmpty()) {
            System.out.println("Nome inválido!");
        }
        else{
            this.nome = nome;

        }
    }

    public static void main(String[] args) {
        Passageiros p1 = new Passageiros();
        Passageiros p2 = new Passageiros();
        Passageiros p3 = new Passageiros();
        Passageiros p4 = new Passageiros();
        Passageiros p5 = new Passageiros();
        Passageiros p6 = new Passageiros();

        p1.setNome("Carla Mendes");
        p1.setIdade(28);

        p2.setNome("Lucas Silva");
        p2.setIdade(17);

        p3.setNome("");
        p3.setIdade(45);

        p4.setNome("Júlia Fernandez");
        p4.setIdade(121);

        p5.setNome("Rafael Silva");
        p5.setIdade(-3);

        p6.setNome(null);
        p6.setIdade(38);

        System.out.println("------Dados Dos Passageiros------");
        System.out.println("Nome p1: " + p1.getNome() );
        System.out.println("Idade: " + p1.getIdade() + "\n");

        System.out.println("Nome p2: " + p2.getNome());
        System.out.println("Idade: " + p2.getIdade() + "\n");

        System.out.println("Nome p3: " + p3.getNome());
        System.out.println("Idade: " + p3.getIdade() + "\n");

        System.out.println("Nome p4: " + p4.getNome());
        System.out.println("Idade: " + p4.getIdade() + "\n");

        System.out.println("Nome p5: " + p5.getNome());
        System.out.println("Idade: " + p5.getIdade() + "\n");

        System.out.println("Nome p6: " + p6.getNome());
        System.out.println("Idade: " + p6.getIdade() + "\n");
    }


}
