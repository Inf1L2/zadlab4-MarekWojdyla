
package pl.edu.ur.polab4;


import java.util.Scanner;
public class Koło {
    int Obwod;
    int Pole;
    int r;
    float pi;
  
   Scanner podaj = new Scanner (System.in);
    
     public void obliczanieObwodu ()
    {
        System.out.println("Podaj promień");
        r = podaj.nextInt();
        System.out.println("Podaj Liczbe pi");
        pi = podaj.nextFloat();
        Obwod = (int) (2*pi*r);
       System.out.println("Obwód wynosi:="+Obwod); 
    }
     public void PoleKola()
     {
          System.out.println("Podaj promień");
          r = podaj.nextInt();
          System.out.println("Podaj Liczbe pi");
        pi = podaj.nextFloat();   
         Pole =  (int)(pi*(r*r));
         System.out.println("Pole koła:="+Pole);
     }
  

public static void main(String[] args) {
   
  Koło k = new Koło ();
   k.PoleKola();
   k.obliczanieObwodu();
  
}
}