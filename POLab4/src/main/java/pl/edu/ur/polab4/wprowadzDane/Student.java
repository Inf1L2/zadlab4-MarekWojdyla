
package pl.edu.ur.polab4.wprowadzDane;


public class Student {
    public String Imie;
   public String Nazwisko;
   public int nr_indeksu;
   public int rok_studiow;
   public String nazwa_specjalnosci;
   
    public Student  (String Imie , String Nazwisko , int nr_indeksu , int rok_studiow , String nazwa_specjalnosci) 
    {
       this.Imie = Imie;
       this.Nazwisko = Nazwisko;
       this.nr_indeksu = nr_indeksu;
       this.rok_studiow = rok_studiow;
       this.nazwa_specjalnosci = nazwa_specjalnosci;
    }
     public Student (String Imie , String Nazwisko , int nr_indeksu , int rok_studiow ) 
    {
       this.Imie = Imie;
       this.Nazwisko = Nazwisko;
       this.nr_indeksu = nr_indeksu;
       this.rok_studiow = rok_studiow;
      
    }
      public Student (String Imie , String Nazwisko , int nr_indeksu , String nazwa_specjalnosci) 
    {
       this.Imie = Imie;
       this.Nazwisko = Nazwisko;
       this.nr_indeksu = nr_indeksu;
       this.nazwa_specjalnosci = nazwa_specjalnosci;
    }
       public Student (String Imie , int nr_indeksu , int rok_studiow , String nazwa_specjalnosci) 
    {
        this.Imie = Imie;
       this.nr_indeksu = nr_indeksu;
       this.rok_studiow = rok_studiow;
       this.nazwa_specjalnosci = nazwa_specjalnosci;
    }

    Student(String imie, String nazwisko, int nr_indeksu, String nazwa_specjalnosci, int rok_srudiow) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       public void pokazDane() {
        System.out.println("Student");
        System.out.println("imię: " + this.Imie);
        System.out.println("nazwisko: " + this.Nazwisko);
        System.out.println("Rok_studiów:" + this.rok_studiow);
        System.out.println("Nazwa_specjalnosci:" + this.nazwa_specjalnosci);
       
    }

}

    

