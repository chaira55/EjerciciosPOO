package Ejercicios.Pelicula;

public class Pelicula {
    private String nombre = null;
    private String director = null;
    private genero genero;
    private int duracion = 0;
    private int anno = 0;
    private double calificacion = 0;




    public Pelicula(String nombre, String director, Ejercicios.Pelicula.Pelicula.genero genero, int duracion, int anno,
            double calificacion) {
        this.nombre = nombre;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.anno = anno;
        this.calificacion = calificacion;
    }

    
    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    private void setDirector(String director) {
        this.director = director;
    }

    public genero getGenero() {
        return genero;
    }

    private void setGenero(genero genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    private void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAnno() {
        return anno;
    }

    private void setAnno(int anno) {
        this.anno = anno;
    }

    public double getCalificacion() {
        return calificacion;
    }

    private void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }


    protected boolean esPeliculaEpica(){
        if (duracion >= 180) {
            return true;
        } else{
            return false;
        }
    }

    protected String calcularValoracion(){
        if (calificacion <= 2 ) {
            return "Muy mala";
        } else if (calificacion > 2 && calificacion <= 5) {
            return "Mala";
        } else if (calificacion > 5 && calificacion <= 7) {
            return "Regular";
        } else if (calificacion > 7 && calificacion <= 8) {
            return "Buena";
        } else if (calificacion > 8 && calificacion <= 10) {
            return "Excelente";
        } else{
            return "No tiene asignada una valoracion valida";
        }
    }

    protected boolean esSimilar(Pelicula peliculaAnterior){
        if (genero == peliculaAnterior.genero && calcularValoracion() == peliculaAnterior.calcularValoracion()) {
            return true;
        } else{
            return false;
        }
    }


    public void mostrarCartel(){
        System.out.println("--------------- " + nombre + " ---------------");
        for(int i = 0; i < calificacion; i++){
            System.out.print("*");
        }
        System.out.println();
        System.out.println(anno);
        System.out.println("Genero 1 = " + genero.DRAMA + ", Genero 2 = " + genero.COMEDIA + ", Genero 3 = " + genero.ACCION);
        System.out.println(director);
    }
    

    @Override
    public String toString() {
        return "Pelicula [Nombre = " + nombre + ", Director = " + director + ", Genero = " + genero + ", Duracion = " + duracion
                + ", Año = " + anno + ", Calificacion = " + calificacion + "]";
    }

    enum genero{
        ACCION,
        COMEDIA,
        DRAMA,
        SUSPENSO
    }
    
}
