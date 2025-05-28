package aula27_05;

public class Agua {
    String identifica;
    double capTotal;
    double volAtual;


    public Agua(String identifica,double capTotal,double volAtual){
        this.identifica = identifica;
        this.capTotal = capTotal;
        this.volAtual = volAtual;
    }

    double percentualOcupado(){
        double form = (volAtual / capTotal) * 100 ;
        return form;
    }

    double voulmeRestante(){
        return capTotal - volAtual;
    }

    double estimaDuracao(double consumoDiario){
        return volAtual / consumoDiario;
    }

    void exibiRelatorio(double consumoDiario){
        System.out.printf("Tanque: %s\n",identifica);
        System.out.printf("Capacidade Total: %.2f\n",capTotal);
        System.out.printf("Volume Atual: %.2f\n",volAtual);
        System.out.printf("Percentual ocupado: %.2f%%\n", percentualOcupado());
        System.out.printf("Volume restante: %.2f%%\n", voulmeRestante());
        System.out.printf("Consumo diario Estimado: %.2f Litros por dia\n",consumoDiario);
        System.out.printf("Estimativa de Duracao: %.2f dias\n", estimaDuracao(consumoDiario));
    }

    public static void main(String[] args) {
        Agua t = new Agua("Caixa Principal", 1000,650);

        t.exibiRelatorio(130);


    }
}
