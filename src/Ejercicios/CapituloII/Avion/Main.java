package Ejercicios.CapituloII.Avion;

public class Main {
    public static void main(String[] args) {
        Avion a = new Avion("Airbus", 4);
        Avion b;
        Avion c = new Avion("Loockhead", 4);

        b = a;
        
        System.out.println(a.toString());
        System.out.println(b.toString());

        a.setNombreFabricante("Douglas");

        System.out.println(a.toString());
        System.out.println(b.toString());

        a.cambiarFafricante(a);

        System.out.println(b.toString());


    }
    
}
