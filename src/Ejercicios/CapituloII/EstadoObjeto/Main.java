package Ejercicios.CapituloII.EstadoObjeto;

import Ejercicios.CapituloII.EstadoObjeto.Automovil.ColorAutomovil;
import Ejercicios.CapituloII.EstadoObjeto.Automovil.TipoAutomovil;
import Ejercicios.CapituloII.EstadoObjeto.Automovil.TipoCombustible;

public class Main {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Ford", 2018, 3, TipoCombustible.DIESEL, TipoAutomovil.FAMILIAR, 5, 6, 250, ColorAutomovil.NEGRO, true);

        System.out.println(auto1.toString());

        auto1.setVelocidadActual(100);
        System.out.println("VELOCIDAD ACTUAL = " + auto1.getVelocidadActual());
        auto1.Acelerar(20);
        System.out.println("VELOCIDAD ACTUAL = " + auto1.getVelocidadActual());
        auto1.desAcelerar(50);
        System.out.println("VELOCIDAD ACTUAL = " + auto1.getVelocidadActual());
        auto1.Acelerar(200);
        auto1.tieneMulta();
        auto1.valorMulta();
        System.out.println("VELOCIDAD ACTUAL = " + auto1.getVelocidadActual());
        auto1.Acelerar(200);
        auto1.tieneMulta();
        auto1.valorMulta();
        System.out.println("TIEMPO ESTIMADO = " + auto1.tiempoEstimado(40));
        System.out.println("VELOCIDAD ACTUAL = " + auto1.getVelocidadActual());
        auto1.frenar();
        System.out.println("VELOCIDAD ACTUAL = " + auto1.getVelocidadActual());
        System.out.println("TIEMPO ESTIMADO = " + auto1.tiempoEstimado(40));

    }
    
}
