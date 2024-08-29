package Ejercicios.CapituloII.Imagenes;
public class Cuadrado{
    public static final int SIZE = 9;
    public static void main(String[] args) {
        char matriz [][] = new char[SIZE][SIZE]; //filas/columnas

        llenarMatrizC(matriz);
        mostrarMatrizC(matriz);
    }

    public static void llenarMatrizC (char [][] matriz){
        //LENAR LA MATRIZ
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                if (i == 0 || i == SIZE - 1 || j == 0 || j == SIZE - 1){
                    matriz[i][j] = '*';
                } else {
                    matriz [i][j] = ' ';
                }
            }
        }
    }

    public static void mostrarMatrizC (char [][] matriz){
        //MOSTRAR MATRIZ
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
    
}
