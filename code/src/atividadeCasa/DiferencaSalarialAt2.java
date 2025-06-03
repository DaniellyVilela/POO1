package atividadeCasa;

public class DiferencaSalarialAt2 {
    double salario;

    void funcionario(double salario1, double salario2) {
        double salario3 = salario1 - salario2;

        if(salario1 > 0) {
            double salario4 = salario3 * (-1);
            System.out.printf("A diferença salarial: R$%.2f\n", salario4);

        }
        else {
            System.out.printf("A diferença salarial R$%.2f\n", salario3);
        }
    }
    public static void main(String[] args) {
        DiferencaSalarialAt2 joao = new DiferencaSalarialAt2();
        DiferencaSalarialAt2 maria = new DiferencaSalarialAt2();
        DiferencaSalarialAt2 total = new DiferencaSalarialAt2();

        joao.salario = 3000;
        maria.salario = 3500;

        total.funcionario(joao.salario, maria.salario);
    }
}
