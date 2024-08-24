package Ejercicios.Pedido;

public class Main {
    public static void main(String[] args) {
        Pedido p1 = new Pedido();
        p1.calcularPedido("Sopa", 6000, "Gaseosa", 3000);

        Pedido p2 = new Pedido();
        p2.calcularPedido("Carpaccio de res", 15000, "Camarones", 40000, "Jugo natural", 12000);

        Pedido p3 = new Pedido();
        p3.calcularPedido("Crema de verduras", 15000, "Salmon", 30000, "Tiramisú", 14000, "Gaseosa", 3000);

    }

    
}
