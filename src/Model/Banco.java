
package Model;


public class Banco {
private String Nombre;
    private String Apellido;
    private int NumCuenta;

    public Banco() {
    }

    public Banco(int NumCuenta, String Nombre, String Apellido) {
        this.NumCuenta = NumCuenta;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    public int getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(int NumCuenta) {
        this.NumCuenta = NumCuenta;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    @Override
    public String toString() {
        return "Banco{" + "NumCuenta=" + NumCuenta + ", Nombre=" + Nombre + ", Apellido=" + Apellido + '}';
    }
    
    
    public void mostrar(){
        System.out.println(this.getNombre());
    }
    
    
}
