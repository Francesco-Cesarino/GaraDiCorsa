/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GaraDiCorsa;

import java.util.ArrayList;

/**
 *
 * @author Francesco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Corridore.METRI_PERCORSI = 100;
       Corridore.STAMPA_ARRIVI = true;
       Corridore.TEMPO_DI_STAMPA = 1;
       
       ArrayList<Corridore> listaCorridori = new ArrayList <>();
       
       int numeroCorridori = 10;
       
       for(int i = 0; i < numeroCorridori; i++)
       {
           listaCorridori.add(new Corridore("Macchinetta -->"+(i+1)));
           
       }
       
       for(Corridore c : listaCorridori) c.start();
       for(Corridore c : listaCorridori)try{c.join();}catch(Exception e){}
       
       Corridore.stampaClassifica();
       
    }
    
}
