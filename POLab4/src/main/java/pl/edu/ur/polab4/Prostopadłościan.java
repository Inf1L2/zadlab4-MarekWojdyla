
package pl.edu.ur.polab4;

import java.util.Scanner;


public class Prostopadłościan {
     int krawedz_podstawy_a;
    int krawedz_podstawy_b;
    int wysokosc;
    int Pole_Prostopadłosciana;
    Scanner s = new Scanner (System.in);
    public void Pole ()
    {
       System.out.println("Podaj krawedz_podstawy_a:");
        krawedz_podstawy_a= s.nextInt();
        
       System.out.println("Podaj krawedz_podstawy_b:");
       krawedz_podstawy_b = s.nextInt();
       
       System.out.println("Podaj wysokosc:");
        wysokosc= s.nextInt();
       
        Pole_Prostopadłosciana =krawedz_podstawy_a *krawedz_podstawy_b * wysokosc  ;
        System.out.println("Pole Prostopadłosciana :=" +  Pole_Prostopadłosciana);
    }
     public static void main(String[] args) {
    Prostopadłościan p = new Prostopadłościan ();
    p.Pole();
    
}
    
}
