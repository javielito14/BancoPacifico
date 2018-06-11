/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class CuentaAhorro extends Banco {
    
    private double Saldo;
    private double Interes;

    public CuentaAhorro() {
    }

    public CuentaAhorro(int NumCuenta, String Nombre, String Apellido) {
        super(NumCuenta, Nombre, Apellido);
      
    }

   
    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public double getInteres() {
        return Interes;
    }

    public void setInteres(double Interes) {
        this.Interes = Interes;
    }

    @Override
    public void mostrar() {
        super.mostrar(); 
        System.out.println("Cuenta De Ahorros");
    }
    
    
    
    
    
}