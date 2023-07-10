package Lambda_Recap;

import jdk.jshell.execution.Util;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> sayi=new ArrayList<>(Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8));
        ciftVePozitiflambdaExpressionYazdir(sayi);
        System.out.println();
        ciftVePozitifMetRef(sayi);
        System.out.println();
        kareYazdir(sayi);
        System.out.println();
        tekrarsizKare(sayi);
        System.out.println();
        buyuktenKucugeSirala(sayi);
        System.out.println();
        pozitifKupBirlerBas5(sayi);
        System.out.println();
        toplamMetRef(sayi);
        System.out.println();
        toplamLambdaExp(sayi);
        System.out.println();
        System.out.println(ciftKareNaturalOrder(sayi));


    }//main
    //SORU1: List elemanlarının çift ve pozitif olanlarını,
    // Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın
    public static void ciftVePozitiflambdaExpressionYazdir(List<Integer> sayi){
       sayi.
               stream().
               filter(t->t%2==0 && t>=0).
               forEach(t-> System.out.print(t+" "));

    }
    //SORU2: List elemanlarının çift ve pozitif olanlarını,
    // Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın
    public static void ciftVePozitifMetRef(List<Integer> sayi){
        sayi.
                stream().
                filter(t->t%2==0 && t>=0).
                forEach(Utils::yazdir);
    }
    //SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın
    public static void kareYazdir(List<Integer> sayi){
        //sayi.stream().map(t->t*t).forEach(Utils::yazdir);
        sayi.
                stream().
                map(Utils::kareBul).
                forEach(Utils::yazdir);

    }
    //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın
    public static void tekrarsizKare(List<Integer> sayi){
        sayi.
                stream().
                map(Utils::kareBul).distinct().
                forEach(Utils::yazdir);
    }
    //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın
    public static void buyuktenKucugeSirala(List<Integer> sayi){
        sayi.
                stream().
                sorted(Comparator.reverseOrder()).
                forEach(Utils::yazdir);

    }
    // SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup,
    // birler basamagı 5 olanları yazdırınız
    public static void  pozitifKupBirlerBas5(List<Integer> sayi){
        sayi.
                stream().filter(t->t>0).
                map(Utils::kupBul).
                filter(t->t%10==5).
                forEach(Utils::yazdir);
    }
    // SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın
    public static void toplamMetRef(List<Integer> sayi){
        Optional<Integer> sonuc=sayi.stream().reduce(Integer::sum);
        System.out.println(sonuc);

    }
    //// SORU8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın
    public static void toplamLambdaExp(List<Integer> sayi){
       int sonuc= sayi.stream().reduce(0,(a,b)->a+b); //a her zaman ilk degerini identitiy'den alir yani
        System.out.println(sonuc);                            // 0 olacak, b de her zaman akistan alir degerini
                                                    //a ilk degerden sonrakileri a+b'den alir
    }
    //SORU9 : Listin cift elemanlarının, karelerini,
    // kucukten buyuge sıralayıp list halinde return ederek yazdırınız
    public static List<Integer> ciftKareNaturalOrder(List<Integer> sayi){
       List<Integer> sonuc= sayi.stream().filter(t->t%2==0).map(Utils::kareBul).sorted().distinct().
                collect(Collectors.toList());
        return sonuc;
    }



}//class
