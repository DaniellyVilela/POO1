package aula27_05;

public class Triangulo {
    double ladoA;
    double ladoB;
    double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    boolean validaTriangulo() {
        if ((ladoA + ladoB > ladoC) && (ladoA+ladoC > ladoB) && (ladoB + ladoC > ladoA)) {
            return true;
        }
        else {
            return false;
        }
    }
    double calculaArea() {
        double p = (ladoA + ladoB + ladoC) /2;
        double area = Math.sqrt(p*(p-ladoA)*
                (p-ladoB)*(p-ladoC));
        return area;
    }

    public static void main(String[] args) {
        Triangulo x = new Triangulo(3.0, 4.0, 5.0);
        Triangulo y = new Triangulo(7.5, 7.0, 5.0);

        if (x.validaTriangulo() && y.validaTriangulo()) {
            System.out.printf("Área do Triangulo x: %.2f \n", x.calculaArea());
            System.out.printf("Área do Triangulo Y: %.2f \n", y.calculaArea());
        }
        else {
            System.out.print("Nothing...");
        }
    }
}
