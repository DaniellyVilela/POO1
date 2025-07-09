package aula08_07.Atividade;

public class TesteBanco {
    public static void main(String[] args) {
         Poupanca ContaPoupa = new Poupanca();
        ContaPoupa.nConta = "12345-6";
        ContaPoupa.titular = "Ana Silva";
        ContaPoupa.saldo = 1000;
        ContaPoupa.taxaJuros = 0.5;
        ContaPoupa.exibirInfo("Inicial");
        System.out.println("\n>>>Realizando operações...");
        ContaPoupa.depositar(500);
        ContaPoupa.sacar(200);
        ContaPoupa.exibirInfo("Final");

    }
}
