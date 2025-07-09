package aula08_07.atividade2;

public class LojaOnline {
    public static void main(String[] args) {
        Livro l = new Livro("O senhor dos Anéis",99.90,"J.R.R Tolkien");
        System.out.println("\n[DEBUG] Construtor de Produto sendo chamado...\n" +
                "[DEBUG] Construtor de Livro sendo chamado...\n" +
                "\n>>> Solicitando a exibição dos detalhes do livro... ");
        l.imprimir();
    }
}
