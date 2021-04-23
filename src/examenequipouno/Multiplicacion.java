
package examenequipouno;

public class Multiplicacion {
    
    double productos; 
    
        public double tablaMultiplicar(double dato){
        for(int i = 1; i<=10; i++){
            productos=i*dato;
            System.out.println(i + " * " + dato + " = " + productos);
        }
        return dato;
    }
    
}
