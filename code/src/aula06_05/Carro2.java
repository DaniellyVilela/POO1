package aula06_05;

public class Carro2 {
    //Não tenho nenhum atributo nessa classe para passa  esse  metodo, então ele vai utilizar o parametro.EX: ↓

    void nomeProprietario(String nome){
        System.out.println("O nome do proprietário é: "+nome);
    }

    //Principal ↓
    public static void main(String[] args) {
        Carro2 car = new Carro2();
        car.nomeProprietario("Maria");
    }

}
