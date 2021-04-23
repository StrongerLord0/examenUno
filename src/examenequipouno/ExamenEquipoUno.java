/*
 * Programacion Orientada a Objetos
 * Examen Equipo 1 | Unidad 2 
 * Docente: Juana Garcia Saenz
 */
package examenequipouno;

import java.util.Scanner;

public class ExamenEquipoUno {

    public static void main(String[] args) {
       
        // Instanciacion de clase
        Scanner sc = new Scanner (System.in);
        Suma men1 = new Suma();
        Resta men2 = new Resta();
        Multiplicacion men3 = new Multiplicacion();
        cadenaTexto obj = new cadenaTexto();
        
        System.out.println("Ingresa la opcion que mas te interese:\n"
                + "1. Realizar una suma de dos valores\n"
                + "2. Realizar una resta de dos valores\n"
                + "3. Realizar una tabla de multiplicar\n"
                + "4. Realizar una operacion extra\n"
                + "5. Funcion extra\n"
                + "6. Salir del sistema.");
        
        int Opcion = sc.nextInt();
        
        switch(Opcion){
            case 1:
                    men1.ingresarDatos(); 
                    men1.Operacion();
                    men1.mostrarResultado();
                    break;
            case 2:
                    men2.ingresarDatos();
                    men2.Operacion();
                    men2.mostrarResultado();
                    break;
            case 3:
                    System.out.print("Ingresa el dato que quieres multiplicar: ");
                    double dato= sc.nextDouble();
                    men3.tablaMultiplicar(dato);
                    break;
            case 4:
                    System.out.println("Ingresa dos valores para la operacion extra: ");
                    double vUno= sc.nextDouble();
                    float vDos= sc.nextFloat();
                    Division men4 = new Division(vUno,vDos);
                    
                    System.out.println("¿Que deseas conocer de esta operacion extra?\n"
                            + "1. Resultado de una division.\n"
                            + "2. Saber si el valor uno es par.\n"
                            + "3. Saber si el valor dos es impar.");
                    int minimenu = sc.nextInt();
                    
                    switch(minimenu){
                        case 1:
                            men4.Division(vUno, vDos); 
                            break;
                        case 2:
                            men4.Division(vUno);
                            break;
                        case 3:
                            men4.Division(vDos);
                            break;
                        default:
                            System.out.println("Ingresa una opcion valida.");
                    }
                    break;
            case 5:
                    String[] txt = new String[1];
                    obj.cadenaTexto(txt);
                    System.out.println("La cadena de texto es: " + txt[0]); // Parametros por referencia
            case 6:
                    System.exit(0); // Manera de apreciar un destructor.
                    break;
            default:
                    System.out.println("Ingresa opcion valida.");
                    break;
        
        }
        
    }
    
}


