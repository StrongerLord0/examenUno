
package examenequipouno;

public class Division {
 
    private double res,v1,v2;
    
    public Division(double vUno, double vDos){
        this.v1 = vUno;
        this.v2 = vDos;
    }
    
    public void Division(double v1, double v2){
        res = v1/v2;
        System.out.println("El resultado de: " + v1 + "/" + v2 + " es: " + res);
        res = v2/v1;
        System.out.println("El resultado de: " + v1 + "/" + v2 + " es: " + res);
    }
   
    public void Division(double v1){
        res = v1 % 2;
        if (res == 0){
            System.out.println("El numero si es par.");
        } else {
            System.out.println("El numero no es par.");
        }
    }
    
    public void Division(float v2){
        res = v2 % 2;
        if (res != 0){
            System.out.println("El numero si es impar.");
        } else {
            System.out.println("El numero no es impar.");
        }
     } 
  
}

