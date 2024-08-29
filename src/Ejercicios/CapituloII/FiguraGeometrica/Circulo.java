package Ejercicios.CapituloII.FiguraGeometrica;

public class Circulo {
    private final double pi = 3.141516;
    private double radio = 0;

    
    Circulo(double radio){
        this.radio = radio;
    }

    public double areaCirculo(){
        return pi * Math.pow(this.radio,2);
    }

    public double perimetroCirculo (){
        return 2 * pi * this.radio;    
    }

}
