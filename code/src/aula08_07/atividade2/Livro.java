package aula08_07.atividade2;

public class Livro extends Produto{
    String autor;
    public Livro(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }
    @Override
    public void imprimir() {  //Já exite lá na classe pai, o override serve para mostra que está sobreescrevendo
        super.imprimir();
        System.out.println("Autor: " + autor);
    }

}
