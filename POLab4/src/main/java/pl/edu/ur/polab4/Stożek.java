
package pl.edu.ur.polab4;

import static java.lang.Math.sqrt;
import java.util.Scanner;


public class Stożek {
    int wysokosc;
    int promien;
    int tworzaca;
    int Pole_Prostopadłosciana;
    double pi;
    int Objetosc;
    Scanner s = new Scanner (System.in);
    
    public void tworzaca ()
    {
         System.out.println("Podaj wysokosc:");
        wysokosc= s.nextInt();
        
         System.out.println("Podaj promien:");
        promien= s.nextInt();
        
        tworzaca = (int) sqrt((wysokosc*wysokosc)+(promien*promien));
        System.out.println("Tworzaca:=" +tworzaca);
        
    }
    public void Objetosc()
    {
         System.out.println("Podaj wysokosc:");
        wysokosc= s.nextInt();
        
         System.out.println("Podaj pi:");
        pi= s.nextInt();
        
         System.out.println("Podaj promien:");
        promien= s.nextInt();
        
        Objetosc = (int) (1/3*pi*(promien*promien)*wysokosc);
          System.out.println("Podana wysokosc:=" +wysokosc);
           System.out.println("Podany promien:=" +promien);
            System.out.println("Podana wartosc PI:=" +pi);
        System.out.println("Objetosc:=" + Objetosc);
        
        
    }
    
    public void Pole_Podstawy_Stozka () 
    {
           System.out.println("Podaj pi:");
        pi= s.nextDouble();
        
         System.out.println("Podaj promien:");
        promien= s.nextInt();
        
        int Pole_Podstawy = (int) (pi*(promien*promien));
    }
    public void Pole_Boczne ()
    {
           System.out.println("Podaj pi:");
        pi= s.nextDouble();
        
         System.out.println("Podaj promien:");
        promien= s.nextInt();
        
           System.out.println("Podaj tworzaca:");
        tworzaca= s.nextInt();
        
        int Pole_Boczne = (int) (pi*promien*tworzaca);
        System.out.println("Pole_Boczne" + Pole_Boczne);
    }
    public void Polecałkowite ()
    {
         System.out.println("Podaj pi:");
        pi= s.nextDouble();
        
         System.out.println("Podaj promien:");
        promien= s.nextInt();
        
           System.out.println("Podaj tworzaca:");
        tworzaca= s.nextInt();
        
         int Pole_Podstawy = (int) (pi*(promien*promien));
       int Pole_Boczne = (int) (pi*promien*tworzaca);
       int PoleCałkowite = Pole_Podstawy + Pole_Boczne;
       System.out.println("Pole_podstawy:=" +Pole_Podstawy);
         System.out.println("Pole_podstawy:=" +Pole_Boczne);
       
       System.out.println("Pole całkowite:="+ PoleCałkowite);
    }
     public static void main(String[] args) {
       
    Stożek stozek = new Stożek ();
    stozek.Polecałkowite();
    stozek.Objetosc();
    
    
}
    
    
}
