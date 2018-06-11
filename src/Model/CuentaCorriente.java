/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class CuentaCorriente extends Banco{
    
    private double Saldo;

    public CuentaCorriente() {
    }

    public CuentaCorriente(int NumCuenta, String Nombre, String Apellido) {
        super(NumCuenta, Nombre, Apellido);
        
        
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    @Override
    public void mostrar() {
        super.mostrar(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Cuenta Corriente");
    }
    
    

    
    
}
