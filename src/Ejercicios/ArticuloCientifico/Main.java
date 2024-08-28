package Ejercicios.ArticuloCientifico;

public class Main {
    public static void main(String[] args) {
        String [] palabras = {"Fisica", "Espacio", "Tiempo"};
        Articulo articulo = new Articulo("La teoria espacial de la relatividad", "Albert Einstein", palabras, "Anales de Fisicia", 1913, "Las leyes de la fisica son las mismas en todos los sistemas de referencias iniciales");

        articulo.imprimir();
    }
}
