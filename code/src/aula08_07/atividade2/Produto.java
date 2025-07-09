package aula08_07.atividade2;

public class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public void imprimir() {
        System.out.println("--- Detalhes do Produto ---");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
    }
}
