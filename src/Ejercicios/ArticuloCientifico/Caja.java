package Ejercicios.ArticuloCientifico;

public class Caja {
    private int longitud = 0;
    private int base = 0;
    private int anchura = 0;
    private int altura = 0;
    private TipoCaja tipo;


    public Caja(int base, int anchura, int altura) {
        this.base = base;
        this.anchura = anchura;
        this.altura = altura;
    }

    public Caja() {
        this.base = 0;
        this.anchura = 0;
        this.altura = 0;
    }

    public Caja(int longitud) {
        this.base = longitud;
        this.anchura = longitud;
        this.altura = longitud;
    }


    public Caja(int base, int anchura, int altura, TipoCaja tipo) {
        this(base, anchura, altura);
        this.tipo = tipo;
    }

    enum TipoCaja{
        CUADRADA,
        RECTANGULAR
    }

    
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public TipoCaja getTipo() {
        return tipo;
    }

    public void setTipo(TipoCaja tipo) {
        this.tipo = tipo;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    
    
}
