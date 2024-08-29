package Ejercicios.CapituloII.Planetas;

public class Planetas {
    public String nombre = null;
    private int cantSatelites = 0;
    private double masa = 0;
    private double volumen = 0;
    private int diametro = 0;
    private int distanciaSol = 0;
    private TipoPlaneta tipo;
    private boolean observable = false;


    public Planetas(String nombre, int cantSatelites, double masa, double volumen, int diametro, int distanciaSol,
            TipoPlaneta tipo, boolean observable) {
        this.nombre = nombre;
        this.cantSatelites = cantSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.observable = observable;
    }

    public enum TipoPlaneta{
        GASEOSO,
        TERRESTRE,
        ENENO 
    }

    public double densidadPlaneta(){
        return this.masa/this.volumen;
    }

    public boolean exterior(){
        if (distanciaSol > (149597870*3.4)){
            return true;
        } else {
            return false;
        }
    }


    @Override
    public String toString() {
        return "Planetas [NOMMBRE = " + nombre + ", CANTIDAD DE SATELITES = " + cantSatelites + ", MASA = " + masa + ", VOLUMEN = "
                + volumen + ", DIAMETRO = " + diametro + ", DISTANCIA = " + distanciaSol + ", TIPO = " + tipo + ", OBSERVABLE = "
                + observable + "]";
    }


    


    
}

