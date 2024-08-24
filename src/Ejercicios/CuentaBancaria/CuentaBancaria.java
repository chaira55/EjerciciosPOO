package Ejercicios.CuentaBancaria;

public class CuentaBancaria {
    private String nombreTitular = null;
    private String apellidTitula = null;
    private int numeroCuentaBancaria = 0;
    private tipoCuentaBancaria tipoCuenta;
    private int saldo = 0;


    public CuentaBancaria(String nombreTitular, String apellidTitula, int numeroCuentaBancaria,
            tipoCuentaBancaria tipoCuenta) {
        this.nombreTitular = nombreTitular;
        this.apellidTitula = apellidTitula;
        this.numeroCuentaBancaria = numeroCuentaBancaria;
        this.tipoCuenta = tipoCuenta;
    }


    public int consultarSaldo(){
        return this.saldo;
    }

    public Boolean consignacion(int valor){
        if (valor > 0) {
            saldo += valor;
            System.out.println("Se ha echo una consignacion de $" + valor + " a la cuenta. Tu nuevo saldo es de = " + saldo);
            return true;
        } else {
            System.out.println("El valor a consiganar debe ser mayor a cero");
            return false;
        }
    }

    public boolean retirar(int valor){
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Se ha echo un retir de $" + valor + " a la cuenta. Tu nuevo saldo es de = " + saldo);
            return true;
        } else{
            System.out.println("No tienes esa cantidad en la cuenta.");
            return false;
        }
    }

    public void compararSaldos (CuentaBancaria cuenta){
        if (saldo >= cuenta.saldo ) {
            System.out.println("La cuenta actual es mayor o igual a la cuenta pasada como parametro");
        } else{
            System.out.println("La cuenta actual es menor a la cuenta pasada como parametro");
        }
    }

    public void transferir(CuentaBancaria cuentaDestino, int valorTransferir){
        if (retirar(valorTransferir)) {
            cuentaDestino.saldo += valorTransferir;            
        }
    }


    @Override
    public String toString() {
        return "CuentaBancaria [nombreTitular=" + nombreTitular + ", apellidTitula=" + apellidTitula
                + ", numeroCuentaBancaria=" + numeroCuentaBancaria + ", tipoCuenta=" + tipoCuenta + "]";
    }



    enum tipoCuentaBancaria{
        AHORRO, 
        CORRIENTE
    }
    
}
