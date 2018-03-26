
package pl.edu.ur.polab4;

import java.util.Scanner;


public class Prostopadłościan {
     int a;
    int b;
    int wysokosc;
    int Objetosc;
    Scanner s = new Scanner (System.in);
    public void Objetosc ()
    {
       System.out.println("Podaj krawedz_podstawy_a:");
        a= s.nextInt();
        
       System.out.println("Podaj krawedz_podstawy_b:");
       b = s.nextInt();
      
       System.out.println("Podaj wysokosc:");
        wysokosc= s.nextInt();
       
        Objetosc =a *b * wysokosc  ;
         System.out.println("Podana krawedz_podstawy_a: :="+a);
         System.out.println("Podana krawedz_podstawy_b: :="+b);
         System.out.println("Podana wysokość: :="+wysokosc);
              
        System.out.println("Objetosc :=" +  Objetosc);
    }
    
    public void PoleCałkowite () 
    {
      System.out.println("Podaj krawedz_podstawy_a:");
        a= s.nextInt();
        
       System.out.println("Podaj krawedz_podstawy_b:");
       b = s.nextInt();
       
       System.out.println("Podaj wysokosc:");
        wysokosc= s.nextInt();
       
        
        int Pole_Całkowite = 2*(a* b) + 2*(b*wysokosc) + 2*(a*wysokosc);
         System.out.println("Podana krawedz_podstawy_a: :="+a);
         System.out.println("Podana krawedz_podstawy_b: :="+b);
         System.out.println("Podana wysokość: :="+wysokosc);
        System.out.println("Pole_Całkowite:=" + Pole_Całkowite);
        
    }
     public static void main(String[] args) {
    Prostopadłościan p = new Prostopadłościan ();
    p.Objetosc();
    p.PoleCałkowite();
    
}
    
}
