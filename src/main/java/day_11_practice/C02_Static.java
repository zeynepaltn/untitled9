package day_11_practice;
        /*

    okulIsmi, okulNo, okulAcikMi seklinde uc tane static variable olusturalım.
    Bu static variable'leri main icerisinde yazdıralım

*/

public class C02_Static {

    static String okulIsmi="Yildiz Koleji";
    static int okulNo;
    static boolean okulAcikMi;


    public static void main(String[] args) {
        //static vari'lara, class icerisindeki tum methodlardan direk ulasabiliriz
        System.out.println(okulIsmi);//Yildiz Koleji
        System.out.println(okulNo);//default value'yi yani 0
        System.out.println(okulAcikMi);//default value'yi yani false
    //Static vari'lar gokteki ay gibidir, yani herkes icin aynidir.Static vari'larin degeri
    //bir kisi tarafindan degistirilirse hrkes icin degisiklige ugrar.
    //Static vari'lar class'a baglidir
    okulNo=102;
        System.out.println(okulNo);
        staticMethod();
        System.out.println(okulNo);


    }

    private static void staticMethod() {
        okulNo=200;
        System.out.println(okulNo);
    }


}
