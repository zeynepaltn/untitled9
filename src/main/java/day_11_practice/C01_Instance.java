package day_11_practice;
/*

   sayi, isim, ogrenciMi seklinde dort tane instance variable olusturalım.
   Bu instance variable'lerin default degerlerini main icerisinde yazdıralım

*/
public class C01_Instance {
    int sayi;//0 default degeri
    String isim;//null default degeri
    boolean ogrenciMi;//false default degeri

    public static void main(String[] args) {
        //Instance vari'lari static olan main de kullanabilmek icin once object olusturmaliyiz
        C01_Instance obj1=new C01_Instance();
        System.out.println(obj1.sayi);
        System.out.println(obj1.isim);
        System.out.println(obj1.ogrenciMi);

        C01_Instance obj2=new C01_Instance();
        obj1.isim="Hasan";
        obj2.isim="Huseyin";
        System.out.println(obj1.isim);//Hasan
        obj1.sayi=20;
        obj2.sayi=25;
        System.out.println(obj2.sayi);//25
        System.out.println(obj1.sayi);//20
        //Instance var'lar object'e baglidir ve hangi obj uzerinden
        //degisiklik yapildiysa yapilan degisiklik sadece o object'i baglar.



    }//main

}//class
