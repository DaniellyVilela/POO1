package aula03_06;

public class Funcionario {
    double salario;
    double diferencaSalarial(Funcionario f, double meuSalario){
        double diferenca;
        if (meuSalario >= f.salario){
             diferenca = meuSalario - f.salario;
        }
        else {
             diferenca = f.salario - meuSalario;
        }
        return diferenca;
    }

    public static void main(String[] args) {
        Funcionario davi = new Funcionario();
        Funcionario lucas = new Funcionario();
        davi.salario = 2000;
        lucas.salario = 1000;
    System.out.print("Diferença: "+davi.diferencaSalarial(lucas,davi.salario));
    }
}
