package atividadeCasa;

public class ContaCorrent {
    private int nConta;
    private String titula;
    private double saldo;
    private double mensal;

    public int getnConta(){
        return nConta;
    }
    public String getTitula(){
        return titula;
    }
    public double getSaldo(){
        return nConta;
    }
    public double getMensal(){
        return mensal;
    }

    void setnConta(int nConta){
        this.nConta = nConta;
    }
    void setTitula(String titula){
        this.titula = titula;
    }
    void setSaldo(double saldo){
        this.saldo = saldo;
    }
    void setMensal(double mensal){
        this.mensal = mensal;
    }
    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void taxa() {
        saldo -= mensal;
    }

    void exibi(){
        System.out.println("=== RESUMO DA CONTA CORRENTE === ");
        System.out.println("Número da conta: " + nConta);
        System.out.println("Titular: " + titula);
        System.out.printf("Saldo atual: R$%.2f\n", saldo);
        System.out.printf("Taxa mensal: R$%.2f\n", mensal);
        System.out.println("___________________________________");
    }
    public static void main(String[] args) {
        ContaCorrent conta1 = new ContaCorrent();
        conta1.setnConta(1023);
        conta1.setTitula("Mariana Costa");
        conta1.setSaldo(1200);
        conta1.setMensal(12.50);

        conta1.depositar(300);
        conta1.sacar(500);
        conta1.taxa();
        conta1.exibi();

        System.out.println();

        ContaCorrent conta2 = new ContaCorrent();
        conta2.setnConta(2077);
        conta2.setTitula("Carlos Eduardo");
        conta2.setSaldo(850);
        conta2.setMensal(15);

        conta2.depositar(100);
        conta2.sacar(250);
        conta2.taxa();
        conta2.exibi();
    }
}
