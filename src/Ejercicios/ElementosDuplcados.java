package Ejercicios;
import java.util.Scanner;

public class ElementosDuplcados{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] array = {1, 2, 2, 4, 1, 4, 5};   

        System.out.println("Elementos del array");
        for (int i = 0; i < array.length; i++){
            System.out.println("Elemento ["+ i +"]" + " = " + array[i]);
        }

        Duplicado(array);
        MayorMenor(array);
        Buscar(array, 7);
        ObjetosDuplicados(array);
    }

    //Detecta cuales son los elementos dupliicados en un array
    public static void Duplicado(int array[]){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i+1; j < array.length; j++){
                if ((array[i] == array[j]) && i != j) {
                    System.out.println("Elemento duplicado = " + array[j]);
                }
            }
        }
    }

    //Determina cual es el numero mayor y menor 
    public static void MayorMenor (int array[]){
        int menor = 0;
        int mayor = 0;
        
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i+1; j < array.length; j++){
                if (((menor == 0) || (array[i] < menor)) && i != j) {
                    menor = array[j];
                } else if ((array[i] < array[j]) && i != j) {
                    mayor = array[j];
                }
            }
        } 
        
        System.out.println("Numero menor = " + menor);
        System.out.println("Numero mayor = " + mayor);
    }

    //Buscar un numero
    public static void Buscar(int array[], int num){
        boolean flag = false;
        for(int i = 0; i < array.length; i++){
            if (array[i] == num) {
                flag = true;
                break;
            }
        }

        if (!flag){
            System.out.println("El numero " + num + " no se encuentra en el vector");
        } else {
            System.out.println("El numero " + num + " se encuentra en el vector");
        }
    }


    //Busca elementos duplicados en dos arrays
    public static void ObjetosDuplicados (int array[]){
        int[] array1 = {11, 2, 5, 9, 4, 3, 2};


        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array1.length; j++){
                if (array[i] == array1[j]) {
                    System.out.println("Elemento duplicado = " + array[i]);
                }
            }
        }
    }

    
}