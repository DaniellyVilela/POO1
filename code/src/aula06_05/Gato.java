package aula06_05;
//Explicação de metodo e exemplo

public class Gato {

    //Atributo ↓
    String nome;

    //Metodo sem parametro ↓
    void emitirSom() { //metodo sempre utiliza o ComeCase e a primeira letra tem que ser minuscula. OBS: Paramento é o que esta sendo passado no parentese
        System.out.println("MIAUUUU!");
    }

    //Metodo com parametro ↓
    void idadeGato( int idade) {
        System.out.println("Idade: " + idade);

    }

    //Principal ↓
    public static void main(String[] args) {
        Gato cat = new Gato();
        cat.emitirSom();
        cat.nome = "Romeu";
        System.out.println("Nome: "+cat.nome);
        cat.idadeGato(18); //Aqui você já tem que passa resultado dentro d parantese, exemplo as criações de funções do python, onde para criar uma funçõa as vezes é necessario passa parametros ou não, apenas chamar a função

    }
}
