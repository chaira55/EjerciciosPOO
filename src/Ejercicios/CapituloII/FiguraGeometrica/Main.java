package Ejercicios.CapituloII.FiguraGeometrica;

public class Main {
    public static void main(String args[]) {

        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1,2);
        Cuadrado figura3 = new Cuadrado(3);
        Triangulo figura4 = new Triangulo(1,5);
        System.out.println("El área del círculo es = " + figura1.areaCirculo());
        System.out.println("El perímetro del círculo es = " + figura1.perimetroCirculo());
        System.out.println();
        System.out.println("El área del rectángulo es = " + figura2.areaRectangulo());
        System.out.println("El perímetro del rectángulo es = " + figura2.perimetroRectangulo());
        System.out.println();
        System.out.println("El área del cuadrado es = " + figura3.areaCuadrado());
        System.out.println("El perímetro del cuadrado es = " + figura3.perimetroCuadrado());
        System.out.println();
        System.out.println("El área del triángulo es = " + figura4.areaTriangulo());
        System.out.println("El perímetro del triángulo es = " + figura4.perimetroTriangualo());
        figura4.tipoTriangulo();
    }
}
