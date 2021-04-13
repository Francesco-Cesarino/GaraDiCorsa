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
public class Corridore extends Thread {
    
    public static int METRI_PERCORSI = 100;
    public static ArrayList <String> CLASSIFICA = new ArrayList<>();
    public static boolean STAMPA_ARRIVI = false;
    public static int TEMPO_DI_STAMPA = 1;
    
    public Corridore (String nome)
    {
        super(nome);
    }
    
    @Override
    public void run()
    {
        for(int i = 0; i < METRI_PERCORSI;i++)
        {
            if((i+1)%TEMPO_DI_STAMPA == 0)
            {
                System.out.println(super.getName());
            }
            assegnazioneClassifica(super.getName());
        }
    }
    
    public static synchronized void assegnazioneClassifica (String nome)
    {
        if(STAMPA_ARRIVI)
        stampaArrivo(nome);
        CLASSIFICA.add(nome);
    }
    
    public static void stampaArrivo(String nome)
    {
        System.out.println("------>"+nome + " ha finito la gara");
        
        
    }
    
    public static void stampaClassifica(){
        for (int i = 0; i < CLASSIFICA.size(); i++)
        {
            System.out.println("numero "+(i+1)+ " > " + CLASSIFICA.get(i));
            
        }
    }
}

