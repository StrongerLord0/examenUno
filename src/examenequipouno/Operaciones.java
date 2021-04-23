
package examenequipouno;

import java.util.Scanner;

public class Operaciones {
    
    protected double valorUno, valorDos, resultado;
    Scanner sc = new Scanner(System.in);
    
    protected void ingresarDatos(){
        System.out.print("Ingresa el primer valor: ");
        valorUno = sc.nextDouble();
        System.out.print("Ingresa el segundo valor: ");
        valorDos = sc.nextDouble();
    }
    
    protected void mostrarResultado(){
        System.err.println("El resultado es: " + resultado);
    }
    
    
}
