package Ejercicios.CapituloII.Pelicula;

import Ejercicios.CapituloII.Pelicula.Pelicula.genero;

public class Main {
    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula("Gandhi", "Richard Attendborough", genero.DRAMA, 191, 1982, 8.1);
        Pelicula pelicula2 = new Pelicula("Thor", "Kenneth Branagh", genero.ACCION, 115, 2011, 7.0);

        System.out.println(pelicula1.toString());
        System.out.println(pelicula2.toString());

        System.out.println("La pelicula " + pelicula1.getNombre() + " es epica = " + pelicula1.esPeliculaEpica());
        System.out.println("La pelicula "  + pelicula2.getNombre() + " es epica = " + pelicula2.esPeliculaEpica());

        System.out.println("La pelicula " + pelicula1.getNombre() + " tiene una valoracion = " + pelicula1.calcularValoracion());
        System.out.println("La pelicula "  + pelicula2.getNombre() + " tiene una valoracion = " + pelicula2.calcularValoracion());

        System.out.println("La pelicula " + pelicula1.getNombre() + " es similar a " + pelicula2.getNombre() + " = " + pelicula1.esSimilar(pelicula2));

        pelicula1.mostrarCartel();
        pelicula2.mostrarCartel();

    }
    
}
