/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

import java.util.Scanner;
public class Kwadrat {
    int Pole_kwadratu;
    
    Scanner scanner =  new Scanner (System.in);
    
    public void  Pole()
    {
        int bok;
        System.out.println("Podaj bok kwadratu");
        bok= scanner.nextInt();
        Pole_kwadratu = (bok*bok*bok*bok);
        System.out.println("Pole Kwadratu :="+Pole_kwadratu);
        
        
    }
    public static void main(String[] args) {
    
        Kwadrat k = new Kwadrat ();
        k.Pole();
}
}