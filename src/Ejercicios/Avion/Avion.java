package Ejercicios.Avion;

public class Avion {
    private String nombreFabricante = null;
    private int numMotores = 0;


    protected Avion(String nombreFabricante, int numMotores) {
        this.nombreFabricante = nombreFabricante;
        this.numMotores = numMotores;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    public int getNumMotores() {
        return numMotores;
    }

    public void setNumMotores(int numMotores) {
        this.numMotores = numMotores;
    }

    public void cambiarFafricante(Avion a){
        a.setNombreFabricante("Loockhead");
    }


    @Override
    public String toString() {
        return "Avion [ Nombre Fabricante = " + nombreFabricante + " ]";
    }

    
    
    
    
}
