package day_12_practice;

public class C02 {
    String isim;
    int yas;
    String telefon;

    public C02(String isim, int yas, String telefon) { //parametreli const olusturuldugunda, default const olur
        this.isim=isim;
        this.yas=yas;
    }

    public static void main(String[] args) {
        C02 obj1=new C02("Burak",32,"0246");
        System.out.println(obj1.isim+", "+obj1.yas+", "+obj1.telefon);
    }
}
