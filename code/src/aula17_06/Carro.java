package aula17_06;

public class Carro {
    String modelo;
    String placa;
    boolean estacionado;
    static int vagasDisponiveis = 5;

    public Carro(String modelo, String placa) {

        if(vagasDisponiveis <= 0) {
            this.estacionado = false;

            System.out.println("----------------------------------");
            System.out.println("\nEstacionamento cheio. Não foi possível estacionar:");
            System.out.println("Placa: " + placa);
        }else{
            this.estacionado = true;
            this.placa = placa;
            this.modelo = modelo;
            vagasDisponiveis--;;

        }

    }
    void exibirDados() {
    if(estacionado) {
        System.out.println("----------------------------------");
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Estacionado: " + estacionado);}


    }


    public static void exibiVagas() {
        System.out.println("\nVagas disponiveis: "+vagasDisponiveis);
        System.out.println("\n_________________________________________________________________________________");

    }

    public static void main(String[] args) {
        Carro v1 = new Carro("Fiat Uno", " ABC-1234" );
        v1.exibirDados();
        Carro.exibiVagas();

        Carro v2 = new Carro(" Chevrolet Onix", " DEF-5678" );
        v2.exibirDados();
        Carro.exibiVagas();

        Carro v3 = new Carro(" Hyundai HB20 ", "  GHI-9012" );
        v3.exibirDados();
        Carro.exibiVagas();

        Carro v4 = new Carro(" Volkswagen Gol", "JKL-3456" );
        v4.exibirDados();
        Carro.exibiVagas();

        Carro v5 = new Carro("  Renault Sandero", "MNO-7890" );
        v5.exibirDados();
        Carro.exibiVagas();

        Carro v6 = new Carro("Toyota Corolla", "PQR-4321" );
        v6.exibirDados();
        Carro.exibiVagas();



    }

}


