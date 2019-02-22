/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dindondan;

/**
 *
 * @author padua_princess_joy
 */
public class DatiCondivisi {
    private int numero;
    private int errore;
    private Semaforo mtx;
   
    
    public DatiCondivisi(Semaforo mutex) {
        errore=0;
        mtx=mutex;
        
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero() {
        this.numero = numero+1;
    }

    public int getErrore() {
        return errore;
    }

    public void setErrore() {
        this.errore = errore+1;
    }

    public Semaforo getMtx() {
        return mtx;
    }

    
    
    
    
}
