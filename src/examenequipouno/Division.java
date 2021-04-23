
package examenequipouno;

public class Division {
 
    private double res,v1,v2;
    
    // Por medio de un constructor se inicializan valores.
    // Se hace referencia al objeto actual.
    public Division(double vUno, double vDos){
        this.v1 = vUno;
        this.v2 = vDos;
    }
    
    public Division(double vUno, double vDos, double resultado){
        this.v1=vUno;
        this.v2=vDos;
        this.res=resultado;
    }
    
    // Representación de la sobrecarga de metodos.
    // Paso de parametros.
    public void Division(double v1, double v2){
        //v1 = 5; // Paso de parametros por valor
        //v2 = 10; // Paso de parametros por valor
        res = v1/v2;
        System.out.println("El resultado de: " + v1 + "/" + v2 + " es: " + res);
        res = v2/v1; // De esta manera podemos ver el uso de un destructor.
        System.out.println("El resultado de: " + v1 + "/" + v2 + " es: " + res);
    }
   
    public void Division(double v1){
        res = v1 % 2; //Uso de operadores binarios.
        if (res == 0){
            System.out.println("El numero si es par.");
        } else {
            System.out.println("El numero no es par.");
        }
    }
    
    // Metodo que retorna un valor con el void.
    public void Division(float v2){
        res = v2 % 2;
        if (res != 0){
            System.out.println("El numero si es impar.");
        } else {
            System.out.println("El numero no es impar.");
        }
     } 
  
}

