package pl.edu.ur.polab4;
import java.util.Scanner;
public class Main {

 
    public static void main(String[] args) {
         Scanner podaj = new Scanner (System.in);
         int w;
        while (true)
            
        {
         System.out.print("\n1.Koło 2.kwadrat 3.Prostokat  4.Prostopadłoscian 5.Stożek  6. Sześcian 7.kula 8.zakonczenie programu\nWybierz dzialanie:  ");
        w= podaj.nextInt();  
        
        if(w==1)
        {
           Koło k = new Koło ();
           k.PoleKola();
           k.obliczanieObwodu();
           
        }else if(w==2)
        {
              Kwadrat k = new Kwadrat ();
        k.Pole_kwadratu();
        k.Obwod_kwadratu();
        
        }else if (w==3)
        {
          Prostokąt p = new Prostokąt ();
           p.Pole();
           p.Obwod();  
        }else if (w==4)
        {
            Prostopadłościan p = new Prostopadłościan ();
            p.Objetosc();
            p.PoleCałkowite();
        }else if (w==5)
        {
             Stożek stozek = new Stożek ();
              stozek.Polecałkowite();
              stozek.Objetosc();
        }else if (w==6)
        {
            Sześcian sz = new Sześcian ();
            sz.Objetosc();
            sz.Pole(); 
        }else if (w==7)
        {
            kula k = new kula ();
            k.Pole_kola();
            k.Objetosc();
        }else if(w==8)
        {
            break;
        }
        
                    
       
       
    }
    
}
}
