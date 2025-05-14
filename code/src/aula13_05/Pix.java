package aula13_05;

public class Pix {
    double saldo;
    void crediatar(double valor){
        saldo = valor+ saldo;
        System.out.println("Saldo: " + saldo);
    }

    void debitar(double valor){ //valor é o tanto que vai sere transferido, creditado é a conta que está fazendo o pix
        if (saldo >= valor){
            saldo = saldo - valor;
            System.out.println("Saldo atual: " + saldo);

        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }

    void transfeir(Pix contaCreditada, double valor){
        if (saldo >= valor){//significado= o davi que está chamando esse metodo ai, ele está chamando esse saldo.
            //Creditando o dinheiro
             contaCreditada.saldo = contaCreditada.saldo + valor;       // OBS: O davi é a conta creditada, a pessoa que está fazendo o pix
            //debitando o dinheiro de quem chamou
            saldo = saldo - valor;
            System.out.println("Saldo conta creditada : "+ contaCreditada.saldo);
            System.out.println("Saldo conta debitada : " + saldo);

        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    public static void main(String[] args) {
        Pix contaDavi = new Pix();

        contaDavi.saldo = 1000;
        // contaDavi.crediatar(1000);
        // contaDavi.debitar(500);

        Pix contaMaria = new Pix();
        contaMaria.saldo = 0;
        contaDavi.transfeir(contaMaria, 2000);
    }
}
