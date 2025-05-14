package aula13_05;

public class Carro {

    String marca ;
    String modelo ;
    int ano;
    String cor;
    String placa;
    double preco;


    //Não tenho nenhum atributo nessa classe para passa a esse  metodo, então ele vai utilizar o parametro.EX: a seguir ↓

    void nomeProprietario(String nome){
        System.out.println("O nome do proprietário é: "+nome);
    }

    void TabelaFib(double preco){
        double valor = (preco *80)/100;
        System.out.println("Preço da Tabela Fipe: " + valor);}
        //Principal ↓
        public static void main(String[] args) {
            Carro car = new Carro();
            car.marca = "Toyota";
            car.modelo = "Corolla";
            car.ano = 2015;
            car.cor = "vermelho";
            car.placa = "ver8m87";
            car.preco = 30000;

            System.out.println("_________________________________");
            System.out.println("Marca: "+car.marca);
            System.out.println("Modelo: "+car.modelo);
            System.out.println("Ano: "+car.ano);
            System.out.println("Cor: "+car.cor);
            System.out.println("Placa: "+car.placa);
            System.out.println("Preço: R$"+car.preco);
            System.out.println("_________________________________");
            car.nomeProprietario("Maria");
            System.out.println("_________________________________");
            car.TabelaFib(car.preco);


        }

}
