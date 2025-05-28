package aula27_05;

import java.util.Scanner;

public class Eletrodomestico {
    String nome;
    double potencia;
    double horasPorDia;

    public Eletrodomestico(String nome, double potencia, double horasPorDia) {
        this.nome = nome;
        this.potencia = potencia;
        this.horasPorDia = horasPorDia;
    }

    double wattsDia(){
        return horasPorDia * potencia;
    }

    double wattsMes(){
        return wattsDia() * 30;
    }

    double wattsAno(){
        return wattsMes() * 12;
    }
    double gastoMensal(double precoKwatt){
        return (wattsMes() / 1000) * precoKwatt;
    }

    void exibiRelatorio( double precoKwatt){
        System.out.printf("Eletrodomestico: %s\n", nome);
        System.out.printf("Potência do aparelho: P= %.2f\n", potencia);
        System.out.printf("Tempo de utilização diária: %.2f horas/dias\n", horasPorDia);
        System.out.printf("Consumo diario: %.2f\n", wattsDia());
        System.out.printf("Consumo mensal: %.2f\n", wattsMes());
        System.out.printf("Consumo ano: %.2f\n", wattsAno());
        System.out.printf("Preco do Kwatt: %.2f\n", precoKwatt);
        System.out.printf("Gasto mensal estimado: %.2f\n", gastoMensal(precoKwatt));

    }

    public static void main(String[] args) {
        Eletrodomestico e =  new Eletrodomestico("Telefone sem Fio",3.0,24.0);
        e.exibiRelatorio(0.27);
    }
}
