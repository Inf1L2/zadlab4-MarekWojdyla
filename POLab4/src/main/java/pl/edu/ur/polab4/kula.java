
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
        System.out.println("POle kuli" + pole);
    }
        public static void main(String[] args) {
            kula k = new kula ();
            k.Pole_kola();
            
        }
        
    }
    

