package aula06_05;

public class Conta {
    //Atributo ↓
    String nroConta;
    double saldo;

    //Metodo ↓
    void mostrarDadosClientes(){
        System.out.println("O número da conta do cliente é " + nroConta + " e o seu saldo atual é de apenas R$" + saldo);
    }

    //Principal ↓
    public static void main(String[] args) {
        Conta c = new Conta();

        c.nroConta = "32144-2";
        c.saldo = 50000;

        System.out.println("____________________________________________________________________________________________");
        c.mostrarDadosClientes();
        System.out.println("____________________________________________________________________________________________");
        System.out.println("Número da conta: " + c.nroConta);
        System.out.println("Saldo atual: " + c.saldo);
        System.out.println("____________________________________________________________________________________________");
    }
}
