package Ejercicios.CapituloII.Pedido;

public class Pedido {

    protected void calcularPedido(String primerPlato, int costoPrimerPlato, String bebida, int costoBebida){
        int total = costoPrimerPlato + costoBebida;
        System.out.println("EL costo de " + primerPlato + " + el costo de la bebida " + bebida + " es de un total de = " + total);
    }

    protected void calcularPedido(String primerPlato, int costoPrimerPlato, String segundoPlato, int costoSegundoPlato, String bebida, int costoBebida){
        int total = costoPrimerPlato + costoSegundoPlato + costoBebida;
        System.out.println("EL costo de " + primerPlato + " + el costo del seguno plato " + segundoPlato + " + el costo de la bebida " + bebida + " es de un total de = " + total);
    }
    
    protected void calcularPedido(String primerPlato, int costoPrimerPlato, String segundoPlato, int costoSegundoPlato, String bebida, int costoBebida, String postre, int costoPostre){
        int total = costoPrimerPlato + costoSegundoPlato + costoBebida + costoPostre;
        System.out.println("EL costo de " + primerPlato + " + el costo del seguno plato " + segundoPlato + " + el costo de la bebida " + bebida + " + el costo del postre " + postre + "  es de un total de = " + total);
    }
}
