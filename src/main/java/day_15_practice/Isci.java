package day_15_practice;

public class Isci extends Muhasebe{
    protected String isciStatu="Surekli Isci";
    protected void mesai(){
        System.out.println("Isciler gunluk 8 saat ve haftada 5 gun calisir");
    }
    //bu class'dan da obje olusturabiliriz. Bu class'in child classlarinin olmasi obje olusturmaya
    //engel degil. Fakat isciler icin surekli isci ve ustabasi olmakdan baska ihtimal olmadigindan
    //isci class'inda isci uretmeye gerek yok

}
