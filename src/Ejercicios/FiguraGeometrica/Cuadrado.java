package Ejercicios.FiguraGeometrica;

public class Cuadrado {
    int lado = 0;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public double areaCuadrado(){
        return Math.pow(this.lado, 2);

    }

    public int perimetroCuadrado(){
        return 4 * this.lado;
    }
    
}
