package Ejercicios.Persona;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Sharik", "Guzman", 1038434371, 2004, "Colombia", 'H');
        Persona p2 = new Persona("Sharik", "Arroyo", 1038435906, 2002,"Venezuela", 'H');

        p1.imprimir();
        p2.imprimir();
    }
}

