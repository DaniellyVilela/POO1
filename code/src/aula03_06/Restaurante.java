package aula03_06;


public class Restaurante {
    String nome;
    String cidade;
    double nota1;
    double nota3;
    double nota2;

    public Restaurante(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;

    }
    public Restaurante(String nome, String cidade, double nota1, double nota2, double nota3){
        this.nome = nome;
        this.cidade = cidade;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }


    double Media() {
        double total = (nota1 + nota2 + nota3) / 3;
        return total;
    }
    void AtualizaNotas(int escolha,double notaNova) {
        if (escolha == 1) {
            nota1 = notaNova;
        } else if (escolha == 2) {
            nota2 = notaNova;
        } else if (escolha == 3) {
            nota3 = notaNova;
        } else {
            System.out.println("Erro ao atualizar notas!Digite um número entre 1 a 3.");
        }
    }
   void ExibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Cidade: " + cidade);
       System.out.printf("Media: " + Media());
   }

   boolean estaAprovado(){
        if(Media()>=7){
            return true;
        }
        else{
            return false;
        }}

    Restaurante clonar(Restaurante r2){
        System.out.println("Nome: " + r2.nome);
        System.out.println("Cidade: " + r2.cidade);
        System.out.printf("Notas: %.2f, %.2f, %.2f \n",r2.nota1,r2.nota2,r2.nota3);
        System.out.printf("Media: %.2f \n" + Media());

        return r2;
    }

    public static void main(String[] args) {
        Restaurante r1 = new Restaurante("Sabor Goiano","Uruaçu",8.5,9.0,7.5);
        r1.ExibirDados();
        System.out.printf("\nNotas: %.2f, %.2f, %.2f",r1.nota1,r1.nota2,r1.nota3);
        System.out.println("Notas Atualizadas!");
        r1.AtualizaNotas(2,6.5);
        System.out.println("Média Atualizada: " + r1.Media());
        System.out.printf("\nNotas: %.2f, %.2f, %.2f",r1.nota1,r1.nota2,r1.nota3);
        System.out.println("\nAprovado? "+r1.estaAprovado());
        System.out.println("______________________________________________");
        Restaurante r2 = new Restaurante("Teste","Anapolis",8.6,5.6,7.5);
        r2.ExibirDados();


        
    }

}
