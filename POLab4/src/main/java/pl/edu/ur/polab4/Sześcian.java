
package pl.edu.ur.polab4;

import java.util.Scanner;
public class Sześcian {
    int a;
    Scanner s = new Scanner (System.in);
    public void Pole () 
    {
        System.out.println("Podaj a");
        a= s.nextInt();
        int pole = 6*(a*a);
    }
    public void Objetosc () 
    {
       System.out.println("Podaj a");
       a = s.nextInt();
       int Objetosc = (a*a*a);
    }
    
}
