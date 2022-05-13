/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prjava02;

import java.io.*;
import java.net.*;

/**
 *
 * @alexpeirau00 --> Escriu el teu correu electrònic: alexpeirau00@gmail.com
 */
public class Prjava02 {

    // Versio 1 del projecte prjavaPeirau02

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("versió 0.1 del projecte prjava02"); 
        System.out.println("Creació d'una branca del projecte prjavaPeirau02");	
        System.out.println("Nova creació d'una branca del projecte prjavaPeirau02");	
        // Comentario añadido y nuevo en Branca00 directamente.

        System.out.println("Afegint més codi a la branca00 del projecte prjavaCognom02");



        try {
            InetAddress adreça = InetAddress.getLocalHost();
            String hostname = adreça.getHostName();
            System.out.println("hostname="+hostname);
            System.out.println("Nom de l'usuari: " + System.getProperty("user.name"));
            System.out.println("Carpeta Personal: " + System.getProperty("user.home"));
            System.out.println("Sistema operatiu: " + System.getProperty("os.name"));
            System.out.println("Versió OS: " + System.getProperty("os.version"));
        }
        catch (IOException e) {
		System.out.println("Exception occurred");
        }  
    }
}