package Ejercicios.OperacionesMatematicas;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int op = 0;
        double num1 = 0;
        double num2 = 0;


        do{
            System.out.println("Elija una opción:\n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\n5. Elevacion\n6. Raiz cuadrada\n7. Raiz cubica\n8. Salir");
            op = scanner.nextInt();

            if (op == 8){
                System.err.println("**********Saliendo del sistema*****************");
                break;
            }

            System.err.println("Digite el primer numero: ");
            num1 = scanner.nextDouble();
            System.err.println("Digite el segundo numero: ");
            num2 = scanner.nextDouble();

            switch (op) {
                case 1:
                    System.err.println("SUMA = " + Operaciones.Sumar(num1, num2));
                    break;  
                case 2:
                    System.err.println("RESTA = " + Operaciones.Restar(num1, num2));
                    break;
                case 3: 
                    System.err.println("MULTIPLICACION = "  + Operaciones.Multiplicar(num1, num2));
                    break;
                case 4: 
                    System.err.println("DIVISION = " + Operaciones.Division(num1, num2));
                    break;
                case 5:
                    System.err.println("ELEVACION = " + Operaciones.Potencia(num1, num2));
                    break;
                case 6:
                    System.err.println("RAIZ CUADRADA DE " + num1 + " = " + Operaciones.RaizCuadrada(num1));
                    break;
                case 7:
                    System.err.println("RAIZ CUBUCA DE " + num1 + " = " + Operaciones.RaizCubica(num1));
                    break;

                default:
                System.out.println("Opcion invalida!!");
                    break;
            }

        } while (op != 8);
        
        scanner.close();
    }
}
