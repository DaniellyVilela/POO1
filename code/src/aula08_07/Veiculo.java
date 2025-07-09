package aula08_07;

public class Veiculo {
    String marca;
    String modelo;
    int ano;
    public void ligar(){
        System.out.println("Ligado");
    }
    public void exibi_relatorio(){
        System.out.println("marca:"+marca);
        System.out.println("modelo:"+modelo);
        System.out.println("ano:"+ano);
    }

}
