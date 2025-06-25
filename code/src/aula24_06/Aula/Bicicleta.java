package aula24_06.Aula;

public class Bicicleta {
    private String modelo;
    private int capBateria;
    private int nivelBateria;
    private double automiaTotal;
    private double distanciaPercorrida;

    public String getModelo() {
        return modelo;
    }
    public int getCapBateria() {
        return capBateria;
    }
    public int getNivelBateria() {
        return nivelBateria;
    }
    public double getAutomataTotal() {
        return automiaTotal;
    }
    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    void setModelo(String modelo) {
        if(modelo == null || modelo.isEmpty()){
            this.modelo = modelo;
        }
        else{
            System.out.println("Digite um modelo válido!");
        }

    }
    void setCapBateria(int capBateria) {
        if (capBateria <= 1 || capBateria >= 100) {
            this.capBateria = capBateria;
        }
        else{
            System.out.println("Batéria invalida!");
        }
    }

    void setNivelBateria(int nivelBateria) {
        if (nivelBateria <= 1 || nivelBateria >= 100) {

        }
    }
}
