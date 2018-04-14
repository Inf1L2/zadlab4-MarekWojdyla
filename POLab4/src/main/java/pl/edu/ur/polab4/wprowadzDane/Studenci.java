
package pl.edu.ur.polab4.wprowadzDane;

import java.util.Scanner;

public class Studenci {
    
     Student[] tab;
     int indeks ;
    
    Scanner scan = new Scanner(System.in);
    int nr;
    String imie;
    String nazwisko;
    int nr_indeksu;
    int rok_studiow;
    String nazwa_specjalnosci;
    
    public Studenci ()
    {
        this.indeks = 0;
        this.tab = new Student[100];
    }
    public void Wprowadzanie ()
    {
        for(int i =0; i<100; i++)
        {
          tab[i] = new Student("","",0,0,"");
        }
       
        
    }
        public void EdytujDane ()
        {
          System.out.println("Podaj numer indeksu");
          nr = scan.nextInt();
          System.out.println("Podaj imie");
          imie = scan.next();
          System.out.println("Podaj nazwisko");
          nazwisko = scan.next();
          System.out.println("Podaj rok_studiow");
          rok_studiow = scan.nextInt();
          System.out.println("Podaj numer Indeksu");
          nr_indeksu = scan.nextInt();
          System.out.println("Podaj nazwe specjalnosci");
          nazwa_specjalnosci = scan.next();
        }
        
        public void UsunIndeks(){

        System.out.print("Podaj index tablicy do usuniecia: ");

         nr = scan.nextInt();

        tab[nr] = new Student("","",0,0,"");

    }
         public void wyswietlIndex(){

        System.out.print("Podaj indeks tablicy do wyswietlenia: ");

        int nr = scan.nextInt();

       System.out.println("Student o numerze ["+nr+"}");

        System.out.println("Imie: "+tab[nr].Imie);

        System.out.println("Nazwisko: "+tab[nr].Nazwisko);

        System.out.println("Numer indeksu: "+tab[nr].nr_indeksu);

        System.out.println("Nazwa specjalizacji: "+tab[nr].nazwa_specjalnosci);

        System.out.println("Rok studiow: "+tab[nr].rok_studiow);

    }
         public void wyswietlWszystko(){

        for(int i=0;i<100;i++){

            System.out.println("Student o numerze ["+i+"}");

            System.out.println("Imie: "+tab[i].Imie);

            System.out.println("Nazwisko: "+tab[i].Nazwisko);

            System.out.println("Numer indeksu: "+tab[i].nr_indeksu);

            System.out.println("Nazwa specjalizacji: "+tab[i].nazwa_specjalnosci);

            System.out.println("Rok studiow: "+tab[i].rok_studiow);

        }
    }
          public void wyswietlZakres(){

        System.out.print("Podaj poczatek zakresu do wyswietlenia: ");

        int min = scan.nextInt();

        System.out.print("Podaj koniec zakresu: ");

        int max = scan.nextInt();



        for (int i = min;i<=max;i++){

            System.out.println("\nStudent o numerze ["+i+"}");

            System.out.println("Imie: "+tab[i].Imie);

            System.out.println("Nazwisko: "+tab[i].Nazwisko);

            System.out.println("Numer indeksu: "+tab[i].nr_indeksu);

            System.out.println("Nazwa specjalizacji: "+tab[i].nazwa_specjalnosci);

            System.out.println("Rok studiow: "+tab[i].rok_studiow);

        }
       
            
        }
        public static void Menu () {
          
             int menu;
             String m;
          Scanner scan = new Scanner(System.in);
          Studenci tab = new Studenci ();
         tab.Wprowadzanie();
             
         
          
              do {
                  System.out.println("1.Wprowadz Dane Studenta/Edytuj 3.Usuwanie 4.Wyświetlanie indeksu 5. Wyświetl wszystko 6.Wyświetlanie zakresu 7.wyjdz z programu");
                  menu = scan.nextInt();
                  switch(menu){
                  
                  case 1:
                      tab.EdytujDane();
                      break;
                 
                  case 3:
                      tab.UsunIndeks();
                  case 4:
                      tab.wyswietlIndex();
                  case 5:
                      tab.wyswietlWszystko();
                  case 6:
                      tab.wyswietlZakres();
                  case 7:
                      if(menu  == 7){
                          break;
                      }
                      
              }
                   System.out.println("\nCzy chcesz kontynuowac?: ");

            m = scan.next();
          } while (m.equalsIgnoreCase("tak"));
                    
              }


          public static void main (String[] args) {
            Studenci studenci = new Studenci ();
            studenci.Menu();
          }
} 



 


