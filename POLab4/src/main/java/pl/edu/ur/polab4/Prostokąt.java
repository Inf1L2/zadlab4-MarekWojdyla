/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

import java.util.Scanner;

public class Prostokąt {
    int bok_a;
    int bok_b;
    int Pole_Prostokata;
    int Obwod;
    Scanner s = new Scanner (System.in);
    public void Pole ()
    {
       System.out.println("Podaj bok_a:");
       bok_a = s.nextInt();
       System.out.println("Podaj bok_b:");
       bok_b = s.nextInt();
       
        Pole_Prostokata = bok_a*bok_b;
           System.out.println("Podany bok_a:="+bok_a);
              System.out.println("POdany bok_b:="+bok_b);
        System.out.println("Pole Prostokąta :=" +  Pole_Prostokata);
    }
    public void Obwod () 
    {
        
       System.out.println("Podaj bok_a:");
       bok_a = s.nextInt();
       System.out.println("Podaj bok_b:");
       bok_b = s.nextInt();
        
        Obwod = 2*bok_a + 2*bok_b;
         System.out.println("Podany bok_a:="+bok_a);
              System.out.println("POdany bok_b:="+bok_b);
        System.out.println("Obwod :=" +  Obwod);
    }
     public static void main(String[] args) {
    Prostokąt p = new Prostokąt ();
    p.Pole();
    p.Obwod();
    
}
}