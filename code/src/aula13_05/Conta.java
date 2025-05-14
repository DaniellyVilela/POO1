package aula13_05;

public class Conta {
    //Atributo ↓
    String nroConta;
    double saldo;
    double debitar;
    double credito;

    //Metodo ↓
    void mostrarDadosClientes(){
        System.out.println("O número da conta do cliente é " + nroConta + " e o seu saldo atual é de apenas R$" + saldo);
    }
    void creditar(double valor,double saldo){
        double atual = valor + saldo;
        System.out.println("Creditos adicionados com sucesso! \nSaldo atual:  " + atual);

    }
    void debito(double saldo,double debi){
        if (saldo > debi){
            double cont = saldo - debi;
            System.out.println("Saldo atualizado com sucesso!");
            System.out.println("Saldo Atual: " + cont);
        }
        else {
            System.out.println("Não há saldos suficiente para debito!");
        }
    }

    //Principal ↓
    public static void main(String[] args) {
        Conta c = new Conta();

        c.nroConta = "32144-2";
        c.saldo = 50000;
        c.credito = 2000;
        c.debitar = 6000;

        System.out.println("____________________________________________________________________________________________");
        c.mostrarDadosClientes();
        System.out.println("____________________________________________________________________________________________");
        System.out.println("Número da conta: " + c.nroConta);
        System.out.println("Saldo atual: " + c.saldo);
        System.out.println("____________________________________________________________________________________________");
        c.creditar(c.credito,c.saldo);
        System.out.println("____________________________________________________________________________________________");
        c.debito(c.saldo, c.debitar);


    }
}

