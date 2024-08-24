package Ejercicios.EstadoObjeto;

public class Automovil {
    private String marca = null;
    private int modelo = 0;
    private int motor = 0;
    private TipoCombustible TipoCombustible;
    private TipoAutomovil TipoAutomovil;
    private int cantPuertas = 0;
    private int cantAsientos = 0;
    public int velocidadMax = 0; // km/h
    private ColorAutomovil color;
    public int velocidadActual = 0;
    public boolean esAutomatico;
    private int multa = 0;
    
    //CONSTRUCTOR
    public Automovil(String marca, int modelo, int motor,
            Ejercicios.EstadoObjeto.Automovil.TipoCombustible tipoCombustible,
            Ejercicios.EstadoObjeto.Automovil.TipoAutomovil tipoAutomovil, int cantPuertas, int cantAsientos,
            int velocidadMax, ColorAutomovil color, boolean esAutomatico) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        TipoCombustible = tipoCombustible;
        TipoAutomovil = tipoAutomovil;
        this.cantPuertas = cantPuertas;
        this.cantAsientos = cantAsientos;
        this.velocidadMax = velocidadMax;
        this.color = color;
        this.esAutomatico = esAutomatico;
    }

    
    //METODOS GETTERS AND SETTERS

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public TipoCombustible getTipoCombustible() {
        return TipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        TipoCombustible = tipoCombustible;
    }

    public TipoAutomovil getTipoAutomovil() {
        return TipoAutomovil;
    }

    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        TipoAutomovil = tipoAutomovil;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public ColorAutomovil getColor() {
        return color;
    }

    public void setColor(ColorAutomovil color) {
        this.color = color;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    
    public boolean getAutomatico(){
        return esAutomatico;
    }

    public void setEsAutomatico(boolean esAutomatico){
        this.esAutomatico = esAutomatico;
    }



    //METODO PARA ACELERAR A CIERTA VELOCIDAD, DESACELERAR Y FRENAR(velocidad=0)
    public void Acelerar(int incrementoVelocidad){
        if(incrementoVelocidad + velocidadActual < velocidadMax){ //acelerar
            velocidadActual += incrementoVelocidad;
        } else if (incrementoVelocidad + velocidadActual > velocidadMax) {
            System.out.println("ERROR!, EXEDISTE LA VELOCIDAD MAXIMA!");
            System.out.println("TU MULTA ES DE 100 USD");
            multa += 100;
        }
    }

    public void desAcelerar(int decrementoVelocidad){
        if((velocidadActual >= 0) && (velocidadActual - decrementoVelocidad >= 0)){ //acelerar
            velocidadActual -= decrementoVelocidad;
        } else{
            System.out.println("ERROR!, TE ENCUENTRAS ESTACIONADO!");
        }
    }

    public void frenar(){
        velocidadActual = 0;
    }


    //METODO PARA DETERMINAR SI TIENE MULTAS Y DAR EL VALOR DE LAS MULTAS

    public void tieneMulta(){
        if (multa == 0) {
            System.out.println("EL AUTO NO TIENE MULTAS");            
        } else {
            System.out.println("EL AUTO SI TIENE MULTAS");
        }
    }

    public void valorMulta(){
        System.out.println("DEUDA EN MULTAS = " + multa);
    }

    //METODO PARA CALCULAR EL TIEMPO ESTIMADO DE LLEGADA
    public double tiempoEstimado(int distancia){
        if (velocidadActual == 0) {
            System.out.println("ERROR!! EL AUTO SE ENCUENTRA DETENIDO");
            return 0;
        }
        return (double) distancia/velocidadActual;
    }


    //METODO PARA MOSTRAR LOS ATRIBUTOS DE UN AUTOMOVIL EN PANTALLA
    

    enum TipoCombustible{
        GASOLINA,
        BIOETANOL,
        DIESEL,
        BIODIESEL,
        GAS_NATURAL
    }

    @Override
    public String toString() {
        return "Automovil [Marca=" + marca + ", Modelo=" + modelo + ", Motor=" + motor + ", Tipo Combustible="
                + TipoCombustible + ", Tipo Automovil=" + TipoAutomovil + ", Cantidad de Puertas=" + cantPuertas
                + ", Cantidad de Asientos=" + cantAsientos + ", Velocidad Maxima=" + velocidadMax + ", Color=" + color + ", Es Automatico = " + esAutomatico + "]";
    }


    enum TipoAutomovil{
        CARRO_CIUDAD,
        SUBCOMPACTO,
        COMPACTO,
        FAMILIAR,
        EJECUTIVO,
        SUV
    }

    enum ColorAutomovil{
        BLANCO,
        NEGRO,
        ROJO,
        NARANJA,
        AMARILLO,
        VERDE,
        AZUL,
        VIOLETA
    }

    public boolean isAutomatico() {
        return esAutomatico;
    }


    public void setAutomatico(boolean isAutomatico) {
        this.esAutomatico = isAutomatico;
    }
    
}
