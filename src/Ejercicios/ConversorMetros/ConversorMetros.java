package Ejercicios.ConversorMetros;

public class ConversorMetros {

    private final double centimetros = 100.0;
    private final double milimetros = 1000.0;
    private final double pulgadas = 39.3701;
    private final double pies = 3.28084;
    private final double yardas = 1.09361;
    private double metros = 0;

    public ConversorMetros(double metros) {
        this.metros = metros;
    }

    protected double centimetros(){
        return metros*centimetros;
    }

    protected double milimetros(){
        return metros*milimetros;
    }

    protected double pulgadas(){
        return metros*pulgadas;
    }

    protected double pies(){
        return metros*pies;
    }

    protected double yardas(){
        return metros*yardas;
    }

}
