package Ejercicios.CapituloII.Persona;

public class Persona {
    String nombre;
    String apellido;
    int DocumentoIdentidad;
    int AnnoNacimiento;
    String PaisNacimiento;
    char genero;

    Persona (String nombre, String apellido, int DocumentoIdentidad, int AnnoNacimiento, String PaisNacimiento, char genero){
        this.nombre = nombre;
        this.apellido = apellido;
        this.DocumentoIdentidad = DocumentoIdentidad;
        this.AnnoNacimiento = AnnoNacimiento;
        this.PaisNacimiento = PaisNacimiento;
        this.genero = genero;
    }


    public void imprimir() {
        System.out.println("[NOMBRE = " + nombre + ", APELLIDO = " + apellido + ", DOCUMENTO DE IDENTIDAD = " + DocumentoIdentidad + ", AÑO DE NACIMIENTO = " + AnnoNacimiento + ", PAIS DE NACIMIENTO = " + PaisNacimiento + ", GENERO = " + genero + "]");
    }
}
