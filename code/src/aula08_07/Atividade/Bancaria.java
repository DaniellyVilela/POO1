package aula08_07.Atividade;

public class Bancaria {
    String nConta;
    String titular;
    double saldo;

    public  double depositar(double valor) {
        this.saldo = this.saldo += valor;
        System.out.println("Deposito de R$"+valor+" realizado com sucesso!");
        return saldo;
    }
    public  double sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$"+valor+" realizado com sucesso!");
        }
        else{
            System.out.println("Saldo insuficiente");
        }
        return valor;
    }

    public void  exibirInfo(String situacao) {
        System.out.println("\n===  Situação "+situacao+" da Conta Poupança === ");
        System.out.println("Número da conta: " + nConta);
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo atual: R$%.2f\n", saldo);
        System.out.println("___________________________________");
    }


}
