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
public class Controlla extends Thread {

    private DatiCondivisi ptrdati;
    private int maxNum;
    private int nVerifica;
    

    public Controlla(int n, DatiCondivisi dati) {
        ptrdati = dati;
        maxNum = n;
        nVerifica = 1;
    }

    public void run() {
       for (int i=0;i<maxNum;i++) {
           ptrdati.getMtx().Wait();
            if(ptrdati.getNumero()!=nVerifica) {       
                System.out.println("Errore");          
                ptrdati.setErrore();             
            } 
            ptrdati.getMtx().Signal();
            
            nVerifica++;
        }

    }

}
