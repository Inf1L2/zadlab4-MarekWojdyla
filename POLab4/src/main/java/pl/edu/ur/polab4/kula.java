
package pl.edu.ur.polab4;
import java.util.Scanner;

public class kula 
{
    double pi;
    int r;
    Scanner s = new Scanner (System.in);
    public void Pole_kola ()
    {
        System.out.println("Poda pi" );
        pi = s.nextInt();
         System.out.println("Poda r" );
        r = s.nextInt();
        
        double pole =  (4*pi*(r*r));
         System.out.println("Podane PI:=");
          System.out.println("Podane r:=");
        System.out.println("POle kuli" + pole);
    }
    public void Objetosc ()
    {
         System.out.println("Poda pi" );
        pi = s.nextInt();
         System.out.println("Poda r" );
        r = s.nextInt();
        
        double Objetosc =  4/3 * pi*(r*r*r);
          System.out.println("Podane PI:=");
          System.out.println("Podane r:=");
        System.out.println("Objetosc:=" + Objetosc);
    }
        public static void main(String[] args) {
            kula k = new kula ();
            k.Pole_kola();
            k.Objetosc();
            
        }
        
    }
    

