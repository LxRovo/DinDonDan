/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
package dindondan;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author padua_princess_joy
 */
public class Esercizio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int num;
            Scanner input=new Scanner(System.in);
            
            System.out.println("Inserisci numero:");
            num=input.nextInt();
            Semaforo mutex=new Semaforo(1);
            DatiCondivisi dati=new DatiCondivisi(mutex);
            
            Incrementa th1=new Incrementa(num,dati);
            Controlla th2=new Controlla(num,dati);
            
            
            th1.start();
            th2.start();
            th1.join();
            th2.join();
            
            
            System.out.println("Percetuale errore rilevati:"+((dati.getErrore()*100)/num));
        } catch (InterruptedException ex) {
            Logger.getLogger(Esercizio2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
