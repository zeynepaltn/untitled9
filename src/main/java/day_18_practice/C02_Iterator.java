package day_18_practice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 Bir Set olusturunuz icerisine int elemanlar ekleyiniz.
 set'deki cift elemanları iterator ile siliniz
*/
public class C02_Iterator {
    public static void main(String[] args) {

       // Set<Integer> st=new TreeSet<>(); //Set interface'dir set esittir new set diyemeyiz, treeset dedik
        //st.add(1); bu sekilde de eleman eklenebilir bu listeye ama asagidaki method daha hizli
        Set<Integer> st=new TreeSet<>(Arrays.asList(1,2,3,4,5));
        Iterator itr=st.iterator(); //set'lerde index yapisi yoktur, bu sebeple iterator kullanilir
                                //List haric hicbir collection'da index yapisi yoktur
        while (itr.hasNext()){ //Iterator'un yaninda eleman var mi kontrol ediyorum
                            //varsa true yoksa false dondurecek, true oldugu muddetce while dongusu kirilmaz

            Object sayi=itr.next();//iterator'u bir adim ileriye atiyoruz, uzerinden gectigi elemani bize donduruyor
                                //ve biz bunu object sayi'ya assign ettik (int java kabul etmedi)
            if((Integer) sayi%2==0){ //sayi object'e assign, 2 ye bolumden kalani bulamayiz o yuzden Int'a cast yaptik
                itr.remove();

            }

        }

        System.out.println(st);

    }
}
