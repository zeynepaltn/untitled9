package day_16_practice_inheritance_overriding;

import stringmanipulations.Main;

public class Corsa extends Opel{

    protected String hiz="Corsalar max 200 km hiz yapar";
    protected String yakit="Corsa benzinli veya elektriklidir";
    protected String model="Corsa";

    protected void motor(){
        System.out.println("CORSA ARABALAR CEVRECI MOTOR KULLANIRLAR");

    }

    protected void yakitTuketimi(){
        System.out.println("CORSA 5.6 LT YAKIT TUKETIR");
    }

    protected void vitesSayisi(){
        System.out.println("CORSA 5 VITESLIDIR");
    }

    public static void main(String[] args) {
    /*
    Inheritance variable; Olusturdugumuz objenin data turu hangi class'a aitse oradan baslayarak bakar,
    yoksa parent'ina gider ve ilk buldugu yerden alir.

    Inheritance Method; Olusturdugumuz obje'nin data turu hangi class'a aitse ordan baslayarak bakar,
    yoksa parnt'a gider, buldugu yerden hemen almaz, override edilmis mi diye kontrol eder.
    (constractor class'ina kadar ayni isimde method var mi diye kontrol eder.) Override edileni alir.
     */



        Corsa arb1=new Corsa();
        /*
        Object'i Opel yaparak javayi Opel'e yonlendirdik.
        Bir limit koyduk. Artik Corsa Class'indan variable aramasi yapamaz.
         */


        System.out.println(arb1.hareket);//corsa class'da haraket olmadigi icin parent'dakini alacak
        System.out.println(arb1.hiz);//corsa class da hiz instance variable'i var, onu alacak
        System.out.println(arb1.yakit);//corsa'daki yakit instance variable'i kullanilir
        System.out.println(arb1.marka);//parent'dan alir, burada marka instance vari'i yok
        System.out.println(arb1.sirketMerkezi);//parent'dan gelecek
        System.out.println(arb1.model);


        arb1.motor();


        Opel arb2=new Corsa(); //Bu sefer objemiz opel'den oldugu icin once o class'a bakar orda yoksa parent'a gider
        System.out.println(arb2.hareket);
        System.out.println(arb2.hiz);//Opel'deki hiz degerini alacak
        System.out.println(arb2.yakit);
        System.out.println(arb2.marka);
        System.out.println(arb2.sirketMerkezi);
       // System.out.println(arb2.model); bu kod calismaz cunku opel class'da da parent'da da
        //bu variable yok, bu yuzden Compile Time error verir (Corsa ya zaten gitmeyecegiz cunku object in datasi Opel)

        arb2.motor(); //methodlar variable'lar gibi calismaz, override edilmis mi kontrol etmemiz lazim
        //corsa class'inda motor() override oldugu icin o degeri yazdiracak

        arb2.garanti();
        arb2.yakitTuketimi();
       // arb2.vitesSayisi(); CTE verir.opel'de de parent'inda da bu method yok gidecek baska bir yer de yok.
    }//class


}//class
