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
public class Incrementa extends Thread{
    private DatiCondivisi ptrdati;
    private int maxNum;
    private int inc=1;
    
    
    
    public Incrementa(int n,DatiCondivisi dati) {
        ptrdati=dati;
        maxNum=n;
        
    }
    public void run () {
        for (int i=0;i<maxNum;i++) {
            ptrdati.getMtx().Wait();
            ptrdati.setNumero();
            ptrdati.getMtx().Signal();
            System.out.println(ptrdati.getNumero());
            
        }
    }
}
