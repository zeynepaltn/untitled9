package day_15_practice;

public class SurekliIsci extends Isci{
    @Override
    public String toString() {
        return "SurekliIsci{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {
        SurekliIsci surIc1=new SurekliIsci();
        surIc1.persNo=5001;
        surIc1.isim="Cem";
        surIc1.soyisim="Oz";
        surIc1.statu="Isci";
        surIc1.saatUcreti=11;
        surIc1.maas= surIc1.maasHesapla();

        System.out.println(surIc1.persNo);
        //tek tek yazdirmakansa toString methodunu kullaniyorum once generate edelim
        System.out.println(surIc1.toString());
    }
}
