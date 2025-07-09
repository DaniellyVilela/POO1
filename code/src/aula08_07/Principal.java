package aula08_07;

public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        meuCarro.ano = 2023;
        meuCarro.nPortas=4;

        meuCarro.ligar();
        meuCarro.exibi_relatorio();
        System.out.println("N° de portas: " + meuCarro.nPortas);
    }
}
