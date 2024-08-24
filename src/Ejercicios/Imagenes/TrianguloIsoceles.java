package Ejercicios.Imagenes;

public class TrianguloIsoceles {
    public static final int SIZE = 9;
    public static void main(String[] args) {
        char [][] matriz = new char[SIZE][SIZE];

        llenarMatrizI(matriz);
        mostrarMatrizI(matriz);
    }


    public static void llenarMatrizI (char [][] matriz){
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                if (i >= j) {
                    matriz[i][j] = '*';
                } else {
                    matriz[i][j] = ' ';
                }
            }
        }
    }

    public static void mostrarMatrizI (char [][] matriz){
        //MOSTRAR MATRIZ
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
    
}
