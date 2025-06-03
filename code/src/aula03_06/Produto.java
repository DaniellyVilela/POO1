package aula03_06;

public class Produto {
    double preco;

    public Produto(double preco) {
        this.preco = preco;
    }
    double calcularDesconto(Produto p, double percentual) {
        double percentualParte = 1- (percentual /100);
        double precoNovo = p.preco * percentualParte;
        return precoNovo;
    }

    public static void main(String[] args) {
        Produto p= new Produto(100);//o preço foi atribuido no consttrutor
        System.out.println("Preço novo: " + p.calcularDesconto(p, 10));
    }
}
