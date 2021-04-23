
package examenequipouno;

public class cadenaTexto2 {
    
    protected Operaciones operaciones = new Operaciones();
    
    public cadenaTexto2(Operaciones men2){
    
    this.operaciones = men2;
    
    }
    public void cadenaTexto () {
        operaciones.valorUno=1;
        operaciones.valorDos=4;
        System.out.println("Hola Maestra 2 :)");
    }
}
