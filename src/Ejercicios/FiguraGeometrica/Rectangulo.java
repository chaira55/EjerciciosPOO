package Ejercicios.FiguraGeometrica;

public class Rectangulo {

    int base = 0;
    int altura = 0;
    
    Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public int areaRectangulo(){
        return this.base * this.altura;
    }

    public int perimetroRectangulo(){
        return 2 * (this.base + this.altura);
    }
}
