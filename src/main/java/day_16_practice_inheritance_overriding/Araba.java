package day_16_practice_inheritance_overriding;
// Araba, Opel, Corsa adında farklı class'lar olusturunuz.
// Opel class'ı Araba class'ına baglı olacak
// Corsa class'ı Opel class'ına baglı olacak
// Araba class'ına genel bilgileri, varible ve method olarak yazınız.
// Opel class'ına gerekli bilgileri, variable ve method olarak yazınız.
// Corsa class'ına en spesifik bilgileri, variable ve method olarak yazınız.

// Corsa class'ından obje olusturarak variableları ve methodları yazdırınız.

public class Araba {
    protected String hareket="Arabalar teker ile haraket eder";
    protected String hiz="Arabalar motor gucune gore hiz yaparlar";
    protected String yakit="Arabalar farkli yakitlar kullanabilir";
    protected String marka="Arabalar uretildikleri markaya sahiptir";
    protected void motor() {
        System.out.println("ARABALAR FARKLI MARKALARDA MOTOR KULLANIRLAR");

    }
    protected void yakitTuketimi(){
        System.out.println("ARABALAR MOTOR GUCU VE YAKIT TURUNE GORE YAKIT TUKETIRLER");
    }


}//class
