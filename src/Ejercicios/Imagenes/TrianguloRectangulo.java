package Ejercicios.Imagenes;
public class TrianguloRectangulo {
    public static final int SIZE = 9;

    public static void main(String[] args) {
        char [][] matriz = new char[SIZE][SIZE];

        llenarMatrizT(matriz);
        mostrarMatrizT(matriz);
        
    }

    public static void llenarMatrizT (char [][] matriz){
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

    public static void mostrarMatrizT (char [][] matriz){
        //MOSTRAR MATRIZ
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
    
}
