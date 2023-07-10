package day_14_practice;

public class C01_Varargs {


    public static void main(String[] args) {

        /*
        parametre olarak bir int ve istediginiz kadar String olan bir method olusturun,
        en uzun String'in harf sayisi ile int parametre degeri carpıp sonucu yazdırın
         */


        int sayi = 5;
        String str1 = "Zulal";
        String str2 = "Zeynep";
        String str3 = "Ali";

        carpim(sayi,str1,str2,str3);


    } //main
    // int, varargs yapmaya gerek yok cunku zaten int bir tane
    // ama String birden fazla oldugu icin String'i Varargs yapiyoruz

    // Bir methodda varargs disinda parametre kullanacaksak
    // once varargs disindaki parametreler yazilmali, en son varargs yazilmalidir
    //Bir method'da birden fazla Varargs olmaz

    private static void carpim(int sayi, String...str) {

        String enUzunKelime="";

        for (String each:str) {

            if(each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }

        }

        System.out.println(enUzunKelime.length()*sayi);


    }


}
