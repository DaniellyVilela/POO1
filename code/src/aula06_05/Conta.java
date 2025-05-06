package aula06_05;

public class Conta {
    String nroConta;
    double saldo;

    public static void main(String[] args) {
        Conta c = new Conta();

        c.nroConta = "32144-2";
        c.saldo = 50000;

        System.out.println("Número da conta: " + c.nroConta);
        System.out.println("Saldo atual: " + c.saldo);
    }
}
