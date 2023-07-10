package stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        //Example 1: short data tipini byte a ceviren kodu girin(type casting e ornek)
        short num=260;
        byte numByte= (byte) num; //explicit narrowing e ornektir. Byte degerleri 256 tanedir==>
        // java burada modulus aliyor yani 260/256 dan kalani

        byte num1=10;
        int num1Int=num1; //auto widening e ornektir
    String a="Tek Rakibim Dunku Ben.";
    // butun harfleri nasil buyuk harf yapabiliriz
        String aUpper=a.toUpperCase();
        System.out.println(aUpper);
    //butun harfleri kuck yapalim
    String aLower=a.toLowerCase();
        System.out.println(aLower);
    //charAt() istenilen indekse gitmek icin. Index her zaman 0 dan baslar
        char ilk=a.charAt(0);
        System.out.println(ilk);//ilk harfin T oldugunu gosterir
    // space de bir char dir. index leri sayarken space leri de saymayi unutma
        System.out.println(a.charAt(11)); // bosluga denk geldigi icin bir sey print etmez bosluk vardir 
    }//main
}//class
