package atividadeCasa;

public class Bike {
    private String modelo;
    private int capBateria = 100;
    private int nivelBateria;
    private double autonomiaTotal;
    private double distanciaPercorrida;

    public String getModelo(){
        return modelo;
    }
    public int getCapBateria(){
        return capBateria;
    }
    public int getNivelBateria(){
        return nivelBateria;
    }
    public double getAutonomiaTotal(){
        return autonomiaTotal;
    }
    public  double getDistanciaPercorrida(){
        return distanciaPercorrida;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }
     void setCapBateria(int capBateria){
        this.capBateria = capBateria;
    }
     void setNivelBateria(int nivelBateria){
        this.nivelBateria = nivelBateria;
    }
     void setAutonomiaTotal(double autonomiaTotal){
        this.autonomiaTotal = autonomiaTotal;
    }
     void setDistanciaPercorrida(double distanciaPercorrida){
        this.distanciaPercorrida = distanciaPercorrida;
    }
    public double restanteBat(){
        return (nivelBateria/100.0)*autonomiaTotal;
    }

    void registro(double distancia){
        distanciaPercorrida += distancia;
        double km = autonomiaTotal / 100;
        int bateriaFinal = (int)(distancia / km);
        nivelBateria -= bateriaFinal;
        if(nivelBateria == 0 ){
            System.out.println("Sua Bateria chegou ao final!");
        }
    }
    public void exibirRelatorio() {
        System.out.println("=== RELATÓRIO DA BICICLETA ELÉTRICA === ");
        System.out.println("____________________________________________________");
        System.out.println("\nModelo: " + modelo);
        System.out.println("\nCapacidade da bateria: " + capBateria + "%");
        System.out.println("\nNível atual da bateria: " + nivelBateria + "%");
        System.out.printf("\nAutonomia total: %.2f km\n", autonomiaTotal);
        System.out.printf("\nAutonomia restante: %.2f km\n", restanteBat());
        System.out.printf("\nDistância percorrida hoje: %.2f km\n", distanciaPercorrida);
        System.out.println("____________________________________________________");

    }

    public static void main(String[] args) {
        Bike b = new Bike();
        b.setModelo("EcoRide X200");
        b.setNivelBateria(80);
        b.setAutonomiaTotal(60.0);
        b.registro(15.0);
        b.exibirRelatorio();

        System.out.println("____________________________________");

        Bike b2 = new Bike();
        b2.setModelo("PowerBike 3000");
        b2.setNivelBateria(60);
        b2.setAutonomiaTotal(80.0);

        b2.registro(20.0);
        b2.exibirRelatorio();

    }

}
