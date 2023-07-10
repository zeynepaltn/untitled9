package day_18_practice;

import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/*
Bir Deque (Deque bir collection uyesidir) olusturunuz icerisine int elemanlar ekleyiniz.
5'den buyuk elemanları iterator ile yazdırınız
 */
public class C03_Iterator {
   //Index yapisi olmayan durumlarda ITERATOR kullan, index yapisi olursa for loop kullan
   //List haric hicbir collection'da index yapisi yok
    public static void main(String[] args) {

        Deque<Integer> dq=new LinkedList<>(Arrays.asList(1,8,3,6,7));
        System.out.println(dq);

        Iterator itr= dq.iterator();
        while(itr.hasNext()){
            Object sayi=itr.next();
            //Integer sayi  = (Integer) itr.next();
            //Hic object karistirmadan bu sekilde ilk assign yaparken casy yapilabilir
            if((Integer) sayi<5){
                itr.remove();

            }

        }
        System.out.println(dq);



    }//main
}//class
