package Ejercicios.CapituloII.ArticuloCientifico;

public class Articulo {
    private String nombreArticulo = null;
    private String autor = null;
    private String[] palabraClave = new String[3];
    private String nombrePublicacion = null;
    private int anno = 0;
    private String resumen = null;

    
    public Articulo(String nombreArticulo, String autor) {
        this.nombreArticulo = nombreArticulo;
        this.autor = autor;
    }


    public Articulo(String nombreArticulo, String autor, String[] palabraClave, String nombrePublicacion, int anno) {
        this(nombreArticulo, autor);
        this.palabraClave = palabraClave;
        this.nombrePublicacion = nombrePublicacion;
        this.anno = anno;
    }


    public Articulo(String nombreArticulo, String autor, String[] palabraClave, String nombrePublicacion, int anno,
            String resumen) {
        this(nombreArticulo, autor, palabraClave, nombrePublicacion, anno);
        this.resumen = resumen;
    }


    public void imprimir(){
        System.out.println("Nombre Articulo = " + nombreArticulo);
        System.out.println("Autor = " + autor);
        System.out.println("Palabras claves = ");

        for (int i = 0; i < palabraClave.length; i++){
            System.out.println(palabraClave[i]);
        }

        System.out.println("Nombre publicacion = " + nombrePublicacion);
        System.out.println("Año = " + anno);
        System.out.println("Resumen = " + resumen);


    }

    
    
}
