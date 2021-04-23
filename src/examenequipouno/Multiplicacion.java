
package examenequipouno;

public class Multiplicacion {
    
    double productos; 
    
        // Metodo que retorna el valor sin el void.
        public double tablaMultiplicar(double dato){
        for(int i = 1; i<=10; i++){ // Ejemplificacion de uso de operadores unarios.
            productos=i*dato; // Sobrecarga de operadores
            System.out.println(i + " * " + dato + " = " + productos);
        }
        return dato;
    }
    
}
