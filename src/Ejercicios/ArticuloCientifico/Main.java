package Ejercicios.ArticuloCientifico;

import Ejercicios.ArticuloCientifico.Caja.TipoCaja;

public class Main {
    public static void main(String[] args) {
        String [] palabras = {"Fisica", "Espacio", "Tiempo"};
        Articulo articulo = new Articulo("La teoria espacial de la relatividad", "Albert Einstein", palabras, "Anales de Fisicia", 1913, "Las leyes de la fisica son las mismas en todos los sistemas de referencias iniciales");

        articulo.imprimir();

        Empleado empleado1 = new Empleado();
        System.out.println("Empleado 1:");
        System.out.println("ID: " + empleado1.getIdEmpleado());
        System.out.println("Nombre: " + empleado1.getNombreEmpleado());
        System.out.println("Apellidos: " + empleado1.getApellidoEmpleado());
        System.out.println("Edad: " + empleado1.getEdadEmpleado());

        // Crear un empleado utilizando el segundo constructor (con parámetros)
        Empleado empleado2 = new Empleado(101, "Sharik", "González", 25);
        System.out.println("\nEmpleado 2:");
        System.out.println("ID: " + empleado2.getIdEmpleado());
        System.out.println("Nombre: " + empleado2.getNombreEmpleado());
        System.out.println("Apellidos: " + empleado2.getApellidoEmpleado());
        System.out.println("Edad: " + empleado2.getEdadEmpleado());

        // Probando la clase Caja

        // Crear una caja utilizando el primer constructor (con parámetros)
        Caja caja1 = new Caja(10, 20, 30);
        System.out.println("\nCaja 1:");
        System.out.println("Longitud: " + caja1.getLongitud());
        System.out.println("Anchura: " + caja1.getAnchura());
        System.out.println("Altura: " + caja1.getAltura());
        System.out.println("Tipo: " + caja1.getTipo());

        // Crear una caja utilizando el segundo constructor (sin parámetros)
        Caja caja2 = new Caja();
        System.out.println("\nCaja 2:");
        System.out.println("Longitud: " + caja2.getLongitud());
        System.out.println("Anchura: " + caja2.getAnchura());
        System.out.println("Altura: " + caja2.getAltura());
        System.out.println("Tipo: " + caja2.getTipo());

        // Crear una caja utilizando el tercer constructor (un solo parámetro)
        Caja caja3 = new Caja(15);
        System.out.println("\nCaja 3:");
        System.out.println("Longitud: " + caja3.getLongitud());
        System.out.println("Anchura: " + caja3.getAnchura());
        System.out.println("Altura: " + caja3.getAltura());
        System.out.println("Tipo: " + caja3.getTipo());

        // Crear una caja utilizando el cuarto constructor (con el tipo de caja)
        Caja caja4 = new Caja(5, 10, 15, TipoCaja.CUADRADA);
        System.out.println("\nCaja 4:");
        System.out.println("Longitud: " + caja4.getLongitud());
        System.out.println("Anchura: " + caja4.getAnchura());
        System.out.println("Altura: " + caja4.getAltura());
        System.out.println("Tipo: " + caja4.getTipo());

    }
}
