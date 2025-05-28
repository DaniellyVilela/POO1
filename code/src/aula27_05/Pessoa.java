package aula27_05;

public class Pessoa {
    double peso;
    double altura;



    double calcularIMC(double peso, double altura) {
        double imc = peso / (altura * altura);
        return imc;
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        System.out.printf("IMC: %.2f\n", p.calcularIMC(p.peso, p.altura));
    }

}
