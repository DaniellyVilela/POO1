package aula03_06;

public class Estoque {
    String nome;
    int quantidade;
    double precoUnitario;

    public Estoque(String nome) {
        this.nome = nome;
    }
    public Estoque(String nome,int quantidade, double precoUnitario){
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    double valorTotal(){
        double precoTotal = precoUnitario * quantidade;
        return precoTotal;
    }

    void reporEstoque( Estoque produto2){
        int adicionado = quantidade + produto2.quantidade;
    }

    void exibiResumo(){
        System.out.println("Produto: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço: " + precoUnitario);
    }

    public static void main(String[] args) {
        Estoque produto1 = new Estoque("Produto 1",100,5.50);
        Estoque produto2 = new Estoque("Produto 2",50,5.50);
        produto1.reporEstoque(produto2);
        produto1.exibiResumo();


    }

}
