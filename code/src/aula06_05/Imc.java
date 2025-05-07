package aula06_05;

import java.util.Scanner;

public class Imc {
    double peso;
    double altura;

    void getPeso(double peso , double altura) {
        double imc = peso / (altura * altura);                      // Pode fazer a conta fora do print e depois só coloca a variavel, igual assim <--
        System.out.printf("IMC: %.2f ",(peso / (altura * altura)) ); //os parenteses com peso e ate o final é para ressalta que é o f a conta toda.
        System.out.printf("\nIMC: %.2f ",imc);


    }

    //Principal ↓
    public static void main(String[] args) {
        Imc i = new Imc();

        Scanner sc = new Scanner(System.in);
        System.out.print("Peso: ");
        i.peso = sc.nextDouble();

        System.out.print("Altura: ");
        i.altura = sc.nextDouble();
        i.getPeso(i.peso,i.altura);



    }
}
