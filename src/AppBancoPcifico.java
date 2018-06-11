

import java.util.ArrayList;
import java.util.List;
import Model.Banco;
import Model.CuentaAhorro;
import Model.CuentaCorriente;
import Model.CuentaJoven;


public class AppBancoPcifico {
    public static void main(String[] args) {
        
        CuentaAhorro c1 = new CuentaAhorro(100,"Jonathan","Suarez");
        CuentaCorriente c2 = new CuentaCorriente (200, "Kerly", "Illescas");
        CuentaJoven c3 = new CuentaJoven (300, "Alexander","Suarez");
        
        List<Banco> listaBanco = new ArrayList<>();
        listaBanco.add(c1);
        listaBanco.add(c2);
        listaBanco.add(c3);
        
        System.out.println(listaBanco);
        
        for (Banco banco : listaBanco) {
            banco.mostrar();
            
        }
                
    }
    
}

