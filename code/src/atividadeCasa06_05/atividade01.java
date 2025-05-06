package atividadeCasa06_05;

import java.util.Scanner;

public class atividade01 {
    public static void main(String[] args) {
        Scanner li = new Scanner(System.in);
        System.out.print("Nome Completo: ");
        String nome_completo = li.nextLine();

        System.out.print("Idade: ");
        int idade = li.nextInt();

        System.out.print("Peso(em quilogramas): ");
        double peso = li.nextDouble();

        System.out.print("Altura(metros): ");
        double altura = li.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("__________________________________________________");
        if (imc < 18.5){
            System.out.print("Nome e idade: " + nome_completo + ", "+idade);
            System.out.printf("\nPeso: %.2f kg", peso);
            System.out.println("\nAltura: " + altura);
            System.out.printf("IMC: %.2f \nCategoria do IMC: ABAIXO DO PESO",imc);
        }
        else if (18.5 <= imc && imc < 25.0 ) {
            System.out.print("Nome e idade: " + nome_completo + ", "+idade);
            System.out.printf("\nPeso: %.2f kg", peso);
            System.out.println("\nAltura: " + altura+" kg");
            System.out.printf("IMC: %.2f \nCategoria do IMC: PESO NORMAL",imc);
        }
        else if (25.0 <= imc && imc < 30.0){
            System.out.print("Nome e idade: " + nome_completo + ", "+idade);
            System.out.printf("\nPeso: %.2f kg", peso);
            System.out.println("\nAltura: " + altura);
            System.out.printf("IMC: %.2f \nCategoria do IMC: SOBREPESO",imc);
        }
        else if  (30.0 < imc && imc < 35.0){
            System.out.print("Nome e idade: " + nome_completo + ", "+idade);
            System.out.printf("\nPeso: %.2f kg", peso);
            System.out.println("\nAltura: " + altura);
            System.out.printf("IMC: %.2f \nCategoria do IMC: OBESIDADE GRAU I",imc);
        }
        else if( 35.0 < imc && imc < 40.0){
            System.out.print("Nome e idade: " + nome_completo + ", "+idade);
            System.out.printf("\nPeso: %.2f kg", peso);
            System.out.println("\nAltura: " + altura);
            System.out.printf("IMC: %.2f \nCategoria do IMC: OBESIDADE GRAU II",imc);

        } else if (imc >= 40.0) {
            System.out.print("Nome e idade: " + nome_completo + ", "+idade);
            System.out.printf("\nPeso: %.2f kg", peso);
            System.out.println("\nAltura: " + altura);
            System.out.printf("IMC: %.2f \nCategoria do IMC: OBESIDADE GRAU III",imc);

        }
        else {
            System.out.println("INVÁLIDO!");
        }
        System.out.println("__________________________________________________");

    }
}
