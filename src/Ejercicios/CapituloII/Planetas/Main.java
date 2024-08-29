package Ejercicios.CapituloII.Planetas;

import Ejercicios.CapituloII.Planetas.Planetas.TipoPlaneta;

public class Main {
    public static void main(String[] args) {
        Planetas p1 = new Planetas("Tierra", 1,5.9736E24, 1.08321E12, 12742, 150000000, TipoPlaneta.TERRESTRE,true);
        System.out.println();
        System.out.println(p1.toString());
        System.out.println("\nLa dencidad del planeta " + p1.nombre + " es de = " + p1.densidadPlaneta());
        System.out.println("\nEs un planeta exterior = " + p1.exterior());


        Planetas p2 = new Planetas("Jupiter", 79,1.899E27, 1.43131E15, 139820, 750000000, TipoPlaneta.GASEOSO,true);
        System.out.println();
        System.out.println(p2.toString());
        System.out.println("\nLa dencidad del planeta " + p2.nombre + " es de = " + p2.densidadPlaneta());
        System.out.println("\nEs un planeta exterior = " + p2.exterior());
    }
    
}
