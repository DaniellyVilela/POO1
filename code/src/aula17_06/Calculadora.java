package aula17_06;

public class Calculadora {
    double a;
    double b;
    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public static void soma(double a, double b){
        double s = a + b;
        System.out.println("Soma: " +s);
    }
    public static void subtracao(double a, double b){
        double s = a - b;
        System.out.println("Subtracao: " +s);
    }
    public static void multiplicacao(double a, double b){
        double s = a * b;
        System.out.println("Multiplicacao: " +s);
    }
    public static void divisao(double a, double b){
        if(b == 0){
            throw new ArithmeticException("\nDivisão por zero não é permitido.");

        }
        else {
            double s = a / b;
            System.out.println("Divisão: "+s);
        }
    }

    public static void main(String[] args) {
        Calculadora.soma(10,5);
        Calculadora.subtracao(10,5);
        Calculadora.multiplicacao(10,5);
        Calculadora.divisao(10,5);
        Calculadora.divisao(10,0);

    }
}
