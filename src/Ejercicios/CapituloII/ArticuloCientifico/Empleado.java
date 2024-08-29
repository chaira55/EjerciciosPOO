package Ejercicios.CapituloII.ArticuloCientifico;

public class Empleado {
    private int idEmpleado = 0;
    private String nombreEmpleado = null;
    private String apellidoEmpleado = null;
    private int edadEmpleado = 0;
    
    
    public Empleado() {
        this.idEmpleado = 100;
        this.nombreEmpleado = "Nuevo empleado";
        this.apellidoEmpleado = "Nuevo empleado";
        this.edadEmpleado = 18;
    }


    public Empleado(int idEmpleado, String nombreEmpleado, String apellidoEmpleado, int edadEmpleado) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.edadEmpleado = edadEmpleado;
    }


    public int getIdEmpleado() {
        return idEmpleado;
    }


    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }


    public String getNombreEmpleado() {
        return nombreEmpleado;
    }


    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }


    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }


    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }


    public int getEdadEmpleado() {
        return edadEmpleado;
    }


    public void setEdadEmpleado(int edadEmpleado) {
        this.edadEmpleado = edadEmpleado;
    }



    

}
