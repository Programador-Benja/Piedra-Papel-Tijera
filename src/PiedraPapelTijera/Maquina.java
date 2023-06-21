
package PiedraPapelTijera;

public class Maquina {
    private int azar;
    private int contador = 0;
    
    //El metodo MaquinaJuega() retorna un valor entre 0 y 2;
    public int MaquinaJuega(){
        this.azar = (int) (Math.random() * 3 );
        return azar;
    }
    //Este metodo retorna el valor actual del contador
    public int getContador() {
        return contador;
    }
    //Este metodo actualizarContador() cada vez que se lo invoca se le suma 1
    public void ctualizarContador() {
        this.contador ++;
    }
}
