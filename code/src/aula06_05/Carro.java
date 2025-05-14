package aula06_05;

import java.util.Scanner;

public class Carro {

    //Não tenho nenhum atributo nessa classe para passa a esse  metodo, então ele vai utilizar o parametro.EX: a seguir ↓

    void nomeProprietario(String nome){

        System.out.println("O nome do proprietário é: "+nome);
    }

    void TabelaFib(double preco) {
        double valor = (preco * 80) / 100;
        System.out.println("Preço de 80%: R$ " + valor);}
        //Principal ↓
        public static void main (String[]args){
            Scanner novo = new Scanner(System.in);

            Carro car = new Carro();

            System.out.print("Marca: ");
            String marca = novo.nextLine();

            System.out.print("Modelo: ");
            String modelo = novo.nextLine();

            System.out.print("Ano: ");
            int ano = novo.nextInt();
            novo.nextLine();

            System.out.print("cor: ");
            String cor = novo.nextLine();

            System.out.print("placa: ");
            String placa = novo.nextLine();

            System.out.print("Preço: ");
            double preco = novo.nextDouble();

            novo.nextLine();



            System.out.println("_________________________________");
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Ano: " + ano);
            System.out.println("Cor: " + cor);
            System.out.println("Placa: " + placa);
            System.out.println("Preço: R$" + preco);
            System.out.println("_________________________________");
            car.nomeProprietario("Maria");
            System.out.println("_________________________________");
            car.TabelaFib(preco);


        }
    }
