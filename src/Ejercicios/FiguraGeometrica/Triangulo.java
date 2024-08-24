package Ejercicios.FiguraGeometrica;

public class Triangulo {

    private int base = 0;
    private int altura = 0;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public double areaTriangulo(){
        return (base * altura)/2;
    }

    public double perimetroTriangualo(){
        return base + altura + hipotenusaTriangulo();
    }

    public double hipotenusaTriangulo(){
        return Math.pow(base,2) + Math.pow(altura, 2);
    }

    public void tipoTriangulo(){
        if ((base == altura) && (altura == hipotenusaTriangulo()) && (base == hipotenusaTriangulo())){
            System.out.println("TRIANGULO EQUILATERO");
        }else if ((base != altura) || (base != hipotenusaTriangulo()) || (altura != hipotenusaTriangulo())) {
            System.out.println("TRIANGULO ESCALENO");             
        } else {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }

    
}
