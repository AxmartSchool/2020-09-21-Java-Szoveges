/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladatokszoveges;

    

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;



/**
 *
 * @author jager.balazs
 */
public class FeladatokSzoveges {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int [] kockaDobasok = new int[120] ;
    public static int [] gyakorisagok = new int[6];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        randomSzamGeneralas();
        dobasokKiirasa();
        dobottSzamokGyakorisaga();
        dobasokEgyHatodResze();
        legtobbszorDobottSzam();
        legkevesebbszerDobottSzam();
        legalabbTizszer();
        egymasUtanUgyanaz();
        
        
    }

    private static void randomSzamGeneralas() {
        
        Random rand = new Random();
        
        for (int i = 0; i < kockaDobasok.length; i++) {
            
            kockaDobasok[i]=rand.nextInt(6)+1;
            
        }

        
    }

    private static void dobasokKiirasa() {
        
        for (int i = 0; i < kockaDobasok.length; i++) {
            
            System.out.print(kockaDobasok[i]);
            
        }
        System.out.println("");
    }

    private static void dobottSzamokGyakorisaga() {
        
        for (int i = 1; i < 7; i++) {
            int gyakorisag = 0;
            for (int j = 0; j < kockaDobasok.length; j++) {
                 if (i == kockaDobasok[j]) {
                    gyakorisag++;
                }
            }
            System.out.println("Az " + i + " szamot " + gyakorisag + " szor dobta.");
            gyakorisagok[i-1] = gyakorisag;
        }
        
        
    }

    private static void dobasokEgyHatodResze() {
        
        for (int i = 0; i < gyakorisagok.length; i++) {
            if (gyakorisagok[i] == 20) {
                System.out.println("Van");
                return;
            }
        }
        System.out.println("Nincs");
        
    }

    private static void legtobbszorDobottSzam() {

            int legtobbetDobottSzamIndexe = 0;
            for (int i = 1; i < gyakorisagok.length; i++) {
                if (gyakorisagok[i] > gyakorisagok[legtobbetDobottSzamIndexe]) {
                    
                    legtobbetDobottSzamIndexe = i;
                    
                }
                
                
        }
        System.out.println("A legtobbszor dobott szam : " + (legtobbetDobottSzamIndexe+1) );
        
    }

    private static void legkevesebbszerDobottSzam() {
        
        int legkevesebbetDobottSzamIndexe = 0;
            for (int i = 1; i < gyakorisagok.length; i++) {
                if (gyakorisagok[i] < gyakorisagok[legkevesebbetDobottSzamIndexe]) {
                    
                    legkevesebbetDobottSzamIndexe = i;
                    
                }
                
                
        }
        System.out.println("A legkevesebbszer dobott szam : " + (legkevesebbetDobottSzamIndexe+1) );
        
    }

    private static void legalabbTizszer() {

        
          for (int i = 0; i < gyakorisagok.length; i++) {
            
              if (gyakorisagok[i] < 10) {
                  System.out.println("Nem");
                  return;
              }
              
        }
          
          System.out.println("Igen");
    }

    private static void egymasUtanUgyanaz() {
        
        int szam = kockaDobasok[0];
        for (int i = 1; i < kockaDobasok.length; i++) {
            if (szam == kockaDobasok[i]) {
                System.out.println("Van");
                return;
            }
            szam = kockaDobasok[i];
            
        }
        
        System.out.println("Nincs");
    }
    
}
