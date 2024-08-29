package Ejercicios.CapituloII.OperacionesMatematicas;
public class Operaciones {

    public static double Sumar (double num1, double num2){
        return num1 + num2;
    }
    
    public static double Restar (double num1, double num2){
        if (num1 > num2) {
            return num1 - num2;   
        } else{
            System.err.println("Error!, el primer numero debe ser mayor al segundo");
        }
        return Double.NaN;
    }

    public static double Multiplicar (double num1, double num2){
        return num1 * num2;
    }

    public static double Division (double num1, double num2){
        if (num2 != 0){
            return num1 / num2;
        } else {
            System.err.println("Error!, el numero debe ser diferente a 0");
        }
        return Double.NaN;
    }

    public static double Potencia (double num1, double num2){
        return Math.pow(num1, num2);
    }

    public static double RaizCuadrada (double num1){
        if (num1 != 0) {
            return Math.sqrt(num1);  
        } else {
            System.err.println("Error!, el numero no puede ser 0");
        }
        return Double.NaN;
    }
    public static double RaizCubica (double num1){
        if (num1 != 0) {
            return Math.cbrt(num1);  
        } else {
            System.err.println("Error!, el numero no puede ser 0");
        }
        return Double.NaN;    
    }
}

