package Ejercicios.CapituloII.CuentaBancaria;

import Ejercicios.CapituloII.CuentaBancaria.CuentaBancaria.tipoCuentaBancaria;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Pedro", "Pérez",123456789,tipoCuentaBancaria.AHORRO);
        CuentaBancaria cuenta2 = new CuentaBancaria("Pablo","Pinzón",44556677,tipoCuentaBancaria.AHORRO);
        cuenta1.consignacion(200000);
        cuenta2.consignacion(100000);
        cuenta1.compararSaldos(cuenta2);
        cuenta1.transferir(cuenta2,50000);
        System.out.println("El saldo actual es = " + cuenta1.consultarSaldo());
        System.out.println("El saldo actual es = " + cuenta2.consultarSaldo());
    }
    
}
