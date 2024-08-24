package Ejercicios.ConversorMetros;

public class Main {
    public static void main(String[] args) {
        ConversorMetros a = new ConversorMetros(3.5);
        System.out.println(a.centimetros());
        System.out.println(a.milimetros());
        System.out.println(a.pulgadas());
        System.out.println(a.pies());
        System.out.println(a.yardas());
    }
    
}
