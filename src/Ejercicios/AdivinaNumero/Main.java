package Ejercicios.AdivinaNumero;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int intentos = 5;
        int aleatorio = random.nextInt(100); 
        boolean op = false;      

        System.out.println("****************ADIVINA EL NUMERO************");

        for (int i = 1; i <=5; i++){
            intentos -= 1;
            System.out.print("Digite un numero = ");
            int num = scanner.nextInt();
            if (num == aleatorio) {
                System.out.println("CORRECTO!!!, EL NUMERO ES = " + aleatorio); 
                op = true;
                break;              
            } else if (aleatorio > num){
                System.out.println("INCONRRECTO!!, EL NUMERO ES MAYOR TE QUEDAN " + intentos + " INTENTOS");
            } else if (aleatorio < num){
                System.out.println("INCONRRECTO!!, EL NUMERO ES MENOR TE QUEDAN " + intentos + " INTENTOS");
            }
        }

        if (!op) {
            System.out.println("EL NUMERO ERA = " + aleatorio);            
        }

    }
    
}
