package day_15_practice;

public class Memur extends Muhasebe{
    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +         //sag tiklayip generate dedik toString() sectik
                ", maas=" + maas +                   //istedigimiz var'lari secip ok dedik
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
//toString() Methodu objelerin tum ozelliklerini yazdirmak icin pratik bir yontemdir.
    public static void main(String[] args) {
        Memur memur1=new Memur();
/*
memur1 objesi Memur Class'inin objesi olmasina ragmen inherit etigi Muhasebe ve onun da parent'i olan
Personel classlarindaki tum data'lari alabilir.
 */
        //personel class'indan
        memur1.persNo=1001;
        memur1.isim="Ahmet";
        memur1.soyisim="Tepe";
        memur1.adres="Ankara";
        memur1.tel="312456785";

        //muhasebe class'indan
        memur1.saatUcreti=10;
        memur1.statu="Memur";
        memur1.maas=memur1.maasHesapla();
        System.out.println(memur1.persNo);
        System.out.println(memur1.maasHesapla());
        System.out.println(memur1.toString());

        Memur memur2=new Memur();
        memur2.persNo=1002;
        memur2.saatUcreti=10;
        memur2.maas=memur2.maasHesapla();
        System.out.println(memur2.toString());
        /*
        artik bu fabrikada istedigimiz kadar memur uretebiliriz, urettigimiz her memur,
        muhasebe ve personel class'larindaki tum ozellikleri inherit etmis olur
         */

    }



}
