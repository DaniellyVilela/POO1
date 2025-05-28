package atividadeCasa;

public class Doisatividade27_05 {
    double salario;

    void funcionario(double salario1, double salario2) {
        double salario3 = salario1 - salario2;

        if(salario1 > 0) {
            double salario4 = salario3 * (-1);
            System.out.printf("A diferença salarial: R$%.2f\n", salario4);

        }
        else {
            System.out.printf("A diferença salarial: R$%.2f\n", salario3);
        }
    }
    public static void main(String[] args) {
        Doisatividade27_05 joao = new Doisatividade27_05();
        Doisatividade27_05 maria = new Doisatividade27_05();
        Doisatividade27_05 total = new Doisatividade27_05();

        joao.salario = 3000;
        maria.salario = 3500;

        total.funcionario(joao.salario, maria.salario);
    }
}
