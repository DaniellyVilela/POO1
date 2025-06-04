package aula03_06;

public class Passagem {
    String nomePassageiro;
    int Km;
    String classe;
    double preco;

    public Passagem(String nomePassageiro, int Km, String classe) {
        this.nomePassageiro = nomePassageiro;
        this.Km = Km;
        this.classe = classe;
    }
    double calculaValor(String escolha,int Km){
        if(escolha.equals("Economico") ){
             preco = Km * 0.50;
            System.out.printf("Valor: %.2f",preco);

        }
        else if(escolha.equals("Executiva")){
            preco = Km * 0.75;
            System.out.printf("Valor: %.2f",preco);
        }
        else if(escolha.equals("Primeira")){
            preco = Km * 1.00;
            System.out.printf("Valor: %.2f",preco);

        }
        return preco;
    }

    void exibiResumo(Passagem p){
        System.out.println("Nome: " + p.nomePassageiro);
        System.out.println("Distância: " + p.Km);
        System.out.println("Classe: " + p.classe);
        calculaValor(p.classe, p.Km);
    }

    boolean compara(Passagem outraPas){
        System.out.println("Preço p1: "+preco);
        System.out.println("Preço p2: "+outraPas.preco);
        if( preco > outraPas.preco ){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Passagem p1 = new Passagem("Lucas", 300, "Executiva");
        p1.exibiResumo(p1);
        System.out.println("\n_________________________");
        Passagem p2 = new Passagem("Felipe", 50, "Primeira");
        p2.exibiResumo(p2);
        System.out.println("\nValor de p1 é maior que p2? "+p1.compara(p2));


    }

}
