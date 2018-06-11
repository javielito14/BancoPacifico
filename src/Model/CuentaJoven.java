
package Model;

public class CuentaJoven extends Banco{
    private double Saldo;

    public CuentaJoven() {
    }

    public CuentaJoven(int NumCuenta, String Nombre, String Apellido) {
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
        System.out.println("Cuenta Joven");
    }
    
    
    
}
